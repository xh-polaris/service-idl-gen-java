package com.xhpolaris.idlgen.meowchat.coreapi;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: meowchat/core_api/core_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class commentGrpc {

  private commentGrpc() {}

  public static final String SERVICE_NAME = "meowchat.core_api.comment";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsResp> getGetCommentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetComments",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsResp> getGetCommentsMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsReq, com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsResp> getGetCommentsMethod;
    if ((getGetCommentsMethod = commentGrpc.getGetCommentsMethod) == null) {
      synchronized (commentGrpc.class) {
        if ((getGetCommentsMethod = commentGrpc.getGetCommentsMethod) == null) {
          commentGrpc.getGetCommentsMethod = getGetCommentsMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsReq, com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetComments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsResp.getDefaultInstance()))
              .setSchemaDescriptor(new commentMethodDescriptorSupplier("GetComments"))
              .build();
        }
      }
    }
    return getGetCommentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewCommentReq,
      com.xhpolaris.idlgen.meowchat.coreapi.NewCommentResp> getNewCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewComment",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.NewCommentReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.NewCommentResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewCommentReq,
      com.xhpolaris.idlgen.meowchat.coreapi.NewCommentResp> getNewCommentMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewCommentReq, com.xhpolaris.idlgen.meowchat.coreapi.NewCommentResp> getNewCommentMethod;
    if ((getNewCommentMethod = commentGrpc.getNewCommentMethod) == null) {
      synchronized (commentGrpc.class) {
        if ((getNewCommentMethod = commentGrpc.getNewCommentMethod) == null) {
          commentGrpc.getNewCommentMethod = getNewCommentMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.NewCommentReq, com.xhpolaris.idlgen.meowchat.coreapi.NewCommentResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.NewCommentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.NewCommentResp.getDefaultInstance()))
              .setSchemaDescriptor(new commentMethodDescriptorSupplier("NewComment"))
              .build();
        }
      }
    }
    return getNewCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentResp> getDeleteCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteComment",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentResp> getDeleteCommentMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentReq, com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentResp> getDeleteCommentMethod;
    if ((getDeleteCommentMethod = commentGrpc.getDeleteCommentMethod) == null) {
      synchronized (commentGrpc.class) {
        if ((getDeleteCommentMethod = commentGrpc.getDeleteCommentMethod) == null) {
          commentGrpc.getDeleteCommentMethod = getDeleteCommentMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentReq, com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentResp.getDefaultInstance()))
              .setSchemaDescriptor(new commentMethodDescriptorSupplier("DeleteComment"))
              .build();
        }
      }
    }
    return getDeleteCommentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static commentStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<commentStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<commentStub>() {
        @java.lang.Override
        public commentStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new commentStub(channel, callOptions);
        }
      };
    return commentStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static commentBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<commentBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<commentBlockingStub>() {
        @java.lang.Override
        public commentBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new commentBlockingStub(channel, callOptions);
        }
      };
    return commentBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static commentFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<commentFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<commentFutureStub>() {
        @java.lang.Override
        public commentFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new commentFutureStub(channel, callOptions);
        }
      };
    return commentFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class commentImplBase implements io.grpc.BindableService {

    /**
     */
    public void getComments(com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCommentsMethod(), responseObserver);
    }

    /**
     */
    public void newComment(com.xhpolaris.idlgen.meowchat.coreapi.NewCommentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewCommentResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewCommentMethod(), responseObserver);
    }

    /**
     */
    public void deleteComment(com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCommentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCommentsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsReq,
                com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsResp>(
                  this, METHODID_GET_COMMENTS)))
          .addMethod(
            getNewCommentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.NewCommentReq,
                com.xhpolaris.idlgen.meowchat.coreapi.NewCommentResp>(
                  this, METHODID_NEW_COMMENT)))
          .addMethod(
            getDeleteCommentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentReq,
                com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentResp>(
                  this, METHODID_DELETE_COMMENT)))
          .build();
    }
  }

  /**
   */
  public static final class commentStub extends io.grpc.stub.AbstractAsyncStub<commentStub> {
    private commentStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected commentStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new commentStub(channel, callOptions);
    }

    /**
     */
    public void getComments(com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCommentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void newComment(com.xhpolaris.idlgen.meowchat.coreapi.NewCommentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewCommentResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteComment(com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCommentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class commentBlockingStub extends io.grpc.stub.AbstractBlockingStub<commentBlockingStub> {
    private commentBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected commentBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new commentBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsResp getComments(com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCommentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.NewCommentResp newComment(com.xhpolaris.idlgen.meowchat.coreapi.NewCommentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewCommentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentResp deleteComment(com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCommentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class commentFutureStub extends io.grpc.stub.AbstractFutureStub<commentFutureStub> {
    private commentFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected commentFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new commentFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsResp> getComments(
        com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCommentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.NewCommentResp> newComment(
        com.xhpolaris.idlgen.meowchat.coreapi.NewCommentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewCommentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentResp> deleteComment(
        com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCommentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_COMMENTS = 0;
  private static final int METHODID_NEW_COMMENT = 1;
  private static final int METHODID_DELETE_COMMENT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final commentImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(commentImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_COMMENTS:
          serviceImpl.getComments((com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetCommentsResp>) responseObserver);
          break;
        case METHODID_NEW_COMMENT:
          serviceImpl.newComment((com.xhpolaris.idlgen.meowchat.coreapi.NewCommentReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewCommentResp>) responseObserver);
          break;
        case METHODID_DELETE_COMMENT:
          serviceImpl.deleteComment((com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommentResp>) responseObserver);
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

  private static abstract class commentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    commentBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xhpolaris.idlgen.meowchat.coreapi.CoreApiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("comment");
    }
  }

  private static final class commentFileDescriptorSupplier
      extends commentBaseDescriptorSupplier {
    commentFileDescriptorSupplier() {}
  }

  private static final class commentMethodDescriptorSupplier
      extends commentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    commentMethodDescriptorSupplier(String methodName) {
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
      synchronized (commentGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new commentFileDescriptorSupplier())
              .addMethod(getGetCommentsMethod())
              .addMethod(getNewCommentMethod())
              .addMethod(getDeleteCommentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
