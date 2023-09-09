package com.xhpolaris.idlgen.meowchat.coreapi;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: meowchat/core_api/core_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class momentGrpc {

  private momentGrpc() {}

  public static final String SERVICE_NAME = "meowchat.core_api.moment";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsResp> getGetMomentPreviewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMomentPreviews",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsResp> getGetMomentPreviewsMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsReq, com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsResp> getGetMomentPreviewsMethod;
    if ((getGetMomentPreviewsMethod = momentGrpc.getGetMomentPreviewsMethod) == null) {
      synchronized (momentGrpc.class) {
        if ((getGetMomentPreviewsMethod = momentGrpc.getGetMomentPreviewsMethod) == null) {
          momentGrpc.getGetMomentPreviewsMethod = getGetMomentPreviewsMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsReq, com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMomentPreviews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsResp.getDefaultInstance()))
              .setSchemaDescriptor(new momentMethodDescriptorSupplier("GetMomentPreviews"))
              .build();
        }
      }
    }
    return getGetMomentPreviewsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailResp> getGetMomentDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMomentDetail",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailResp> getGetMomentDetailMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailReq, com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailResp> getGetMomentDetailMethod;
    if ((getGetMomentDetailMethod = momentGrpc.getGetMomentDetailMethod) == null) {
      synchronized (momentGrpc.class) {
        if ((getGetMomentDetailMethod = momentGrpc.getGetMomentDetailMethod) == null) {
          momentGrpc.getGetMomentDetailMethod = getGetMomentDetailMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailReq, com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMomentDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailResp.getDefaultInstance()))
              .setSchemaDescriptor(new momentMethodDescriptorSupplier("GetMomentDetail"))
              .build();
        }
      }
    }
    return getGetMomentDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewMomentReq,
      com.xhpolaris.idlgen.meowchat.coreapi.NewMomentResp> getNewMomentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewMoment",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.NewMomentReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.NewMomentResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewMomentReq,
      com.xhpolaris.idlgen.meowchat.coreapi.NewMomentResp> getNewMomentMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewMomentReq, com.xhpolaris.idlgen.meowchat.coreapi.NewMomentResp> getNewMomentMethod;
    if ((getNewMomentMethod = momentGrpc.getNewMomentMethod) == null) {
      synchronized (momentGrpc.class) {
        if ((getNewMomentMethod = momentGrpc.getNewMomentMethod) == null) {
          momentGrpc.getNewMomentMethod = getNewMomentMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.NewMomentReq, com.xhpolaris.idlgen.meowchat.coreapi.NewMomentResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewMoment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.NewMomentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.NewMomentResp.getDefaultInstance()))
              .setSchemaDescriptor(new momentMethodDescriptorSupplier("NewMoment"))
              .build();
        }
      }
    }
    return getNewMomentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentResp> getDeleteMomentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMoment",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentResp> getDeleteMomentMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentReq, com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentResp> getDeleteMomentMethod;
    if ((getDeleteMomentMethod = momentGrpc.getDeleteMomentMethod) == null) {
      synchronized (momentGrpc.class) {
        if ((getDeleteMomentMethod = momentGrpc.getDeleteMomentMethod) == null) {
          momentGrpc.getDeleteMomentMethod = getDeleteMomentMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentReq, com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMoment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentResp.getDefaultInstance()))
              .setSchemaDescriptor(new momentMethodDescriptorSupplier("DeleteMoment"))
              .build();
        }
      }
    }
    return getDeleteMomentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentReq,
      com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentResp> getSearchMomentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchMoment",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentReq,
      com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentResp> getSearchMomentMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentReq, com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentResp> getSearchMomentMethod;
    if ((getSearchMomentMethod = momentGrpc.getSearchMomentMethod) == null) {
      synchronized (momentGrpc.class) {
        if ((getSearchMomentMethod = momentGrpc.getSearchMomentMethod) == null) {
          momentGrpc.getSearchMomentMethod = getSearchMomentMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentReq, com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchMoment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentResp.getDefaultInstance()))
              .setSchemaDescriptor(new momentMethodDescriptorSupplier("SearchMoment"))
              .build();
        }
      }
    }
    return getSearchMomentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static momentStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<momentStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<momentStub>() {
        @java.lang.Override
        public momentStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new momentStub(channel, callOptions);
        }
      };
    return momentStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static momentBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<momentBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<momentBlockingStub>() {
        @java.lang.Override
        public momentBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new momentBlockingStub(channel, callOptions);
        }
      };
    return momentBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static momentFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<momentFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<momentFutureStub>() {
        @java.lang.Override
        public momentFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new momentFutureStub(channel, callOptions);
        }
      };
    return momentFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class momentImplBase implements io.grpc.BindableService {

    /**
     */
    public void getMomentPreviews(com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMomentPreviewsMethod(), responseObserver);
    }

    /**
     */
    public void getMomentDetail(com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMomentDetailMethod(), responseObserver);
    }

    /**
     */
    public void newMoment(com.xhpolaris.idlgen.meowchat.coreapi.NewMomentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewMomentResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewMomentMethod(), responseObserver);
    }

    /**
     */
    public void deleteMoment(com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMomentMethod(), responseObserver);
    }

    /**
     */
    public void searchMoment(com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMomentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMomentPreviewsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsReq,
                com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsResp>(
                  this, METHODID_GET_MOMENT_PREVIEWS)))
          .addMethod(
            getGetMomentDetailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailReq,
                com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailResp>(
                  this, METHODID_GET_MOMENT_DETAIL)))
          .addMethod(
            getNewMomentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.NewMomentReq,
                com.xhpolaris.idlgen.meowchat.coreapi.NewMomentResp>(
                  this, METHODID_NEW_MOMENT)))
          .addMethod(
            getDeleteMomentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentReq,
                com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentResp>(
                  this, METHODID_DELETE_MOMENT)))
          .addMethod(
            getSearchMomentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentReq,
                com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentResp>(
                  this, METHODID_SEARCH_MOMENT)))
          .build();
    }
  }

  /**
   */
  public static final class momentStub extends io.grpc.stub.AbstractAsyncStub<momentStub> {
    private momentStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected momentStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new momentStub(channel, callOptions);
    }

    /**
     */
    public void getMomentPreviews(com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMomentPreviewsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMomentDetail(com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMomentDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void newMoment(com.xhpolaris.idlgen.meowchat.coreapi.NewMomentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewMomentResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewMomentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMoment(com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMomentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchMoment(com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMomentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class momentBlockingStub extends io.grpc.stub.AbstractBlockingStub<momentBlockingStub> {
    private momentBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected momentBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new momentBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsResp getMomentPreviews(com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMomentPreviewsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailResp getMomentDetail(com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMomentDetailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.NewMomentResp newMoment(com.xhpolaris.idlgen.meowchat.coreapi.NewMomentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewMomentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentResp deleteMoment(com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMomentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentResp searchMoment(com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMomentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class momentFutureStub extends io.grpc.stub.AbstractFutureStub<momentFutureStub> {
    private momentFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected momentFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new momentFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsResp> getMomentPreviews(
        com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMomentPreviewsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailResp> getMomentDetail(
        com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMomentDetailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.NewMomentResp> newMoment(
        com.xhpolaris.idlgen.meowchat.coreapi.NewMomentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewMomentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentResp> deleteMoment(
        com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMomentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentResp> searchMoment(
        com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMomentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MOMENT_PREVIEWS = 0;
  private static final int METHODID_GET_MOMENT_DETAIL = 1;
  private static final int METHODID_NEW_MOMENT = 2;
  private static final int METHODID_DELETE_MOMENT = 3;
  private static final int METHODID_SEARCH_MOMENT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final momentImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(momentImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MOMENT_PREVIEWS:
          serviceImpl.getMomentPreviews((com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetMomentPreviewsResp>) responseObserver);
          break;
        case METHODID_GET_MOMENT_DETAIL:
          serviceImpl.getMomentDetail((com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetMomentDetailResp>) responseObserver);
          break;
        case METHODID_NEW_MOMENT:
          serviceImpl.newMoment((com.xhpolaris.idlgen.meowchat.coreapi.NewMomentReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewMomentResp>) responseObserver);
          break;
        case METHODID_DELETE_MOMENT:
          serviceImpl.deleteMoment((com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteMomentResp>) responseObserver);
          break;
        case METHODID_SEARCH_MOMENT:
          serviceImpl.searchMoment((com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SearchMomentResp>) responseObserver);
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

  private static abstract class momentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    momentBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xhpolaris.idlgen.meowchat.coreapi.CoreApiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("moment");
    }
  }

  private static final class momentFileDescriptorSupplier
      extends momentBaseDescriptorSupplier {
    momentFileDescriptorSupplier() {}
  }

  private static final class momentMethodDescriptorSupplier
      extends momentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    momentMethodDescriptorSupplier(String methodName) {
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
      synchronized (momentGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new momentFileDescriptorSupplier())
              .addMethod(getGetMomentPreviewsMethod())
              .addMethod(getGetMomentDetailMethod())
              .addMethod(getNewMomentMethod())
              .addMethod(getDeleteMomentMethod())
              .addMethod(getSearchMomentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
