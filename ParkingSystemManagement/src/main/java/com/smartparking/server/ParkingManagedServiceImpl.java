package com.smartparking.server;

import com.smartparking.grpc.*;
import io.grpc.stub.StreamObserver;

public class ParkingManagedServiceImpl extends ParkingManagedGrpc.ParkingManagedImplBase{
    @Override
    public void parkingOpen(Parking request, StreamObserver<Empety> responseObserver) {
        super.parkingOpen(request, responseObserver);
    }

    @Override
    public void carCheckIn(CarEntrance request, StreamObserver<Ticket> responseObserver) {
        super.carCheckIn(request, responseObserver);
    }

    @Override
    public void carCheckOut(CarExit request, StreamObserver<Ticket> responseObserver) {
        super.carCheckOut(request, responseObserver);
    }

    @Override
    public void checkIfItIsFull(Status request, StreamObserver<Status> responseObserver) {
        super.checkIfItIsFull(request, responseObserver);
    }

    @Override
    public void checkOutPaymant(Ticket request, StreamObserver<Ticket> responseObserver) {
        super.checkOutPaymant(request, responseObserver);
    }

    @Override
    public void parkingClosure(Request request, StreamObserver<FinanceDay> responseObserver) {
        super.parkingClosure(request, responseObserver);
    }

    @Override
    public void report(Request request, StreamObserver<FinanceDay> responseObserver) {
        super.report(request, responseObserver);
    }
}
