package com.xhpolaris.idlgen.platform.sts;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: platform/sts/sts.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StsServiceGrpc {

  private StsServiceGrpc() {}

  public static final String SERVICE_NAME = "platform.sts.StsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.GenCosStsReq,
      com.xhpolaris.idlgen.platform.sts.GenCosStsResp> getGenCosStsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "genCosSts",
      requestType = com.xhpolaris.idlgen.platform.sts.GenCosStsReq.class,
      responseType = com.xhpolaris.idlgen.platform.sts.GenCosStsResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.GenCosStsReq,
      com.xhpolaris.idlgen.platform.sts.GenCosStsResp> getGenCosStsMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.GenCosStsReq, com.xhpolaris.idlgen.platform.sts.GenCosStsResp> getGenCosStsMethod;
    if ((getGenCosStsMethod = StsServiceGrpc.getGenCosStsMethod) == null) {
      synchronized (StsServiceGrpc.class) {
        if ((getGenCosStsMethod = StsServiceGrpc.getGenCosStsMethod) == null) {
          StsServiceGrpc.getGenCosStsMethod = getGenCosStsMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.platform.sts.GenCosStsReq, com.xhpolaris.idlgen.platform.sts.GenCosStsResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "genCosSts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.sts.GenCosStsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.sts.GenCosStsResp.getDefaultInstance()))
              .setSchemaDescriptor(new StsServiceMethodDescriptorSupplier("genCosSts"))
              .build();
        }
      }
    }
    return getGenCosStsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.GenSignedUrlReq,
      com.xhpolaris.idlgen.platform.sts.GenSignedUrlResp> getGenSignedUrlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "genSignedUrl",
      requestType = com.xhpolaris.idlgen.platform.sts.GenSignedUrlReq.class,
      responseType = com.xhpolaris.idlgen.platform.sts.GenSignedUrlResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.GenSignedUrlReq,
      com.xhpolaris.idlgen.platform.sts.GenSignedUrlResp> getGenSignedUrlMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.GenSignedUrlReq, com.xhpolaris.idlgen.platform.sts.GenSignedUrlResp> getGenSignedUrlMethod;
    if ((getGenSignedUrlMethod = StsServiceGrpc.getGenSignedUrlMethod) == null) {
      synchronized (StsServiceGrpc.class) {
        if ((getGenSignedUrlMethod = StsServiceGrpc.getGenSignedUrlMethod) == null) {
          StsServiceGrpc.getGenSignedUrlMethod = getGenSignedUrlMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.platform.sts.GenSignedUrlReq, com.xhpolaris.idlgen.platform.sts.GenSignedUrlResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "genSignedUrl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.sts.GenSignedUrlReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.sts.GenSignedUrlResp.getDefaultInstance()))
              .setSchemaDescriptor(new StsServiceMethodDescriptorSupplier("genSignedUrl"))
              .build();
        }
      }
    }
    return getGenSignedUrlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.DeleteObjectReq,
      com.xhpolaris.idlgen.platform.sts.DeleteObjectResp> getDeleteObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteObject",
      requestType = com.xhpolaris.idlgen.platform.sts.DeleteObjectReq.class,
      responseType = com.xhpolaris.idlgen.platform.sts.DeleteObjectResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.DeleteObjectReq,
      com.xhpolaris.idlgen.platform.sts.DeleteObjectResp> getDeleteObjectMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.DeleteObjectReq, com.xhpolaris.idlgen.platform.sts.DeleteObjectResp> getDeleteObjectMethod;
    if ((getDeleteObjectMethod = StsServiceGrpc.getDeleteObjectMethod) == null) {
      synchronized (StsServiceGrpc.class) {
        if ((getDeleteObjectMethod = StsServiceGrpc.getDeleteObjectMethod) == null) {
          StsServiceGrpc.getDeleteObjectMethod = getDeleteObjectMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.platform.sts.DeleteObjectReq, com.xhpolaris.idlgen.platform.sts.DeleteObjectResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.sts.DeleteObjectReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.sts.DeleteObjectResp.getDefaultInstance()))
              .setSchemaDescriptor(new StsServiceMethodDescriptorSupplier("deleteObject"))
              .build();
        }
      }
    }
    return getDeleteObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.TextCheckReq,
      com.xhpolaris.idlgen.platform.sts.TextCheckResp> getTextCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "textCheck",
      requestType = com.xhpolaris.idlgen.platform.sts.TextCheckReq.class,
      responseType = com.xhpolaris.idlgen.platform.sts.TextCheckResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.TextCheckReq,
      com.xhpolaris.idlgen.platform.sts.TextCheckResp> getTextCheckMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.TextCheckReq, com.xhpolaris.idlgen.platform.sts.TextCheckResp> getTextCheckMethod;
    if ((getTextCheckMethod = StsServiceGrpc.getTextCheckMethod) == null) {
      synchronized (StsServiceGrpc.class) {
        if ((getTextCheckMethod = StsServiceGrpc.getTextCheckMethod) == null) {
          StsServiceGrpc.getTextCheckMethod = getTextCheckMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.platform.sts.TextCheckReq, com.xhpolaris.idlgen.platform.sts.TextCheckResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "textCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.sts.TextCheckReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.sts.TextCheckResp.getDefaultInstance()))
              .setSchemaDescriptor(new StsServiceMethodDescriptorSupplier("textCheck"))
              .build();
        }
      }
    }
    return getTextCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.PhotoCheckReq,
      com.xhpolaris.idlgen.platform.sts.PhotoCheckResp> getPhotoCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "photoCheck",
      requestType = com.xhpolaris.idlgen.platform.sts.PhotoCheckReq.class,
      responseType = com.xhpolaris.idlgen.platform.sts.PhotoCheckResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.PhotoCheckReq,
      com.xhpolaris.idlgen.platform.sts.PhotoCheckResp> getPhotoCheckMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.PhotoCheckReq, com.xhpolaris.idlgen.platform.sts.PhotoCheckResp> getPhotoCheckMethod;
    if ((getPhotoCheckMethod = StsServiceGrpc.getPhotoCheckMethod) == null) {
      synchronized (StsServiceGrpc.class) {
        if ((getPhotoCheckMethod = StsServiceGrpc.getPhotoCheckMethod) == null) {
          StsServiceGrpc.getPhotoCheckMethod = getPhotoCheckMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.platform.sts.PhotoCheckReq, com.xhpolaris.idlgen.platform.sts.PhotoCheckResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "photoCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.sts.PhotoCheckReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.sts.PhotoCheckResp.getDefaultInstance()))
              .setSchemaDescriptor(new StsServiceMethodDescriptorSupplier("photoCheck"))
              .build();
        }
      }
    }
    return getPhotoCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.SignInReq,
      com.xhpolaris.idlgen.platform.sts.SignInResp> getSignInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "signIn",
      requestType = com.xhpolaris.idlgen.platform.sts.SignInReq.class,
      responseType = com.xhpolaris.idlgen.platform.sts.SignInResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.SignInReq,
      com.xhpolaris.idlgen.platform.sts.SignInResp> getSignInMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.SignInReq, com.xhpolaris.idlgen.platform.sts.SignInResp> getSignInMethod;
    if ((getSignInMethod = StsServiceGrpc.getSignInMethod) == null) {
      synchronized (StsServiceGrpc.class) {
        if ((getSignInMethod = StsServiceGrpc.getSignInMethod) == null) {
          StsServiceGrpc.getSignInMethod = getSignInMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.platform.sts.SignInReq, com.xhpolaris.idlgen.platform.sts.SignInResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "signIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.sts.SignInReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.sts.SignInResp.getDefaultInstance()))
              .setSchemaDescriptor(new StsServiceMethodDescriptorSupplier("signIn"))
              .build();
        }
      }
    }
    return getSignInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.SetPasswordReq,
      com.xhpolaris.idlgen.platform.sts.SetPasswordResp> getSetPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setPassword",
      requestType = com.xhpolaris.idlgen.platform.sts.SetPasswordReq.class,
      responseType = com.xhpolaris.idlgen.platform.sts.SetPasswordResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.SetPasswordReq,
      com.xhpolaris.idlgen.platform.sts.SetPasswordResp> getSetPasswordMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.SetPasswordReq, com.xhpolaris.idlgen.platform.sts.SetPasswordResp> getSetPasswordMethod;
    if ((getSetPasswordMethod = StsServiceGrpc.getSetPasswordMethod) == null) {
      synchronized (StsServiceGrpc.class) {
        if ((getSetPasswordMethod = StsServiceGrpc.getSetPasswordMethod) == null) {
          StsServiceGrpc.getSetPasswordMethod = getSetPasswordMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.platform.sts.SetPasswordReq, com.xhpolaris.idlgen.platform.sts.SetPasswordResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.sts.SetPasswordReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.sts.SetPasswordResp.getDefaultInstance()))
              .setSchemaDescriptor(new StsServiceMethodDescriptorSupplier("setPassword"))
              .build();
        }
      }
    }
    return getSetPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.SendVerifyCodeReq,
      com.xhpolaris.idlgen.platform.sts.SendVerifyCodeResp> getSendVerifyCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendVerifyCode",
      requestType = com.xhpolaris.idlgen.platform.sts.SendVerifyCodeReq.class,
      responseType = com.xhpolaris.idlgen.platform.sts.SendVerifyCodeResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.SendVerifyCodeReq,
      com.xhpolaris.idlgen.platform.sts.SendVerifyCodeResp> getSendVerifyCodeMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.platform.sts.SendVerifyCodeReq, com.xhpolaris.idlgen.platform.sts.SendVerifyCodeResp> getSendVerifyCodeMethod;
    if ((getSendVerifyCodeMethod = StsServiceGrpc.getSendVerifyCodeMethod) == null) {
      synchronized (StsServiceGrpc.class) {
        if ((getSendVerifyCodeMethod = StsServiceGrpc.getSendVerifyCodeMethod) == null) {
          StsServiceGrpc.getSendVerifyCodeMethod = getSendVerifyCodeMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.platform.sts.SendVerifyCodeReq, com.xhpolaris.idlgen.platform.sts.SendVerifyCodeResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendVerifyCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.sts.SendVerifyCodeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.platform.sts.SendVerifyCodeResp.getDefaultInstance()))
              .setSchemaDescriptor(new StsServiceMethodDescriptorSupplier("sendVerifyCode"))
              .build();
        }
      }
    }
    return getSendVerifyCodeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StsServiceStub>() {
        @java.lang.Override
        public StsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StsServiceStub(channel, callOptions);
        }
      };
    return StsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StsServiceBlockingStub>() {
        @java.lang.Override
        public StsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StsServiceBlockingStub(channel, callOptions);
        }
      };
    return StsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StsServiceFutureStub>() {
        @java.lang.Override
        public StsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StsServiceFutureStub(channel, callOptions);
        }
      };
    return StsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class StsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void genCosSts(com.xhpolaris.idlgen.platform.sts.GenCosStsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.GenCosStsResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenCosStsMethod(), responseObserver);
    }

    /**
     */
    public void genSignedUrl(com.xhpolaris.idlgen.platform.sts.GenSignedUrlReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.GenSignedUrlResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenSignedUrlMethod(), responseObserver);
    }

    /**
     */
    public void deleteObject(com.xhpolaris.idlgen.platform.sts.DeleteObjectReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.DeleteObjectResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteObjectMethod(), responseObserver);
    }

    /**
     */
    public void textCheck(com.xhpolaris.idlgen.platform.sts.TextCheckReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.TextCheckResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTextCheckMethod(), responseObserver);
    }

    /**
     */
    public void photoCheck(com.xhpolaris.idlgen.platform.sts.PhotoCheckReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.PhotoCheckResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPhotoCheckMethod(), responseObserver);
    }

    /**
     */
    public void signIn(com.xhpolaris.idlgen.platform.sts.SignInReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.SignInResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignInMethod(), responseObserver);
    }

    /**
     */
    public void setPassword(com.xhpolaris.idlgen.platform.sts.SetPasswordReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.SetPasswordResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPasswordMethod(), responseObserver);
    }

    /**
     */
    public void sendVerifyCode(com.xhpolaris.idlgen.platform.sts.SendVerifyCodeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.SendVerifyCodeResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendVerifyCodeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenCosStsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.platform.sts.GenCosStsReq,
                com.xhpolaris.idlgen.platform.sts.GenCosStsResp>(
                  this, METHODID_GEN_COS_STS)))
          .addMethod(
            getGenSignedUrlMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.platform.sts.GenSignedUrlReq,
                com.xhpolaris.idlgen.platform.sts.GenSignedUrlResp>(
                  this, METHODID_GEN_SIGNED_URL)))
          .addMethod(
            getDeleteObjectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.platform.sts.DeleteObjectReq,
                com.xhpolaris.idlgen.platform.sts.DeleteObjectResp>(
                  this, METHODID_DELETE_OBJECT)))
          .addMethod(
            getTextCheckMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.platform.sts.TextCheckReq,
                com.xhpolaris.idlgen.platform.sts.TextCheckResp>(
                  this, METHODID_TEXT_CHECK)))
          .addMethod(
            getPhotoCheckMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.platform.sts.PhotoCheckReq,
                com.xhpolaris.idlgen.platform.sts.PhotoCheckResp>(
                  this, METHODID_PHOTO_CHECK)))
          .addMethod(
            getSignInMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.platform.sts.SignInReq,
                com.xhpolaris.idlgen.platform.sts.SignInResp>(
                  this, METHODID_SIGN_IN)))
          .addMethod(
            getSetPasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.platform.sts.SetPasswordReq,
                com.xhpolaris.idlgen.platform.sts.SetPasswordResp>(
                  this, METHODID_SET_PASSWORD)))
          .addMethod(
            getSendVerifyCodeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.platform.sts.SendVerifyCodeReq,
                com.xhpolaris.idlgen.platform.sts.SendVerifyCodeResp>(
                  this, METHODID_SEND_VERIFY_CODE)))
          .build();
    }
  }

  /**
   */
  public static final class StsServiceStub extends io.grpc.stub.AbstractAsyncStub<StsServiceStub> {
    private StsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StsServiceStub(channel, callOptions);
    }

    /**
     */
    public void genCosSts(com.xhpolaris.idlgen.platform.sts.GenCosStsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.GenCosStsResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenCosStsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void genSignedUrl(com.xhpolaris.idlgen.platform.sts.GenSignedUrlReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.GenSignedUrlResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenSignedUrlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteObject(com.xhpolaris.idlgen.platform.sts.DeleteObjectReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.DeleteObjectResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void textCheck(com.xhpolaris.idlgen.platform.sts.TextCheckReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.TextCheckResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTextCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void photoCheck(com.xhpolaris.idlgen.platform.sts.PhotoCheckReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.PhotoCheckResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPhotoCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signIn(com.xhpolaris.idlgen.platform.sts.SignInReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.SignInResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setPassword(com.xhpolaris.idlgen.platform.sts.SetPasswordReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.SetPasswordResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendVerifyCode(com.xhpolaris.idlgen.platform.sts.SendVerifyCodeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.SendVerifyCodeResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendVerifyCodeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<StsServiceBlockingStub> {
    private StsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.xhpolaris.idlgen.platform.sts.GenCosStsResp genCosSts(com.xhpolaris.idlgen.platform.sts.GenCosStsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenCosStsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.platform.sts.GenSignedUrlResp genSignedUrl(com.xhpolaris.idlgen.platform.sts.GenSignedUrlReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenSignedUrlMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.platform.sts.DeleteObjectResp deleteObject(com.xhpolaris.idlgen.platform.sts.DeleteObjectReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.platform.sts.TextCheckResp textCheck(com.xhpolaris.idlgen.platform.sts.TextCheckReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTextCheckMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.platform.sts.PhotoCheckResp photoCheck(com.xhpolaris.idlgen.platform.sts.PhotoCheckReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPhotoCheckMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.platform.sts.SignInResp signIn(com.xhpolaris.idlgen.platform.sts.SignInReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignInMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.platform.sts.SetPasswordResp setPassword(com.xhpolaris.idlgen.platform.sts.SetPasswordReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.platform.sts.SendVerifyCodeResp sendVerifyCode(com.xhpolaris.idlgen.platform.sts.SendVerifyCodeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendVerifyCodeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<StsServiceFutureStub> {
    private StsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.platform.sts.GenCosStsResp> genCosSts(
        com.xhpolaris.idlgen.platform.sts.GenCosStsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenCosStsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.platform.sts.GenSignedUrlResp> genSignedUrl(
        com.xhpolaris.idlgen.platform.sts.GenSignedUrlReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenSignedUrlMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.platform.sts.DeleteObjectResp> deleteObject(
        com.xhpolaris.idlgen.platform.sts.DeleteObjectReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteObjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.platform.sts.TextCheckResp> textCheck(
        com.xhpolaris.idlgen.platform.sts.TextCheckReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTextCheckMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.platform.sts.PhotoCheckResp> photoCheck(
        com.xhpolaris.idlgen.platform.sts.PhotoCheckReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPhotoCheckMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.platform.sts.SignInResp> signIn(
        com.xhpolaris.idlgen.platform.sts.SignInReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignInMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.platform.sts.SetPasswordResp> setPassword(
        com.xhpolaris.idlgen.platform.sts.SetPasswordReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.platform.sts.SendVerifyCodeResp> sendVerifyCode(
        com.xhpolaris.idlgen.platform.sts.SendVerifyCodeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendVerifyCodeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GEN_COS_STS = 0;
  private static final int METHODID_GEN_SIGNED_URL = 1;
  private static final int METHODID_DELETE_OBJECT = 2;
  private static final int METHODID_TEXT_CHECK = 3;
  private static final int METHODID_PHOTO_CHECK = 4;
  private static final int METHODID_SIGN_IN = 5;
  private static final int METHODID_SET_PASSWORD = 6;
  private static final int METHODID_SEND_VERIFY_CODE = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GEN_COS_STS:
          serviceImpl.genCosSts((com.xhpolaris.idlgen.platform.sts.GenCosStsReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.GenCosStsResp>) responseObserver);
          break;
        case METHODID_GEN_SIGNED_URL:
          serviceImpl.genSignedUrl((com.xhpolaris.idlgen.platform.sts.GenSignedUrlReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.GenSignedUrlResp>) responseObserver);
          break;
        case METHODID_DELETE_OBJECT:
          serviceImpl.deleteObject((com.xhpolaris.idlgen.platform.sts.DeleteObjectReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.DeleteObjectResp>) responseObserver);
          break;
        case METHODID_TEXT_CHECK:
          serviceImpl.textCheck((com.xhpolaris.idlgen.platform.sts.TextCheckReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.TextCheckResp>) responseObserver);
          break;
        case METHODID_PHOTO_CHECK:
          serviceImpl.photoCheck((com.xhpolaris.idlgen.platform.sts.PhotoCheckReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.PhotoCheckResp>) responseObserver);
          break;
        case METHODID_SIGN_IN:
          serviceImpl.signIn((com.xhpolaris.idlgen.platform.sts.SignInReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.SignInResp>) responseObserver);
          break;
        case METHODID_SET_PASSWORD:
          serviceImpl.setPassword((com.xhpolaris.idlgen.platform.sts.SetPasswordReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.SetPasswordResp>) responseObserver);
          break;
        case METHODID_SEND_VERIFY_CODE:
          serviceImpl.sendVerifyCode((com.xhpolaris.idlgen.platform.sts.SendVerifyCodeReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.platform.sts.SendVerifyCodeResp>) responseObserver);
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

  private static abstract class StsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xhpolaris.idlgen.platform.sts.StsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StsService");
    }
  }

  private static final class StsServiceFileDescriptorSupplier
      extends StsServiceBaseDescriptorSupplier {
    StsServiceFileDescriptorSupplier() {}
  }

  private static final class StsServiceMethodDescriptorSupplier
      extends StsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StsServiceFileDescriptorSupplier())
              .addMethod(getGenCosStsMethod())
              .addMethod(getGenSignedUrlMethod())
              .addMethod(getDeleteObjectMethod())
              .addMethod(getTextCheckMethod())
              .addMethod(getPhotoCheckMethod())
              .addMethod(getSignInMethod())
              .addMethod(getSetPasswordMethod())
              .addMethod(getSendVerifyCodeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
