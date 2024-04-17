package com.smartparking.server;

import com.smartparking.grpc.ParkingManagedGrpc;
import com.smartparking.grpc.Status;
import com.smartparking.grpc.Ticket;
import com.smartparking.grpc.VancancyManagementGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class VancancyManagementServiceImpl extends VancancyManagementGrpc.VancancyManagementImplBase {

    @Override
    public void vancancyCheckIn(Status request, StreamObserver<Ticket> responseObserver) {
        super.vancancyCheckIn(request, responseObserver);
    }

    @Override
    public void vancancyCheckOut(Status request, StreamObserver<Ticket> responseObserver) {
        super.vancancyCheckOut(request, responseObserver);
    }

    @Override
    public void vancancyCheckIfItIsFull(Status request, StreamObserver<Ticket> responseObserver) {
        super.vancancyCheckIfItIsFull(request, responseObserver);
    }
}
