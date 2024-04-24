package com.smartparking.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: VancancyManagement.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VancancyManagementGrpc {

  private VancancyManagementGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ParkingSystem.VancancyManagement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smartparking.grpc.CarEntrance,
      com.smartparking.grpc.Ticket> getVancancyCheckInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "vancancyCheckIn",
      requestType = com.smartparking.grpc.CarEntrance.class,
      responseType = com.smartparking.grpc.Ticket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartparking.grpc.CarEntrance,
      com.smartparking.grpc.Ticket> getVancancyCheckInMethod() {
    io.grpc.MethodDescriptor<com.smartparking.grpc.CarEntrance, com.smartparking.grpc.Ticket> getVancancyCheckInMethod;
    if ((getVancancyCheckInMethod = VancancyManagementGrpc.getVancancyCheckInMethod) == null) {
      synchronized (VancancyManagementGrpc.class) {
        if ((getVancancyCheckInMethod = VancancyManagementGrpc.getVancancyCheckInMethod) == null) {
          VancancyManagementGrpc.getVancancyCheckInMethod = getVancancyCheckInMethod =
              io.grpc.MethodDescriptor.<com.smartparking.grpc.CarEntrance, com.smartparking.grpc.Ticket>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "vancancyCheckIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.CarEntrance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Ticket.getDefaultInstance()))
              .setSchemaDescriptor(new VancancyManagementMethodDescriptorSupplier("vancancyCheckIn"))
              .build();
        }
      }
    }
    return getVancancyCheckInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartparking.grpc.TicketRequestCheckout,
      com.smartparking.grpc.Ticket> getVancancyCheckOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "vancancyCheckOut",
      requestType = com.smartparking.grpc.TicketRequestCheckout.class,
      responseType = com.smartparking.grpc.Ticket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartparking.grpc.TicketRequestCheckout,
      com.smartparking.grpc.Ticket> getVancancyCheckOutMethod() {
    io.grpc.MethodDescriptor<com.smartparking.grpc.TicketRequestCheckout, com.smartparking.grpc.Ticket> getVancancyCheckOutMethod;
    if ((getVancancyCheckOutMethod = VancancyManagementGrpc.getVancancyCheckOutMethod) == null) {
      synchronized (VancancyManagementGrpc.class) {
        if ((getVancancyCheckOutMethod = VancancyManagementGrpc.getVancancyCheckOutMethod) == null) {
          VancancyManagementGrpc.getVancancyCheckOutMethod = getVancancyCheckOutMethod =
              io.grpc.MethodDescriptor.<com.smartparking.grpc.TicketRequestCheckout, com.smartparking.grpc.Ticket>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "vancancyCheckOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.TicketRequestCheckout.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Ticket.getDefaultInstance()))
              .setSchemaDescriptor(new VancancyManagementMethodDescriptorSupplier("vancancyCheckOut"))
              .build();
        }
      }
    }
    return getVancancyCheckOutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartparking.grpc.empty,
      com.smartparking.grpc.Status> getVancancyCheckIfItIsFullMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "vancancyCheckIfItIsFull",
      requestType = com.smartparking.grpc.empty.class,
      responseType = com.smartparking.grpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartparking.grpc.empty,
      com.smartparking.grpc.Status> getVancancyCheckIfItIsFullMethod() {
    io.grpc.MethodDescriptor<com.smartparking.grpc.empty, com.smartparking.grpc.Status> getVancancyCheckIfItIsFullMethod;
    if ((getVancancyCheckIfItIsFullMethod = VancancyManagementGrpc.getVancancyCheckIfItIsFullMethod) == null) {
      synchronized (VancancyManagementGrpc.class) {
        if ((getVancancyCheckIfItIsFullMethod = VancancyManagementGrpc.getVancancyCheckIfItIsFullMethod) == null) {
          VancancyManagementGrpc.getVancancyCheckIfItIsFullMethod = getVancancyCheckIfItIsFullMethod =
              io.grpc.MethodDescriptor.<com.smartparking.grpc.empty, com.smartparking.grpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "vancancyCheckIfItIsFull"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Status.getDefaultInstance()))
              .setSchemaDescriptor(new VancancyManagementMethodDescriptorSupplier("vancancyCheckIfItIsFull"))
              .build();
        }
      }
    }
    return getVancancyCheckIfItIsFullMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VancancyManagementStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VancancyManagementStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VancancyManagementStub>() {
        @java.lang.Override
        public VancancyManagementStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VancancyManagementStub(channel, callOptions);
        }
      };
    return VancancyManagementStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VancancyManagementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VancancyManagementBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VancancyManagementBlockingStub>() {
        @java.lang.Override
        public VancancyManagementBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VancancyManagementBlockingStub(channel, callOptions);
        }
      };
    return VancancyManagementBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VancancyManagementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VancancyManagementFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VancancyManagementFutureStub>() {
        @java.lang.Override
        public VancancyManagementFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VancancyManagementFutureStub(channel, callOptions);
        }
      };
    return VancancyManagementFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     *Informa que esta ocupando uma vaga
     * </pre>
     */
    default void vancancyCheckIn(com.smartparking.grpc.CarEntrance request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVancancyCheckInMethod(), responseObserver);
    }

    /**
     * <pre>
     *Informa que esta desocupando uma vaga
     * </pre>
     */
    default void vancancyCheckOut(com.smartparking.grpc.TicketRequestCheckout request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVancancyCheckOutMethod(), responseObserver);
    }

    /**
     * <pre>
     *Informa se nao ha vaga no estacionamento
     * </pre>
     */
    default void vancancyCheckIfItIsFull(com.smartparking.grpc.empty request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVancancyCheckIfItIsFullMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service VancancyManagement.
   */
  public static abstract class VancancyManagementImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VancancyManagementGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service VancancyManagement.
   */
  public static final class VancancyManagementStub
      extends io.grpc.stub.AbstractAsyncStub<VancancyManagementStub> {
    private VancancyManagementStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VancancyManagementStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VancancyManagementStub(channel, callOptions);
    }

    /**
     * <pre>
     *Informa que esta ocupando uma vaga
     * </pre>
     */
    public void vancancyCheckIn(com.smartparking.grpc.CarEntrance request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVancancyCheckInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Informa que esta desocupando uma vaga
     * </pre>
     */
    public void vancancyCheckOut(com.smartparking.grpc.TicketRequestCheckout request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVancancyCheckOutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Informa se nao ha vaga no estacionamento
     * </pre>
     */
    public void vancancyCheckIfItIsFull(com.smartparking.grpc.empty request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVancancyCheckIfItIsFullMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service VancancyManagement.
   */
  public static final class VancancyManagementBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VancancyManagementBlockingStub> {
    private VancancyManagementBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VancancyManagementBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VancancyManagementBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Informa que esta ocupando uma vaga
     * </pre>
     */
    public com.smartparking.grpc.Ticket vancancyCheckIn(com.smartparking.grpc.CarEntrance request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVancancyCheckInMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Informa que esta desocupando uma vaga
     * </pre>
     */
    public com.smartparking.grpc.Ticket vancancyCheckOut(com.smartparking.grpc.TicketRequestCheckout request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVancancyCheckOutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Informa se nao ha vaga no estacionamento
     * </pre>
     */
    public com.smartparking.grpc.Status vancancyCheckIfItIsFull(com.smartparking.grpc.empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVancancyCheckIfItIsFullMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service VancancyManagement.
   */
  public static final class VancancyManagementFutureStub
      extends io.grpc.stub.AbstractFutureStub<VancancyManagementFutureStub> {
    private VancancyManagementFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VancancyManagementFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VancancyManagementFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Informa que esta ocupando uma vaga
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartparking.grpc.Ticket> vancancyCheckIn(
        com.smartparking.grpc.CarEntrance request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVancancyCheckInMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Informa que esta desocupando uma vaga
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartparking.grpc.Ticket> vancancyCheckOut(
        com.smartparking.grpc.TicketRequestCheckout request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVancancyCheckOutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Informa se nao ha vaga no estacionamento
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartparking.grpc.Status> vancancyCheckIfItIsFull(
        com.smartparking.grpc.empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVancancyCheckIfItIsFullMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VANCANCY_CHECK_IN = 0;
  private static final int METHODID_VANCANCY_CHECK_OUT = 1;
  private static final int METHODID_VANCANCY_CHECK_IF_IT_IS_FULL = 2;

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
        case METHODID_VANCANCY_CHECK_IN:
          serviceImpl.vancancyCheckIn((com.smartparking.grpc.CarEntrance) request,
              (io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket>) responseObserver);
          break;
        case METHODID_VANCANCY_CHECK_OUT:
          serviceImpl.vancancyCheckOut((com.smartparking.grpc.TicketRequestCheckout) request,
              (io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket>) responseObserver);
          break;
        case METHODID_VANCANCY_CHECK_IF_IT_IS_FULL:
          serviceImpl.vancancyCheckIfItIsFull((com.smartparking.grpc.empty) request,
              (io.grpc.stub.StreamObserver<com.smartparking.grpc.Status>) responseObserver);
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
          getVancancyCheckInMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.smartparking.grpc.CarEntrance,
              com.smartparking.grpc.Ticket>(
                service, METHODID_VANCANCY_CHECK_IN)))
        .addMethod(
          getVancancyCheckOutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.smartparking.grpc.TicketRequestCheckout,
              com.smartparking.grpc.Ticket>(
                service, METHODID_VANCANCY_CHECK_OUT)))
        .addMethod(
          getVancancyCheckIfItIsFullMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.smartparking.grpc.empty,
              com.smartparking.grpc.Status>(
                service, METHODID_VANCANCY_CHECK_IF_IT_IS_FULL)))
        .build();
  }

  private static abstract class VancancyManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VancancyManagementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smartparking.grpc.VancancyManagementServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VancancyManagement");
    }
  }

  private static final class VancancyManagementFileDescriptorSupplier
      extends VancancyManagementBaseDescriptorSupplier {
    VancancyManagementFileDescriptorSupplier() {}
  }

  private static final class VancancyManagementMethodDescriptorSupplier
      extends VancancyManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VancancyManagementMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (VancancyManagementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VancancyManagementFileDescriptorSupplier())
              .addMethod(getVancancyCheckInMethod())
              .addMethod(getVancancyCheckOutMethod())
              .addMethod(getVancancyCheckIfItIsFullMethod())
              .build();
        }
      }
    }
    return result;
  }
}
