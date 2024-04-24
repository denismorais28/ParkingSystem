package com.smartparking.server;

import com.smartparking.grpc.*;
import io.grpc.stub.StreamObserver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FinanceSystemServiceImpl extends FinanceGrpc.FinanceImplBase {

    private boolean parkingOpen = false;
    private Double priceHourValue = 2.5;
    private int fraction = 15;


    @Override
    public void payment(Ticket request, StreamObserver<Ticket> responseObserver) {

        if(parkingOpen) {
            Ticket ticket = Ticket.newBuilder().setPrice(calcularPreco(request).toString()).build();
            responseObserver.onNext(ticket);
            responseObserver.onCompleted();
            //super.payment(request, responseObserver);
        }else{
            Ticket ticket = Ticket.newBuilder().setPrice(calcularPreco(request).toString()).build();
            responseObserver.onNext(ticket);
            responseObserver.onCompleted();
        }
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
        parkingOpen = false;
        //super.closure(request, responseObserver);
    }

    @Override
    public void open(Parking request, StreamObserver<Empety> responseObserver) {
        parkingOpen = true;
        //super.open(request, responseObserver);
    }

    private Double calcularPreco(Ticket request){

        int timeMinute;
        try {
            timeMinute = calculaTempoMinutos(request.getCheckin(),request.getCheckout());

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return (timeMinute/fraction) * priceHourValue;

    }

    private int calculaTempoMinutos(String strCheckin, String strCheckout) throws ParseException {

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
