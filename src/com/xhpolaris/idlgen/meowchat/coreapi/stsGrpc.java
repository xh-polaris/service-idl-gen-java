package com.xhpolaris.idlgen.meowchat.coreapi;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: meowchat/core_api/core_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class stsGrpc {

  private stsGrpc() {}

  public static final String SERVICE_NAME = "meowchat.core_api.sts";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlReq,
      com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlResp> getApplySignedUrlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplySignedUrl",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlReq,
      com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlResp> getApplySignedUrlMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlReq, com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlResp> getApplySignedUrlMethod;
    if ((getApplySignedUrlMethod = stsGrpc.getApplySignedUrlMethod) == null) {
      synchronized (stsGrpc.class) {
        if ((getApplySignedUrlMethod = stsGrpc.getApplySignedUrlMethod) == null) {
          stsGrpc.getApplySignedUrlMethod = getApplySignedUrlMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlReq, com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplySignedUrl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlResp.getDefaultInstance()))
              .setSchemaDescriptor(new stsMethodDescriptorSupplier("ApplySignedUrl"))
              .build();
        }
      }
    }
    return getApplySignedUrlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityReq,
      com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityResp> getApplySignedUrlAsCommunityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplySignedUrlAsCommunity",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityReq,
      com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityResp> getApplySignedUrlAsCommunityMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityReq, com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityResp> getApplySignedUrlAsCommunityMethod;
    if ((getApplySignedUrlAsCommunityMethod = stsGrpc.getApplySignedUrlAsCommunityMethod) == null) {
      synchronized (stsGrpc.class) {
        if ((getApplySignedUrlAsCommunityMethod = stsGrpc.getApplySignedUrlAsCommunityMethod) == null) {
          stsGrpc.getApplySignedUrlAsCommunityMethod = getApplySignedUrlAsCommunityMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityReq, com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplySignedUrlAsCommunity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityResp.getDefaultInstance()))
              .setSchemaDescriptor(new stsMethodDescriptorSupplier("ApplySignedUrlAsCommunity"))
              .build();
        }
      }
    }
    return getApplySignedUrlAsCommunityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static stsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<stsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<stsStub>() {
        @java.lang.Override
        public stsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new stsStub(channel, callOptions);
        }
      };
    return stsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static stsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<stsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<stsBlockingStub>() {
        @java.lang.Override
        public stsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new stsBlockingStub(channel, callOptions);
        }
      };
    return stsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static stsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<stsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<stsFutureStub>() {
        @java.lang.Override
        public stsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new stsFutureStub(channel, callOptions);
        }
      };
    return stsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class stsImplBase implements io.grpc.BindableService {

    /**
     */
    public void applySignedUrl(com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApplySignedUrlMethod(), responseObserver);
    }

    /**
     */
    public void applySignedUrlAsCommunity(com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApplySignedUrlAsCommunityMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getApplySignedUrlMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlReq,
                com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlResp>(
                  this, METHODID_APPLY_SIGNED_URL)))
          .addMethod(
            getApplySignedUrlAsCommunityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityReq,
                com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityResp>(
                  this, METHODID_APPLY_SIGNED_URL_AS_COMMUNITY)))
          .build();
    }
  }

  /**
   */
  public static final class stsStub extends io.grpc.stub.AbstractAsyncStub<stsStub> {
    private stsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected stsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new stsStub(channel, callOptions);
    }

    /**
     */
    public void applySignedUrl(com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApplySignedUrlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void applySignedUrlAsCommunity(com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApplySignedUrlAsCommunityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class stsBlockingStub extends io.grpc.stub.AbstractBlockingStub<stsBlockingStub> {
    private stsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected stsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new stsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlResp applySignedUrl(com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApplySignedUrlMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityResp applySignedUrlAsCommunity(com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApplySignedUrlAsCommunityMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class stsFutureStub extends io.grpc.stub.AbstractFutureStub<stsFutureStub> {
    private stsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected stsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new stsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlResp> applySignedUrl(
        com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApplySignedUrlMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityResp> applySignedUrlAsCommunity(
        com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApplySignedUrlAsCommunityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_APPLY_SIGNED_URL = 0;
  private static final int METHODID_APPLY_SIGNED_URL_AS_COMMUNITY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final stsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(stsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_APPLY_SIGNED_URL:
          serviceImpl.applySignedUrl((com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlResp>) responseObserver);
          break;
        case METHODID_APPLY_SIGNED_URL_AS_COMMUNITY:
          serviceImpl.applySignedUrlAsCommunity((com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.ApplySignedUrlAsCommunityResp>) responseObserver);
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

  private static abstract class stsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    stsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xhpolaris.idlgen.meowchat.coreapi.CoreApiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("sts");
    }
  }

  private static final class stsFileDescriptorSupplier
      extends stsBaseDescriptorSupplier {
    stsFileDescriptorSupplier() {}
  }

  private static final class stsMethodDescriptorSupplier
      extends stsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    stsMethodDescriptorSupplier(String methodName) {
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
      synchronized (stsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new stsFileDescriptorSupplier())
              .addMethod(getApplySignedUrlMethod())
              .addMethod(getApplySignedUrlAsCommunityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
