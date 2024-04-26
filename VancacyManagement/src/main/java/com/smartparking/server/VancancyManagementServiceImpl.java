package com.smartparking.server;

;
import com.google.protobuf.TimestampOrBuilder;
import com.google.type.DateTime;
import com.smartparking.grpc.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

public class VancancyManagementServiceImpl extends VancancyManagementGrpc.VancancyManagementImplBase {

    private int totalvacancies;
    private HashMap<String, Ticket> ticketies;
    private int countId = 0;
    private boolean parkingOpen = false;
    private String STATUS_OPEN = "Parking is Opened";
    private String STATUS_CLOSE = "Parking is closed";
    private String NO_VACANCY = "No vacancy";
    private Empety empety = Empety.newBuilder().build();

    ManagedChannel channelFinance = ManagedChannelBuilder.forAddress("localhost", 8083)
            .usePlaintext() // For testing purposes only, do not use in production
            .build();
    FinanceGrpc.FinanceBlockingStub blockingStubFinance = FinanceGrpc.newBlockingStub(channelFinance);


    public VancancyManagementServiceImpl(){
        totalvacancies = 10;
        ticketies = new HashMap<String, Ticket>();
    }

    @Override
    public void vancancyCheckIn(CarEntrance request, StreamObserver<Ticket> responseObserver) {
        if (parkingOpen) {
            if (ticketies.size() <= totalvacancies) {
                countId++;
                Ticket ticket = Ticket.newBuilder()
                        .setIdTicket(Integer.toString(countId))
                        .setCheckin(parseStringTimestamp())
                        .setLicensePlate(request.getLicensePlate()).build();
                ticketies.put(Integer.toString(countId), ticket);
                responseObserver.onNext(ticket);
                responseObserver.onCompleted();
            } else {
                Ticket ticket = Ticket.newBuilder().setMsgErro(NO_VACANCY).build();
                responseObserver.onNext(ticket);
                responseObserver.onCompleted();
            }
        }else {
            Ticket ticket = Ticket.newBuilder().setMsgErro(STATUS_CLOSE).build();
            responseObserver.onNext(ticket);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void vancancyCheckOut(TicketRequestCheckout request, StreamObserver<Ticket> responseObserver) {
        if (parkingOpen) {
            if (ticketies.size() > 0) {
                Ticket ticket = ticketies.get(request.getIdTicket());
                Ticket ticketPaymente = blockingStubFinance.payment(Ticket.newBuilder()
                        .setIdTicket(ticket.getIdTicket())
                        .setCheckin(ticket.getCheckin())
                        .setCheckout(parseStringTimestamp())
                        .setLicensePlate(ticket.getLicensePlate()).build());

                Ticket ticketRespose = Ticket.newBuilder()
                        .setIdTicket(ticket.getIdTicket())
                        .setCheckin(ticket.getCheckin())
                        .setCheckout(parseStringTimestamp())
                        .setPrice(ticketPaymente.getPrice())
                        .setLicensePlate(ticket.getLicensePlate()).build();

                blockingStubFinance.addCarToPaymentRecord(ticketRespose);

                ticketies.remove(request.getIdTicket());
                responseObserver.onNext(ticketRespose);
                responseObserver.onCompleted();
            }else {
                Ticket ticketRespose = Ticket.newBuilder()
                        .setMsgErro("EMPETY PARKING").build();

                responseObserver.onNext(ticketRespose);
                responseObserver.onCompleted();

            }
        }else {
            Ticket ticketRespose = Ticket.newBuilder()
                    .setMsgErro(STATUS_CLOSE).build();

            responseObserver.onNext(ticketRespose);
            responseObserver.onCompleted();

        }

    }

    @Override
    public void vancancyCheckIfItIsFull(empty request, StreamObserver<Status> responseObserver) {
        if (parkingOpen) {
            Integer total = totalvacancies - ticketies.size();
            if (total > 0) {
                responseObserver.onNext(Status.newBuilder().setStatus(total + " vacancies").build());
                responseObserver.onCompleted();
            } else {
                responseObserver.onNext(Status.newBuilder().setStatus(NO_VACANCY).build());
                responseObserver.onCompleted();
            }
        }else{
            responseObserver.onNext(Status.newBuilder().setStatus(STATUS_CLOSE).build());
            responseObserver.onCompleted();
        }
    }

    private String parseStringTimestamp() {
        Date dataHoraAtual = new Date();
        return dataHoraAtual.toString();
    }

    @Override
    public void open(Empety request, StreamObserver<Status> responseObserver) {
        if (!parkingOpen) {
            parkingOpen = true;
            Status status = Status.newBuilder().setStatus(STATUS_OPEN).build();
            responseObserver.onNext(status);
            responseObserver.onCompleted();
        }else {
            Status status = Status.newBuilder().setStatus(STATUS_OPEN).build();
            responseObserver.onNext(status);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void closure(Empety request, StreamObserver<Status> responseObserver) {
        if (parkingOpen) {
            parkingOpen = false;
            Status status = Status.newBuilder().setStatus(STATUS_CLOSE).build();
            responseObserver.onNext(status);
            responseObserver.onCompleted();
        }else {
            Status status = Status.newBuilder().setStatus(STATUS_CLOSE).build();
            responseObserver.onNext(status);
            responseObserver.onCompleted();
        }
    }
}
