package com.smartparking.client;

import com.smartparking.grpc.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class ParkingSystemManagementClient {
    private static Scanner scanner = new Scanner(System.in);
    private static ManagedChannel channelParking = ManagedChannelBuilder.forAddress("localhost", 8081)
            .usePlaintext() // For testing purposes only, do not use in production
            .build();
    private static ParkingManagedGrpc.ParkingManagedBlockingStub parkingManagedBlockingStub = ParkingManagedGrpc.newBlockingStub(channelParking);
    private static Empety empety = Empety.newBuilder().build();


    public static void main(String[] args) {


        int option = 0;
        do {
            System.out.println("####### PARKING MANAGED CLIENT ##########");
            System.out.println("Choose the option: ");
            System.out.println("1 - Parking opening ");
            System.out.println("2 - CheckIn Car ");
            System.out.println("3 - CheckOut Car ");
            System.out.println("4 - Parking closing");
            System.out.println("5 - Check if it's full");
            System.out.println("6 - Daily report");
            System.out.println("99 - Exit");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    openParking();
                    break;
                case 2:
                    checkinCar();
                    break;
                case 3:
                    checkoutCar();
                    break;
                case 4:
                    closeParking();
                    break;
                case 5:
                    checkifItIsFull();
                    break;
                case 6:
                    dailyReport();
                    break;
                default:
                    break;


            }

        }while (option != 99 );

    }

    private static void dailyReport() {
        FinanceDay report = parkingManagedBlockingStub.report(empety);

        if(report.getMsgErro() == "") {
            System.out.println("Number of parked vehicles: " + report.getCarQuantity());
            System.out.println("Revenue collected: $ " + report.getAmount());
        }
        System.out.println(report.getMsgErro());
        exitScreen();
    }

    private static void checkoutCar() {
        System.out.println("Inform ticket id: ");
        String plate = scanner.next();
        TicketRequestCheckout ticketRequestCheckout = TicketRequestCheckout.newBuilder().setIdTicket(plate).build();
        Ticket ticket = parkingManagedBlockingStub.carCheckOut(ticketRequestCheckout);

        if(ticket.getMsgErro() == ""){
            System.out.println("Ticket ID: "+ticket.getIdTicket());
            System.out.println("Checkin Time: "+ticket.getCheckin());
            System.out.println("Checkin Time: "+ticket.getCheckout());
            System.out.println("Inform license plate: "+ticket.getLicensePlate());
            System.out.println("Inform license plate: $ "+ticket.getPrice());
        }

        System.out.println(ticket.getMsgErro());
        exitScreen();

    }

    private static void checkifItIsFull() {
        System.out.println(parkingManagedBlockingStub.checkIfItIsFull(empety).getStatus());
        exitScreen();
    }

    private static void checkinCar() {
        System.out.println("Inform license plate: ");
        String plate = scanner.next();
        CarEntrance carEntrance = CarEntrance.newBuilder().setLicensePlate(plate).build();
        Ticket ticket = parkingManagedBlockingStub.carCheckIn(carEntrance);


        if(ticket.getMsgErro() == ""){
            System.out.println("Ticket ID: "+ticket.getIdTicket());
            System.out.println("Checkin Time: "+ticket.getCheckin());
            System.out.println("Inform license plate: "+ticket.getLicensePlate());
        }

        System.out.println(ticket.getMsgErro());
        exitScreen();

    }

    public static void openParking() {
        Status response = parkingManagedBlockingStub.parkingOpen(empety);
        System.out.println(response.getStatus());

        exitScreen();
    }

    public static void closeParking() {
        FinanceDay response = parkingManagedBlockingStub.parkingClosure(empety);
        System.out.println("Cash Expense: " + response.getAmount());
        System.out.println("Quantity of cars for the day: " + response.getCarQuantity());
        System.out.println("Parking is Closed");

        exitScreen();
    }

    public static void exitScreen(){
        System.out.println("\nEnter \"e\" to return to the previous menu:");
        String opt = null;
        do{
            opt = scanner.next();
        }while (!opt.equals("e"));
    }

}
