package com.smartparking.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: ParkingSystem.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ParkingManagedGrpc {

  private ParkingManagedGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ParkingSystem.ParkingManaged";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smartparking.grpc.Car,
      com.smartparking.grpc.Ticket> getCarCheckInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "carCheckIn",
      requestType = com.smartparking.grpc.Car.class,
      responseType = com.smartparking.grpc.Ticket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartparking.grpc.Car,
      com.smartparking.grpc.Ticket> getCarCheckInMethod() {
    io.grpc.MethodDescriptor<com.smartparking.grpc.Car, com.smartparking.grpc.Ticket> getCarCheckInMethod;
    if ((getCarCheckInMethod = ParkingManagedGrpc.getCarCheckInMethod) == null) {
      synchronized (ParkingManagedGrpc.class) {
        if ((getCarCheckInMethod = ParkingManagedGrpc.getCarCheckInMethod) == null) {
          ParkingManagedGrpc.getCarCheckInMethod = getCarCheckInMethod =
              io.grpc.MethodDescriptor.<com.smartparking.grpc.Car, com.smartparking.grpc.Ticket>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "carCheckIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Car.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Ticket.getDefaultInstance()))
              .setSchemaDescriptor(new ParkingManagedMethodDescriptorSupplier("carCheckIn"))
              .build();
        }
      }
    }
    return getCarCheckInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartparking.grpc.Car,
      com.smartparking.grpc.Ticket> getCarCheckOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CarCheckOut",
      requestType = com.smartparking.grpc.Car.class,
      responseType = com.smartparking.grpc.Ticket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartparking.grpc.Car,
      com.smartparking.grpc.Ticket> getCarCheckOutMethod() {
    io.grpc.MethodDescriptor<com.smartparking.grpc.Car, com.smartparking.grpc.Ticket> getCarCheckOutMethod;
    if ((getCarCheckOutMethod = ParkingManagedGrpc.getCarCheckOutMethod) == null) {
      synchronized (ParkingManagedGrpc.class) {
        if ((getCarCheckOutMethod = ParkingManagedGrpc.getCarCheckOutMethod) == null) {
          ParkingManagedGrpc.getCarCheckOutMethod = getCarCheckOutMethod =
              io.grpc.MethodDescriptor.<com.smartparking.grpc.Car, com.smartparking.grpc.Ticket>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CarCheckOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Car.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Ticket.getDefaultInstance()))
              .setSchemaDescriptor(new ParkingManagedMethodDescriptorSupplier("CarCheckOut"))
              .build();
        }
      }
    }
    return getCarCheckOutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ParkingManagedStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ParkingManagedStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ParkingManagedStub>() {
        @java.lang.Override
        public ParkingManagedStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ParkingManagedStub(channel, callOptions);
        }
      };
    return ParkingManagedStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ParkingManagedBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ParkingManagedBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ParkingManagedBlockingStub>() {
        @java.lang.Override
        public ParkingManagedBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ParkingManagedBlockingStub(channel, callOptions);
        }
      };
    return ParkingManagedBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ParkingManagedFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ParkingManagedFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ParkingManagedFutureStub>() {
        @java.lang.Override
        public ParkingManagedFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ParkingManagedFutureStub(channel, callOptions);
        }
      };
    return ParkingManagedFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    default void carCheckIn(com.smartparking.grpc.Car request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCarCheckInMethod(), responseObserver);
    }

    /**
     */
    default void carCheckOut(com.smartparking.grpc.Car request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCarCheckOutMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ParkingManaged.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class ParkingManagedImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ParkingManagedGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ParkingManaged.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class ParkingManagedStub
      extends io.grpc.stub.AbstractAsyncStub<ParkingManagedStub> {
    private ParkingManagedStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingManagedStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ParkingManagedStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void carCheckIn(com.smartparking.grpc.Car request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCarCheckInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void carCheckOut(com.smartparking.grpc.Car request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCarCheckOutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ParkingManaged.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class ParkingManagedBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ParkingManagedBlockingStub> {
    private ParkingManagedBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingManagedBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ParkingManagedBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.smartparking.grpc.Ticket carCheckIn(com.smartparking.grpc.Car request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCarCheckInMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartparking.grpc.Ticket carCheckOut(com.smartparking.grpc.Car request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCarCheckOutMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ParkingManaged.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class ParkingManagedFutureStub
      extends io.grpc.stub.AbstractFutureStub<ParkingManagedFutureStub> {
    private ParkingManagedFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingManagedFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ParkingManagedFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartparking.grpc.Ticket> carCheckIn(
        com.smartparking.grpc.Car request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCarCheckInMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartparking.grpc.Ticket> carCheckOut(
        com.smartparking.grpc.Car request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCarCheckOutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CAR_CHECK_IN = 0;
  private static final int METHODID_CAR_CHECK_OUT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CAR_CHECK_IN:
          serviceImpl.carCheckIn((com.smartparking.grpc.Car) request,
              (io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket>) responseObserver);
          break;
        case METHODID_CAR_CHECK_OUT:
          serviceImpl.carCheckOut((com.smartparking.grpc.Car) request,
              (io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCarCheckInMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.smartparking.grpc.Car,
              com.smartparking.grpc.Ticket>(
                service, METHODID_CAR_CHECK_IN)))
        .addMethod(
          getCarCheckOutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.smartparking.grpc.Car,
              com.smartparking.grpc.Ticket>(
                service, METHODID_CAR_CHECK_OUT)))
        .build();
  }

  private static abstract class ParkingManagedBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ParkingManagedBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smartparking.grpc.ParkingSystemServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ParkingManaged");
    }
  }

  private static final class ParkingManagedFileDescriptorSupplier
      extends ParkingManagedBaseDescriptorSupplier {
    ParkingManagedFileDescriptorSupplier() {}
  }

  private static final class ParkingManagedMethodDescriptorSupplier
      extends ParkingManagedBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ParkingManagedMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ParkingManagedGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ParkingManagedFileDescriptorSupplier())
              .addMethod(getCarCheckInMethod())
              .addMethod(getCarCheckOutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
