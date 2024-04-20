package com.smartparking.FinanceSystem.server;

import com.smartparking.grpc.*;
import io.grpc.stub.StreamObserver;

public class FinanceSystemServiceImpl extends FinanceGrpc.FinanceImplBase {
    @Override
    public void payment(Ticket request, StreamObserver<Ticket> responseObserver) {
        Ticket ticket = Ticket.newBuilder().setPrice("200.00").build();

        responseObserver.onNext(ticket);
        responseObserver.onCompleted();
        //super.payment(request, responseObserver);
    }

    @Override
    public void addCarToPaymentRecord(Ticket request, StreamObserver<Ticket> responseObserver) {
        super.addCarToPaymentRecord(request, responseObserver);
    }

    @Override
    public void paymentRecordReport(Empety request, StreamObserver<FinanceDay> responseObserver) {
        super.paymentRecordReport(request, responseObserver);
    }

    @Override
    public void closure(Empety request, StreamObserver<FinanceDay> responseObserver) {
        super.closure(request, responseObserver);
    }

    @Override
    public void open(Parking request, StreamObserver<Empety> responseObserver) {
        super.open(request, responseObserver);
    }
}
