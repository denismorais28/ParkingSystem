package com.smartparking.server;

import com.smartparking.grpc.Car;
import com.smartparking.grpc.ParkingManagedGrpc;
import com.smartparking.grpc.Ticket;
import io.grpc.stub.StreamObserver;

public class ParkingSystemServiceImpl extends ParkingManagedGrpc.ParkingManagedImplBase{
    @Override
    public void carCheckIn(Car request, StreamObserver<Ticket> responseObserver) {
        super.carCheckIn(request, responseObserver);
    }

    @Override
    public void carCheckOut(Car request, StreamObserver<Ticket> responseObserver) {
        super.carCheckOut(request, responseObserver);
    }
}
