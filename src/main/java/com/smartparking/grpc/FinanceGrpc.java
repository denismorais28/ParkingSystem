package com.smartparking.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: ParkingSystem.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FinanceGrpc {

  private FinanceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ParkingSystem.Finance";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smartparking.grpc.Ticket,
      com.smartparking.grpc.Ticket> getPaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "payment",
      requestType = com.smartparking.grpc.Ticket.class,
      responseType = com.smartparking.grpc.Ticket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartparking.grpc.Ticket,
      com.smartparking.grpc.Ticket> getPaymentMethod() {
    io.grpc.MethodDescriptor<com.smartparking.grpc.Ticket, com.smartparking.grpc.Ticket> getPaymentMethod;
    if ((getPaymentMethod = FinanceGrpc.getPaymentMethod) == null) {
      synchronized (FinanceGrpc.class) {
        if ((getPaymentMethod = FinanceGrpc.getPaymentMethod) == null) {
          FinanceGrpc.getPaymentMethod = getPaymentMethod =
              io.grpc.MethodDescriptor.<com.smartparking.grpc.Ticket, com.smartparking.grpc.Ticket>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "payment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Ticket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Ticket.getDefaultInstance()))
              .setSchemaDescriptor(new FinanceMethodDescriptorSupplier("payment"))
              .build();
        }
      }
    }
    return getPaymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartparking.grpc.Ticket,
      com.smartparking.grpc.Ticket> getAddCarToPaymentRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addCarToPaymentRecord",
      requestType = com.smartparking.grpc.Ticket.class,
      responseType = com.smartparking.grpc.Ticket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartparking.grpc.Ticket,
      com.smartparking.grpc.Ticket> getAddCarToPaymentRecordMethod() {
    io.grpc.MethodDescriptor<com.smartparking.grpc.Ticket, com.smartparking.grpc.Ticket> getAddCarToPaymentRecordMethod;
    if ((getAddCarToPaymentRecordMethod = FinanceGrpc.getAddCarToPaymentRecordMethod) == null) {
      synchronized (FinanceGrpc.class) {
        if ((getAddCarToPaymentRecordMethod = FinanceGrpc.getAddCarToPaymentRecordMethod) == null) {
          FinanceGrpc.getAddCarToPaymentRecordMethod = getAddCarToPaymentRecordMethod =
              io.grpc.MethodDescriptor.<com.smartparking.grpc.Ticket, com.smartparking.grpc.Ticket>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addCarToPaymentRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Ticket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Ticket.getDefaultInstance()))
              .setSchemaDescriptor(new FinanceMethodDescriptorSupplier("addCarToPaymentRecord"))
              .build();
        }
      }
    }
    return getAddCarToPaymentRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartparking.grpc.Empety,
      com.smartparking.grpc.FinanceDay> getPaymentRecordReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PaymentRecordReport",
      requestType = com.smartparking.grpc.Empety.class,
      responseType = com.smartparking.grpc.FinanceDay.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartparking.grpc.Empety,
      com.smartparking.grpc.FinanceDay> getPaymentRecordReportMethod() {
    io.grpc.MethodDescriptor<com.smartparking.grpc.Empety, com.smartparking.grpc.FinanceDay> getPaymentRecordReportMethod;
    if ((getPaymentRecordReportMethod = FinanceGrpc.getPaymentRecordReportMethod) == null) {
      synchronized (FinanceGrpc.class) {
        if ((getPaymentRecordReportMethod = FinanceGrpc.getPaymentRecordReportMethod) == null) {
          FinanceGrpc.getPaymentRecordReportMethod = getPaymentRecordReportMethod =
              io.grpc.MethodDescriptor.<com.smartparking.grpc.Empety, com.smartparking.grpc.FinanceDay>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PaymentRecordReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Empety.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.FinanceDay.getDefaultInstance()))
              .setSchemaDescriptor(new FinanceMethodDescriptorSupplier("PaymentRecordReport"))
              .build();
        }
      }
    }
    return getPaymentRecordReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartparking.grpc.Empety,
      com.smartparking.grpc.FinanceDay> getClosureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "closure",
      requestType = com.smartparking.grpc.Empety.class,
      responseType = com.smartparking.grpc.FinanceDay.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartparking.grpc.Empety,
      com.smartparking.grpc.FinanceDay> getClosureMethod() {
    io.grpc.MethodDescriptor<com.smartparking.grpc.Empety, com.smartparking.grpc.FinanceDay> getClosureMethod;
    if ((getClosureMethod = FinanceGrpc.getClosureMethod) == null) {
      synchronized (FinanceGrpc.class) {
        if ((getClosureMethod = FinanceGrpc.getClosureMethod) == null) {
          FinanceGrpc.getClosureMethod = getClosureMethod =
              io.grpc.MethodDescriptor.<com.smartparking.grpc.Empety, com.smartparking.grpc.FinanceDay>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "closure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Empety.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.FinanceDay.getDefaultInstance()))
              .setSchemaDescriptor(new FinanceMethodDescriptorSupplier("closure"))
              .build();
        }
      }
    }
    return getClosureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartparking.grpc.Parking,
      com.smartparking.grpc.Empety> getOpenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "open",
      requestType = com.smartparking.grpc.Parking.class,
      responseType = com.smartparking.grpc.Empety.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartparking.grpc.Parking,
      com.smartparking.grpc.Empety> getOpenMethod() {
    io.grpc.MethodDescriptor<com.smartparking.grpc.Parking, com.smartparking.grpc.Empety> getOpenMethod;
    if ((getOpenMethod = FinanceGrpc.getOpenMethod) == null) {
      synchronized (FinanceGrpc.class) {
        if ((getOpenMethod = FinanceGrpc.getOpenMethod) == null) {
          FinanceGrpc.getOpenMethod = getOpenMethod =
              io.grpc.MethodDescriptor.<com.smartparking.grpc.Parking, com.smartparking.grpc.Empety>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "open"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Parking.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Empety.getDefaultInstance()))
              .setSchemaDescriptor(new FinanceMethodDescriptorSupplier("open"))
              .build();
        }
      }
    }
    return getOpenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FinanceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FinanceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FinanceStub>() {
        @java.lang.Override
        public FinanceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FinanceStub(channel, callOptions);
        }
      };
    return FinanceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FinanceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FinanceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FinanceBlockingStub>() {
        @java.lang.Override
        public FinanceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FinanceBlockingStub(channel, callOptions);
        }
      };
    return FinanceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FinanceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FinanceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FinanceFutureStub>() {
        @java.lang.Override
        public FinanceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FinanceFutureStub(channel, callOptions);
        }
      };
    return FinanceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void payment(com.smartparking.grpc.Ticket request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPaymentMethod(), responseObserver);
    }

    /**
     */
    default void addCarToPaymentRecord(com.smartparking.grpc.Ticket request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddCarToPaymentRecordMethod(), responseObserver);
    }

    /**
     */
    default void paymentRecordReport(com.smartparking.grpc.Empety request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.FinanceDay> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPaymentRecordReportMethod(), responseObserver);
    }

    /**
     */
    default void closure(com.smartparking.grpc.Empety request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.FinanceDay> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClosureMethod(), responseObserver);
    }

    /**
     */
    default void open(com.smartparking.grpc.Parking request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Empety> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Finance.
   */
  public static abstract class FinanceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FinanceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Finance.
   */
  public static final class FinanceStub
      extends io.grpc.stub.AbstractAsyncStub<FinanceStub> {
    private FinanceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FinanceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FinanceStub(channel, callOptions);
    }

    /**
     */
    public void payment(com.smartparking.grpc.Ticket request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPaymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addCarToPaymentRecord(com.smartparking.grpc.Ticket request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddCarToPaymentRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void paymentRecordReport(com.smartparking.grpc.Empety request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.FinanceDay> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPaymentRecordReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closure(com.smartparking.grpc.Empety request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.FinanceDay> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClosureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void open(com.smartparking.grpc.Parking request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Empety> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Finance.
   */
  public static final class FinanceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FinanceBlockingStub> {
    private FinanceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FinanceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FinanceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.smartparking.grpc.Ticket payment(com.smartparking.grpc.Ticket request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPaymentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartparking.grpc.Ticket addCarToPaymentRecord(com.smartparking.grpc.Ticket request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddCarToPaymentRecordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartparking.grpc.FinanceDay paymentRecordReport(com.smartparking.grpc.Empety request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPaymentRecordReportMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartparking.grpc.FinanceDay closure(com.smartparking.grpc.Empety request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClosureMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartparking.grpc.Empety open(com.smartparking.grpc.Parking request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Finance.
   */
  public static final class FinanceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FinanceFutureStub> {
    private FinanceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FinanceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FinanceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartparking.grpc.Ticket> payment(
        com.smartparking.grpc.Ticket request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPaymentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartparking.grpc.Ticket> addCarToPaymentRecord(
        com.smartparking.grpc.Ticket request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddCarToPaymentRecordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartparking.grpc.FinanceDay> paymentRecordReport(
        com.smartparking.grpc.Empety request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPaymentRecordReportMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartparking.grpc.FinanceDay> closure(
        com.smartparking.grpc.Empety request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClosureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartparking.grpc.Empety> open(
        com.smartparking.grpc.Parking request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PAYMENT = 0;
  private static final int METHODID_ADD_CAR_TO_PAYMENT_RECORD = 1;
  private static final int METHODID_PAYMENT_RECORD_REPORT = 2;
  private static final int METHODID_CLOSURE = 3;
  private static final int METHODID_OPEN = 4;

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
        case METHODID_PAYMENT:
          serviceImpl.payment((com.smartparking.grpc.Ticket) request,
              (io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket>) responseObserver);
          break;
        case METHODID_ADD_CAR_TO_PAYMENT_RECORD:
          serviceImpl.addCarToPaymentRecord((com.smartparking.grpc.Ticket) request,
              (io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket>) responseObserver);
          break;
        case METHODID_PAYMENT_RECORD_REPORT:
          serviceImpl.paymentRecordReport((com.smartparking.grpc.Empety) request,
              (io.grpc.stub.StreamObserver<com.smartparking.grpc.FinanceDay>) responseObserver);
          break;
        case METHODID_CLOSURE:
          serviceImpl.closure((com.smartparking.grpc.Empety) request,
              (io.grpc.stub.StreamObserver<com.smartparking.grpc.FinanceDay>) responseObserver);
          break;
        case METHODID_OPEN:
          serviceImpl.open((com.smartparking.grpc.Parking) request,
              (io.grpc.stub.StreamObserver<com.smartparking.grpc.Empety>) responseObserver);
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
          getPaymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.smartparking.grpc.Ticket,
              com.smartparking.grpc.Ticket>(
                service, METHODID_PAYMENT)))
        .addMethod(
          getAddCarToPaymentRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.smartparking.grpc.Ticket,
              com.smartparking.grpc.Ticket>(
                service, METHODID_ADD_CAR_TO_PAYMENT_RECORD)))
        .addMethod(
          getPaymentRecordReportMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.smartparking.grpc.Empety,
              com.smartparking.grpc.FinanceDay>(
                service, METHODID_PAYMENT_RECORD_REPORT)))
        .addMethod(
          getClosureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.smartparking.grpc.Empety,
              com.smartparking.grpc.FinanceDay>(
                service, METHODID_CLOSURE)))
        .addMethod(
          getOpenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.smartparking.grpc.Parking,
              com.smartparking.grpc.Empety>(
                service, METHODID_OPEN)))
        .build();
  }

  private static abstract class FinanceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FinanceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smartparking.grpc.ParkingSystemServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Finance");
    }
  }

  private static final class FinanceFileDescriptorSupplier
      extends FinanceBaseDescriptorSupplier {
    FinanceFileDescriptorSupplier() {}
  }

  private static final class FinanceMethodDescriptorSupplier
      extends FinanceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FinanceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FinanceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FinanceFileDescriptorSupplier())
              .addMethod(getPaymentMethod())
              .addMethod(getAddCarToPaymentRecordMethod())
              .addMethod(getPaymentRecordReportMethod())
              .addMethod(getClosureMethod())
              .addMethod(getOpenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
