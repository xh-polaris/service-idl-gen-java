package com.xhpolaris.idlgen.meowchat.coreapi;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: meowchat/core_api/core_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class systemGrpc {

  private systemGrpc() {}

  public static final String SERVICE_NAME = "meowchat.core_api.system";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsResp> getGetAdminsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAdmins",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsResp> getGetAdminsMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsReq, com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsResp> getGetAdminsMethod;
    if ((getGetAdminsMethod = systemGrpc.getGetAdminsMethod) == null) {
      synchronized (systemGrpc.class) {
        if ((getGetAdminsMethod = systemGrpc.getGetAdminsMethod) == null) {
          systemGrpc.getGetAdminsMethod = getGetAdminsMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsReq, com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAdmins"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsResp.getDefaultInstance()))
              .setSchemaDescriptor(new systemMethodDescriptorSupplier("GetAdmins"))
              .build();
        }
      }
    }
    return getGetAdminsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewAdminReq,
      com.xhpolaris.idlgen.meowchat.coreapi.NewAdminResp> getNewAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewAdmin",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.NewAdminReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.NewAdminResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewAdminReq,
      com.xhpolaris.idlgen.meowchat.coreapi.NewAdminResp> getNewAdminMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewAdminReq, com.xhpolaris.idlgen.meowchat.coreapi.NewAdminResp> getNewAdminMethod;
    if ((getNewAdminMethod = systemGrpc.getNewAdminMethod) == null) {
      synchronized (systemGrpc.class) {
        if ((getNewAdminMethod = systemGrpc.getNewAdminMethod) == null) {
          systemGrpc.getNewAdminMethod = getNewAdminMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.NewAdminReq, com.xhpolaris.idlgen.meowchat.coreapi.NewAdminResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.NewAdminReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.NewAdminResp.getDefaultInstance()))
              .setSchemaDescriptor(new systemMethodDescriptorSupplier("NewAdmin"))
              .build();
        }
      }
    }
    return getNewAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminResp> getDeleteAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAdmin",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminResp> getDeleteAdminMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminReq, com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminResp> getDeleteAdminMethod;
    if ((getDeleteAdminMethod = systemGrpc.getDeleteAdminMethod) == null) {
      synchronized (systemGrpc.class) {
        if ((getDeleteAdminMethod = systemGrpc.getDeleteAdminMethod) == null) {
          systemGrpc.getDeleteAdminMethod = getDeleteAdminMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminReq, com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminResp.getDefaultInstance()))
              .setSchemaDescriptor(new systemMethodDescriptorSupplier("DeleteAdmin"))
              .build();
        }
      }
    }
    return getDeleteAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetNewsReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetNewsResp> getGetNewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNews",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.GetNewsReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.GetNewsResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetNewsReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetNewsResp> getGetNewsMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetNewsReq, com.xhpolaris.idlgen.meowchat.coreapi.GetNewsResp> getGetNewsMethod;
    if ((getGetNewsMethod = systemGrpc.getGetNewsMethod) == null) {
      synchronized (systemGrpc.class) {
        if ((getGetNewsMethod = systemGrpc.getGetNewsMethod) == null) {
          systemGrpc.getGetNewsMethod = getGetNewsMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.GetNewsReq, com.xhpolaris.idlgen.meowchat.coreapi.GetNewsResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetNewsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetNewsResp.getDefaultInstance()))
              .setSchemaDescriptor(new systemMethodDescriptorSupplier("GetNews"))
              .build();
        }
      }
    }
    return getGetNewsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewNewsReq,
      com.xhpolaris.idlgen.meowchat.coreapi.NewNewsResp> getNewNewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewNews",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.NewNewsReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.NewNewsResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewNewsReq,
      com.xhpolaris.idlgen.meowchat.coreapi.NewNewsResp> getNewNewsMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewNewsReq, com.xhpolaris.idlgen.meowchat.coreapi.NewNewsResp> getNewNewsMethod;
    if ((getNewNewsMethod = systemGrpc.getNewNewsMethod) == null) {
      synchronized (systemGrpc.class) {
        if ((getNewNewsMethod = systemGrpc.getNewNewsMethod) == null) {
          systemGrpc.getNewNewsMethod = getNewNewsMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.NewNewsReq, com.xhpolaris.idlgen.meowchat.coreapi.NewNewsResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewNews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.NewNewsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.NewNewsResp.getDefaultInstance()))
              .setSchemaDescriptor(new systemMethodDescriptorSupplier("NewNews"))
              .build();
        }
      }
    }
    return getNewNewsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsResp> getDeleteNewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNews",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsResp> getDeleteNewsMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsReq, com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsResp> getDeleteNewsMethod;
    if ((getDeleteNewsMethod = systemGrpc.getDeleteNewsMethod) == null) {
      synchronized (systemGrpc.class) {
        if ((getDeleteNewsMethod = systemGrpc.getDeleteNewsMethod) == null) {
          systemGrpc.getDeleteNewsMethod = getDeleteNewsMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsReq, com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsResp.getDefaultInstance()))
              .setSchemaDescriptor(new systemMethodDescriptorSupplier("DeleteNews"))
              .build();
        }
      }
    }
    return getDeleteNewsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesResp> getGetNoticesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNotices",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesResp> getGetNoticesMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesReq, com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesResp> getGetNoticesMethod;
    if ((getGetNoticesMethod = systemGrpc.getGetNoticesMethod) == null) {
      synchronized (systemGrpc.class) {
        if ((getGetNoticesMethod = systemGrpc.getGetNoticesMethod) == null) {
          systemGrpc.getGetNoticesMethod = getGetNoticesMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesReq, com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNotices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesResp.getDefaultInstance()))
              .setSchemaDescriptor(new systemMethodDescriptorSupplier("GetNotices"))
              .build();
        }
      }
    }
    return getGetNoticesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeReq,
      com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeResp> getNewNoticeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewNotice",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeReq,
      com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeResp> getNewNoticeMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeReq, com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeResp> getNewNoticeMethod;
    if ((getNewNoticeMethod = systemGrpc.getNewNoticeMethod) == null) {
      synchronized (systemGrpc.class) {
        if ((getNewNoticeMethod = systemGrpc.getNewNoticeMethod) == null) {
          systemGrpc.getNewNoticeMethod = getNewNoticeMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeReq, com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewNotice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeResp.getDefaultInstance()))
              .setSchemaDescriptor(new systemMethodDescriptorSupplier("NewNotice"))
              .build();
        }
      }
    }
    return getNewNoticeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeResp> getDeleteNoticeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNotice",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeResp> getDeleteNoticeMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeReq, com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeResp> getDeleteNoticeMethod;
    if ((getDeleteNoticeMethod = systemGrpc.getDeleteNoticeMethod) == null) {
      synchronized (systemGrpc.class) {
        if ((getDeleteNoticeMethod = systemGrpc.getDeleteNoticeMethod) == null) {
          systemGrpc.getDeleteNoticeMethod = getDeleteNoticeMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeReq, com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNotice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeResp.getDefaultInstance()))
              .setSchemaDescriptor(new systemMethodDescriptorSupplier("DeleteNotice"))
              .build();
        }
      }
    }
    return getDeleteNoticeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityReq,
      com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityResp> getListCommunityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCommunity",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityReq,
      com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityResp> getListCommunityMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityReq, com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityResp> getListCommunityMethod;
    if ((getListCommunityMethod = systemGrpc.getListCommunityMethod) == null) {
      synchronized (systemGrpc.class) {
        if ((getListCommunityMethod = systemGrpc.getListCommunityMethod) == null) {
          systemGrpc.getListCommunityMethod = getListCommunityMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityReq, com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCommunity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityResp.getDefaultInstance()))
              .setSchemaDescriptor(new systemMethodDescriptorSupplier("ListCommunity"))
              .build();
        }
      }
    }
    return getListCommunityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityReq,
      com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityResp> getNewCommunityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewCommunity",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityReq,
      com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityResp> getNewCommunityMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityReq, com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityResp> getNewCommunityMethod;
    if ((getNewCommunityMethod = systemGrpc.getNewCommunityMethod) == null) {
      synchronized (systemGrpc.class) {
        if ((getNewCommunityMethod = systemGrpc.getNewCommunityMethod) == null) {
          systemGrpc.getNewCommunityMethod = getNewCommunityMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityReq, com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewCommunity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityResp.getDefaultInstance()))
              .setSchemaDescriptor(new systemMethodDescriptorSupplier("NewCommunity"))
              .build();
        }
      }
    }
    return getNewCommunityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityResp> getDeleteCommunityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCommunity",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityReq,
      com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityResp> getDeleteCommunityMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityReq, com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityResp> getDeleteCommunityMethod;
    if ((getDeleteCommunityMethod = systemGrpc.getDeleteCommunityMethod) == null) {
      synchronized (systemGrpc.class) {
        if ((getDeleteCommunityMethod = systemGrpc.getDeleteCommunityMethod) == null) {
          systemGrpc.getDeleteCommunityMethod = getDeleteCommunityMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityReq, com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCommunity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityResp.getDefaultInstance()))
              .setSchemaDescriptor(new systemMethodDescriptorSupplier("DeleteCommunity"))
              .build();
        }
      }
    }
    return getDeleteCommunityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesResp> getGetUserRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserRoles",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesResp> getGetUserRolesMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesReq, com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesResp> getGetUserRolesMethod;
    if ((getGetUserRolesMethod = systemGrpc.getGetUserRolesMethod) == null) {
      synchronized (systemGrpc.class) {
        if ((getGetUserRolesMethod = systemGrpc.getGetUserRolesMethod) == null) {
          systemGrpc.getGetUserRolesMethod = getGetUserRolesMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesReq, com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesResp.getDefaultInstance()))
              .setSchemaDescriptor(new systemMethodDescriptorSupplier("GetUserRoles"))
              .build();
        }
      }
    }
    return getGetUserRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminReq,
      com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminResp> getUpdateCommunityAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCommunityAdmin",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminReq,
      com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminResp> getUpdateCommunityAdminMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminReq, com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminResp> getUpdateCommunityAdminMethod;
    if ((getUpdateCommunityAdminMethod = systemGrpc.getUpdateCommunityAdminMethod) == null) {
      synchronized (systemGrpc.class) {
        if ((getUpdateCommunityAdminMethod = systemGrpc.getUpdateCommunityAdminMethod) == null) {
          systemGrpc.getUpdateCommunityAdminMethod = getUpdateCommunityAdminMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminReq, com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCommunityAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminResp.getDefaultInstance()))
              .setSchemaDescriptor(new systemMethodDescriptorSupplier("UpdateCommunityAdmin"))
              .build();
        }
      }
    }
    return getUpdateCommunityAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminReq,
      com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminResp> getUpdateSuperAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSuperAdmin",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminReq,
      com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminResp> getUpdateSuperAdminMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminReq, com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminResp> getUpdateSuperAdminMethod;
    if ((getUpdateSuperAdminMethod = systemGrpc.getUpdateSuperAdminMethod) == null) {
      synchronized (systemGrpc.class) {
        if ((getUpdateSuperAdminMethod = systemGrpc.getUpdateSuperAdminMethod) == null) {
          systemGrpc.getUpdateSuperAdminMethod = getUpdateSuperAdminMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminReq, com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSuperAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminResp.getDefaultInstance()))
              .setSchemaDescriptor(new systemMethodDescriptorSupplier("UpdateSuperAdmin"))
              .build();
        }
      }
    }
    return getUpdateSuperAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleResp> getGetUserByRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserByRole",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleReq,
      com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleResp> getGetUserByRoleMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleReq, com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleResp> getGetUserByRoleMethod;
    if ((getGetUserByRoleMethod = systemGrpc.getGetUserByRoleMethod) == null) {
      synchronized (systemGrpc.class) {
        if ((getGetUserByRoleMethod = systemGrpc.getGetUserByRoleMethod) == null) {
          systemGrpc.getGetUserByRoleMethod = getGetUserByRoleMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleReq, com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserByRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleResp.getDefaultInstance()))
              .setSchemaDescriptor(new systemMethodDescriptorSupplier("GetUserByRole"))
              .build();
        }
      }
    }
    return getGetUserByRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleReq,
      com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleResp> getUpdateRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRole",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleReq,
      com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleResp> getUpdateRoleMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleReq, com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleResp> getUpdateRoleMethod;
    if ((getUpdateRoleMethod = systemGrpc.getUpdateRoleMethod) == null) {
      synchronized (systemGrpc.class) {
        if ((getUpdateRoleMethod = systemGrpc.getUpdateRoleMethod) == null) {
          systemGrpc.getUpdateRoleMethod = getUpdateRoleMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleReq, com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleResp.getDefaultInstance()))
              .setSchemaDescriptor(new systemMethodDescriptorSupplier("UpdateRole"))
              .build();
        }
      }
    }
    return getUpdateRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.ListApplyReq,
      com.xhpolaris.idlgen.meowchat.coreapi.ListApplyResp> getListApplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListApply",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.ListApplyReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.ListApplyResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.ListApplyReq,
      com.xhpolaris.idlgen.meowchat.coreapi.ListApplyResp> getListApplyMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.ListApplyReq, com.xhpolaris.idlgen.meowchat.coreapi.ListApplyResp> getListApplyMethod;
    if ((getListApplyMethod = systemGrpc.getListApplyMethod) == null) {
      synchronized (systemGrpc.class) {
        if ((getListApplyMethod = systemGrpc.getListApplyMethod) == null) {
          systemGrpc.getListApplyMethod = getListApplyMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.ListApplyReq, com.xhpolaris.idlgen.meowchat.coreapi.ListApplyResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListApply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.ListApplyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.ListApplyResp.getDefaultInstance()))
              .setSchemaDescriptor(new systemMethodDescriptorSupplier("ListApply"))
              .build();
        }
      }
    }
    return getListApplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyReq,
      com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyResp> getHandleApplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleApply",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyReq,
      com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyResp> getHandleApplyMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyReq, com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyResp> getHandleApplyMethod;
    if ((getHandleApplyMethod = systemGrpc.getHandleApplyMethod) == null) {
      synchronized (systemGrpc.class) {
        if ((getHandleApplyMethod = systemGrpc.getHandleApplyMethod) == null) {
          systemGrpc.getHandleApplyMethod = getHandleApplyMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyReq, com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleApply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyResp.getDefaultInstance()))
              .setSchemaDescriptor(new systemMethodDescriptorSupplier("HandleApply"))
              .build();
        }
      }
    }
    return getHandleApplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyReq,
      com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyResp> getCreateApplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateApply",
      requestType = com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyReq,
      com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyResp> getCreateApplyMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyReq, com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyResp> getCreateApplyMethod;
    if ((getCreateApplyMethod = systemGrpc.getCreateApplyMethod) == null) {
      synchronized (systemGrpc.class) {
        if ((getCreateApplyMethod = systemGrpc.getCreateApplyMethod) == null) {
          systemGrpc.getCreateApplyMethod = getCreateApplyMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyReq, com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateApply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyResp.getDefaultInstance()))
              .setSchemaDescriptor(new systemMethodDescriptorSupplier("CreateApply"))
              .build();
        }
      }
    }
    return getCreateApplyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static systemStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<systemStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<systemStub>() {
        @java.lang.Override
        public systemStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new systemStub(channel, callOptions);
        }
      };
    return systemStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static systemBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<systemBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<systemBlockingStub>() {
        @java.lang.Override
        public systemBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new systemBlockingStub(channel, callOptions);
        }
      };
    return systemBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static systemFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<systemFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<systemFutureStub>() {
        @java.lang.Override
        public systemFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new systemFutureStub(channel, callOptions);
        }
      };
    return systemFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class systemImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * admin
     * </pre>
     */
    public void getAdmins(com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAdminsMethod(), responseObserver);
    }

    /**
     */
    public void newAdmin(com.xhpolaris.idlgen.meowchat.coreapi.NewAdminReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewAdminResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewAdminMethod(), responseObserver);
    }

    /**
     */
    public void deleteAdmin(com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAdminMethod(), responseObserver);
    }

    /**
     * <pre>
     * news
     * </pre>
     */
    public void getNews(com.xhpolaris.idlgen.meowchat.coreapi.GetNewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetNewsResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNewsMethod(), responseObserver);
    }

    /**
     */
    public void newNews(com.xhpolaris.idlgen.meowchat.coreapi.NewNewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewNewsResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewNewsMethod(), responseObserver);
    }

    /**
     */
    public void deleteNews(com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNewsMethod(), responseObserver);
    }

    /**
     * <pre>
     * system
     * </pre>
     */
    public void getNotices(com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNoticesMethod(), responseObserver);
    }

    /**
     */
    public void newNotice(com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewNoticeMethod(), responseObserver);
    }

    /**
     */
    public void deleteNotice(com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNoticeMethod(), responseObserver);
    }

    /**
     * <pre>
     * community
     * </pre>
     */
    public void listCommunity(com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCommunityMethod(), responseObserver);
    }

    /**
     */
    public void newCommunity(com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewCommunityMethod(), responseObserver);
    }

    /**
     */
    public void deleteCommunity(com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCommunityMethod(), responseObserver);
    }

    /**
     * <pre>
     * role
     * </pre>
     */
    public void getUserRoles(com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserRolesMethod(), responseObserver);
    }

    /**
     */
    public void updateCommunityAdmin(com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCommunityAdminMethod(), responseObserver);
    }

    /**
     */
    public void updateSuperAdmin(com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSuperAdminMethod(), responseObserver);
    }

    /**
     */
    public void getUserByRole(com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserByRoleMethod(), responseObserver);
    }

    /**
     */
    public void updateRole(com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRoleMethod(), responseObserver);
    }

    /**
     */
    public void listApply(com.xhpolaris.idlgen.meowchat.coreapi.ListApplyReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.ListApplyResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListApplyMethod(), responseObserver);
    }

    /**
     */
    public void handleApply(com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandleApplyMethod(), responseObserver);
    }

    /**
     */
    public void createApply(com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateApplyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdminsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsReq,
                com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsResp>(
                  this, METHODID_GET_ADMINS)))
          .addMethod(
            getNewAdminMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.NewAdminReq,
                com.xhpolaris.idlgen.meowchat.coreapi.NewAdminResp>(
                  this, METHODID_NEW_ADMIN)))
          .addMethod(
            getDeleteAdminMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminReq,
                com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminResp>(
                  this, METHODID_DELETE_ADMIN)))
          .addMethod(
            getGetNewsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.GetNewsReq,
                com.xhpolaris.idlgen.meowchat.coreapi.GetNewsResp>(
                  this, METHODID_GET_NEWS)))
          .addMethod(
            getNewNewsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.NewNewsReq,
                com.xhpolaris.idlgen.meowchat.coreapi.NewNewsResp>(
                  this, METHODID_NEW_NEWS)))
          .addMethod(
            getDeleteNewsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsReq,
                com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsResp>(
                  this, METHODID_DELETE_NEWS)))
          .addMethod(
            getGetNoticesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesReq,
                com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesResp>(
                  this, METHODID_GET_NOTICES)))
          .addMethod(
            getNewNoticeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeReq,
                com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeResp>(
                  this, METHODID_NEW_NOTICE)))
          .addMethod(
            getDeleteNoticeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeReq,
                com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeResp>(
                  this, METHODID_DELETE_NOTICE)))
          .addMethod(
            getListCommunityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityReq,
                com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityResp>(
                  this, METHODID_LIST_COMMUNITY)))
          .addMethod(
            getNewCommunityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityReq,
                com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityResp>(
                  this, METHODID_NEW_COMMUNITY)))
          .addMethod(
            getDeleteCommunityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityReq,
                com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityResp>(
                  this, METHODID_DELETE_COMMUNITY)))
          .addMethod(
            getGetUserRolesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesReq,
                com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesResp>(
                  this, METHODID_GET_USER_ROLES)))
          .addMethod(
            getUpdateCommunityAdminMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminReq,
                com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminResp>(
                  this, METHODID_UPDATE_COMMUNITY_ADMIN)))
          .addMethod(
            getUpdateSuperAdminMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminReq,
                com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminResp>(
                  this, METHODID_UPDATE_SUPER_ADMIN)))
          .addMethod(
            getGetUserByRoleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleReq,
                com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleResp>(
                  this, METHODID_GET_USER_BY_ROLE)))
          .addMethod(
            getUpdateRoleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleReq,
                com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleResp>(
                  this, METHODID_UPDATE_ROLE)))
          .addMethod(
            getListApplyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.ListApplyReq,
                com.xhpolaris.idlgen.meowchat.coreapi.ListApplyResp>(
                  this, METHODID_LIST_APPLY)))
          .addMethod(
            getHandleApplyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyReq,
                com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyResp>(
                  this, METHODID_HANDLE_APPLY)))
          .addMethod(
            getCreateApplyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyReq,
                com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyResp>(
                  this, METHODID_CREATE_APPLY)))
          .build();
    }
  }

  /**
   */
  public static final class systemStub extends io.grpc.stub.AbstractAsyncStub<systemStub> {
    private systemStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected systemStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new systemStub(channel, callOptions);
    }

    /**
     * <pre>
     * admin
     * </pre>
     */
    public void getAdmins(com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAdminsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void newAdmin(com.xhpolaris.idlgen.meowchat.coreapi.NewAdminReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewAdminResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAdmin(com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * news
     * </pre>
     */
    public void getNews(com.xhpolaris.idlgen.meowchat.coreapi.GetNewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetNewsResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNewsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void newNews(com.xhpolaris.idlgen.meowchat.coreapi.NewNewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewNewsResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewNewsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNews(com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNewsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * system
     * </pre>
     */
    public void getNotices(com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNoticesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void newNotice(com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewNoticeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNotice(com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNoticeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * community
     * </pre>
     */
    public void listCommunity(com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCommunityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void newCommunity(com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewCommunityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCommunity(com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCommunityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * role
     * </pre>
     */
    public void getUserRoles(com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCommunityAdmin(com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCommunityAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSuperAdmin(com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSuperAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserByRole(com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserByRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRole(com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listApply(com.xhpolaris.idlgen.meowchat.coreapi.ListApplyReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.ListApplyResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListApplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handleApply(com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandleApplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createApply(com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateApplyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class systemBlockingStub extends io.grpc.stub.AbstractBlockingStub<systemBlockingStub> {
    private systemBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected systemBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new systemBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * admin
     * </pre>
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsResp getAdmins(com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAdminsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.NewAdminResp newAdmin(com.xhpolaris.idlgen.meowchat.coreapi.NewAdminReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewAdminMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminResp deleteAdmin(com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAdminMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * news
     * </pre>
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.GetNewsResp getNews(com.xhpolaris.idlgen.meowchat.coreapi.GetNewsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNewsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.NewNewsResp newNews(com.xhpolaris.idlgen.meowchat.coreapi.NewNewsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewNewsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsResp deleteNews(com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNewsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * system
     * </pre>
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesResp getNotices(com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNoticesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeResp newNotice(com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewNoticeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeResp deleteNotice(com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNoticeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * community
     * </pre>
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityResp listCommunity(com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCommunityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityResp newCommunity(com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewCommunityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityResp deleteCommunity(com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCommunityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * role
     * </pre>
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesResp getUserRoles(com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminResp updateCommunityAdmin(com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCommunityAdminMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminResp updateSuperAdmin(com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSuperAdminMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleResp getUserByRole(com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserByRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleResp updateRole(com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.ListApplyResp listApply(com.xhpolaris.idlgen.meowchat.coreapi.ListApplyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListApplyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyResp handleApply(com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandleApplyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyResp createApply(com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateApplyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class systemFutureStub extends io.grpc.stub.AbstractFutureStub<systemFutureStub> {
    private systemFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected systemFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new systemFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * admin
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsResp> getAdmins(
        com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAdminsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.NewAdminResp> newAdmin(
        com.xhpolaris.idlgen.meowchat.coreapi.NewAdminReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewAdminMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminResp> deleteAdmin(
        com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAdminMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * news
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.GetNewsResp> getNews(
        com.xhpolaris.idlgen.meowchat.coreapi.GetNewsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNewsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.NewNewsResp> newNews(
        com.xhpolaris.idlgen.meowchat.coreapi.NewNewsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewNewsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsResp> deleteNews(
        com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNewsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesResp> getNotices(
        com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNoticesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeResp> newNotice(
        com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewNoticeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeResp> deleteNotice(
        com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNoticeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * community
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityResp> listCommunity(
        com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCommunityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityResp> newCommunity(
        com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewCommunityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityResp> deleteCommunity(
        com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCommunityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * role
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesResp> getUserRoles(
        com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminResp> updateCommunityAdmin(
        com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCommunityAdminMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminResp> updateSuperAdmin(
        com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSuperAdminMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleResp> getUserByRole(
        com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserByRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleResp> updateRole(
        com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.ListApplyResp> listApply(
        com.xhpolaris.idlgen.meowchat.coreapi.ListApplyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListApplyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyResp> handleApply(
        com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandleApplyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyResp> createApply(
        com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateApplyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ADMINS = 0;
  private static final int METHODID_NEW_ADMIN = 1;
  private static final int METHODID_DELETE_ADMIN = 2;
  private static final int METHODID_GET_NEWS = 3;
  private static final int METHODID_NEW_NEWS = 4;
  private static final int METHODID_DELETE_NEWS = 5;
  private static final int METHODID_GET_NOTICES = 6;
  private static final int METHODID_NEW_NOTICE = 7;
  private static final int METHODID_DELETE_NOTICE = 8;
  private static final int METHODID_LIST_COMMUNITY = 9;
  private static final int METHODID_NEW_COMMUNITY = 10;
  private static final int METHODID_DELETE_COMMUNITY = 11;
  private static final int METHODID_GET_USER_ROLES = 12;
  private static final int METHODID_UPDATE_COMMUNITY_ADMIN = 13;
  private static final int METHODID_UPDATE_SUPER_ADMIN = 14;
  private static final int METHODID_GET_USER_BY_ROLE = 15;
  private static final int METHODID_UPDATE_ROLE = 16;
  private static final int METHODID_LIST_APPLY = 17;
  private static final int METHODID_HANDLE_APPLY = 18;
  private static final int METHODID_CREATE_APPLY = 19;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final systemImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(systemImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ADMINS:
          serviceImpl.getAdmins((com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetAdminsResp>) responseObserver);
          break;
        case METHODID_NEW_ADMIN:
          serviceImpl.newAdmin((com.xhpolaris.idlgen.meowchat.coreapi.NewAdminReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewAdminResp>) responseObserver);
          break;
        case METHODID_DELETE_ADMIN:
          serviceImpl.deleteAdmin((com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteAdminResp>) responseObserver);
          break;
        case METHODID_GET_NEWS:
          serviceImpl.getNews((com.xhpolaris.idlgen.meowchat.coreapi.GetNewsReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetNewsResp>) responseObserver);
          break;
        case METHODID_NEW_NEWS:
          serviceImpl.newNews((com.xhpolaris.idlgen.meowchat.coreapi.NewNewsReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewNewsResp>) responseObserver);
          break;
        case METHODID_DELETE_NEWS:
          serviceImpl.deleteNews((com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteNewsResp>) responseObserver);
          break;
        case METHODID_GET_NOTICES:
          serviceImpl.getNotices((com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetNoticesResp>) responseObserver);
          break;
        case METHODID_NEW_NOTICE:
          serviceImpl.newNotice((com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewNoticeResp>) responseObserver);
          break;
        case METHODID_DELETE_NOTICE:
          serviceImpl.deleteNotice((com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteNoticeResp>) responseObserver);
          break;
        case METHODID_LIST_COMMUNITY:
          serviceImpl.listCommunity((com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.ListCommunityResp>) responseObserver);
          break;
        case METHODID_NEW_COMMUNITY:
          serviceImpl.newCommunity((com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.NewCommunityResp>) responseObserver);
          break;
        case METHODID_DELETE_COMMUNITY:
          serviceImpl.deleteCommunity((com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.DeleteCommunityResp>) responseObserver);
          break;
        case METHODID_GET_USER_ROLES:
          serviceImpl.getUserRoles((com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetUserRolesResp>) responseObserver);
          break;
        case METHODID_UPDATE_COMMUNITY_ADMIN:
          serviceImpl.updateCommunityAdmin((com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.UpdateCommunityAdminResp>) responseObserver);
          break;
        case METHODID_UPDATE_SUPER_ADMIN:
          serviceImpl.updateSuperAdmin((com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.UpdateSuperAdminResp>) responseObserver);
          break;
        case METHODID_GET_USER_BY_ROLE:
          serviceImpl.getUserByRole((com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.GetUserByRoleResp>) responseObserver);
          break;
        case METHODID_UPDATE_ROLE:
          serviceImpl.updateRole((com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.UpdateRoleResp>) responseObserver);
          break;
        case METHODID_LIST_APPLY:
          serviceImpl.listApply((com.xhpolaris.idlgen.meowchat.coreapi.ListApplyReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.ListApplyResp>) responseObserver);
          break;
        case METHODID_HANDLE_APPLY:
          serviceImpl.handleApply((com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.HandleApplyResp>) responseObserver);
          break;
        case METHODID_CREATE_APPLY:
          serviceImpl.createApply((com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.coreapi.CreateApplyResp>) responseObserver);
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

  private static abstract class systemBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    systemBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xhpolaris.idlgen.meowchat.coreapi.CoreApiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("system");
    }
  }

  private static final class systemFileDescriptorSupplier
      extends systemBaseDescriptorSupplier {
    systemFileDescriptorSupplier() {}
  }

  private static final class systemMethodDescriptorSupplier
      extends systemBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    systemMethodDescriptorSupplier(String methodName) {
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
      synchronized (systemGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new systemFileDescriptorSupplier())
              .addMethod(getGetAdminsMethod())
              .addMethod(getNewAdminMethod())
              .addMethod(getDeleteAdminMethod())
              .addMethod(getGetNewsMethod())
              .addMethod(getNewNewsMethod())
              .addMethod(getDeleteNewsMethod())
              .addMethod(getGetNoticesMethod())
              .addMethod(getNewNoticeMethod())
              .addMethod(getDeleteNoticeMethod())
              .addMethod(getListCommunityMethod())
              .addMethod(getNewCommunityMethod())
              .addMethod(getDeleteCommunityMethod())
              .addMethod(getGetUserRolesMethod())
              .addMethod(getUpdateCommunityAdminMethod())
              .addMethod(getUpdateSuperAdminMethod())
              .addMethod(getGetUserByRoleMethod())
              .addMethod(getUpdateRoleMethod())
              .addMethod(getListApplyMethod())
              .addMethod(getHandleApplyMethod())
              .addMethod(getCreateApplyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
