package com.xhpolaris.idlgen.meowchat.coreapi;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: meowchat/core_api/core_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class likeGrpc {

  private likeGrpc() {}

  public static final String SERVICE_NAME = "meowchat.core_api.like";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DoLikeReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DoLikeResp> getDoLikeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DoLike",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.DoLikeReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.DoLikeResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DoLikeReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DoLikeResp> getDoLikeMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DoLikeReq, com.xhpolaris.idlgen.meowchat.coreapi.DoLikeResp> getDoLikeMethod;
    if ((getDoLikeMethod = likeGrpc.getDoLikeMethod) == null) {
      synchronized (likeGrpc.class) {
        if ((getDoLikeMethod = likeGrpc.getDoLikeMethod) == null) {
          likeGrpc.getDoLikeMethod = getDoLikeMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.DoLikeReq, com.xhpolaris.idlgen.meowchat.coreapi.DoLikeResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DoLike"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DoLikeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DoLikeResp.getDefaultInstance()))
              .setSchemaDescriptor(new likeMethodDescriptorSupplier("DoLike"))
              .build();
        }
      }
    }
    return getDoLikeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedResp> getGetUserLikedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserLiked",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedResp> getGetUserLikedMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedReq, com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedResp> getGetUserLikedMethod;
    if ((getGetUserLikedMethod = likeGrpc.getGetUserLikedMethod) == null) {
      synchronized (likeGrpc.class) {
        if ((getGetUserLikedMethod = likeGrpc.getGetUserLikedMethod) == null) {
          likeGrpc.getGetUserLikedMethod = getGetUserLikedMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedReq, com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserLiked"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedResp.getDefaultInstance()))
              .setSchemaDescriptor(new likeMethodDescriptorSupplier("GetUserLiked"))
              .build();
        }
      }
    }
    return getGetUserLikedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountResp> getGetLikedCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLikedCount",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountResp> getGetLikedCountMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountReq, com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountResp> getGetLikedCountMethod;
    if ((getGetLikedCountMethod = likeGrpc.getGetLikedCountMethod) == null) {
      synchronized (likeGrpc.class) {
        if ((getGetLikedCountMethod = likeGrpc.getGetLikedCountMethod) == null) {
          likeGrpc.getGetLikedCountMethod = getGetLikedCountMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountReq, com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLikedCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountResp.getDefaultInstance()))
              .setSchemaDescriptor(new likeMethodDescriptorSupplier("GetLikedCount"))
              .build();
        }
      }
    }
    return getGetLikedCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersResp> getGetLikedUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLikedUsers",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersResp> getGetLikedUsersMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersReq, com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersResp> getGetLikedUsersMethod;
    if ((getGetLikedUsersMethod = likeGrpc.getGetLikedUsersMethod) == null) {
      synchronized (likeGrpc.class) {
        if ((getGetLikedUsersMethod = likeGrpc.getGetLikedUsersMethod) == null) {
          likeGrpc.getGetLikedUsersMethod = getGetLikedUsersMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersReq, com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLikedUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersResp.getDefaultInstance()))
              .setSchemaDescriptor(new likeMethodDescriptorSupplier("GetLikedUsers"))
              .build();
        }
      }
    }
    return getGetLikedUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesResp> getGetUserLikesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserLikes",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesResp> getGetUserLikesMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesReq, com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesResp> getGetUserLikesMethod;
    if ((getGetUserLikesMethod = likeGrpc.getGetUserLikesMethod) == null) {
      synchronized (likeGrpc.class) {
        if ((getGetUserLikesMethod = likeGrpc.getGetUserLikesMethod) == null) {
          likeGrpc.getGetUserLikesMethod = getGetUserLikesMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesReq, com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserLikes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesResp.getDefaultInstance()))
              .setSchemaDescriptor(new likeMethodDescriptorSupplier("GetUserLikes"))
              .build();
        }
      }
    }
    return getGetUserLikesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static likeStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<likeStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<likeStub>() {
        @java.lang.Override
        public likeStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new likeStub(channel, callOptions);
        }
      };
    return likeStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static likeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<likeBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<likeBlockingStub>() {
        @java.lang.Override
        public likeBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new likeBlockingStub(channel, callOptions);
        }
      };
    return likeBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static likeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<likeFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<likeFutureStub>() {
        @java.lang.Override
        public likeFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new likeFutureStub(channel, callOptions);
        }
      };
    return likeFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class likeImplBase implements io.grpc.BindableService {

    /**
     */
    public void doLike(com.xhpolaris.idlgen.meowchat.coreapi.DoLikeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DoLikeResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoLikeMethod(), responseObserver);
    }

    /**
     */
    public void getUserLiked(com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserLikedMethod(), responseObserver);
    }

    /**
     */
    public void getLikedCount(com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLikedCountMethod(), responseObserver);
    }

    /**
     */
    public void getLikedUsers(com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLikedUsersMethod(), responseObserver);
    }

    /**
     */
    public void getUserLikes(com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserLikesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDoLikeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.DoLikeReq,
                com.xhpolaris.idlgen.meowchat.coreapi.DoLikeResp>(
                  this, METHODID_DO_LIKE)))
          .addMethod(
            getGetUserLikedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedReq,
                com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedResp>(
                  this, METHODID_GET_USER_LIKED)))
          .addMethod(
            getGetLikedCountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountReq,
                com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountResp>(
                  this, METHODID_GET_LIKED_COUNT)))
          .addMethod(
            getGetLikedUsersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersReq,
                com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersResp>(
                  this, METHODID_GET_LIKED_USERS)))
          .addMethod(
            getGetUserLikesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesReq,
                com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesResp>(
                  this, METHODID_GET_USER_LIKES)))
          .build();
    }
  }

  /**
   */
  public static final class likeStub extends io.grpc.stub.AbstractAsyncStub<likeStub> {
    private likeStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected likeStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new likeStub(channel, callOptions);
    }

    /**
     */
    public void doLike(com.xhpolaris.idlgen.meowchat.coreapi.DoLikeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DoLikeResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoLikeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserLiked(com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserLikedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLikedCount(com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLikedCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLikedUsers(com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLikedUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserLikes(com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserLikesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class likeBlockingStub extends io.grpc.stub.AbstractBlockingStub<likeBlockingStub> {
    private likeBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected likeBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new likeBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.DoLikeResp doLike(com.xhpolaris.idlgen.meowchat.coreapi.DoLikeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoLikeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedResp getUserLiked(com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserLikedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountResp getLikedCount(com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLikedCountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersResp getLikedUsers(com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLikedUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesResp getUserLikes(com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserLikesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class likeFutureStub extends io.grpc.stub.AbstractFutureStub<likeFutureStub> {
    private likeFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected likeFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new likeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.DoLikeResp> doLike(
        com.xhpolaris.idlgen.meowchat.coreapi.DoLikeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoLikeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedResp> getUserLiked(
        com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserLikedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountResp> getLikedCount(
        com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLikedCountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersResp> getLikedUsers(
        com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLikedUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesResp> getUserLikes(
        com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserLikesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DO_LIKE = 0;
  private static final int METHODID_GET_USER_LIKED = 1;
  private static final int METHODID_GET_LIKED_COUNT = 2;
  private static final int METHODID_GET_LIKED_USERS = 3;
  private static final int METHODID_GET_USER_LIKES = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final likeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(likeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DO_LIKE:
          serviceImpl.doLike((com.xhpolaris.idlgen.meowchat.coreapi.DoLikeReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DoLikeResp>) responseObserver);
          break;
        case METHODID_GET_USER_LIKED:
          serviceImpl.getUserLiked((com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikedResp>) responseObserver);
          break;
        case METHODID_GET_LIKED_COUNT:
          serviceImpl.getLikedCount((com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetLikedCountResp>) responseObserver);
          break;
        case METHODID_GET_LIKED_USERS:
          serviceImpl.getLikedUsers((com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetLikedUsersResp>) responseObserver);
          break;
        case METHODID_GET_USER_LIKES:
          serviceImpl.getUserLikes((com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetUserLikesResp>) responseObserver);
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

  private static abstract class likeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    likeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xhpolaris.idlgen.meowchat.coreapi.CoreApiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("like");
    }
  }

  private static final class likeFileDescriptorSupplier
      extends likeBaseDescriptorSupplier {
    likeFileDescriptorSupplier() {}
  }

  private static final class likeMethodDescriptorSupplier
      extends likeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    likeMethodDescriptorSupplier(String methodName) {
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
      synchronized (likeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new likeFileDescriptorSupplier())
              .addMethod(getDoLikeMethod())
              .addMethod(getGetUserLikedMethod())
              .addMethod(getGetLikedCountMethod())
              .addMethod(getGetLikedUsersMethod())
              .addMethod(getGetUserLikesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
