package com.smartparking.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class FinanceSystemServer {

    public static void main(String[] args) {
        // Create a gRPC server and start it
        try {
            Server server = ServerBuilder.forPort(8083)
                    .addService(new FinanceSystemServiceImpl())
                    .build();

            server.start();
            System.out.println("Finance System Server started on portS 8083");

            // Block until the server is terminated
            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
