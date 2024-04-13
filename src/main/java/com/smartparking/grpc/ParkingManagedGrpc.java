package com.smartparking.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: ParkingSystem.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ParkingManagedGrpc {

  private ParkingManagedGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ParkingSystem.ParkingManaged";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smartparking.grpc.Parking,
      com.smartparking.grpc.Empety> getParkingOpenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParkingOpen",
      requestType = com.smartparking.grpc.Parking.class,
      responseType = com.smartparking.grpc.Empety.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartparking.grpc.Parking,
      com.smartparking.grpc.Empety> getParkingOpenMethod() {
    io.grpc.MethodDescriptor<com.smartparking.grpc.Parking, com.smartparking.grpc.Empety> getParkingOpenMethod;
    if ((getParkingOpenMethod = ParkingManagedGrpc.getParkingOpenMethod) == null) {
      synchronized (ParkingManagedGrpc.class) {
        if ((getParkingOpenMethod = ParkingManagedGrpc.getParkingOpenMethod) == null) {
          ParkingManagedGrpc.getParkingOpenMethod = getParkingOpenMethod =
              io.grpc.MethodDescriptor.<com.smartparking.grpc.Parking, com.smartparking.grpc.Empety>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParkingOpen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Parking.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Empety.getDefaultInstance()))
              .setSchemaDescriptor(new ParkingManagedMethodDescriptorSupplier("ParkingOpen"))
              .build();
        }
      }
    }
    return getParkingOpenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartparking.grpc.CarEntrance,
      com.smartparking.grpc.Ticket> getCarCheckInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "carCheckIn",
      requestType = com.smartparking.grpc.CarEntrance.class,
      responseType = com.smartparking.grpc.Ticket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartparking.grpc.CarEntrance,
      com.smartparking.grpc.Ticket> getCarCheckInMethod() {
    io.grpc.MethodDescriptor<com.smartparking.grpc.CarEntrance, com.smartparking.grpc.Ticket> getCarCheckInMethod;
    if ((getCarCheckInMethod = ParkingManagedGrpc.getCarCheckInMethod) == null) {
      synchronized (ParkingManagedGrpc.class) {
        if ((getCarCheckInMethod = ParkingManagedGrpc.getCarCheckInMethod) == null) {
          ParkingManagedGrpc.getCarCheckInMethod = getCarCheckInMethod =
              io.grpc.MethodDescriptor.<com.smartparking.grpc.CarEntrance, com.smartparking.grpc.Ticket>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "carCheckIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.CarEntrance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Ticket.getDefaultInstance()))
              .setSchemaDescriptor(new ParkingManagedMethodDescriptorSupplier("carCheckIn"))
              .build();
        }
      }
    }
    return getCarCheckInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartparking.grpc.CarExit,
      com.smartparking.grpc.Ticket> getCarCheckOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CarCheckOut",
      requestType = com.smartparking.grpc.CarExit.class,
      responseType = com.smartparking.grpc.Ticket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartparking.grpc.CarExit,
      com.smartparking.grpc.Ticket> getCarCheckOutMethod() {
    io.grpc.MethodDescriptor<com.smartparking.grpc.CarExit, com.smartparking.grpc.Ticket> getCarCheckOutMethod;
    if ((getCarCheckOutMethod = ParkingManagedGrpc.getCarCheckOutMethod) == null) {
      synchronized (ParkingManagedGrpc.class) {
        if ((getCarCheckOutMethod = ParkingManagedGrpc.getCarCheckOutMethod) == null) {
          ParkingManagedGrpc.getCarCheckOutMethod = getCarCheckOutMethod =
              io.grpc.MethodDescriptor.<com.smartparking.grpc.CarExit, com.smartparking.grpc.Ticket>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CarCheckOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.CarExit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Ticket.getDefaultInstance()))
              .setSchemaDescriptor(new ParkingManagedMethodDescriptorSupplier("CarCheckOut"))
              .build();
        }
      }
    }
    return getCarCheckOutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartparking.grpc.Status,
      com.smartparking.grpc.Status> getCheckIfItIsFullMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckIfItIsFull",
      requestType = com.smartparking.grpc.Status.class,
      responseType = com.smartparking.grpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartparking.grpc.Status,
      com.smartparking.grpc.Status> getCheckIfItIsFullMethod() {
    io.grpc.MethodDescriptor<com.smartparking.grpc.Status, com.smartparking.grpc.Status> getCheckIfItIsFullMethod;
    if ((getCheckIfItIsFullMethod = ParkingManagedGrpc.getCheckIfItIsFullMethod) == null) {
      synchronized (ParkingManagedGrpc.class) {
        if ((getCheckIfItIsFullMethod = ParkingManagedGrpc.getCheckIfItIsFullMethod) == null) {
          ParkingManagedGrpc.getCheckIfItIsFullMethod = getCheckIfItIsFullMethod =
              io.grpc.MethodDescriptor.<com.smartparking.grpc.Status, com.smartparking.grpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckIfItIsFull"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Status.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Status.getDefaultInstance()))
              .setSchemaDescriptor(new ParkingManagedMethodDescriptorSupplier("CheckIfItIsFull"))
              .build();
        }
      }
    }
    return getCheckIfItIsFullMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartparking.grpc.Ticket,
      com.smartparking.grpc.Ticket> getCheckOutPaymantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckOutPaymant",
      requestType = com.smartparking.grpc.Ticket.class,
      responseType = com.smartparking.grpc.Ticket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartparking.grpc.Ticket,
      com.smartparking.grpc.Ticket> getCheckOutPaymantMethod() {
    io.grpc.MethodDescriptor<com.smartparking.grpc.Ticket, com.smartparking.grpc.Ticket> getCheckOutPaymantMethod;
    if ((getCheckOutPaymantMethod = ParkingManagedGrpc.getCheckOutPaymantMethod) == null) {
      synchronized (ParkingManagedGrpc.class) {
        if ((getCheckOutPaymantMethod = ParkingManagedGrpc.getCheckOutPaymantMethod) == null) {
          ParkingManagedGrpc.getCheckOutPaymantMethod = getCheckOutPaymantMethod =
              io.grpc.MethodDescriptor.<com.smartparking.grpc.Ticket, com.smartparking.grpc.Ticket>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckOutPaymant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Ticket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Ticket.getDefaultInstance()))
              .setSchemaDescriptor(new ParkingManagedMethodDescriptorSupplier("CheckOutPaymant"))
              .build();
        }
      }
    }
    return getCheckOutPaymantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartparking.grpc.Request,
      com.smartparking.grpc.FinanceDay> getParkingClosureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParkingClosure",
      requestType = com.smartparking.grpc.Request.class,
      responseType = com.smartparking.grpc.FinanceDay.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartparking.grpc.Request,
      com.smartparking.grpc.FinanceDay> getParkingClosureMethod() {
    io.grpc.MethodDescriptor<com.smartparking.grpc.Request, com.smartparking.grpc.FinanceDay> getParkingClosureMethod;
    if ((getParkingClosureMethod = ParkingManagedGrpc.getParkingClosureMethod) == null) {
      synchronized (ParkingManagedGrpc.class) {
        if ((getParkingClosureMethod = ParkingManagedGrpc.getParkingClosureMethod) == null) {
          ParkingManagedGrpc.getParkingClosureMethod = getParkingClosureMethod =
              io.grpc.MethodDescriptor.<com.smartparking.grpc.Request, com.smartparking.grpc.FinanceDay>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParkingClosure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.FinanceDay.getDefaultInstance()))
              .setSchemaDescriptor(new ParkingManagedMethodDescriptorSupplier("ParkingClosure"))
              .build();
        }
      }
    }
    return getParkingClosureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartparking.grpc.Request,
      com.smartparking.grpc.FinanceDay> getReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "report",
      requestType = com.smartparking.grpc.Request.class,
      responseType = com.smartparking.grpc.FinanceDay.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartparking.grpc.Request,
      com.smartparking.grpc.FinanceDay> getReportMethod() {
    io.grpc.MethodDescriptor<com.smartparking.grpc.Request, com.smartparking.grpc.FinanceDay> getReportMethod;
    if ((getReportMethod = ParkingManagedGrpc.getReportMethod) == null) {
      synchronized (ParkingManagedGrpc.class) {
        if ((getReportMethod = ParkingManagedGrpc.getReportMethod) == null) {
          ParkingManagedGrpc.getReportMethod = getReportMethod =
              io.grpc.MethodDescriptor.<com.smartparking.grpc.Request, com.smartparking.grpc.FinanceDay>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "report"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartparking.grpc.FinanceDay.getDefaultInstance()))
              .setSchemaDescriptor(new ParkingManagedMethodDescriptorSupplier("report"))
              .build();
        }
      }
    }
    return getReportMethod;
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
   */
  public interface AsyncService {

    /**
     * <pre>
     *Abertura de caixa do estacionamento no dia
     * </pre>
     */
    default void parkingOpen(com.smartparking.grpc.Parking request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Empety> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParkingOpenMethod(), responseObserver);
    }

    /**
     * <pre>
     *Entrada do veiculo -&gt; gera um ticket (Dispara para o serviço VancancyManagement)
     * </pre>
     */
    default void carCheckIn(com.smartparking.grpc.CarEntrance request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCarCheckInMethod(), responseObserver);
    }

    /**
     * <pre>
     *Saida do veiculo -&gt; Pode ser negada se pagamento não tiver sido efetuado (dispara para o serviço VancancyManagement)
     * </pre>
     */
    default void carCheckOut(com.smartparking.grpc.CarExit request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCarCheckOutMethod(), responseObserver);
    }

    /**
     * <pre>
     *Verificar se esta cheio no serviço VancancyManagement
     * </pre>
     */
    default void checkIfItIsFull(com.smartparking.grpc.Status request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckIfItIsFullMethod(), responseObserver);
    }

    /**
     * <pre>
     *Pagamento das horas do veiculo
     * </pre>
     */
    default void checkOutPaymant(com.smartparking.grpc.Ticket request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckOutPaymantMethod(), responseObserver);
    }

    /**
     * <pre>
     *Fechamento do caixa do estacionamento no dia
     * </pre>
     */
    default void parkingClosure(com.smartparking.grpc.Request request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.FinanceDay> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParkingClosureMethod(), responseObserver);
    }

    /**
     * <pre>
     *Relatorio de entrada e saida de veiculo
     * </pre>
     */
    default void report(com.smartparking.grpc.Request request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.FinanceDay> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReportMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ParkingManaged.
   */
  public static abstract class ParkingManagedImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ParkingManagedGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ParkingManaged.
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
     *Abertura de caixa do estacionamento no dia
     * </pre>
     */
    public void parkingOpen(com.smartparking.grpc.Parking request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Empety> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParkingOpenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Entrada do veiculo -&gt; gera um ticket (Dispara para o serviço VancancyManagement)
     * </pre>
     */
    public void carCheckIn(com.smartparking.grpc.CarEntrance request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCarCheckInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Saida do veiculo -&gt; Pode ser negada se pagamento não tiver sido efetuado (dispara para o serviço VancancyManagement)
     * </pre>
     */
    public void carCheckOut(com.smartparking.grpc.CarExit request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCarCheckOutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Verificar se esta cheio no serviço VancancyManagement
     * </pre>
     */
    public void checkIfItIsFull(com.smartparking.grpc.Status request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckIfItIsFullMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Pagamento das horas do veiculo
     * </pre>
     */
    public void checkOutPaymant(com.smartparking.grpc.Ticket request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckOutPaymantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Fechamento do caixa do estacionamento no dia
     * </pre>
     */
    public void parkingClosure(com.smartparking.grpc.Request request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.FinanceDay> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParkingClosureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Relatorio de entrada e saida de veiculo
     * </pre>
     */
    public void report(com.smartparking.grpc.Request request,
        io.grpc.stub.StreamObserver<com.smartparking.grpc.FinanceDay> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReportMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ParkingManaged.
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
     *Abertura de caixa do estacionamento no dia
     * </pre>
     */
    public com.smartparking.grpc.Empety parkingOpen(com.smartparking.grpc.Parking request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParkingOpenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Entrada do veiculo -&gt; gera um ticket (Dispara para o serviço VancancyManagement)
     * </pre>
     */
    public com.smartparking.grpc.Ticket carCheckIn(com.smartparking.grpc.CarEntrance request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCarCheckInMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Saida do veiculo -&gt; Pode ser negada se pagamento não tiver sido efetuado (dispara para o serviço VancancyManagement)
     * </pre>
     */
    public com.smartparking.grpc.Ticket carCheckOut(com.smartparking.grpc.CarExit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCarCheckOutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Verificar se esta cheio no serviço VancancyManagement
     * </pre>
     */
    public com.smartparking.grpc.Status checkIfItIsFull(com.smartparking.grpc.Status request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckIfItIsFullMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Pagamento das horas do veiculo
     * </pre>
     */
    public com.smartparking.grpc.Ticket checkOutPaymant(com.smartparking.grpc.Ticket request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckOutPaymantMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Fechamento do caixa do estacionamento no dia
     * </pre>
     */
    public com.smartparking.grpc.FinanceDay parkingClosure(com.smartparking.grpc.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParkingClosureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Relatorio de entrada e saida de veiculo
     * </pre>
     */
    public com.smartparking.grpc.FinanceDay report(com.smartparking.grpc.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReportMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ParkingManaged.
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
     *Abertura de caixa do estacionamento no dia
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartparking.grpc.Empety> parkingOpen(
        com.smartparking.grpc.Parking request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParkingOpenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Entrada do veiculo -&gt; gera um ticket (Dispara para o serviço VancancyManagement)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartparking.grpc.Ticket> carCheckIn(
        com.smartparking.grpc.CarEntrance request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCarCheckInMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Saida do veiculo -&gt; Pode ser negada se pagamento não tiver sido efetuado (dispara para o serviço VancancyManagement)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartparking.grpc.Ticket> carCheckOut(
        com.smartparking.grpc.CarExit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCarCheckOutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Verificar se esta cheio no serviço VancancyManagement
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartparking.grpc.Status> checkIfItIsFull(
        com.smartparking.grpc.Status request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckIfItIsFullMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Pagamento das horas do veiculo
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartparking.grpc.Ticket> checkOutPaymant(
        com.smartparking.grpc.Ticket request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckOutPaymantMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Fechamento do caixa do estacionamento no dia
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartparking.grpc.FinanceDay> parkingClosure(
        com.smartparking.grpc.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParkingClosureMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Relatorio de entrada e saida de veiculo
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartparking.grpc.FinanceDay> report(
        com.smartparking.grpc.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReportMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARKING_OPEN = 0;
  private static final int METHODID_CAR_CHECK_IN = 1;
  private static final int METHODID_CAR_CHECK_OUT = 2;
  private static final int METHODID_CHECK_IF_IT_IS_FULL = 3;
  private static final int METHODID_CHECK_OUT_PAYMANT = 4;
  private static final int METHODID_PARKING_CLOSURE = 5;
  private static final int METHODID_REPORT = 6;

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
        case METHODID_PARKING_OPEN:
          serviceImpl.parkingOpen((com.smartparking.grpc.Parking) request,
              (io.grpc.stub.StreamObserver<com.smartparking.grpc.Empety>) responseObserver);
          break;
        case METHODID_CAR_CHECK_IN:
          serviceImpl.carCheckIn((com.smartparking.grpc.CarEntrance) request,
              (io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket>) responseObserver);
          break;
        case METHODID_CAR_CHECK_OUT:
          serviceImpl.carCheckOut((com.smartparking.grpc.CarExit) request,
              (io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket>) responseObserver);
          break;
        case METHODID_CHECK_IF_IT_IS_FULL:
          serviceImpl.checkIfItIsFull((com.smartparking.grpc.Status) request,
              (io.grpc.stub.StreamObserver<com.smartparking.grpc.Status>) responseObserver);
          break;
        case METHODID_CHECK_OUT_PAYMANT:
          serviceImpl.checkOutPaymant((com.smartparking.grpc.Ticket) request,
              (io.grpc.stub.StreamObserver<com.smartparking.grpc.Ticket>) responseObserver);
          break;
        case METHODID_PARKING_CLOSURE:
          serviceImpl.parkingClosure((com.smartparking.grpc.Request) request,
              (io.grpc.stub.StreamObserver<com.smartparking.grpc.FinanceDay>) responseObserver);
          break;
        case METHODID_REPORT:
          serviceImpl.report((com.smartparking.grpc.Request) request,
              (io.grpc.stub.StreamObserver<com.smartparking.grpc.FinanceDay>) responseObserver);
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
          getParkingOpenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.smartparking.grpc.Parking,
              com.smartparking.grpc.Empety>(
                service, METHODID_PARKING_OPEN)))
        .addMethod(
          getCarCheckInMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.smartparking.grpc.CarEntrance,
              com.smartparking.grpc.Ticket>(
                service, METHODID_CAR_CHECK_IN)))
        .addMethod(
          getCarCheckOutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.smartparking.grpc.CarExit,
              com.smartparking.grpc.Ticket>(
                service, METHODID_CAR_CHECK_OUT)))
        .addMethod(
          getCheckIfItIsFullMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.smartparking.grpc.Status,
              com.smartparking.grpc.Status>(
                service, METHODID_CHECK_IF_IT_IS_FULL)))
        .addMethod(
          getCheckOutPaymantMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.smartparking.grpc.Ticket,
              com.smartparking.grpc.Ticket>(
                service, METHODID_CHECK_OUT_PAYMANT)))
        .addMethod(
          getParkingClosureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.smartparking.grpc.Request,
              com.smartparking.grpc.FinanceDay>(
                service, METHODID_PARKING_CLOSURE)))
        .addMethod(
          getReportMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.smartparking.grpc.Request,
              com.smartparking.grpc.FinanceDay>(
                service, METHODID_REPORT)))
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
              .addMethod(getParkingOpenMethod())
              .addMethod(getCarCheckInMethod())
              .addMethod(getCarCheckOutMethod())
              .addMethod(getCheckIfItIsFullMethod())
              .addMethod(getCheckOutPaymantMethod())
              .addMethod(getParkingClosureMethod())
              .addMethod(getReportMethod())
              .build();
        }
      }
    }
    return result;
  }
}
