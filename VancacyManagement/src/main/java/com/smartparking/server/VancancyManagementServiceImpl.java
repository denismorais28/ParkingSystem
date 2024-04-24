package com.smartparking.server;

;
import com.google.protobuf.TimestampOrBuilder;
import com.google.type.DateTime;
import com.smartparking.grpc.*;
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

    public VancancyManagementServiceImpl(){
        totalvacancies = 10;
        ticketies = new HashMap<String, Ticket>();
    }

    @Override
    public void vancancyCheckIn(CarEntrance request, StreamObserver<Ticket> responseObserver) {
        if (ticketies.size() <= totalvacancies){
            countId++;
            Ticket ticket = Ticket.newBuilder()
                        .setIdTicket(Integer.toString(countId))
                        .setCheckin(parseStringTimestamp())
                        .setLicensePlate(request.getLicensePlate()).build();
            ticketies.put(Integer.toString(countId),ticket);
            responseObserver.onNext(ticket);
            responseObserver.onCompleted();
        }
        // super.vancancyCheckIn(request, responseObserver);
    }

    @Override
    public void vancancyCheckOut(TicketRequestCheckout request, StreamObserver<Ticket> responseObserver) {
        if (ticketies.size() > 0){
            Ticket ticket = ticketies.get(request.getIdTicket());
            ticket.newBuilderForType().setCheckout(parseStringTimestamp()).build();
            ticketies.remove(request.getIdTicket());
            responseObserver.onNext(ticket);
            responseObserver.onCompleted();
        }
//        super.vancancyCheckOut(request, responseObserver);
    }

    @Override
    public void vancancyCheckIfItIsFull(empty request, StreamObserver<Status> responseObserver) {
        Integer total = totalvacancies - ticketies.size();
        if(total > 0){
            responseObserver.onNext(Status.newBuilder().setStatus(total+" vacancies").build());
            responseObserver.onCompleted();
        }else {
            responseObserver.onNext(Status.newBuilder().setStatus("No vacancy").build());
            responseObserver.onCompleted();
        }
//        super.vancancyCheckIfItIsFull(request, responseObserver);
    }

    private String parseStringTimestamp() {
        Date dataHoraAtual = new Date();
        return dataHoraAtual.toString();
    }

}
