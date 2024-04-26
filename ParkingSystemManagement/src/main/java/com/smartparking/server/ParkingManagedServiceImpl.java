package com.smartparking.server;

import com.smartparking.grpc.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class ParkingManagedServiceImpl extends ParkingManagedGrpc.ParkingManagedImplBase{

    private String STATUS_OPEN = "Parking is Opened";
    private String STATUS_CLOSE = "Parking is closed";
    private Empety empety = Empety.newBuilder().build();

    ManagedChannel channelFinance = ManagedChannelBuilder.forAddress("localhost", 8083)
            .usePlaintext() // For testing purposes only, do not use in production
            .build();
    FinanceGrpc.FinanceBlockingStub blockingStubFinance = FinanceGrpc.newBlockingStub(channelFinance);


    ManagedChannel channelVancancy = ManagedChannelBuilder.forAddress("localhost", 8082)
            .usePlaintext() // For testing purposes only, do not use in production
            .build();
    VancancyManagementGrpc.VancancyManagementBlockingStub blockingStubVancancy = VancancyManagementGrpc.newBlockingStub(channelVancancy);



    @Override
    public void parkingOpen(Empety request, StreamObserver<Status> responseObserver) {
        blockingStubFinance.open(Parking.newBuilder().build());
        responseObserver.onNext(Status.newBuilder().setStatus(STATUS_OPEN).build());
        responseObserver.onCompleted();
    }

    @Override
    public void carCheckIn(CarEntrance request, StreamObserver<Ticket> responseObserver) {
        CarEntrance carEntrance = CarEntrance.newBuilder().setLicensePlate(request.getLicensePlate()).build();
        responseObserver.onNext(blockingStubVancancy.vancancyCheckIn(carEntrance));
        responseObserver.onCompleted();
    }

    @Override
    public void parkingClosure(Empety request, StreamObserver<FinanceDay> responseObserver) {
        responseObserver.onNext(blockingStubFinance.closure(empety));
        responseObserver.onCompleted();
    }

    @Override
    public void carCheckOut(TicketRequestCheckout request, StreamObserver<Ticket> responseObserver) {
        TicketRequestCheckout ticketRequestCheckout = TicketRequestCheckout.newBuilder().setIdTicket(request.getIdTicket()).build();
        responseObserver.onNext(blockingStubVancancy.vancancyCheckOut(ticketRequestCheckout));
        responseObserver.onCompleted();
    }

    @Override
    public void checkIfItIsFull(Empety request, StreamObserver<Status> responseObserver) {
        responseObserver.onNext(blockingStubVancancy.vancancyCheckIfItIsFull(empety));
        responseObserver.onCompleted();
    }

    @Override
    public void report(Empety request, StreamObserver<FinanceDay> responseObserver) {
        responseObserver.onNext(blockingStubFinance.paymentRecordReport(empety));
        responseObserver.onCompleted();
    }
}
