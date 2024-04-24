package com.smartparking;

import com.google.type.DateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {

        String strDateCheckin =  "Tue Mar 23 07:50:55 BRT 2024";
        String strDateCheckout =  "Tue Apr 23 13:55:55 BRT 2024";
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);

        Date parsedDateCheckin = sdf.parse(strDateCheckin);
        Date parsedDateCheckout = sdf.parse( strDateCheckout);

        Calendar dateCheckin = Calendar.getInstance();
        Calendar dateCheckout = Calendar.getInstance();
        dateCheckin.setTime(parsedDateCheckin);
        dateCheckout.setTime(parsedDateCheckout);
        int d = dateCheckout.get(Calendar.DATE) - dateCheckin.get(Calendar.DATE) ;

        if (d == 0){
            
            int hour = dateCheckout.get(Calendar.HOUR_OF_DAY) - dateCheckin.get(Calendar.HOUR_OF_DAY);
            int minute = dateCheckout.get(Calendar.MINUTE) - dateCheckin.get(Calendar.MINUTE);
            System.out.println("Hour: "+hour+" Minute" + minute);
            if (minute < 0){
                hour--;
                minute = 60 + minute;
                System.out.println("Hour: "+hour+" Minute " + minute);
            }
        }
        System.out.println(d);


        }

}