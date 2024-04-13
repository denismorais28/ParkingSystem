package com.smartparking.server;

import com.smartparking.grpc.VancancyManagementServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ParkingSystemServer {
    public static void main(String[] args) {
        // Create a gRPC server and start it
        try {
            Server server = ServerBuilder.forPort(8081)
                    .addService(new ParkingManagedServiceImpl())
//                    .addService(new VancancyManagementServiceImpl())
                    .build();

            server.start();
            System.out.println("Server started on port 8081");

            // Block until the server is terminated
            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
