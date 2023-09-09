package com.xhpolaris.idlgen.meowchat.user;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: meowchat/user/user.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "meowchat.user.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.GetUserReq,
      com.xhpolaris.idlgen.meowchat.user.GetUserResp> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = com.xhpolaris.idlgen.meowchat.user.GetUserReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.user.GetUserResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.GetUserReq,
      com.xhpolaris.idlgen.meowchat.user.GetUserResp> getGetUserMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.GetUserReq, com.xhpolaris.idlgen.meowchat.user.GetUserResp> getGetUserMethod;
    if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
          UserServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.user.GetUserReq, com.xhpolaris.idlgen.meowchat.user.GetUserResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.user.GetUserReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.user.GetUserResp.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.GetUserDetailReq,
      com.xhpolaris.idlgen.meowchat.user.GetUserDetailResp> getGetUserDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserDetail",
      requestType = com.xhpolaris.idlgen.meowchat.user.GetUserDetailReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.user.GetUserDetailResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.GetUserDetailReq,
      com.xhpolaris.idlgen.meowchat.user.GetUserDetailResp> getGetUserDetailMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.GetUserDetailReq, com.xhpolaris.idlgen.meowchat.user.GetUserDetailResp> getGetUserDetailMethod;
    if ((getGetUserDetailMethod = UserServiceGrpc.getGetUserDetailMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserDetailMethod = UserServiceGrpc.getGetUserDetailMethod) == null) {
          UserServiceGrpc.getGetUserDetailMethod = getGetUserDetailMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.user.GetUserDetailReq, com.xhpolaris.idlgen.meowchat.user.GetUserDetailResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.user.GetUserDetailReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.user.GetUserDetailResp.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUserDetail"))
              .build();
        }
      }
    }
    return getGetUserDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.UpdateUserReq,
      com.xhpolaris.idlgen.meowchat.user.UpdateUserResp> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = com.xhpolaris.idlgen.meowchat.user.UpdateUserReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.user.UpdateUserResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.UpdateUserReq,
      com.xhpolaris.idlgen.meowchat.user.UpdateUserResp> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.UpdateUserReq, com.xhpolaris.idlgen.meowchat.user.UpdateUserResp> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
          UserServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.user.UpdateUserReq, com.xhpolaris.idlgen.meowchat.user.UpdateUserResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.user.UpdateUserReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.user.UpdateUserResp.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.SearchUserReq,
      com.xhpolaris.idlgen.meowchat.user.SearchUserResp> getSearchUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchUser",
      requestType = com.xhpolaris.idlgen.meowchat.user.SearchUserReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.user.SearchUserResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.SearchUserReq,
      com.xhpolaris.idlgen.meowchat.user.SearchUserResp> getSearchUserMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.SearchUserReq, com.xhpolaris.idlgen.meowchat.user.SearchUserResp> getSearchUserMethod;
    if ((getSearchUserMethod = UserServiceGrpc.getSearchUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSearchUserMethod = UserServiceGrpc.getSearchUserMethod) == null) {
          UserServiceGrpc.getSearchUserMethod = getSearchUserMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.user.SearchUserReq, com.xhpolaris.idlgen.meowchat.user.SearchUserResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.user.SearchUserReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.user.SearchUserResp.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("SearchUser"))
              .build();
        }
      }
    }
    return getSearchUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.DoLikeReq,
      com.xhpolaris.idlgen.meowchat.user.DoLikeResp> getDoLikeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DoLike",
      requestType = com.xhpolaris.idlgen.meowchat.user.DoLikeReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.user.DoLikeResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.DoLikeReq,
      com.xhpolaris.idlgen.meowchat.user.DoLikeResp> getDoLikeMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.DoLikeReq, com.xhpolaris.idlgen.meowchat.user.DoLikeResp> getDoLikeMethod;
    if ((getDoLikeMethod = UserServiceGrpc.getDoLikeMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDoLikeMethod = UserServiceGrpc.getDoLikeMethod) == null) {
          UserServiceGrpc.getDoLikeMethod = getDoLikeMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.user.DoLikeReq, com.xhpolaris.idlgen.meowchat.user.DoLikeResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DoLike"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.user.DoLikeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.user.DoLikeResp.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DoLike"))
              .build();
        }
      }
    }
    return getDoLikeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.GetUserLikedReq,
      com.xhpolaris.idlgen.meowchat.user.GetUserLikedResp> getGetUserLikeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserLike",
      requestType = com.xhpolaris.idlgen.meowchat.user.GetUserLikedReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.user.GetUserLikedResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.GetUserLikedReq,
      com.xhpolaris.idlgen.meowchat.user.GetUserLikedResp> getGetUserLikeMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.GetUserLikedReq, com.xhpolaris.idlgen.meowchat.user.GetUserLikedResp> getGetUserLikeMethod;
    if ((getGetUserLikeMethod = UserServiceGrpc.getGetUserLikeMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserLikeMethod = UserServiceGrpc.getGetUserLikeMethod) == null) {
          UserServiceGrpc.getGetUserLikeMethod = getGetUserLikeMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.user.GetUserLikedReq, com.xhpolaris.idlgen.meowchat.user.GetUserLikedResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserLike"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.user.GetUserLikedReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.user.GetUserLikedResp.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUserLike"))
              .build();
        }
      }
    }
    return getGetUserLikeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.GetTargetLikesReq,
      com.xhpolaris.idlgen.meowchat.user.GetTargetLikesResp> getGetTargetLikesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTargetLikes",
      requestType = com.xhpolaris.idlgen.meowchat.user.GetTargetLikesReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.user.GetTargetLikesResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.GetTargetLikesReq,
      com.xhpolaris.idlgen.meowchat.user.GetTargetLikesResp> getGetTargetLikesMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.GetTargetLikesReq, com.xhpolaris.idlgen.meowchat.user.GetTargetLikesResp> getGetTargetLikesMethod;
    if ((getGetTargetLikesMethod = UserServiceGrpc.getGetTargetLikesMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetTargetLikesMethod = UserServiceGrpc.getGetTargetLikesMethod) == null) {
          UserServiceGrpc.getGetTargetLikesMethod = getGetTargetLikesMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.user.GetTargetLikesReq, com.xhpolaris.idlgen.meowchat.user.GetTargetLikesResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTargetLikes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.user.GetTargetLikesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.user.GetTargetLikesResp.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetTargetLikes"))
              .build();
        }
      }
    }
    return getGetTargetLikesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.GetUserLikesReq,
      com.xhpolaris.idlgen.meowchat.user.GetUserLikesResp> getGetUserLikesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserLikes",
      requestType = com.xhpolaris.idlgen.meowchat.user.GetUserLikesReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.user.GetUserLikesResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.GetUserLikesReq,
      com.xhpolaris.idlgen.meowchat.user.GetUserLikesResp> getGetUserLikesMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.GetUserLikesReq, com.xhpolaris.idlgen.meowchat.user.GetUserLikesResp> getGetUserLikesMethod;
    if ((getGetUserLikesMethod = UserServiceGrpc.getGetUserLikesMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserLikesMethod = UserServiceGrpc.getGetUserLikesMethod) == null) {
          UserServiceGrpc.getGetUserLikesMethod = getGetUserLikesMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.user.GetUserLikesReq, com.xhpolaris.idlgen.meowchat.user.GetUserLikesResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserLikes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.user.GetUserLikesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.user.GetUserLikesResp.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUserLikes"))
              .build();
        }
      }
    }
    return getGetUserLikesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.GetLikedUsersReq,
      com.xhpolaris.idlgen.meowchat.user.GetLikedUsersResp> getGetLikedUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLikedUsers",
      requestType = com.xhpolaris.idlgen.meowchat.user.GetLikedUsersReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.user.GetLikedUsersResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.GetLikedUsersReq,
      com.xhpolaris.idlgen.meowchat.user.GetLikedUsersResp> getGetLikedUsersMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.user.GetLikedUsersReq, com.xhpolaris.idlgen.meowchat.user.GetLikedUsersResp> getGetLikedUsersMethod;
    if ((getGetLikedUsersMethod = UserServiceGrpc.getGetLikedUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetLikedUsersMethod = UserServiceGrpc.getGetLikedUsersMethod) == null) {
          UserServiceGrpc.getGetLikedUsersMethod = getGetLikedUsersMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.user.GetLikedUsersReq, com.xhpolaris.idlgen.meowchat.user.GetLikedUsersResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLikedUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.user.GetLikedUsersReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.user.GetLikedUsersResp.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetLikedUsers"))
              .build();
        }
      }
    }
    return getGetLikedUsersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUser(com.xhpolaris.idlgen.meowchat.user.GetUserReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.GetUserResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    public void getUserDetail(com.xhpolaris.idlgen.meowchat.user.GetUserDetailReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.GetUserDetailResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserDetailMethod(), responseObserver);
    }

    /**
     */
    public void updateUser(com.xhpolaris.idlgen.meowchat.user.UpdateUserReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.UpdateUserResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void searchUser(com.xhpolaris.idlgen.meowchat.user.SearchUserReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.SearchUserResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * 点赞/取消赞
     * </pre>
     */
    public void doLike(com.xhpolaris.idlgen.meowchat.user.DoLikeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.DoLikeResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoLikeMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取用户是否点赞
     * </pre>
     */
    public void getUserLike(com.xhpolaris.idlgen.meowchat.user.GetUserLikedReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.GetUserLikedResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserLikeMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取目标点赞数
     * </pre>
     */
    public void getTargetLikes(com.xhpolaris.idlgen.meowchat.user.GetTargetLikesReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.GetTargetLikesResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTargetLikesMethod(), responseObserver);
    }

    /**
     * <pre>
     * 查看用户点赞列表
     * </pre>
     */
    public void getUserLikes(com.xhpolaris.idlgen.meowchat.user.GetUserLikesReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.GetUserLikesResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserLikesMethod(), responseObserver);
    }

    /**
     * <pre>
     * 查看喜欢某个东西的用户
     * </pre>
     */
    public void getLikedUsers(com.xhpolaris.idlgen.meowchat.user.GetLikedUsersReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.GetLikedUsersResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLikedUsersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.user.GetUserReq,
                com.xhpolaris.idlgen.meowchat.user.GetUserResp>(
                  this, METHODID_GET_USER)))
          .addMethod(
            getGetUserDetailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.user.GetUserDetailReq,
                com.xhpolaris.idlgen.meowchat.user.GetUserDetailResp>(
                  this, METHODID_GET_USER_DETAIL)))
          .addMethod(
            getUpdateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.user.UpdateUserReq,
                com.xhpolaris.idlgen.meowchat.user.UpdateUserResp>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getSearchUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.user.SearchUserReq,
                com.xhpolaris.idlgen.meowchat.user.SearchUserResp>(
                  this, METHODID_SEARCH_USER)))
          .addMethod(
            getDoLikeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.user.DoLikeReq,
                com.xhpolaris.idlgen.meowchat.user.DoLikeResp>(
                  this, METHODID_DO_LIKE)))
          .addMethod(
            getGetUserLikeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.user.GetUserLikedReq,
                com.xhpolaris.idlgen.meowchat.user.GetUserLikedResp>(
                  this, METHODID_GET_USER_LIKE)))
          .addMethod(
            getGetTargetLikesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.user.GetTargetLikesReq,
                com.xhpolaris.idlgen.meowchat.user.GetTargetLikesResp>(
                  this, METHODID_GET_TARGET_LIKES)))
          .addMethod(
            getGetUserLikesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.user.GetUserLikesReq,
                com.xhpolaris.idlgen.meowchat.user.GetUserLikesResp>(
                  this, METHODID_GET_USER_LIKES)))
          .addMethod(
            getGetLikedUsersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.user.GetLikedUsersReq,
                com.xhpolaris.idlgen.meowchat.user.GetLikedUsersResp>(
                  this, METHODID_GET_LIKED_USERS)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUser(com.xhpolaris.idlgen.meowchat.user.GetUserReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.GetUserResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserDetail(com.xhpolaris.idlgen.meowchat.user.GetUserDetailReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.GetUserDetailResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(com.xhpolaris.idlgen.meowchat.user.UpdateUserReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.UpdateUserResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchUser(com.xhpolaris.idlgen.meowchat.user.SearchUserReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.SearchUserResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 点赞/取消赞
     * </pre>
     */
    public void doLike(com.xhpolaris.idlgen.meowchat.user.DoLikeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.DoLikeResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoLikeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取用户是否点赞
     * </pre>
     */
    public void getUserLike(com.xhpolaris.idlgen.meowchat.user.GetUserLikedReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.GetUserLikedResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserLikeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取目标点赞数
     * </pre>
     */
    public void getTargetLikes(com.xhpolaris.idlgen.meowchat.user.GetTargetLikesReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.GetTargetLikesResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTargetLikesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 查看用户点赞列表
     * </pre>
     */
    public void getUserLikes(com.xhpolaris.idlgen.meowchat.user.GetUserLikesReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.GetUserLikesResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserLikesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 查看喜欢某个东西的用户
     * </pre>
     */
    public void getLikedUsers(com.xhpolaris.idlgen.meowchat.user.GetLikedUsersReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.GetLikedUsersResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLikedUsersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.user.GetUserResp getUser(com.xhpolaris.idlgen.meowchat.user.GetUserReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.user.GetUserDetailResp getUserDetail(com.xhpolaris.idlgen.meowchat.user.GetUserDetailReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserDetailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.user.UpdateUserResp updateUser(com.xhpolaris.idlgen.meowchat.user.UpdateUserReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.user.SearchUserResp searchUser(com.xhpolaris.idlgen.meowchat.user.SearchUserReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 点赞/取消赞
     * </pre>
     */
    public com.xhpolaris.idlgen.meowchat.user.DoLikeResp doLike(com.xhpolaris.idlgen.meowchat.user.DoLikeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoLikeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取用户是否点赞
     * </pre>
     */
    public com.xhpolaris.idlgen.meowchat.user.GetUserLikedResp getUserLike(com.xhpolaris.idlgen.meowchat.user.GetUserLikedReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserLikeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取目标点赞数
     * </pre>
     */
    public com.xhpolaris.idlgen.meowchat.user.GetTargetLikesResp getTargetLikes(com.xhpolaris.idlgen.meowchat.user.GetTargetLikesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTargetLikesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查看用户点赞列表
     * </pre>
     */
    public com.xhpolaris.idlgen.meowchat.user.GetUserLikesResp getUserLikes(com.xhpolaris.idlgen.meowchat.user.GetUserLikesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserLikesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查看喜欢某个东西的用户
     * </pre>
     */
    public com.xhpolaris.idlgen.meowchat.user.GetLikedUsersResp getLikedUsers(com.xhpolaris.idlgen.meowchat.user.GetLikedUsersReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLikedUsersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.user.GetUserResp> getUser(
        com.xhpolaris.idlgen.meowchat.user.GetUserReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.user.GetUserDetailResp> getUserDetail(
        com.xhpolaris.idlgen.meowchat.user.GetUserDetailReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserDetailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.user.UpdateUserResp> updateUser(
        com.xhpolaris.idlgen.meowchat.user.UpdateUserReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.user.SearchUserResp> searchUser(
        com.xhpolaris.idlgen.meowchat.user.SearchUserReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 点赞/取消赞
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.user.DoLikeResp> doLike(
        com.xhpolaris.idlgen.meowchat.user.DoLikeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoLikeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取用户是否点赞
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.user.GetUserLikedResp> getUserLike(
        com.xhpolaris.idlgen.meowchat.user.GetUserLikedReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserLikeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取目标点赞数
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.user.GetTargetLikesResp> getTargetLikes(
        com.xhpolaris.idlgen.meowchat.user.GetTargetLikesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTargetLikesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 查看用户点赞列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.user.GetUserLikesResp> getUserLikes(
        com.xhpolaris.idlgen.meowchat.user.GetUserLikesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserLikesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 查看喜欢某个东西的用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.user.GetLikedUsersResp> getLikedUsers(
        com.xhpolaris.idlgen.meowchat.user.GetLikedUsersReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLikedUsersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER = 0;
  private static final int METHODID_GET_USER_DETAIL = 1;
  private static final int METHODID_UPDATE_USER = 2;
  private static final int METHODID_SEARCH_USER = 3;
  private static final int METHODID_DO_LIKE = 4;
  private static final int METHODID_GET_USER_LIKE = 5;
  private static final int METHODID_GET_TARGET_LIKES = 6;
  private static final int METHODID_GET_USER_LIKES = 7;
  private static final int METHODID_GET_LIKED_USERS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER:
          serviceImpl.getUser((com.xhpolaris.idlgen.meowchat.user.GetUserReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.GetUserResp>) responseObserver);
          break;
        case METHODID_GET_USER_DETAIL:
          serviceImpl.getUserDetail((com.xhpolaris.idlgen.meowchat.user.GetUserDetailReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.GetUserDetailResp>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.xhpolaris.idlgen.meowchat.user.UpdateUserReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.UpdateUserResp>) responseObserver);
          break;
        case METHODID_SEARCH_USER:
          serviceImpl.searchUser((com.xhpolaris.idlgen.meowchat.user.SearchUserReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.SearchUserResp>) responseObserver);
          break;
        case METHODID_DO_LIKE:
          serviceImpl.doLike((com.xhpolaris.idlgen.meowchat.user.DoLikeReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.DoLikeResp>) responseObserver);
          break;
        case METHODID_GET_USER_LIKE:
          serviceImpl.getUserLike((com.xhpolaris.idlgen.meowchat.user.GetUserLikedReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.GetUserLikedResp>) responseObserver);
          break;
        case METHODID_GET_TARGET_LIKES:
          serviceImpl.getTargetLikes((com.xhpolaris.idlgen.meowchat.user.GetTargetLikesReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.GetTargetLikesResp>) responseObserver);
          break;
        case METHODID_GET_USER_LIKES:
          serviceImpl.getUserLikes((com.xhpolaris.idlgen.meowchat.user.GetUserLikesReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.GetUserLikesResp>) responseObserver);
          break;
        case METHODID_GET_LIKED_USERS:
          serviceImpl.getLikedUsers((com.xhpolaris.idlgen.meowchat.user.GetLikedUsersReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.user.GetLikedUsersResp>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xhpolaris.idlgen.meowchat.user.UserProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getGetUserMethod())
              .addMethod(getGetUserDetailMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getSearchUserMethod())
              .addMethod(getDoLikeMethod())
              .addMethod(getGetUserLikeMethod())
              .addMethod(getGetTargetLikesMethod())
              .addMethod(getGetUserLikesMethod())
              .addMethod(getGetLikedUsersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
