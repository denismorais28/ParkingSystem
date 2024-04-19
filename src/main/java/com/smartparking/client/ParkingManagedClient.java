package com.smartparking.client;

import com.smartparking.grpc.Empety;
import com.smartparking.grpc.Parking;
import com.smartparking.grpc.ParkingManagedGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class ParkingManagedClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8081)
                .usePlaintext() // For testing purposes only, do not use in production
                .build();

        int option = 0;
        do {
            System.out.println("####### PARKING MANAGED CLIENT ##########");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - abertura de caixa ");
            System.out.println("99 - Encerrar ");
            option = scanner.nextInt();
            if (option == 1){
                openParking(channel,scanner);
            }

        }while (option != 99 );

    }

    public static void openParking(ManagedChannel channel, Scanner scanner){
        System.out.println("####### PARKING MANAGED CLIENT ##########");
        System.out.println("Informe o valor de abertura de caixa:");
        Double d = scanner.nextDouble();

        try {
            ParkingManagedGrpc.ParkingManagedBlockingStub blockingStub = ParkingManagedGrpc.newBlockingStub(channel);
            Parking parkingRequest = Parking.newBuilder().setOpeningCashValue(d.toString()).build();

            Empety response = blockingStub.parkingOpen(parkingRequest);
            System.out.println("Response from server: " + response);

        } finally {
            // Shutdown the channel
            channel.shutdown();
        }
    }
}
