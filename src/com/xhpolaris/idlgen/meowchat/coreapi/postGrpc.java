package com.xhpolaris.idlgen.meowchat.coreapi;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: meowchat/core_api/core_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class postGrpc {

  private postGrpc() {}

  public static final String SERVICE_NAME = "meowchat.core_api.post";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsResp> getGetPostPreviewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPostPreviews",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsResp> getGetPostPreviewsMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsReq, com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsResp> getGetPostPreviewsMethod;
    if ((getGetPostPreviewsMethod = postGrpc.getGetPostPreviewsMethod) == null) {
      synchronized (postGrpc.class) {
        if ((getGetPostPreviewsMethod = postGrpc.getGetPostPreviewsMethod) == null) {
          postGrpc.getGetPostPreviewsMethod = getGetPostPreviewsMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsReq, com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPostPreviews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsResp.getDefaultInstance()))
              .setSchemaDescriptor(new postMethodDescriptorSupplier("GetPostPreviews"))
              .build();
        }
      }
    }
    return getGetPostPreviewsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailResp> getGetPostDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPostDetail",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailResp> getGetPostDetailMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailReq, com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailResp> getGetPostDetailMethod;
    if ((getGetPostDetailMethod = postGrpc.getGetPostDetailMethod) == null) {
      synchronized (postGrpc.class) {
        if ((getGetPostDetailMethod = postGrpc.getGetPostDetailMethod) == null) {
          postGrpc.getGetPostDetailMethod = getGetPostDetailMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailReq, com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPostDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailResp.getDefaultInstance()))
              .setSchemaDescriptor(new postMethodDescriptorSupplier("GetPostDetail"))
              .build();
        }
      }
    }
    return getGetPostDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewPostReq,
      com.xhpolaris.idlgen.meowchat.coreapi.NewPostResp> getNewPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewPost",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.NewPostReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.NewPostResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewPostReq,
      com.xhpolaris.idlgen.meowchat.coreapi.NewPostResp> getNewPostMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewPostReq, com.xhpolaris.idlgen.meowchat.coreapi.NewPostResp> getNewPostMethod;
    if ((getNewPostMethod = postGrpc.getNewPostMethod) == null) {
      synchronized (postGrpc.class) {
        if ((getNewPostMethod = postGrpc.getNewPostMethod) == null) {
          postGrpc.getNewPostMethod = getNewPostMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.NewPostReq, com.xhpolaris.idlgen.meowchat.coreapi.NewPostResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.NewPostReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.NewPostResp.getDefaultInstance()))
              .setSchemaDescriptor(new postMethodDescriptorSupplier("NewPost"))
              .build();
        }
      }
    }
    return getNewPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeletePostReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DeletePostResp> getDeletePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePost",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.DeletePostReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.DeletePostResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeletePostReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DeletePostResp> getDeletePostMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeletePostReq, com.xhpolaris.idlgen.meowchat.coreapi.DeletePostResp> getDeletePostMethod;
    if ((getDeletePostMethod = postGrpc.getDeletePostMethod) == null) {
      synchronized (postGrpc.class) {
        if ((getDeletePostMethod = postGrpc.getDeletePostMethod) == null) {
          postGrpc.getDeletePostMethod = getDeletePostMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.DeletePostReq, com.xhpolaris.idlgen.meowchat.coreapi.DeletePostResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DeletePostReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DeletePostResp.getDefaultInstance()))
              .setSchemaDescriptor(new postMethodDescriptorSupplier("DeletePost"))
              .build();
        }
      }
    }
    return getDeletePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialReq,
      com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialResp> getSetOfficialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetOfficial",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialReq,
      com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialResp> getSetOfficialMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialReq, com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialResp> getSetOfficialMethod;
    if ((getSetOfficialMethod = postGrpc.getSetOfficialMethod) == null) {
      synchronized (postGrpc.class) {
        if ((getSetOfficialMethod = postGrpc.getSetOfficialMethod) == null) {
          postGrpc.getSetOfficialMethod = getSetOfficialMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialReq, com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetOfficial"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialResp.getDefaultInstance()))
              .setSchemaDescriptor(new postMethodDescriptorSupplier("SetOfficial"))
              .build();
        }
      }
    }
    return getSetOfficialMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static postStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<postStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<postStub>() {
        @java.lang.Override
        public postStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new postStub(channel, callOptions);
        }
      };
    return postStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static postBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<postBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<postBlockingStub>() {
        @java.lang.Override
        public postBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new postBlockingStub(channel, callOptions);
        }
      };
    return postBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static postFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<postFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<postFutureStub>() {
        @java.lang.Override
        public postFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new postFutureStub(channel, callOptions);
        }
      };
    return postFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class postImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPostPreviews(com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPostPreviewsMethod(), responseObserver);
    }

    /**
     */
    public void getPostDetail(com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPostDetailMethod(), responseObserver);
    }

    /**
     */
    public void newPost(com.xhpolaris.idlgen.meowchat.coreapi.NewPostReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewPostResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewPostMethod(), responseObserver);
    }

    /**
     */
    public void deletePost(com.xhpolaris.idlgen.meowchat.coreapi.DeletePostReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeletePostResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePostMethod(), responseObserver);
    }

    /**
     */
    public void setOfficial(com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetOfficialMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPostPreviewsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsReq,
                com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsResp>(
                  this, METHODID_GET_POST_PREVIEWS)))
          .addMethod(
            getGetPostDetailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailReq,
                com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailResp>(
                  this, METHODID_GET_POST_DETAIL)))
          .addMethod(
            getNewPostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.NewPostReq,
                com.xhpolaris.idlgen.meowchat.coreapi.NewPostResp>(
                  this, METHODID_NEW_POST)))
          .addMethod(
            getDeletePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.DeletePostReq,
                com.xhpolaris.idlgen.meowchat.coreapi.DeletePostResp>(
                  this, METHODID_DELETE_POST)))
          .addMethod(
            getSetOfficialMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialReq,
                com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialResp>(
                  this, METHODID_SET_OFFICIAL)))
          .build();
    }
  }

  /**
   */
  public static final class postStub extends io.grpc.stub.AbstractAsyncStub<postStub> {
    private postStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected postStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new postStub(channel, callOptions);
    }

    /**
     */
    public void getPostPreviews(com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPostPreviewsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPostDetail(com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPostDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void newPost(com.xhpolaris.idlgen.meowchat.coreapi.NewPostReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewPostResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePost(com.xhpolaris.idlgen.meowchat.coreapi.DeletePostReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeletePostResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setOfficial(com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetOfficialMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class postBlockingStub extends io.grpc.stub.AbstractBlockingStub<postBlockingStub> {
    private postBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected postBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new postBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsResp getPostPreviews(com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPostPreviewsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailResp getPostDetail(com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPostDetailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.NewPostResp newPost(com.xhpolaris.idlgen.meowchat.coreapi.NewPostReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.DeletePostResp deletePost(com.xhpolaris.idlgen.meowchat.coreapi.DeletePostReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialResp setOfficial(com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetOfficialMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class postFutureStub extends io.grpc.stub.AbstractFutureStub<postFutureStub> {
    private postFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected postFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new postFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsResp> getPostPreviews(
        com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPostPreviewsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailResp> getPostDetail(
        com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPostDetailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.NewPostResp> newPost(
        com.xhpolaris.idlgen.meowchat.coreapi.NewPostReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewPostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.DeletePostResp> deletePost(
        com.xhpolaris.idlgen.meowchat.coreapi.DeletePostReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialResp> setOfficial(
        com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetOfficialMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_POST_PREVIEWS = 0;
  private static final int METHODID_GET_POST_DETAIL = 1;
  private static final int METHODID_NEW_POST = 2;
  private static final int METHODID_DELETE_POST = 3;
  private static final int METHODID_SET_OFFICIAL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final postImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(postImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_POST_PREVIEWS:
          serviceImpl.getPostPreviews((com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetPostPreviewsResp>) responseObserver);
          break;
        case METHODID_GET_POST_DETAIL:
          serviceImpl.getPostDetail((com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetPostDetailResp>) responseObserver);
          break;
        case METHODID_NEW_POST:
          serviceImpl.newPost((com.xhpolaris.idlgen.meowchat.coreapi.NewPostReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewPostResp>) responseObserver);
          break;
        case METHODID_DELETE_POST:
          serviceImpl.deletePost((com.xhpolaris.idlgen.meowchat.coreapi.DeletePostReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeletePostResp>) responseObserver);
          break;
        case METHODID_SET_OFFICIAL:
          serviceImpl.setOfficial((com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SetOfficialResp>) responseObserver);
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

  private static abstract class postBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    postBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xhpolaris.idlgen.meowchat.coreapi.CoreApiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("post");
    }
  }

  private static final class postFileDescriptorSupplier
      extends postBaseDescriptorSupplier {
    postFileDescriptorSupplier() {}
  }

  private static final class postMethodDescriptorSupplier
      extends postBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    postMethodDescriptorSupplier(String methodName) {
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
      synchronized (postGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new postFileDescriptorSupplier())
              .addMethod(getGetPostPreviewsMethod())
              .addMethod(getGetPostDetailMethod())
              .addMethod(getNewPostMethod())
              .addMethod(getDeletePostMethod())
              .addMethod(getSetOfficialMethod())
              .build();
        }
      }
    }
    return result;
  }
}
