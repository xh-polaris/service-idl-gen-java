package com.xhpolaris.idlgen.meowchat.coreapi;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: meowchat/core_api/core_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class authGrpc {

  private authGrpc() {}

  public static final String SERVICE_NAME = "meowchat.core_api.auth";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SignInReq,
      com.xhpolaris.idlgen.meowchat.coreapi.SignInResp> getSignInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignIn",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.SignInReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.SignInResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SignInReq,
      com.xhpolaris.idlgen.meowchat.coreapi.SignInResp> getSignInMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SignInReq, com.xhpolaris.idlgen.meowchat.coreapi.SignInResp> getSignInMethod;
    if ((getSignInMethod = authGrpc.getSignInMethod) == null) {
      synchronized (authGrpc.class) {
        if ((getSignInMethod = authGrpc.getSignInMethod) == null) {
          authGrpc.getSignInMethod = getSignInMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.SignInReq, com.xhpolaris.idlgen.meowchat.coreapi.SignInResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.SignInReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.SignInResp.getDefaultInstance()))
              .setSchemaDescriptor(new authMethodDescriptorSupplier("SignIn"))
              .build();
        }
      }
    }
    return getSignInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeReq,
      com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeResp> getSendVerifyCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendVerifyCode",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeReq,
      com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeResp> getSendVerifyCodeMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeReq, com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeResp> getSendVerifyCodeMethod;
    if ((getSendVerifyCodeMethod = authGrpc.getSendVerifyCodeMethod) == null) {
      synchronized (authGrpc.class) {
        if ((getSendVerifyCodeMethod = authGrpc.getSendVerifyCodeMethod) == null) {
          authGrpc.getSendVerifyCodeMethod = getSendVerifyCodeMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeReq, com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendVerifyCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeResp.getDefaultInstance()))
              .setSchemaDescriptor(new authMethodDescriptorSupplier("SendVerifyCode"))
              .build();
        }
      }
    }
    return getSendVerifyCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordReq,
      com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordResp> getSetPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPassword",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordReq,
      com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordResp> getSetPasswordMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordReq, com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordResp> getSetPasswordMethod;
    if ((getSetPasswordMethod = authGrpc.getSetPasswordMethod) == null) {
      synchronized (authGrpc.class) {
        if ((getSetPasswordMethod = authGrpc.getSetPasswordMethod) == null) {
          authGrpc.getSetPasswordMethod = getSetPasswordMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordReq, com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordResp.getDefaultInstance()))
              .setSchemaDescriptor(new authMethodDescriptorSupplier("SetPassword"))
              .build();
        }
      }
    }
    return getSetPasswordMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static authStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<authStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<authStub>() {
        @java.lang.Override
        public authStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new authStub(channel, callOptions);
        }
      };
    return authStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static authBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<authBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<authBlockingStub>() {
        @java.lang.Override
        public authBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new authBlockingStub(channel, callOptions);
        }
      };
    return authBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static authFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<authFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<authFutureStub>() {
        @java.lang.Override
        public authFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new authFutureStub(channel, callOptions);
        }
      };
    return authFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class authImplBase implements io.grpc.BindableService {

    /**
     */
    public void signIn(com.xhpolaris.idlgen.meowchat.coreapi.SignInReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SignInResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignInMethod(), responseObserver);
    }

    /**
     */
    public void sendVerifyCode(com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendVerifyCodeMethod(), responseObserver);
    }

    /**
     */
    public void setPassword(com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPasswordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSignInMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.SignInReq,
                com.xhpolaris.idlgen.meowchat.coreapi.SignInResp>(
                  this, METHODID_SIGN_IN)))
          .addMethod(
            getSendVerifyCodeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeReq,
                com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeResp>(
                  this, METHODID_SEND_VERIFY_CODE)))
          .addMethod(
            getSetPasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordReq,
                com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordResp>(
                  this, METHODID_SET_PASSWORD)))
          .build();
    }
  }

  /**
   */
  public static final class authStub extends io.grpc.stub.AbstractAsyncStub<authStub> {
    private authStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected authStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new authStub(channel, callOptions);
    }

    /**
     */
    public void signIn(com.xhpolaris.idlgen.meowchat.coreapi.SignInReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SignInResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendVerifyCode(com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendVerifyCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setPassword(com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPasswordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class authBlockingStub extends io.grpc.stub.AbstractBlockingStub<authBlockingStub> {
    private authBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected authBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new authBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.SignInResp signIn(com.xhpolaris.idlgen.meowchat.coreapi.SignInReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignInMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeResp sendVerifyCode(com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendVerifyCodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordResp setPassword(com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPasswordMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class authFutureStub extends io.grpc.stub.AbstractFutureStub<authFutureStub> {
    private authFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected authFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new authFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.SignInResp> signIn(
        com.xhpolaris.idlgen.meowchat.coreapi.SignInReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignInMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeResp> sendVerifyCode(
        com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendVerifyCodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordResp> setPassword(
        com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPasswordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIGN_IN = 0;
  private static final int METHODID_SEND_VERIFY_CODE = 1;
  private static final int METHODID_SET_PASSWORD = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final authImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(authImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIGN_IN:
          serviceImpl.signIn((com.xhpolaris.idlgen.meowchat.coreapi.SignInReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SignInResp>) responseObserver);
          break;
        case METHODID_SEND_VERIFY_CODE:
          serviceImpl.sendVerifyCode((com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SendVerifyCodeResp>) responseObserver);
          break;
        case METHODID_SET_PASSWORD:
          serviceImpl.setPassword((com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SetPasswordResp>) responseObserver);
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

  private static abstract class authBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    authBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xhpolaris.idlgen.meowchat.coreapi.CoreApiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("auth");
    }
  }

  private static final class authFileDescriptorSupplier
      extends authBaseDescriptorSupplier {
    authFileDescriptorSupplier() {}
  }

  private static final class authMethodDescriptorSupplier
      extends authBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    authMethodDescriptorSupplier(String methodName) {
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
      synchronized (authGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new authFileDescriptorSupplier())
              .addMethod(getSignInMethod())
              .addMethod(getSendVerifyCodeMethod())
              .addMethod(getSetPasswordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
