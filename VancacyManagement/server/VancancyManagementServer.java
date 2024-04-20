package com.smartparking.VancacyManagement.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class VancancyManagementServer {

    public static void main(String[] args) {
        // Create a gRPC server and start it
        try {
            Server server = ServerBuilder.forPort(8082)
                    .addService(new VancancyManagementServiceImpl())
                    .build();

            server.start();
            System.out.println("Vancancy Management Server started on port 8082");

            // Block until the server is terminated
            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
