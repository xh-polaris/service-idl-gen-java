package com.xhpolaris.idlgen.meowchat.coreapi;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: meowchat/core_api/core_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class collectionGrpc {

  private collectionGrpc() {}

  public static final String SERVICE_NAME = "meowchat.core_api.collection";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsResp> getGetCatPreviewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCatPreviews",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsResp> getGetCatPreviewsMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsReq, com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsResp> getGetCatPreviewsMethod;
    if ((getGetCatPreviewsMethod = collectionGrpc.getGetCatPreviewsMethod) == null) {
      synchronized (collectionGrpc.class) {
        if ((getGetCatPreviewsMethod = collectionGrpc.getGetCatPreviewsMethod) == null) {
          collectionGrpc.getGetCatPreviewsMethod = getGetCatPreviewsMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsReq, com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCatPreviews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsResp.getDefaultInstance()))
              .setSchemaDescriptor(new collectionMethodDescriptorSupplier("GetCatPreviews"))
              .build();
        }
      }
    }
    return getGetCatPreviewsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailResp> getGetCatDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCatDetail",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailResp> getGetCatDetailMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailReq, com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailResp> getGetCatDetailMethod;
    if ((getGetCatDetailMethod = collectionGrpc.getGetCatDetailMethod) == null) {
      synchronized (collectionGrpc.class) {
        if ((getGetCatDetailMethod = collectionGrpc.getGetCatDetailMethod) == null) {
          collectionGrpc.getGetCatDetailMethod = getGetCatDetailMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailReq, com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCatDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailResp.getDefaultInstance()))
              .setSchemaDescriptor(new collectionMethodDescriptorSupplier("GetCatDetail"))
              .build();
        }
      }
    }
    return getGetCatDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewCatReq,
      com.xhpolaris.idlgen.meowchat.coreapi.NewCatResp> getNewCatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewCat",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.NewCatReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.NewCatResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewCatReq,
      com.xhpolaris.idlgen.meowchat.coreapi.NewCatResp> getNewCatMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewCatReq, com.xhpolaris.idlgen.meowchat.coreapi.NewCatResp> getNewCatMethod;
    if ((getNewCatMethod = collectionGrpc.getNewCatMethod) == null) {
      synchronized (collectionGrpc.class) {
        if ((getNewCatMethod = collectionGrpc.getNewCatMethod) == null) {
          collectionGrpc.getNewCatMethod = getNewCatMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.NewCatReq, com.xhpolaris.idlgen.meowchat.coreapi.NewCatResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewCat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.NewCatReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.NewCatResp.getDefaultInstance()))
              .setSchemaDescriptor(new collectionMethodDescriptorSupplier("NewCat"))
              .build();
        }
      }
    }
    return getNewCatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatResp> getDeleteCatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCat",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatResp> getDeleteCatMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatReq, com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatResp> getDeleteCatMethod;
    if ((getDeleteCatMethod = collectionGrpc.getDeleteCatMethod) == null) {
      synchronized (collectionGrpc.class) {
        if ((getDeleteCatMethod = collectionGrpc.getDeleteCatMethod) == null) {
          collectionGrpc.getDeleteCatMethod = getDeleteCatMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatReq, com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatResp.getDefaultInstance()))
              .setSchemaDescriptor(new collectionMethodDescriptorSupplier("DeleteCat"))
              .build();
        }
      }
    }
    return getDeleteCatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SearchCatReq,
      com.xhpolaris.idlgen.meowchat.coreapi.SearchCatResp> getSearchCatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchCat",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.SearchCatReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.SearchCatResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SearchCatReq,
      com.xhpolaris.idlgen.meowchat.coreapi.SearchCatResp> getSearchCatMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SearchCatReq, com.xhpolaris.idlgen.meowchat.coreapi.SearchCatResp> getSearchCatMethod;
    if ((getSearchCatMethod = collectionGrpc.getSearchCatMethod) == null) {
      synchronized (collectionGrpc.class) {
        if ((getSearchCatMethod = collectionGrpc.getSearchCatMethod) == null) {
          collectionGrpc.getSearchCatMethod = getSearchCatMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.SearchCatReq, com.xhpolaris.idlgen.meowchat.coreapi.SearchCatResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchCat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.SearchCatReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.SearchCatResp.getDefaultInstance()))
              .setSchemaDescriptor(new collectionMethodDescriptorSupplier("SearchCat"))
              .build();
        }
      }
    }
    return getSearchCatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.CreateImageReq,
      com.xhpolaris.idlgen.meowchat.coreapi.CreateImageResp> getCreateImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateImage",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.CreateImageReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.CreateImageResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.CreateImageReq,
      com.xhpolaris.idlgen.meowchat.coreapi.CreateImageResp> getCreateImageMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.CreateImageReq, com.xhpolaris.idlgen.meowchat.coreapi.CreateImageResp> getCreateImageMethod;
    if ((getCreateImageMethod = collectionGrpc.getCreateImageMethod) == null) {
      synchronized (collectionGrpc.class) {
        if ((getCreateImageMethod = collectionGrpc.getCreateImageMethod) == null) {
          collectionGrpc.getCreateImageMethod = getCreateImageMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.CreateImageReq, com.xhpolaris.idlgen.meowchat.coreapi.CreateImageResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.CreateImageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.CreateImageResp.getDefaultInstance()))
              .setSchemaDescriptor(new collectionMethodDescriptorSupplier("CreateImage"))
              .build();
        }
      }
    }
    return getCreateImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageResp> getDeleteImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteImage",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageResp> getDeleteImageMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageReq, com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageResp> getDeleteImageMethod;
    if ((getDeleteImageMethod = collectionGrpc.getDeleteImageMethod) == null) {
      synchronized (collectionGrpc.class) {
        if ((getDeleteImageMethod = collectionGrpc.getDeleteImageMethod) == null) {
          collectionGrpc.getDeleteImageMethod = getDeleteImageMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageReq, com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageResp.getDefaultInstance()))
              .setSchemaDescriptor(new collectionMethodDescriptorSupplier("DeleteImage"))
              .build();
        }
      }
    }
    return getDeleteImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatResp> getGetImageByCatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetImageByCat",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatResp> getGetImageByCatMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatReq, com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatResp> getGetImageByCatMethod;
    if ((getGetImageByCatMethod = collectionGrpc.getGetImageByCatMethod) == null) {
      synchronized (collectionGrpc.class) {
        if ((getGetImageByCatMethod = collectionGrpc.getGetImageByCatMethod) == null) {
          collectionGrpc.getGetImageByCatMethod = getGetImageByCatMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatReq, com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetImageByCat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatResp.getDefaultInstance()))
              .setSchemaDescriptor(new collectionMethodDescriptorSupplier("GetImageByCat"))
              .build();
        }
      }
    }
    return getGetImageByCatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static collectionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<collectionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<collectionStub>() {
        @java.lang.Override
        public collectionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new collectionStub(channel, callOptions);
        }
      };
    return collectionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static collectionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<collectionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<collectionBlockingStub>() {
        @java.lang.Override
        public collectionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new collectionBlockingStub(channel, callOptions);
        }
      };
    return collectionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static collectionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<collectionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<collectionFutureStub>() {
        @java.lang.Override
        public collectionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new collectionFutureStub(channel, callOptions);
        }
      };
    return collectionFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class collectionImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCatPreviews(com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCatPreviewsMethod(), responseObserver);
    }

    /**
     */
    public void getCatDetail(com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCatDetailMethod(), responseObserver);
    }

    /**
     */
    public void newCat(com.xhpolaris.idlgen.meowchat.coreapi.NewCatReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewCatResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewCatMethod(), responseObserver);
    }

    /**
     */
    public void deleteCat(com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCatMethod(), responseObserver);
    }

    /**
     */
    public void searchCat(com.xhpolaris.idlgen.meowchat.coreapi.SearchCatReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SearchCatResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchCatMethod(), responseObserver);
    }

    /**
     */
    public void createImage(com.xhpolaris.idlgen.meowchat.coreapi.CreateImageReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.CreateImageResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateImageMethod(), responseObserver);
    }

    /**
     */
    public void deleteImage(com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteImageMethod(), responseObserver);
    }

    /**
     */
    public void getImageByCat(com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetImageByCatMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCatPreviewsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsReq,
                com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsResp>(
                  this, METHODID_GET_CAT_PREVIEWS)))
          .addMethod(
            getGetCatDetailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailReq,
                com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailResp>(
                  this, METHODID_GET_CAT_DETAIL)))
          .addMethod(
            getNewCatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.NewCatReq,
                com.xhpolaris.idlgen.meowchat.coreapi.NewCatResp>(
                  this, METHODID_NEW_CAT)))
          .addMethod(
            getDeleteCatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatReq,
                com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatResp>(
                  this, METHODID_DELETE_CAT)))
          .addMethod(
            getSearchCatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.SearchCatReq,
                com.xhpolaris.idlgen.meowchat.coreapi.SearchCatResp>(
                  this, METHODID_SEARCH_CAT)))
          .addMethod(
            getCreateImageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.CreateImageReq,
                com.xhpolaris.idlgen.meowchat.coreapi.CreateImageResp>(
                  this, METHODID_CREATE_IMAGE)))
          .addMethod(
            getDeleteImageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageReq,
                com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageResp>(
                  this, METHODID_DELETE_IMAGE)))
          .addMethod(
            getGetImageByCatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatReq,
                com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatResp>(
                  this, METHODID_GET_IMAGE_BY_CAT)))
          .build();
    }
  }

  /**
   */
  public static final class collectionStub extends io.grpc.stub.AbstractAsyncStub<collectionStub> {
    private collectionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected collectionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new collectionStub(channel, callOptions);
    }

    /**
     */
    public void getCatPreviews(com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCatPreviewsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCatDetail(com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCatDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void newCat(com.xhpolaris.idlgen.meowchat.coreapi.NewCatReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewCatResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewCatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCat(com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchCat(com.xhpolaris.idlgen.meowchat.coreapi.SearchCatReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SearchCatResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchCatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createImage(com.xhpolaris.idlgen.meowchat.coreapi.CreateImageReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.CreateImageResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteImage(com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getImageByCat(com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetImageByCatMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class collectionBlockingStub extends io.grpc.stub.AbstractBlockingStub<collectionBlockingStub> {
    private collectionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected collectionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new collectionBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsResp getCatPreviews(com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCatPreviewsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailResp getCatDetail(com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCatDetailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.NewCatResp newCat(com.xhpolaris.idlgen.meowchat.coreapi.NewCatReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewCatMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatResp deleteCat(com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCatMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.SearchCatResp searchCat(com.xhpolaris.idlgen.meowchat.coreapi.SearchCatReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchCatMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.CreateImageResp createImage(com.xhpolaris.idlgen.meowchat.coreapi.CreateImageReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateImageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageResp deleteImage(com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteImageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatResp getImageByCat(com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetImageByCatMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class collectionFutureStub extends io.grpc.stub.AbstractFutureStub<collectionFutureStub> {
    private collectionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected collectionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new collectionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsResp> getCatPreviews(
        com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCatPreviewsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailResp> getCatDetail(
        com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCatDetailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.NewCatResp> newCat(
        com.xhpolaris.idlgen.meowchat.coreapi.NewCatReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewCatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatResp> deleteCat(
        com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.SearchCatResp> searchCat(
        com.xhpolaris.idlgen.meowchat.coreapi.SearchCatReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchCatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.CreateImageResp> createImage(
        com.xhpolaris.idlgen.meowchat.coreapi.CreateImageReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateImageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageResp> deleteImage(
        com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteImageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatResp> getImageByCat(
        com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetImageByCatMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAT_PREVIEWS = 0;
  private static final int METHODID_GET_CAT_DETAIL = 1;
  private static final int METHODID_NEW_CAT = 2;
  private static final int METHODID_DELETE_CAT = 3;
  private static final int METHODID_SEARCH_CAT = 4;
  private static final int METHODID_CREATE_IMAGE = 5;
  private static final int METHODID_DELETE_IMAGE = 6;
  private static final int METHODID_GET_IMAGE_BY_CAT = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final collectionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(collectionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAT_PREVIEWS:
          serviceImpl.getCatPreviews((com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetCatPreviewsResp>) responseObserver);
          break;
        case METHODID_GET_CAT_DETAIL:
          serviceImpl.getCatDetail((com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetCatDetailResp>) responseObserver);
          break;
        case METHODID_NEW_CAT:
          serviceImpl.newCat((com.xhpolaris.idlgen.meowchat.coreapi.NewCatReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewCatResp>) responseObserver);
          break;
        case METHODID_DELETE_CAT:
          serviceImpl.deleteCat((com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCatResp>) responseObserver);
          break;
        case METHODID_SEARCH_CAT:
          serviceImpl.searchCat((com.xhpolaris.idlgen.meowchat.coreapi.SearchCatReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SearchCatResp>) responseObserver);
          break;
        case METHODID_CREATE_IMAGE:
          serviceImpl.createImage((com.xhpolaris.idlgen.meowchat.coreapi.CreateImageReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.CreateImageResp>) responseObserver);
          break;
        case METHODID_DELETE_IMAGE:
          serviceImpl.deleteImage((com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteImageResp>) responseObserver);
          break;
        case METHODID_GET_IMAGE_BY_CAT:
          serviceImpl.getImageByCat((com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetImageByCatResp>) responseObserver);
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

  private static abstract class collectionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    collectionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xhpolaris.idlgen.meowchat.coreapi.CoreApiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("collection");
    }
  }

  private static final class collectionFileDescriptorSupplier
      extends collectionBaseDescriptorSupplier {
    collectionFileDescriptorSupplier() {}
  }

  private static final class collectionMethodDescriptorSupplier
      extends collectionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    collectionMethodDescriptorSupplier(String methodName) {
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
      synchronized (collectionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new collectionFileDescriptorSupplier())
              .addMethod(getGetCatPreviewsMethod())
              .addMethod(getGetCatDetailMethod())
              .addMethod(getNewCatMethod())
              .addMethod(getDeleteCatMethod())
              .addMethod(getSearchCatMethod())
              .addMethod(getCreateImageMethod())
              .addMethod(getDeleteImageMethod())
              .addMethod(getGetImageByCatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
