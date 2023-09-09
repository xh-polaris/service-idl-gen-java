package com.xhpolaris.idlgen.meowchat.coreapi;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: meowchat/core_api/core_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class planGrpc {

  private planGrpc() {}

  public static final String SERVICE_NAME = "meowchat.core_api.plan";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsResp> getGetPlanPreviewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlanPreviews",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsResp> getGetPlanPreviewsMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsReq, com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsResp> getGetPlanPreviewsMethod;
    if ((getGetPlanPreviewsMethod = planGrpc.getGetPlanPreviewsMethod) == null) {
      synchronized (planGrpc.class) {
        if ((getGetPlanPreviewsMethod = planGrpc.getGetPlanPreviewsMethod) == null) {
          planGrpc.getGetPlanPreviewsMethod = getGetPlanPreviewsMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsReq, com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlanPreviews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsResp.getDefaultInstance()))
              .setSchemaDescriptor(new planMethodDescriptorSupplier("GetPlanPreviews"))
              .build();
        }
      }
    }
    return getGetPlanPreviewsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailResp> getGetPlanDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlanDetail",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailResp> getGetPlanDetailMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailReq, com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailResp> getGetPlanDetailMethod;
    if ((getGetPlanDetailMethod = planGrpc.getGetPlanDetailMethod) == null) {
      synchronized (planGrpc.class) {
        if ((getGetPlanDetailMethod = planGrpc.getGetPlanDetailMethod) == null) {
          planGrpc.getGetPlanDetailMethod = getGetPlanDetailMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailReq, com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlanDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailResp.getDefaultInstance()))
              .setSchemaDescriptor(new planMethodDescriptorSupplier("GetPlanDetail"))
              .build();
        }
      }
    }
    return getGetPlanDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewPlanReq,
      com.xhpolaris.idlgen.meowchat.coreapi.NewPlanResp> getNewPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewPlan",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.NewPlanReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.NewPlanResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewPlanReq,
      com.xhpolaris.idlgen.meowchat.coreapi.NewPlanResp> getNewPlanMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewPlanReq, com.xhpolaris.idlgen.meowchat.coreapi.NewPlanResp> getNewPlanMethod;
    if ((getNewPlanMethod = planGrpc.getNewPlanMethod) == null) {
      synchronized (planGrpc.class) {
        if ((getNewPlanMethod = planGrpc.getNewPlanMethod) == null) {
          planGrpc.getNewPlanMethod = getNewPlanMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.NewPlanReq, com.xhpolaris.idlgen.meowchat.coreapi.NewPlanResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.NewPlanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.NewPlanResp.getDefaultInstance()))
              .setSchemaDescriptor(new planMethodDescriptorSupplier("NewPlan"))
              .build();
        }
      }
    }
    return getNewPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanResp> getDeletePlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePlan",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanResp> getDeletePlanMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanReq, com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanResp> getDeletePlanMethod;
    if ((getDeletePlanMethod = planGrpc.getDeletePlanMethod) == null) {
      synchronized (planGrpc.class) {
        if ((getDeletePlanMethod = planGrpc.getDeletePlanMethod) == null) {
          planGrpc.getDeletePlanMethod = getDeletePlanMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanReq, com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanResp.getDefaultInstance()))
              .setSchemaDescriptor(new planMethodDescriptorSupplier("DeletePlan"))
              .build();
        }
      }
    }
    return getDeletePlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanReq,
      com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanResp> getSearchPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchPlan",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanReq,
      com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanResp> getSearchPlanMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanReq, com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanResp> getSearchPlanMethod;
    if ((getSearchPlanMethod = planGrpc.getSearchPlanMethod) == null) {
      synchronized (planGrpc.class) {
        if ((getSearchPlanMethod = planGrpc.getSearchPlanMethod) == null) {
          planGrpc.getSearchPlanMethod = getSearchPlanMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanReq, com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanResp.getDefaultInstance()))
              .setSchemaDescriptor(new planMethodDescriptorSupplier("SearchPlan"))
              .build();
        }
      }
    }
    return getSearchPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DonateFishReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DonateFishResp> getDonateFishMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DonateFish",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.DonateFishReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.DonateFishResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DonateFishReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DonateFishResp> getDonateFishMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DonateFishReq, com.xhpolaris.idlgen.meowchat.coreapi.DonateFishResp> getDonateFishMethod;
    if ((getDonateFishMethod = planGrpc.getDonateFishMethod) == null) {
      synchronized (planGrpc.class) {
        if ((getDonateFishMethod = planGrpc.getDonateFishMethod) == null) {
          planGrpc.getDonateFishMethod = getDonateFishMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.DonateFishReq, com.xhpolaris.idlgen.meowchat.coreapi.DonateFishResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DonateFish"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DonateFishReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DonateFishResp.getDefaultInstance()))
              .setSchemaDescriptor(new planMethodDescriptorSupplier("DonateFish"))
              .build();
        }
      }
    }
    return getDonateFishMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishResp> getGetUserFishMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserFish",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishResp> getGetUserFishMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishReq, com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishResp> getGetUserFishMethod;
    if ((getGetUserFishMethod = planGrpc.getGetUserFishMethod) == null) {
      synchronized (planGrpc.class) {
        if ((getGetUserFishMethod = planGrpc.getGetUserFishMethod) == null) {
          planGrpc.getGetUserFishMethod = getGetUserFishMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishReq, com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserFish"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishResp.getDefaultInstance()))
              .setSchemaDescriptor(new planMethodDescriptorSupplier("GetUserFish"))
              .build();
        }
      }
    }
    return getGetUserFishMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanReq,
      com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanResp> getListFishByPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFishByPlan",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanReq,
      com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanResp> getListFishByPlanMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanReq, com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanResp> getListFishByPlanMethod;
    if ((getListFishByPlanMethod = planGrpc.getListFishByPlanMethod) == null) {
      synchronized (planGrpc.class) {
        if ((getListFishByPlanMethod = planGrpc.getListFishByPlanMethod) == null) {
          planGrpc.getListFishByPlanMethod = getListFishByPlanMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanReq, com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFishByPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanResp.getDefaultInstance()))
              .setSchemaDescriptor(new planMethodDescriptorSupplier("ListFishByPlan"))
              .build();
        }
      }
    }
    return getListFishByPlanMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static planStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<planStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<planStub>() {
        @java.lang.Override
        public planStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new planStub(channel, callOptions);
        }
      };
    return planStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static planBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<planBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<planBlockingStub>() {
        @java.lang.Override
        public planBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new planBlockingStub(channel, callOptions);
        }
      };
    return planBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static planFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<planFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<planFutureStub>() {
        @java.lang.Override
        public planFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new planFutureStub(channel, callOptions);
        }
      };
    return planFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class planImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPlanPreviews(com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlanPreviewsMethod(), responseObserver);
    }

    /**
     */
    public void getPlanDetail(com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlanDetailMethod(), responseObserver);
    }

    /**
     */
    public void newPlan(com.xhpolaris.idlgen.meowchat.coreapi.NewPlanReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewPlanResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewPlanMethod(), responseObserver);
    }

    /**
     */
    public void deletePlan(com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePlanMethod(), responseObserver);
    }

    /**
     */
    public void searchPlan(com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchPlanMethod(), responseObserver);
    }

    /**
     */
    public void donateFish(com.xhpolaris.idlgen.meowchat.coreapi.DonateFishReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DonateFishResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDonateFishMethod(), responseObserver);
    }

    /**
     */
    public void getUserFish(com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserFishMethod(), responseObserver);
    }

    /**
     */
    public void listFishByPlan(com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFishByPlanMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPlanPreviewsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsReq,
                com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsResp>(
                  this, METHODID_GET_PLAN_PREVIEWS)))
          .addMethod(
            getGetPlanDetailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailReq,
                com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailResp>(
                  this, METHODID_GET_PLAN_DETAIL)))
          .addMethod(
            getNewPlanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.NewPlanReq,
                com.xhpolaris.idlgen.meowchat.coreapi.NewPlanResp>(
                  this, METHODID_NEW_PLAN)))
          .addMethod(
            getDeletePlanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanReq,
                com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanResp>(
                  this, METHODID_DELETE_PLAN)))
          .addMethod(
            getSearchPlanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanReq,
                com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanResp>(
                  this, METHODID_SEARCH_PLAN)))
          .addMethod(
            getDonateFishMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.DonateFishReq,
                com.xhpolaris.idlgen.meowchat.coreapi.DonateFishResp>(
                  this, METHODID_DONATE_FISH)))
          .addMethod(
            getGetUserFishMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishReq,
                com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishResp>(
                  this, METHODID_GET_USER_FISH)))
          .addMethod(
            getListFishByPlanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanReq,
                com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanResp>(
                  this, METHODID_LIST_FISH_BY_PLAN)))
          .build();
    }
  }

  /**
   */
  public static final class planStub extends io.grpc.stub.AbstractAsyncStub<planStub> {
    private planStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected planStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new planStub(channel, callOptions);
    }

    /**
     */
    public void getPlanPreviews(com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlanPreviewsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlanDetail(com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlanDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void newPlan(com.xhpolaris.idlgen.meowchat.coreapi.NewPlanReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewPlanResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePlan(com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchPlan(com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void donateFish(com.xhpolaris.idlgen.meowchat.coreapi.DonateFishReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DonateFishResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDonateFishMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserFish(com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserFishMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listFishByPlan(com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFishByPlanMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class planBlockingStub extends io.grpc.stub.AbstractBlockingStub<planBlockingStub> {
    private planBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected planBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new planBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsResp getPlanPreviews(com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlanPreviewsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailResp getPlanDetail(com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlanDetailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.NewPlanResp newPlan(com.xhpolaris.idlgen.meowchat.coreapi.NewPlanReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewPlanMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanResp deletePlan(com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePlanMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanResp searchPlan(com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchPlanMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.DonateFishResp donateFish(com.xhpolaris.idlgen.meowchat.coreapi.DonateFishReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDonateFishMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishResp getUserFish(com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserFishMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanResp listFishByPlan(com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFishByPlanMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class planFutureStub extends io.grpc.stub.AbstractFutureStub<planFutureStub> {
    private planFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected planFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new planFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsResp> getPlanPreviews(
        com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlanPreviewsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailResp> getPlanDetail(
        com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlanDetailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.NewPlanResp> newPlan(
        com.xhpolaris.idlgen.meowchat.coreapi.NewPlanReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewPlanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanResp> deletePlan(
        com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePlanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanResp> searchPlan(
        com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchPlanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.DonateFishResp> donateFish(
        com.xhpolaris.idlgen.meowchat.coreapi.DonateFishReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDonateFishMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishResp> getUserFish(
        com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserFishMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanResp> listFishByPlan(
        com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFishByPlanMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PLAN_PREVIEWS = 0;
  private static final int METHODID_GET_PLAN_DETAIL = 1;
  private static final int METHODID_NEW_PLAN = 2;
  private static final int METHODID_DELETE_PLAN = 3;
  private static final int METHODID_SEARCH_PLAN = 4;
  private static final int METHODID_DONATE_FISH = 5;
  private static final int METHODID_GET_USER_FISH = 6;
  private static final int METHODID_LIST_FISH_BY_PLAN = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final planImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(planImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PLAN_PREVIEWS:
          serviceImpl.getPlanPreviews((com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetPlanPreviewsResp>) responseObserver);
          break;
        case METHODID_GET_PLAN_DETAIL:
          serviceImpl.getPlanDetail((com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetPlanDetailResp>) responseObserver);
          break;
        case METHODID_NEW_PLAN:
          serviceImpl.newPlan((com.xhpolaris.idlgen.meowchat.coreapi.NewPlanReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewPlanResp>) responseObserver);
          break;
        case METHODID_DELETE_PLAN:
          serviceImpl.deletePlan((com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeletePlanResp>) responseObserver);
          break;
        case METHODID_SEARCH_PLAN:
          serviceImpl.searchPlan((com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SearchPlanResp>) responseObserver);
          break;
        case METHODID_DONATE_FISH:
          serviceImpl.donateFish((com.xhpolaris.idlgen.meowchat.coreapi.DonateFishReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DonateFishResp>) responseObserver);
          break;
        case METHODID_GET_USER_FISH:
          serviceImpl.getUserFish((com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetUserFishResp>) responseObserver);
          break;
        case METHODID_LIST_FISH_BY_PLAN:
          serviceImpl.listFishByPlan((com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.ListFishByPlanResp>) responseObserver);
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

  private static abstract class planBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    planBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xhpolaris.idlgen.meowchat.coreapi.CoreApiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("plan");
    }
  }

  private static final class planFileDescriptorSupplier
      extends planBaseDescriptorSupplier {
    planFileDescriptorSupplier() {}
  }

  private static final class planMethodDescriptorSupplier
      extends planBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    planMethodDescriptorSupplier(String methodName) {
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
      synchronized (planGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new planFileDescriptorSupplier())
              .addMethod(getGetPlanPreviewsMethod())
              .addMethod(getGetPlanDetailMethod())
              .addMethod(getNewPlanMethod())
              .addMethod(getDeletePlanMethod())
              .addMethod(getSearchPlanMethod())
              .addMethod(getDonateFishMethod())
              .addMethod(getGetUserFishMethod())
              .addMethod(getListFishByPlanMethod())
              .build();
        }
      }
    }
    return result;
  }
}
