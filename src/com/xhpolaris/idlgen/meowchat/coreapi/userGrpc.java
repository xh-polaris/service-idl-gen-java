package com.xhpolaris.idlgen.meowchat.coreapi;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: meowchat/core_api/core_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class userGrpc {

  private userGrpc() {}

  public static final String SERVICE_NAME = "meowchat.core_api.user";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoResp> getGetUserInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserInfo",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoResp> getGetUserInfoMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoReq, com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoResp> getGetUserInfoMethod;
    if ((getGetUserInfoMethod = userGrpc.getGetUserInfoMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getGetUserInfoMethod = userGrpc.getGetUserInfoMethod) == null) {
          userGrpc.getGetUserInfoMethod = getGetUserInfoMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoReq, com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoResp.getDefaultInstance()))
              .setSchemaDescriptor(new userMethodDescriptorSupplier("GetUserInfo"))
              .build();
        }
      }
    }
    return getGetUserInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoReq,
      com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoResp> getUpdateUserInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserInfo",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoReq,
      com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoResp> getUpdateUserInfoMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoReq, com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoResp> getUpdateUserInfoMethod;
    if ((getUpdateUserInfoMethod = userGrpc.getUpdateUserInfoMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getUpdateUserInfoMethod = userGrpc.getUpdateUserInfoMethod) == null) {
          userGrpc.getUpdateUserInfoMethod = getUpdateUserInfoMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoReq, com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoResp.getDefaultInstance()))
              .setSchemaDescriptor(new userMethodDescriptorSupplier("UpdateUserInfo"))
              .build();
        }
      }
    }
    return getUpdateUserInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SearchUserReq,
      com.xhpolaris.idlgen.meowchat.coreapi.SearchUserResp> getSearchUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchUser",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.SearchUserReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.SearchUserResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SearchUserReq,
      com.xhpolaris.idlgen.meowchat.coreapi.SearchUserResp> getSearchUserMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SearchUserReq, com.xhpolaris.idlgen.meowchat.coreapi.SearchUserResp> getSearchUserMethod;
    if ((getSearchUserMethod = userGrpc.getSearchUserMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getSearchUserMethod = userGrpc.getSearchUserMethod) == null) {
          userGrpc.getSearchUserMethod = getSearchUserMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.SearchUserReq, com.xhpolaris.idlgen.meowchat.coreapi.SearchUserResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.SearchUserReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.SearchUserResp.getDefaultInstance()))
              .setSchemaDescriptor(new userMethodDescriptorSupplier("SearchUser"))
              .build();
        }
      }
    }
    return getSearchUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminReq,
      com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminResp> getSearchUserForAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchUserForAdmin",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminReq,
      com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminResp> getSearchUserForAdminMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminReq, com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminResp> getSearchUserForAdminMethod;
    if ((getSearchUserForAdminMethod = userGrpc.getSearchUserForAdminMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getSearchUserForAdminMethod = userGrpc.getSearchUserForAdminMethod) == null) {
          userGrpc.getSearchUserForAdminMethod = getSearchUserForAdminMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminReq, com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchUserForAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminResp.getDefaultInstance()))
              .setSchemaDescriptor(new userMethodDescriptorSupplier("SearchUserForAdmin"))
              .build();
        }
      }
    }
    return getSearchUserForAdminMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<userStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<userStub>() {
        @java.lang.Override
        public userStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new userStub(channel, callOptions);
        }
      };
    return userStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<userBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<userBlockingStub>() {
        @java.lang.Override
        public userBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new userBlockingStub(channel, callOptions);
        }
      };
    return userBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<userFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<userFutureStub>() {
        @java.lang.Override
        public userFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new userFutureStub(channel, callOptions);
        }
      };
    return userFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class userImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUserInfo(com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserInfoMethod(), responseObserver);
    }

    /**
     */
    public void updateUserInfo(com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserInfoMethod(), responseObserver);
    }

    /**
     */
    public void searchUser(com.xhpolaris.idlgen.meowchat.coreapi.SearchUserReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SearchUserResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchUserMethod(), responseObserver);
    }

    /**
     */
    public void searchUserForAdmin(com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchUserForAdminMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoReq,
                com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoResp>(
                  this, METHODID_GET_USER_INFO)))
          .addMethod(
            getUpdateUserInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoReq,
                com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoResp>(
                  this, METHODID_UPDATE_USER_INFO)))
          .addMethod(
            getSearchUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.SearchUserReq,
                com.xhpolaris.idlgen.meowchat.coreapi.SearchUserResp>(
                  this, METHODID_SEARCH_USER)))
          .addMethod(
            getSearchUserForAdminMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminReq,
                com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminResp>(
                  this, METHODID_SEARCH_USER_FOR_ADMIN)))
          .build();
    }
  }

  /**
   */
  public static final class userStub extends io.grpc.stub.AbstractAsyncStub<userStub> {
    private userStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new userStub(channel, callOptions);
    }

    /**
     */
    public void getUserInfo(com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUserInfo(com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchUser(com.xhpolaris.idlgen.meowchat.coreapi.SearchUserReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SearchUserResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchUserForAdmin(com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchUserForAdminMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class userBlockingStub extends io.grpc.stub.AbstractBlockingStub<userBlockingStub> {
    private userBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new userBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoResp getUserInfo(com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoResp updateUserInfo(com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.SearchUserResp searchUser(com.xhpolaris.idlgen.meowchat.coreapi.SearchUserReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminResp searchUserForAdmin(com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchUserForAdminMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class userFutureStub extends io.grpc.stub.AbstractFutureStub<userFutureStub> {
    private userFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new userFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoResp> getUserInfo(
        com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoResp> updateUserInfo(
        com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.SearchUserResp> searchUser(
        com.xhpolaris.idlgen.meowchat.coreapi.SearchUserReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminResp> searchUserForAdmin(
        com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchUserForAdminMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_INFO = 0;
  private static final int METHODID_UPDATE_USER_INFO = 1;
  private static final int METHODID_SEARCH_USER = 2;
  private static final int METHODID_SEARCH_USER_FOR_ADMIN = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_INFO:
          serviceImpl.getUserInfo((com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetUserInfoResp>) responseObserver);
          break;
        case METHODID_UPDATE_USER_INFO:
          serviceImpl.updateUserInfo((com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.UpdateUserInfoResp>) responseObserver);
          break;
        case METHODID_SEARCH_USER:
          serviceImpl.searchUser((com.xhpolaris.idlgen.meowchat.coreapi.SearchUserReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SearchUserResp>) responseObserver);
          break;
        case METHODID_SEARCH_USER_FOR_ADMIN:
          serviceImpl.searchUserForAdmin((com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.SearchUserForAdminResp>) responseObserver);
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

  private static abstract class userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xhpolaris.idlgen.meowchat.coreapi.CoreApiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("user");
    }
  }

  private static final class userFileDescriptorSupplier
      extends userBaseDescriptorSupplier {
    userFileDescriptorSupplier() {}
  }

  private static final class userMethodDescriptorSupplier
      extends userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userMethodDescriptorSupplier(String methodName) {
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
      synchronized (userGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userFileDescriptorSupplier())
              .addMethod(getGetUserInfoMethod())
              .addMethod(getUpdateUserInfoMethod())
              .addMethod(getSearchUserMethod())
              .addMethod(getSearchUserForAdminMethod())
              .build();
        }
      }
    }
    return result;
  }
}
