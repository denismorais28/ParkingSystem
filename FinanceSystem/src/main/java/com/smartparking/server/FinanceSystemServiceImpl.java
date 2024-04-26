package com.smartparking.server;

import com.smartparking.grpc.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FinanceSystemServiceImpl extends FinanceGrpc.FinanceImplBase {

    private boolean parkingOpen = false;
    private Double priceHourValue = 2.5;
    private int fraction = 15;
    private List<Ticket> paymentRecord = new ArrayList<Ticket>();
    private String STATUS_OPEN = "Parking is Opened";
    private String STATUS_CLOSE = "Parking is closed";
    private Empety empety = Empety.newBuilder().build();

    ManagedChannel channelVancancy = ManagedChannelBuilder.forAddress("localhost", 8082)
            .usePlaintext() // For testing purposes only, do not use in production
            .build();
    VancancyManagementGrpc.VancancyManagementBlockingStub blockingStubVancancy = VancancyManagementGrpc.newBlockingStub(channelVancancy);

    @Override
    public void payment(Ticket request, StreamObserver<Ticket> responseObserver) {

        if(parkingOpen) {
            Double price = calculatePrice(request);
            Ticket ticket = Ticket
                    .newBuilder()
                    .setPrice(price.toString())
                    .setCheckin(request.getCheckin())
                    .setCheckout(request.getCheckout())
                    .setIdTicket(request.getIdTicket())
                    .setLicensePlate(request.getLicensePlate())
                    .build();
            responseObserver.onNext(ticket);
            responseObserver.onCompleted();
            //super.payment(request, responseObserver);
        }else{
            Ticket ticket = Ticket.newBuilder().setMsgErro(STATUS_CLOSE).build();
            responseObserver.onNext(ticket);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void addCarToPaymentRecord(Ticket request, StreamObserver<Status> responseObserver) {

        if(parkingOpen) {
            paymentRecord.add(request);
            Status status = Status
                    .newBuilder().setStatus("OK")
                    .build();
            responseObserver.onNext(status);
            responseObserver.onCompleted();
            //super.payment(request, responseObserver);
        }else{
            Status status = Status
                    .newBuilder().setStatus("Parking is closed")
                    .build();
            paymentRecord.add(request);
            responseObserver.onNext(status);
            responseObserver.onCompleted();

        }
        //super.addCarToPaymentRecord(re
    }


    @Override
    public void paymentRecordReport(Empety request, StreamObserver<FinanceDay> responseObserver) {
        if(parkingOpen) {
            if (paymentRecord.size() > 0 ) {
                Double amount = 0.0;
                for (Ticket p : paymentRecord) {
                    amount += Double.valueOf(p.getPrice());
                }
                FinanceDay financeDay = FinanceDay.newBuilder()
                        .setAmount(amount.toString())
                        .setCarQuantity(Integer.toString(paymentRecord.size())).build();
                responseObserver.onNext(financeDay);
                responseObserver.onCompleted();
            }else {
                FinanceDay financeDay = FinanceDay.newBuilder()
                        .setMsgErro("There is no payment registered").build();
                responseObserver.onNext(financeDay);
                responseObserver.onCompleted();
            }
        }else {
            FinanceDay financeDay = FinanceDay.newBuilder()
                    .setMsgErro(STATUS_CLOSE).build();
            responseObserver.onNext(financeDay);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void closure(Empety request, StreamObserver<FinanceDay> responseObserver) {
        if (parkingOpen) {
            parkingOpen = false;
            Double amount = 0.0;

            for (Ticket p : paymentRecord) {
                amount += Double.valueOf(p.getPrice());
            }
            blockingStubVancancy.closure(empety);

            FinanceDay financeDay = FinanceDay.newBuilder()
                    .setAmount(amount.toString())
                    .setCarQuantity(Integer.toString(paymentRecord.size())).build();

            responseObserver.onNext(financeDay);
            responseObserver.onCompleted();
        }else{
            FinanceDay financeDay = FinanceDay.newBuilder()
                    .setMsgErro(STATUS_CLOSE).build();
            responseObserver.onNext(financeDay);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void open(Empety request, StreamObserver<Status> responseObserver) {
        if (!parkingOpen) {
            parkingOpen = true;

            blockingStubVancancy.open(empety);
            Status empty = Status.newBuilder().setStatus(STATUS_OPEN).build();
            responseObserver.onNext(empty);
            responseObserver.onCompleted();
        }else {
            Status empty = Status.newBuilder().setStatus(STATUS_OPEN).build();
            responseObserver.onNext(empty);
            responseObserver.onCompleted();
        }
    }

    private Double calculatePrice(Ticket request){

        int timeMinute;
        try {
            timeMinute = calculatesTimeMinutes(request.getCheckin(),request.getCheckout());

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        Double result = (double)timeMinute/ (double)fraction;

        return result * priceHourValue;

    }

    private int calculatesTimeMinutes(String strCheckin, String strCheckout) throws ParseException {

        final Calendar dateCheckin = parseDateString(strCheckin);
        final Calendar dateCheckout = parseDateString(strCheckout);

        int day = dateCheckout.get(Calendar.DATE) - dateCheckin.get(Calendar.DATE) ;
        int hour;
        int minute;

        if (day == 0){
            hour = dateCheckout.get(Calendar.HOUR_OF_DAY) - dateCheckin.get(Calendar.HOUR_OF_DAY);
            minute = dateCheckout.get(Calendar.MINUTE) - dateCheckin.get(Calendar.MINUTE);

            if (minute < 0){
                hour--;
                minute = 60 + minute;
            }

            return (hour*60)+minute;
        }else{
            hour = dateCheckout.get(Calendar.HOUR_OF_DAY) - dateCheckin.get(Calendar.HOUR_OF_DAY);
            minute = dateCheckout.get(Calendar.MINUTE) - dateCheckin.get(Calendar.MINUTE);

            hour += (day*24);

            if (minute < 0){
                hour--;
                minute = 60 + minute;
            }
            return (hour*60)+minute;
        }
    }
    private Calendar parseDateString(final String strDateCheck) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
        Date parsedDateCheckin = sdf.parse(strDateCheck);
        Calendar dateCheck = Calendar.getInstance();
        dateCheck.setTime(parsedDateCheckin);
        return dateCheck;

    }

}
