package com.xhpolaris.idlgen.platform.comment;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: platform/comment/comment.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CommentServiceGrpc {

  private CommentServiceGrpc() {}

  public static final String SERVICE_NAME = "platform.comment.CommentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.CreateCommentReq,
      com.xhpolaris.idlgen.platform.comment.CreateCommentResp> getCreateCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createComment",
      requestType = com.xhpolaris.idlgen.platform.comment.CreateCommentReq.class,
      responseType = com.xhpolaris.idlgen.platform.comment.CreateCommentResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.CreateCommentReq,
      com.xhpolaris.idlgen.platform.comment.CreateCommentResp> getCreateCommentMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.CreateCommentReq, com.xhpolaris.idlgen.platform.comment.CreateCommentResp> getCreateCommentMethod;
    if ((getCreateCommentMethod = CommentServiceGrpc.getCreateCommentMethod) == null) {
      synchronized (CommentServiceGrpc.class) {
        if ((getCreateCommentMethod = CommentServiceGrpc.getCreateCommentMethod) == null) {
          CommentServiceGrpc.getCreateCommentMethod = getCreateCommentMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.platform.comment.CreateCommentReq, com.xhpolaris.idlgen.platform.comment.CreateCommentResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.comment.CreateCommentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.comment.CreateCommentResp.getDefaultInstance()))
              .setSchemaDescriptor(new CommentServiceMethodDescriptorSupplier("createComment"))
              .build();
        }
      }
    }
    return getCreateCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.UpdateCommentReq,
      com.xhpolaris.idlgen.platform.comment.UpdateCommentResp> getUpdateCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateComment",
      requestType = com.xhpolaris.idlgen.platform.comment.UpdateCommentReq.class,
      responseType = com.xhpolaris.idlgen.platform.comment.UpdateCommentResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.UpdateCommentReq,
      com.xhpolaris.idlgen.platform.comment.UpdateCommentResp> getUpdateCommentMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.UpdateCommentReq, com.xhpolaris.idlgen.platform.comment.UpdateCommentResp> getUpdateCommentMethod;
    if ((getUpdateCommentMethod = CommentServiceGrpc.getUpdateCommentMethod) == null) {
      synchronized (CommentServiceGrpc.class) {
        if ((getUpdateCommentMethod = CommentServiceGrpc.getUpdateCommentMethod) == null) {
          CommentServiceGrpc.getUpdateCommentMethod = getUpdateCommentMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.platform.comment.UpdateCommentReq, com.xhpolaris.idlgen.platform.comment.UpdateCommentResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.comment.UpdateCommentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.comment.UpdateCommentResp.getDefaultInstance()))
              .setSchemaDescriptor(new CommentServiceMethodDescriptorSupplier("updateComment"))
              .build();
        }
      }
    }
    return getUpdateCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdReq,
      com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdResp> getDeleteCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteComment",
      requestType = com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdReq.class,
      responseType = com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdReq,
      com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdResp> getDeleteCommentMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdReq, com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdResp> getDeleteCommentMethod;
    if ((getDeleteCommentMethod = CommentServiceGrpc.getDeleteCommentMethod) == null) {
      synchronized (CommentServiceGrpc.class) {
        if ((getDeleteCommentMethod = CommentServiceGrpc.getDeleteCommentMethod) == null) {
          CommentServiceGrpc.getDeleteCommentMethod = getDeleteCommentMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdReq, com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdResp.getDefaultInstance()))
              .setSchemaDescriptor(new CommentServiceMethodDescriptorSupplier("deleteComment"))
              .build();
        }
      }
    }
    return getDeleteCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.ListCommentByParentReq,
      com.xhpolaris.idlgen.platform.comment.ListCommentByParentResp> getListCommentByParentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listCommentByParent",
      requestType = com.xhpolaris.idlgen.platform.comment.ListCommentByParentReq.class,
      responseType = com.xhpolaris.idlgen.platform.comment.ListCommentByParentResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.ListCommentByParentReq,
      com.xhpolaris.idlgen.platform.comment.ListCommentByParentResp> getListCommentByParentMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.ListCommentByParentReq, com.xhpolaris.idlgen.platform.comment.ListCommentByParentResp> getListCommentByParentMethod;
    if ((getListCommentByParentMethod = CommentServiceGrpc.getListCommentByParentMethod) == null) {
      synchronized (CommentServiceGrpc.class) {
        if ((getListCommentByParentMethod = CommentServiceGrpc.getListCommentByParentMethod) == null) {
          CommentServiceGrpc.getListCommentByParentMethod = getListCommentByParentMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.platform.comment.ListCommentByParentReq, com.xhpolaris.idlgen.platform.comment.ListCommentByParentResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listCommentByParent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.comment.ListCommentByParentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.comment.ListCommentByParentResp.getDefaultInstance()))
              .setSchemaDescriptor(new CommentServiceMethodDescriptorSupplier("listCommentByParent"))
              .build();
        }
      }
    }
    return getListCommentByParentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.CountCommentByParentReq,
      com.xhpolaris.idlgen.platform.comment.CountCommentByParentResp> getCountCommentByParentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countCommentByParent",
      requestType = com.xhpolaris.idlgen.platform.comment.CountCommentByParentReq.class,
      responseType = com.xhpolaris.idlgen.platform.comment.CountCommentByParentResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.CountCommentByParentReq,
      com.xhpolaris.idlgen.platform.comment.CountCommentByParentResp> getCountCommentByParentMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.CountCommentByParentReq, com.xhpolaris.idlgen.platform.comment.CountCommentByParentResp> getCountCommentByParentMethod;
    if ((getCountCommentByParentMethod = CommentServiceGrpc.getCountCommentByParentMethod) == null) {
      synchronized (CommentServiceGrpc.class) {
        if ((getCountCommentByParentMethod = CommentServiceGrpc.getCountCommentByParentMethod) == null) {
          CommentServiceGrpc.getCountCommentByParentMethod = getCountCommentByParentMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.platform.comment.CountCommentByParentReq, com.xhpolaris.idlgen.platform.comment.CountCommentByParentResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countCommentByParent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.comment.CountCommentByParentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.comment.CountCommentByParentResp.getDefaultInstance()))
              .setSchemaDescriptor(new CommentServiceMethodDescriptorSupplier("countCommentByParent"))
              .build();
        }
      }
    }
    return getCountCommentByParentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdReq,
      com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdResp> getRetrieveCommentByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "retrieveCommentById",
      requestType = com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdReq.class,
      responseType = com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdReq,
      com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdResp> getRetrieveCommentByIdMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdReq, com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdResp> getRetrieveCommentByIdMethod;
    if ((getRetrieveCommentByIdMethod = CommentServiceGrpc.getRetrieveCommentByIdMethod) == null) {
      synchronized (CommentServiceGrpc.class) {
        if ((getRetrieveCommentByIdMethod = CommentServiceGrpc.getRetrieveCommentByIdMethod) == null) {
          CommentServiceGrpc.getRetrieveCommentByIdMethod = getRetrieveCommentByIdMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdReq, com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "retrieveCommentById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdResp.getDefaultInstance()))
              .setSchemaDescriptor(new CommentServiceMethodDescriptorSupplier("retrieveCommentById"))
              .build();
        }
      }
    }
    return getRetrieveCommentByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeReq,
      com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeResp> getListCommentByAuthorIdAndTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listCommentByAuthorIdAndType",
      requestType = com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeReq.class,
      responseType = com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeReq,
      com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeResp> getListCommentByAuthorIdAndTypeMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeReq, com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeResp> getListCommentByAuthorIdAndTypeMethod;
    if ((getListCommentByAuthorIdAndTypeMethod = CommentServiceGrpc.getListCommentByAuthorIdAndTypeMethod) == null) {
      synchronized (CommentServiceGrpc.class) {
        if ((getListCommentByAuthorIdAndTypeMethod = CommentServiceGrpc.getListCommentByAuthorIdAndTypeMethod) == null) {
          CommentServiceGrpc.getListCommentByAuthorIdAndTypeMethod = getListCommentByAuthorIdAndTypeMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeReq, com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listCommentByAuthorIdAndType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeResp.getDefaultInstance()))
              .setSchemaDescriptor(new CommentServiceMethodDescriptorSupplier("listCommentByAuthorIdAndType"))
              .build();
        }
      }
    }
    return getListCommentByAuthorIdAndTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeReq,
      com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeResp> getListCommentByReplyToAndTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listCommentByReplyToAndType",
      requestType = com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeReq.class,
      responseType = com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeReq,
      com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeResp> getListCommentByReplyToAndTypeMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeReq, com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeResp> getListCommentByReplyToAndTypeMethod;
    if ((getListCommentByReplyToAndTypeMethod = CommentServiceGrpc.getListCommentByReplyToAndTypeMethod) == null) {
      synchronized (CommentServiceGrpc.class) {
        if ((getListCommentByReplyToAndTypeMethod = CommentServiceGrpc.getListCommentByReplyToAndTypeMethod) == null) {
          CommentServiceGrpc.getListCommentByReplyToAndTypeMethod = getListCommentByReplyToAndTypeMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeReq, com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listCommentByReplyToAndType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeResp.getDefaultInstance()))
              .setSchemaDescriptor(new CommentServiceMethodDescriptorSupplier("listCommentByReplyToAndType"))
              .build();
        }
      }
    }
    return getListCommentByReplyToAndTypeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommentServiceStub>() {
        @java.lang.Override
        public CommentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommentServiceStub(channel, callOptions);
        }
      };
    return CommentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommentServiceBlockingStub>() {
        @java.lang.Override
        public CommentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommentServiceBlockingStub(channel, callOptions);
        }
      };
    return CommentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommentServiceFutureStub>() {
        @java.lang.Override
        public CommentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommentServiceFutureStub(channel, callOptions);
        }
      };
    return CommentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CommentServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 创建
     * </pre>
     */
    public void createComment(com.xhpolaris.idlgen.platform.comment.CreateCommentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.CreateCommentResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCommentMethod(), responseObserver);
    }

    /**
     * <pre>
     * 修改
     * </pre>
     */
    public void updateComment(com.xhpolaris.idlgen.platform.comment.UpdateCommentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.UpdateCommentResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCommentMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除
     * </pre>
     */
    public void deleteComment(com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCommentMethod(), responseObserver);
    }

    /**
     * <pre>
     * 根据 parentId 查找
     * </pre>
     */
    public void listCommentByParent(com.xhpolaris.idlgen.platform.comment.ListCommentByParentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.ListCommentByParentResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCommentByParentMethod(), responseObserver);
    }

    /**
     * <pre>
     * 根据 parentId 统计
     * </pre>
     */
    public void countCommentByParent(com.xhpolaris.idlgen.platform.comment.CountCommentByParentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.CountCommentByParentResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountCommentByParentMethod(), responseObserver);
    }

    /**
     * <pre>
     * 根据 id 查找
     * </pre>
     */
    public void retrieveCommentById(com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveCommentByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * 根据 authorId &amp; type 查找
     * </pre>
     */
    public void listCommentByAuthorIdAndType(com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCommentByAuthorIdAndTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * 根据 replyTo &amp; type 查找
     * </pre>
     */
    public void listCommentByReplyToAndType(com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCommentByReplyToAndTypeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCommentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.platform.comment.CreateCommentReq,
                com.xhpolaris.idlgen.platform.comment.CreateCommentResp>(
                  this, METHODID_CREATE_COMMENT)))
          .addMethod(
            getUpdateCommentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.platform.comment.UpdateCommentReq,
                com.xhpolaris.idlgen.platform.comment.UpdateCommentResp>(
                  this, METHODID_UPDATE_COMMENT)))
          .addMethod(
            getDeleteCommentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdReq,
                com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdResp>(
                  this, METHODID_DELETE_COMMENT)))
          .addMethod(
            getListCommentByParentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.platform.comment.ListCommentByParentReq,
                com.xhpolaris.idlgen.platform.comment.ListCommentByParentResp>(
                  this, METHODID_LIST_COMMENT_BY_PARENT)))
          .addMethod(
            getCountCommentByParentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.platform.comment.CountCommentByParentReq,
                com.xhpolaris.idlgen.platform.comment.CountCommentByParentResp>(
                  this, METHODID_COUNT_COMMENT_BY_PARENT)))
          .addMethod(
            getRetrieveCommentByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdReq,
                com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdResp>(
                  this, METHODID_RETRIEVE_COMMENT_BY_ID)))
          .addMethod(
            getListCommentByAuthorIdAndTypeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeReq,
                com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeResp>(
                  this, METHODID_LIST_COMMENT_BY_AUTHOR_ID_AND_TYPE)))
          .addMethod(
            getListCommentByReplyToAndTypeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeReq,
                com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeResp>(
                  this, METHODID_LIST_COMMENT_BY_REPLY_TO_AND_TYPE)))
          .build();
    }
  }

  /**
   */
  public static final class CommentServiceStub extends io.grpc.stub.AbstractAsyncStub<CommentServiceStub> {
    private CommentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommentServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建
     * </pre>
     */
    public void createComment(com.xhpolaris.idlgen.platform.comment.CreateCommentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.CreateCommentResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 修改
     * </pre>
     */
    public void updateComment(com.xhpolaris.idlgen.platform.comment.UpdateCommentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.UpdateCommentResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除
     * </pre>
     */
    public void deleteComment(com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据 parentId 查找
     * </pre>
     */
    public void listCommentByParent(com.xhpolaris.idlgen.platform.comment.ListCommentByParentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.ListCommentByParentResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCommentByParentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据 parentId 统计
     * </pre>
     */
    public void countCommentByParent(com.xhpolaris.idlgen.platform.comment.CountCommentByParentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.CountCommentByParentResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountCommentByParentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据 id 查找
     * </pre>
     */
    public void retrieveCommentById(com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveCommentByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据 authorId &amp; type 查找
     * </pre>
     */
    public void listCommentByAuthorIdAndType(com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCommentByAuthorIdAndTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据 replyTo &amp; type 查找
     * </pre>
     */
    public void listCommentByReplyToAndType(com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCommentByReplyToAndTypeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CommentServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CommentServiceBlockingStub> {
    private CommentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommentServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建
     * </pre>
     */
    public com.xhpolaris.idlgen.platform.comment.CreateCommentResp createComment(com.xhpolaris.idlgen.platform.comment.CreateCommentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCommentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 修改
     * </pre>
     */
    public com.xhpolaris.idlgen.platform.comment.UpdateCommentResp updateComment(com.xhpolaris.idlgen.platform.comment.UpdateCommentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCommentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除
     * </pre>
     */
    public com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdResp deleteComment(com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCommentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据 parentId 查找
     * </pre>
     */
    public com.xhpolaris.idlgen.platform.comment.ListCommentByParentResp listCommentByParent(com.xhpolaris.idlgen.platform.comment.ListCommentByParentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCommentByParentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据 parentId 统计
     * </pre>
     */
    public com.xhpolaris.idlgen.platform.comment.CountCommentByParentResp countCommentByParent(com.xhpolaris.idlgen.platform.comment.CountCommentByParentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountCommentByParentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据 id 查找
     * </pre>
     */
    public com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdResp retrieveCommentById(com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveCommentByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据 authorId &amp; type 查找
     * </pre>
     */
    public com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeResp listCommentByAuthorIdAndType(com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCommentByAuthorIdAndTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据 replyTo &amp; type 查找
     * </pre>
     */
    public com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeResp listCommentByReplyToAndType(com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCommentByReplyToAndTypeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CommentServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CommentServiceFutureStub> {
    private CommentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommentServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.platform.comment.CreateCommentResp> createComment(
        com.xhpolaris.idlgen.platform.comment.CreateCommentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCommentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 修改
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.platform.comment.UpdateCommentResp> updateComment(
        com.xhpolaris.idlgen.platform.comment.UpdateCommentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCommentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdResp> deleteComment(
        com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCommentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据 parentId 查找
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.platform.comment.ListCommentByParentResp> listCommentByParent(
        com.xhpolaris.idlgen.platform.comment.ListCommentByParentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCommentByParentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据 parentId 统计
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.platform.comment.CountCommentByParentResp> countCommentByParent(
        com.xhpolaris.idlgen.platform.comment.CountCommentByParentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountCommentByParentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据 id 查找
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdResp> retrieveCommentById(
        com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveCommentByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据 authorId &amp; type 查找
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeResp> listCommentByAuthorIdAndType(
        com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCommentByAuthorIdAndTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据 replyTo &amp; type 查找
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeResp> listCommentByReplyToAndType(
        com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCommentByReplyToAndTypeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_COMMENT = 0;
  private static final int METHODID_UPDATE_COMMENT = 1;
  private static final int METHODID_DELETE_COMMENT = 2;
  private static final int METHODID_LIST_COMMENT_BY_PARENT = 3;
  private static final int METHODID_COUNT_COMMENT_BY_PARENT = 4;
  private static final int METHODID_RETRIEVE_COMMENT_BY_ID = 5;
  private static final int METHODID_LIST_COMMENT_BY_AUTHOR_ID_AND_TYPE = 6;
  private static final int METHODID_LIST_COMMENT_BY_REPLY_TO_AND_TYPE = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CommentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CommentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_COMMENT:
          serviceImpl.createComment((com.xhpolaris.idlgen.platform.comment.CreateCommentReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.CreateCommentResp>) responseObserver);
          break;
        case METHODID_UPDATE_COMMENT:
          serviceImpl.updateComment((com.xhpolaris.idlgen.platform.comment.UpdateCommentReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.UpdateCommentResp>) responseObserver);
          break;
        case METHODID_DELETE_COMMENT:
          serviceImpl.deleteComment((com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.DeleteCommentByIdResp>) responseObserver);
          break;
        case METHODID_LIST_COMMENT_BY_PARENT:
          serviceImpl.listCommentByParent((com.xhpolaris.idlgen.platform.comment.ListCommentByParentReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.ListCommentByParentResp>) responseObserver);
          break;
        case METHODID_COUNT_COMMENT_BY_PARENT:
          serviceImpl.countCommentByParent((com.xhpolaris.idlgen.platform.comment.CountCommentByParentReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.CountCommentByParentResp>) responseObserver);
          break;
        case METHODID_RETRIEVE_COMMENT_BY_ID:
          serviceImpl.retrieveCommentById((com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.RetrieveCommentByIdResp>) responseObserver);
          break;
        case METHODID_LIST_COMMENT_BY_AUTHOR_ID_AND_TYPE:
          serviceImpl.listCommentByAuthorIdAndType((com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.ListCommentByAuthorIdAndTypeResp>) responseObserver);
          break;
        case METHODID_LIST_COMMENT_BY_REPLY_TO_AND_TYPE:
          serviceImpl.listCommentByReplyToAndType((com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.comment.ListCommentByReplyToAndTypeResp>) responseObserver);
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

  private static abstract class CommentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xhpolaris.idlgen.platform.comment.CommentProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CommentService");
    }
  }

  private static final class CommentServiceFileDescriptorSupplier
      extends CommentServiceBaseDescriptorSupplier {
    CommentServiceFileDescriptorSupplier() {}
  }

  private static final class CommentServiceMethodDescriptorSupplier
      extends CommentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CommentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CommentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommentServiceFileDescriptorSupplier())
              .addMethod(getCreateCommentMethod())
              .addMethod(getUpdateCommentMethod())
              .addMethod(getDeleteCommentMethod())
              .addMethod(getListCommentByParentMethod())
              .addMethod(getCountCommentByParentMethod())
              .addMethod(getRetrieveCommentByIdMethod())
              .addMethod(getListCommentByAuthorIdAndTypeMethod())
              .addMethod(getListCommentByReplyToAndTypeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
