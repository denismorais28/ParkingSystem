package com.smartparking.server;

;
import com.google.protobuf.TimestampOrBuilder;
import com.google.type.DateTime;
import com.smartparking.grpc.CarEntrance;
import com.smartparking.grpc.Status;
import com.smartparking.grpc.Ticket;
import com.smartparking.grpc.VancancyManagementGrpc;
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
    private HashMap<Integer, Ticket> ticketies;

    public VancancyManagementServiceImpl(){
        totalvacancies = 10;
        ticketies = new HashMap<Integer, Ticket>();
    }

    @Override
    public void vancancyCheckIn(CarEntrance request, StreamObserver<Ticket> responseObserver) {
        if (ticketies.size() <= totalvacancies){
            Ticket ticket = Ticket.newBuilder().setCheckin(parseStringTimestamp()).setLicensePlate(request.getLicensePlate()).build();
            ticketies.put(ticketies.size()+1,ticket);
            responseObserver.onNext(ticket);
            responseObserver.onCompleted();
        }
        // super.vancancyCheckIn(request, responseObserver);
    }

    @Override
    public void vancancyCheckOut(Ticket request, StreamObserver<Ticket> responseObserver) {
        super.vancancyCheckOut(request, responseObserver);
    }

    @Override
    public void vancancyCheckIfItIsFull(Status request, StreamObserver<Ticket> responseObserver) {
        super.vancancyCheckIfItIsFull(request, responseObserver);
    }

    private String parseStringTimestamp() {
        Date dataHoraAtual = new Date();
        return dataHoraAtual.toString();
    }

}
