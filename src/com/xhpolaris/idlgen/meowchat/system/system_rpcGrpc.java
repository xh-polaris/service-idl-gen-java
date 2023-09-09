package com.xhpolaris.idlgen.meowchat.system;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: meowchat/system/system.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class system_rpcGrpc {

  private system_rpcGrpc() {}

  public static final String SERVICE_NAME = "meowchat.system.system_rpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeReq,
      com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeResp> getRetrieveNoticeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrieveNotice",
      requestType = com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeReq,
      com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeResp> getRetrieveNoticeMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeReq, com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeResp> getRetrieveNoticeMethod;
    if ((getRetrieveNoticeMethod = system_rpcGrpc.getRetrieveNoticeMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getRetrieveNoticeMethod = system_rpcGrpc.getRetrieveNoticeMethod) == null) {
          system_rpcGrpc.getRetrieveNoticeMethod = getRetrieveNoticeMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeReq, com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetrieveNotice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("RetrieveNotice"))
              .build();
        }
      }
    }
    return getRetrieveNoticeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.ListNoticeReq,
      com.xhpolaris.idlgen.meowchat.system.ListNoticeResp> getListNoticeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNotice",
      requestType = com.xhpolaris.idlgen.meowchat.system.ListNoticeReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.ListNoticeResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.ListNoticeReq,
      com.xhpolaris.idlgen.meowchat.system.ListNoticeResp> getListNoticeMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.ListNoticeReq, com.xhpolaris.idlgen.meowchat.system.ListNoticeResp> getListNoticeMethod;
    if ((getListNoticeMethod = system_rpcGrpc.getListNoticeMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getListNoticeMethod = system_rpcGrpc.getListNoticeMethod) == null) {
          system_rpcGrpc.getListNoticeMethod = getListNoticeMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.ListNoticeReq, com.xhpolaris.idlgen.meowchat.system.ListNoticeResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNotice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.ListNoticeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.ListNoticeResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("ListNotice"))
              .build();
        }
      }
    }
    return getListNoticeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.CreateNoticeReq,
      com.xhpolaris.idlgen.meowchat.system.CreateNoticeResp> getCreateNoticeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNotice",
      requestType = com.xhpolaris.idlgen.meowchat.system.CreateNoticeReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.CreateNoticeResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.CreateNoticeReq,
      com.xhpolaris.idlgen.meowchat.system.CreateNoticeResp> getCreateNoticeMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.CreateNoticeReq, com.xhpolaris.idlgen.meowchat.system.CreateNoticeResp> getCreateNoticeMethod;
    if ((getCreateNoticeMethod = system_rpcGrpc.getCreateNoticeMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getCreateNoticeMethod = system_rpcGrpc.getCreateNoticeMethod) == null) {
          system_rpcGrpc.getCreateNoticeMethod = getCreateNoticeMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.CreateNoticeReq, com.xhpolaris.idlgen.meowchat.system.CreateNoticeResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNotice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.CreateNoticeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.CreateNoticeResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("CreateNotice"))
              .build();
        }
      }
    }
    return getCreateNoticeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.UpdateNoticeReq,
      com.xhpolaris.idlgen.meowchat.system.UpdateNoticeResp> getUpdateNoticeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNotice",
      requestType = com.xhpolaris.idlgen.meowchat.system.UpdateNoticeReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.UpdateNoticeResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.UpdateNoticeReq,
      com.xhpolaris.idlgen.meowchat.system.UpdateNoticeResp> getUpdateNoticeMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.UpdateNoticeReq, com.xhpolaris.idlgen.meowchat.system.UpdateNoticeResp> getUpdateNoticeMethod;
    if ((getUpdateNoticeMethod = system_rpcGrpc.getUpdateNoticeMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getUpdateNoticeMethod = system_rpcGrpc.getUpdateNoticeMethod) == null) {
          system_rpcGrpc.getUpdateNoticeMethod = getUpdateNoticeMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.UpdateNoticeReq, com.xhpolaris.idlgen.meowchat.system.UpdateNoticeResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNotice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.UpdateNoticeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.UpdateNoticeResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("UpdateNotice"))
              .build();
        }
      }
    }
    return getUpdateNoticeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.DeleteNoticeReq,
      com.xhpolaris.idlgen.meowchat.system.DeleteNoticeResp> getDeleteNoticeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNotice",
      requestType = com.xhpolaris.idlgen.meowchat.system.DeleteNoticeReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.DeleteNoticeResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.DeleteNoticeReq,
      com.xhpolaris.idlgen.meowchat.system.DeleteNoticeResp> getDeleteNoticeMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.DeleteNoticeReq, com.xhpolaris.idlgen.meowchat.system.DeleteNoticeResp> getDeleteNoticeMethod;
    if ((getDeleteNoticeMethod = system_rpcGrpc.getDeleteNoticeMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getDeleteNoticeMethod = system_rpcGrpc.getDeleteNoticeMethod) == null) {
          system_rpcGrpc.getDeleteNoticeMethod = getDeleteNoticeMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.DeleteNoticeReq, com.xhpolaris.idlgen.meowchat.system.DeleteNoticeResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNotice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.DeleteNoticeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.DeleteNoticeResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("DeleteNotice"))
              .build();
        }
      }
    }
    return getDeleteNoticeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.RetrieveNewsReq,
      com.xhpolaris.idlgen.meowchat.system.RetrieveNewsResp> getRetrieveNewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrieveNews",
      requestType = com.xhpolaris.idlgen.meowchat.system.RetrieveNewsReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.RetrieveNewsResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.RetrieveNewsReq,
      com.xhpolaris.idlgen.meowchat.system.RetrieveNewsResp> getRetrieveNewsMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.RetrieveNewsReq, com.xhpolaris.idlgen.meowchat.system.RetrieveNewsResp> getRetrieveNewsMethod;
    if ((getRetrieveNewsMethod = system_rpcGrpc.getRetrieveNewsMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getRetrieveNewsMethod = system_rpcGrpc.getRetrieveNewsMethod) == null) {
          system_rpcGrpc.getRetrieveNewsMethod = getRetrieveNewsMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.RetrieveNewsReq, com.xhpolaris.idlgen.meowchat.system.RetrieveNewsResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetrieveNews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.RetrieveNewsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.RetrieveNewsResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("RetrieveNews"))
              .build();
        }
      }
    }
    return getRetrieveNewsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.ListNewsReq,
      com.xhpolaris.idlgen.meowchat.system.ListNewsResp> getListNewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNews",
      requestType = com.xhpolaris.idlgen.meowchat.system.ListNewsReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.ListNewsResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.ListNewsReq,
      com.xhpolaris.idlgen.meowchat.system.ListNewsResp> getListNewsMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.ListNewsReq, com.xhpolaris.idlgen.meowchat.system.ListNewsResp> getListNewsMethod;
    if ((getListNewsMethod = system_rpcGrpc.getListNewsMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getListNewsMethod = system_rpcGrpc.getListNewsMethod) == null) {
          system_rpcGrpc.getListNewsMethod = getListNewsMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.ListNewsReq, com.xhpolaris.idlgen.meowchat.system.ListNewsResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.ListNewsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.ListNewsResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("ListNews"))
              .build();
        }
      }
    }
    return getListNewsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.CreateNewsReq,
      com.xhpolaris.idlgen.meowchat.system.CreateNewsResp> getCreateNewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNews",
      requestType = com.xhpolaris.idlgen.meowchat.system.CreateNewsReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.CreateNewsResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.CreateNewsReq,
      com.xhpolaris.idlgen.meowchat.system.CreateNewsResp> getCreateNewsMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.CreateNewsReq, com.xhpolaris.idlgen.meowchat.system.CreateNewsResp> getCreateNewsMethod;
    if ((getCreateNewsMethod = system_rpcGrpc.getCreateNewsMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getCreateNewsMethod = system_rpcGrpc.getCreateNewsMethod) == null) {
          system_rpcGrpc.getCreateNewsMethod = getCreateNewsMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.CreateNewsReq, com.xhpolaris.idlgen.meowchat.system.CreateNewsResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.CreateNewsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.CreateNewsResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("CreateNews"))
              .build();
        }
      }
    }
    return getCreateNewsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.UpdateNewsReq,
      com.xhpolaris.idlgen.meowchat.system.UpdateNewsResp> getUpdateNewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNews",
      requestType = com.xhpolaris.idlgen.meowchat.system.UpdateNewsReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.UpdateNewsResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.UpdateNewsReq,
      com.xhpolaris.idlgen.meowchat.system.UpdateNewsResp> getUpdateNewsMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.UpdateNewsReq, com.xhpolaris.idlgen.meowchat.system.UpdateNewsResp> getUpdateNewsMethod;
    if ((getUpdateNewsMethod = system_rpcGrpc.getUpdateNewsMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getUpdateNewsMethod = system_rpcGrpc.getUpdateNewsMethod) == null) {
          system_rpcGrpc.getUpdateNewsMethod = getUpdateNewsMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.UpdateNewsReq, com.xhpolaris.idlgen.meowchat.system.UpdateNewsResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.UpdateNewsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.UpdateNewsResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("UpdateNews"))
              .build();
        }
      }
    }
    return getUpdateNewsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.DeleteNewsReq,
      com.xhpolaris.idlgen.meowchat.system.DeleteNewsResp> getDeleteNewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNews",
      requestType = com.xhpolaris.idlgen.meowchat.system.DeleteNewsReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.DeleteNewsResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.DeleteNewsReq,
      com.xhpolaris.idlgen.meowchat.system.DeleteNewsResp> getDeleteNewsMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.DeleteNewsReq, com.xhpolaris.idlgen.meowchat.system.DeleteNewsResp> getDeleteNewsMethod;
    if ((getDeleteNewsMethod = system_rpcGrpc.getDeleteNewsMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getDeleteNewsMethod = system_rpcGrpc.getDeleteNewsMethod) == null) {
          system_rpcGrpc.getDeleteNewsMethod = getDeleteNewsMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.DeleteNewsReq, com.xhpolaris.idlgen.meowchat.system.DeleteNewsResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.DeleteNewsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.DeleteNewsResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("DeleteNews"))
              .build();
        }
      }
    }
    return getDeleteNewsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.RetrieveAdminReq,
      com.xhpolaris.idlgen.meowchat.system.RetrieveAdminResp> getRetrieveAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrieveAdmin",
      requestType = com.xhpolaris.idlgen.meowchat.system.RetrieveAdminReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.RetrieveAdminResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.RetrieveAdminReq,
      com.xhpolaris.idlgen.meowchat.system.RetrieveAdminResp> getRetrieveAdminMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.RetrieveAdminReq, com.xhpolaris.idlgen.meowchat.system.RetrieveAdminResp> getRetrieveAdminMethod;
    if ((getRetrieveAdminMethod = system_rpcGrpc.getRetrieveAdminMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getRetrieveAdminMethod = system_rpcGrpc.getRetrieveAdminMethod) == null) {
          system_rpcGrpc.getRetrieveAdminMethod = getRetrieveAdminMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.RetrieveAdminReq, com.xhpolaris.idlgen.meowchat.system.RetrieveAdminResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetrieveAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.RetrieveAdminReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.RetrieveAdminResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("RetrieveAdmin"))
              .build();
        }
      }
    }
    return getRetrieveAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.ListAdminReq,
      com.xhpolaris.idlgen.meowchat.system.ListAdminResp> getListAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAdmin",
      requestType = com.xhpolaris.idlgen.meowchat.system.ListAdminReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.ListAdminResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.ListAdminReq,
      com.xhpolaris.idlgen.meowchat.system.ListAdminResp> getListAdminMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.ListAdminReq, com.xhpolaris.idlgen.meowchat.system.ListAdminResp> getListAdminMethod;
    if ((getListAdminMethod = system_rpcGrpc.getListAdminMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getListAdminMethod = system_rpcGrpc.getListAdminMethod) == null) {
          system_rpcGrpc.getListAdminMethod = getListAdminMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.ListAdminReq, com.xhpolaris.idlgen.meowchat.system.ListAdminResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.ListAdminReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.ListAdminResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("ListAdmin"))
              .build();
        }
      }
    }
    return getListAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.CreateAdminReq,
      com.xhpolaris.idlgen.meowchat.system.CreateAdminResp> getCreateAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAdmin",
      requestType = com.xhpolaris.idlgen.meowchat.system.CreateAdminReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.CreateAdminResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.CreateAdminReq,
      com.xhpolaris.idlgen.meowchat.system.CreateAdminResp> getCreateAdminMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.CreateAdminReq, com.xhpolaris.idlgen.meowchat.system.CreateAdminResp> getCreateAdminMethod;
    if ((getCreateAdminMethod = system_rpcGrpc.getCreateAdminMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getCreateAdminMethod = system_rpcGrpc.getCreateAdminMethod) == null) {
          system_rpcGrpc.getCreateAdminMethod = getCreateAdminMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.CreateAdminReq, com.xhpolaris.idlgen.meowchat.system.CreateAdminResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.CreateAdminReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.CreateAdminResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("CreateAdmin"))
              .build();
        }
      }
    }
    return getCreateAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.UpdateAdminReq,
      com.xhpolaris.idlgen.meowchat.system.UpdateAdminResp> getUpdateAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAdmin",
      requestType = com.xhpolaris.idlgen.meowchat.system.UpdateAdminReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.UpdateAdminResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.UpdateAdminReq,
      com.xhpolaris.idlgen.meowchat.system.UpdateAdminResp> getUpdateAdminMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.UpdateAdminReq, com.xhpolaris.idlgen.meowchat.system.UpdateAdminResp> getUpdateAdminMethod;
    if ((getUpdateAdminMethod = system_rpcGrpc.getUpdateAdminMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getUpdateAdminMethod = system_rpcGrpc.getUpdateAdminMethod) == null) {
          system_rpcGrpc.getUpdateAdminMethod = getUpdateAdminMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.UpdateAdminReq, com.xhpolaris.idlgen.meowchat.system.UpdateAdminResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.UpdateAdminReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.UpdateAdminResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("UpdateAdmin"))
              .build();
        }
      }
    }
    return getUpdateAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.DeleteAdminReq,
      com.xhpolaris.idlgen.meowchat.system.DeleteAdminResp> getDeleteAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAdmin",
      requestType = com.xhpolaris.idlgen.meowchat.system.DeleteAdminReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.DeleteAdminResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.DeleteAdminReq,
      com.xhpolaris.idlgen.meowchat.system.DeleteAdminResp> getDeleteAdminMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.DeleteAdminReq, com.xhpolaris.idlgen.meowchat.system.DeleteAdminResp> getDeleteAdminMethod;
    if ((getDeleteAdminMethod = system_rpcGrpc.getDeleteAdminMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getDeleteAdminMethod = system_rpcGrpc.getDeleteAdminMethod) == null) {
          system_rpcGrpc.getDeleteAdminMethod = getDeleteAdminMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.DeleteAdminReq, com.xhpolaris.idlgen.meowchat.system.DeleteAdminResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.DeleteAdminReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.DeleteAdminResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("DeleteAdmin"))
              .build();
        }
      }
    }
    return getDeleteAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleReq,
      com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleResp> getRetrieveUserRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrieveUserRole",
      requestType = com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleReq,
      com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleResp> getRetrieveUserRoleMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleReq, com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleResp> getRetrieveUserRoleMethod;
    if ((getRetrieveUserRoleMethod = system_rpcGrpc.getRetrieveUserRoleMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getRetrieveUserRoleMethod = system_rpcGrpc.getRetrieveUserRoleMethod) == null) {
          system_rpcGrpc.getRetrieveUserRoleMethod = getRetrieveUserRoleMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleReq, com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetrieveUserRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("RetrieveUserRole"))
              .build();
        }
      }
    }
    return getRetrieveUserRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleReq,
      com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleResp> getListUserIdByRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUserIdByRole",
      requestType = com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleReq,
      com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleResp> getListUserIdByRoleMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleReq, com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleResp> getListUserIdByRoleMethod;
    if ((getListUserIdByRoleMethod = system_rpcGrpc.getListUserIdByRoleMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getListUserIdByRoleMethod = system_rpcGrpc.getListUserIdByRoleMethod) == null) {
          system_rpcGrpc.getListUserIdByRoleMethod = getListUserIdByRoleMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleReq, com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUserIdByRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("ListUserIdByRole"))
              .build();
        }
      }
    }
    return getListUserIdByRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleReq,
      com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleResp> getUpdateUserRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserRole",
      requestType = com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleReq,
      com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleResp> getUpdateUserRoleMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleReq, com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleResp> getUpdateUserRoleMethod;
    if ((getUpdateUserRoleMethod = system_rpcGrpc.getUpdateUserRoleMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getUpdateUserRoleMethod = system_rpcGrpc.getUpdateUserRoleMethod) == null) {
          system_rpcGrpc.getUpdateUserRoleMethod = getUpdateUserRoleMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleReq, com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("UpdateUserRole"))
              .build();
        }
      }
    }
    return getUpdateUserRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.ContainsRoleReq,
      com.xhpolaris.idlgen.meowchat.system.ContainsRoleResp> getContainsRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContainsRole",
      requestType = com.xhpolaris.idlgen.meowchat.system.ContainsRoleReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.ContainsRoleResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.ContainsRoleReq,
      com.xhpolaris.idlgen.meowchat.system.ContainsRoleResp> getContainsRoleMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.ContainsRoleReq, com.xhpolaris.idlgen.meowchat.system.ContainsRoleResp> getContainsRoleMethod;
    if ((getContainsRoleMethod = system_rpcGrpc.getContainsRoleMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getContainsRoleMethod = system_rpcGrpc.getContainsRoleMethod) == null) {
          system_rpcGrpc.getContainsRoleMethod = getContainsRoleMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.ContainsRoleReq, com.xhpolaris.idlgen.meowchat.system.ContainsRoleResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ContainsRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.ContainsRoleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.ContainsRoleResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("ContainsRole"))
              .build();
        }
      }
    }
    return getContainsRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.CreateApplyReq,
      com.xhpolaris.idlgen.meowchat.system.CreateApplyResp> getCreateApplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateApply",
      requestType = com.xhpolaris.idlgen.meowchat.system.CreateApplyReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.CreateApplyResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.CreateApplyReq,
      com.xhpolaris.idlgen.meowchat.system.CreateApplyResp> getCreateApplyMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.CreateApplyReq, com.xhpolaris.idlgen.meowchat.system.CreateApplyResp> getCreateApplyMethod;
    if ((getCreateApplyMethod = system_rpcGrpc.getCreateApplyMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getCreateApplyMethod = system_rpcGrpc.getCreateApplyMethod) == null) {
          system_rpcGrpc.getCreateApplyMethod = getCreateApplyMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.CreateApplyReq, com.xhpolaris.idlgen.meowchat.system.CreateApplyResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateApply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.CreateApplyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.CreateApplyResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("CreateApply"))
              .build();
        }
      }
    }
    return getCreateApplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.HandleApplyReq,
      com.xhpolaris.idlgen.meowchat.system.HandleApplyResp> getHandleApplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleApply",
      requestType = com.xhpolaris.idlgen.meowchat.system.HandleApplyReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.HandleApplyResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.HandleApplyReq,
      com.xhpolaris.idlgen.meowchat.system.HandleApplyResp> getHandleApplyMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.HandleApplyReq, com.xhpolaris.idlgen.meowchat.system.HandleApplyResp> getHandleApplyMethod;
    if ((getHandleApplyMethod = system_rpcGrpc.getHandleApplyMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getHandleApplyMethod = system_rpcGrpc.getHandleApplyMethod) == null) {
          system_rpcGrpc.getHandleApplyMethod = getHandleApplyMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.HandleApplyReq, com.xhpolaris.idlgen.meowchat.system.HandleApplyResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleApply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.HandleApplyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.HandleApplyResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("HandleApply"))
              .build();
        }
      }
    }
    return getHandleApplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.ListApplyReq,
      com.xhpolaris.idlgen.meowchat.system.ListApplyResp> getListApplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListApply",
      requestType = com.xhpolaris.idlgen.meowchat.system.ListApplyReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.ListApplyResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.ListApplyReq,
      com.xhpolaris.idlgen.meowchat.system.ListApplyResp> getListApplyMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.ListApplyReq, com.xhpolaris.idlgen.meowchat.system.ListApplyResp> getListApplyMethod;
    if ((getListApplyMethod = system_rpcGrpc.getListApplyMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getListApplyMethod = system_rpcGrpc.getListApplyMethod) == null) {
          system_rpcGrpc.getListApplyMethod = getListApplyMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.ListApplyReq, com.xhpolaris.idlgen.meowchat.system.ListApplyResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListApply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.ListApplyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.ListApplyResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("ListApply"))
              .build();
        }
      }
    }
    return getListApplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityReq,
      com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityResp> getRetrieveCommunityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrieveCommunity",
      requestType = com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityReq,
      com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityResp> getRetrieveCommunityMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityReq, com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityResp> getRetrieveCommunityMethod;
    if ((getRetrieveCommunityMethod = system_rpcGrpc.getRetrieveCommunityMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getRetrieveCommunityMethod = system_rpcGrpc.getRetrieveCommunityMethod) == null) {
          system_rpcGrpc.getRetrieveCommunityMethod = getRetrieveCommunityMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityReq, com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetrieveCommunity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("RetrieveCommunity"))
              .build();
        }
      }
    }
    return getRetrieveCommunityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.ListCommunityReq,
      com.xhpolaris.idlgen.meowchat.system.ListCommunityResp> getListCommunityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCommunity",
      requestType = com.xhpolaris.idlgen.meowchat.system.ListCommunityReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.ListCommunityResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.ListCommunityReq,
      com.xhpolaris.idlgen.meowchat.system.ListCommunityResp> getListCommunityMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.ListCommunityReq, com.xhpolaris.idlgen.meowchat.system.ListCommunityResp> getListCommunityMethod;
    if ((getListCommunityMethod = system_rpcGrpc.getListCommunityMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getListCommunityMethod = system_rpcGrpc.getListCommunityMethod) == null) {
          system_rpcGrpc.getListCommunityMethod = getListCommunityMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.ListCommunityReq, com.xhpolaris.idlgen.meowchat.system.ListCommunityResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCommunity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.ListCommunityReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.ListCommunityResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("ListCommunity"))
              .build();
        }
      }
    }
    return getListCommunityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.CreateCommunityReq,
      com.xhpolaris.idlgen.meowchat.system.CreateCommunityResp> getCreateCommunityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCommunity",
      requestType = com.xhpolaris.idlgen.meowchat.system.CreateCommunityReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.CreateCommunityResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.CreateCommunityReq,
      com.xhpolaris.idlgen.meowchat.system.CreateCommunityResp> getCreateCommunityMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.CreateCommunityReq, com.xhpolaris.idlgen.meowchat.system.CreateCommunityResp> getCreateCommunityMethod;
    if ((getCreateCommunityMethod = system_rpcGrpc.getCreateCommunityMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getCreateCommunityMethod = system_rpcGrpc.getCreateCommunityMethod) == null) {
          system_rpcGrpc.getCreateCommunityMethod = getCreateCommunityMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.CreateCommunityReq, com.xhpolaris.idlgen.meowchat.system.CreateCommunityResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCommunity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.CreateCommunityReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.CreateCommunityResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("CreateCommunity"))
              .build();
        }
      }
    }
    return getCreateCommunityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.UpdateCommunityReq,
      com.xhpolaris.idlgen.meowchat.system.UpdateCommunityResp> getUpdateCommunityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCommunity",
      requestType = com.xhpolaris.idlgen.meowchat.system.UpdateCommunityReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.UpdateCommunityResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.UpdateCommunityReq,
      com.xhpolaris.idlgen.meowchat.system.UpdateCommunityResp> getUpdateCommunityMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.UpdateCommunityReq, com.xhpolaris.idlgen.meowchat.system.UpdateCommunityResp> getUpdateCommunityMethod;
    if ((getUpdateCommunityMethod = system_rpcGrpc.getUpdateCommunityMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getUpdateCommunityMethod = system_rpcGrpc.getUpdateCommunityMethod) == null) {
          system_rpcGrpc.getUpdateCommunityMethod = getUpdateCommunityMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.UpdateCommunityReq, com.xhpolaris.idlgen.meowchat.system.UpdateCommunityResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCommunity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.UpdateCommunityReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.UpdateCommunityResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("UpdateCommunity"))
              .build();
        }
      }
    }
    return getUpdateCommunityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.DeleteCommunityReq,
      com.xhpolaris.idlgen.meowchat.system.DeleteCommunityResp> getDeleteCommunityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCommunity",
      requestType = com.xhpolaris.idlgen.meowchat.system.DeleteCommunityReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.system.DeleteCommunityResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.DeleteCommunityReq,
      com.xhpolaris.idlgen.meowchat.system.DeleteCommunityResp> getDeleteCommunityMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.system.DeleteCommunityReq, com.xhpolaris.idlgen.meowchat.system.DeleteCommunityResp> getDeleteCommunityMethod;
    if ((getDeleteCommunityMethod = system_rpcGrpc.getDeleteCommunityMethod) == null) {
      synchronized (system_rpcGrpc.class) {
        if ((getDeleteCommunityMethod = system_rpcGrpc.getDeleteCommunityMethod) == null) {
          system_rpcGrpc.getDeleteCommunityMethod = getDeleteCommunityMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.system.DeleteCommunityReq, com.xhpolaris.idlgen.meowchat.system.DeleteCommunityResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCommunity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.DeleteCommunityReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.system.DeleteCommunityResp.getDefaultInstance()))
              .setSchemaDescriptor(new system_rpcMethodDescriptorSupplier("DeleteCommunity"))
              .build();
        }
      }
    }
    return getDeleteCommunityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static system_rpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<system_rpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<system_rpcStub>() {
        @java.lang.Override
        public system_rpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new system_rpcStub(channel, callOptions);
        }
      };
    return system_rpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static system_rpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<system_rpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<system_rpcBlockingStub>() {
        @java.lang.Override
        public system_rpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new system_rpcBlockingStub(channel, callOptions);
        }
      };
    return system_rpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static system_rpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<system_rpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<system_rpcFutureStub>() {
        @java.lang.Override
        public system_rpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new system_rpcFutureStub(channel, callOptions);
        }
      };
    return system_rpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class system_rpcImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 公告
     * </pre>
     */
    public void retrieveNotice(com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveNoticeMethod(), responseObserver);
    }

    /**
     */
    public void listNotice(com.xhpolaris.idlgen.meowchat.system.ListNoticeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.ListNoticeResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNoticeMethod(), responseObserver);
    }

    /**
     */
    public void createNotice(com.xhpolaris.idlgen.meowchat.system.CreateNoticeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.CreateNoticeResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNoticeMethod(), responseObserver);
    }

    /**
     */
    public void updateNotice(com.xhpolaris.idlgen.meowchat.system.UpdateNoticeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.UpdateNoticeResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNoticeMethod(), responseObserver);
    }

    /**
     */
    public void deleteNotice(com.xhpolaris.idlgen.meowchat.system.DeleteNoticeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.DeleteNoticeResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNoticeMethod(), responseObserver);
    }

    /**
     * <pre>
     * 轮播图
     * </pre>
     */
    public void retrieveNews(com.xhpolaris.idlgen.meowchat.system.RetrieveNewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.RetrieveNewsResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveNewsMethod(), responseObserver);
    }

    /**
     */
    public void listNews(com.xhpolaris.idlgen.meowchat.system.ListNewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.ListNewsResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNewsMethod(), responseObserver);
    }

    /**
     */
    public void createNews(com.xhpolaris.idlgen.meowchat.system.CreateNewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.CreateNewsResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNewsMethod(), responseObserver);
    }

    /**
     */
    public void updateNews(com.xhpolaris.idlgen.meowchat.system.UpdateNewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.UpdateNewsResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNewsMethod(), responseObserver);
    }

    /**
     */
    public void deleteNews(com.xhpolaris.idlgen.meowchat.system.DeleteNewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.DeleteNewsResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNewsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 社区联系人
     * </pre>
     */
    public void retrieveAdmin(com.xhpolaris.idlgen.meowchat.system.RetrieveAdminReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.RetrieveAdminResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveAdminMethod(), responseObserver);
    }

    /**
     */
    public void listAdmin(com.xhpolaris.idlgen.meowchat.system.ListAdminReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.ListAdminResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAdminMethod(), responseObserver);
    }

    /**
     */
    public void createAdmin(com.xhpolaris.idlgen.meowchat.system.CreateAdminReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.CreateAdminResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAdminMethod(), responseObserver);
    }

    /**
     */
    public void updateAdmin(com.xhpolaris.idlgen.meowchat.system.UpdateAdminReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.UpdateAdminResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAdminMethod(), responseObserver);
    }

    /**
     */
    public void deleteAdmin(com.xhpolaris.idlgen.meowchat.system.DeleteAdminReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.DeleteAdminResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAdminMethod(), responseObserver);
    }

    /**
     * <pre>
     * 用户角色
     * </pre>
     */
    public void retrieveUserRole(com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveUserRoleMethod(), responseObserver);
    }

    /**
     */
    public void listUserIdByRole(com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUserIdByRoleMethod(), responseObserver);
    }

    /**
     */
    public void updateUserRole(com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserRoleMethod(), responseObserver);
    }

    /**
     */
    public void containsRole(com.xhpolaris.idlgen.meowchat.system.ContainsRoleReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.ContainsRoleResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContainsRoleMethod(), responseObserver);
    }

    /**
     */
    public void createApply(com.xhpolaris.idlgen.meowchat.system.CreateApplyReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.CreateApplyResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateApplyMethod(), responseObserver);
    }

    /**
     */
    public void handleApply(com.xhpolaris.idlgen.meowchat.system.HandleApplyReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.HandleApplyResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandleApplyMethod(), responseObserver);
    }

    /**
     */
    public void listApply(com.xhpolaris.idlgen.meowchat.system.ListApplyReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.ListApplyResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListApplyMethod(), responseObserver);
    }

    /**
     * <pre>
     * 社区
     * </pre>
     */
    public void retrieveCommunity(com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveCommunityMethod(), responseObserver);
    }

    /**
     */
    public void listCommunity(com.xhpolaris.idlgen.meowchat.system.ListCommunityReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.ListCommunityResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCommunityMethod(), responseObserver);
    }

    /**
     */
    public void createCommunity(com.xhpolaris.idlgen.meowchat.system.CreateCommunityReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.CreateCommunityResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCommunityMethod(), responseObserver);
    }

    /**
     */
    public void updateCommunity(com.xhpolaris.idlgen.meowchat.system.UpdateCommunityReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.UpdateCommunityResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCommunityMethod(), responseObserver);
    }

    /**
     */
    public void deleteCommunity(com.xhpolaris.idlgen.meowchat.system.DeleteCommunityReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.DeleteCommunityResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCommunityMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRetrieveNoticeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeReq,
                com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeResp>(
                  this, METHODID_RETRIEVE_NOTICE)))
          .addMethod(
            getListNoticeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.ListNoticeReq,
                com.xhpolaris.idlgen.meowchat.system.ListNoticeResp>(
                  this, METHODID_LIST_NOTICE)))
          .addMethod(
            getCreateNoticeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.CreateNoticeReq,
                com.xhpolaris.idlgen.meowchat.system.CreateNoticeResp>(
                  this, METHODID_CREATE_NOTICE)))
          .addMethod(
            getUpdateNoticeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.UpdateNoticeReq,
                com.xhpolaris.idlgen.meowchat.system.UpdateNoticeResp>(
                  this, METHODID_UPDATE_NOTICE)))
          .addMethod(
            getDeleteNoticeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.DeleteNoticeReq,
                com.xhpolaris.idlgen.meowchat.system.DeleteNoticeResp>(
                  this, METHODID_DELETE_NOTICE)))
          .addMethod(
            getRetrieveNewsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.RetrieveNewsReq,
                com.xhpolaris.idlgen.meowchat.system.RetrieveNewsResp>(
                  this, METHODID_RETRIEVE_NEWS)))
          .addMethod(
            getListNewsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.ListNewsReq,
                com.xhpolaris.idlgen.meowchat.system.ListNewsResp>(
                  this, METHODID_LIST_NEWS)))
          .addMethod(
            getCreateNewsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.CreateNewsReq,
                com.xhpolaris.idlgen.meowchat.system.CreateNewsResp>(
                  this, METHODID_CREATE_NEWS)))
          .addMethod(
            getUpdateNewsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.UpdateNewsReq,
                com.xhpolaris.idlgen.meowchat.system.UpdateNewsResp>(
                  this, METHODID_UPDATE_NEWS)))
          .addMethod(
            getDeleteNewsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.DeleteNewsReq,
                com.xhpolaris.idlgen.meowchat.system.DeleteNewsResp>(
                  this, METHODID_DELETE_NEWS)))
          .addMethod(
            getRetrieveAdminMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.RetrieveAdminReq,
                com.xhpolaris.idlgen.meowchat.system.RetrieveAdminResp>(
                  this, METHODID_RETRIEVE_ADMIN)))
          .addMethod(
            getListAdminMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.ListAdminReq,
                com.xhpolaris.idlgen.meowchat.system.ListAdminResp>(
                  this, METHODID_LIST_ADMIN)))
          .addMethod(
            getCreateAdminMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.CreateAdminReq,
                com.xhpolaris.idlgen.meowchat.system.CreateAdminResp>(
                  this, METHODID_CREATE_ADMIN)))
          .addMethod(
            getUpdateAdminMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.UpdateAdminReq,
                com.xhpolaris.idlgen.meowchat.system.UpdateAdminResp>(
                  this, METHODID_UPDATE_ADMIN)))
          .addMethod(
            getDeleteAdminMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.DeleteAdminReq,
                com.xhpolaris.idlgen.meowchat.system.DeleteAdminResp>(
                  this, METHODID_DELETE_ADMIN)))
          .addMethod(
            getRetrieveUserRoleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleReq,
                com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleResp>(
                  this, METHODID_RETRIEVE_USER_ROLE)))
          .addMethod(
            getListUserIdByRoleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleReq,
                com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleResp>(
                  this, METHODID_LIST_USER_ID_BY_ROLE)))
          .addMethod(
            getUpdateUserRoleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleReq,
                com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleResp>(
                  this, METHODID_UPDATE_USER_ROLE)))
          .addMethod(
            getContainsRoleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.ContainsRoleReq,
                com.xhpolaris.idlgen.meowchat.system.ContainsRoleResp>(
                  this, METHODID_CONTAINS_ROLE)))
          .addMethod(
            getCreateApplyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.CreateApplyReq,
                com.xhpolaris.idlgen.meowchat.system.CreateApplyResp>(
                  this, METHODID_CREATE_APPLY)))
          .addMethod(
            getHandleApplyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.HandleApplyReq,
                com.xhpolaris.idlgen.meowchat.system.HandleApplyResp>(
                  this, METHODID_HANDLE_APPLY)))
          .addMethod(
            getListApplyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.ListApplyReq,
                com.xhpolaris.idlgen.meowchat.system.ListApplyResp>(
                  this, METHODID_LIST_APPLY)))
          .addMethod(
            getRetrieveCommunityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityReq,
                com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityResp>(
                  this, METHODID_RETRIEVE_COMMUNITY)))
          .addMethod(
            getListCommunityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.ListCommunityReq,
                com.xhpolaris.idlgen.meowchat.system.ListCommunityResp>(
                  this, METHODID_LIST_COMMUNITY)))
          .addMethod(
            getCreateCommunityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.CreateCommunityReq,
                com.xhpolaris.idlgen.meowchat.system.CreateCommunityResp>(
                  this, METHODID_CREATE_COMMUNITY)))
          .addMethod(
            getUpdateCommunityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.UpdateCommunityReq,
                com.xhpolaris.idlgen.meowchat.system.UpdateCommunityResp>(
                  this, METHODID_UPDATE_COMMUNITY)))
          .addMethod(
            getDeleteCommunityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.system.DeleteCommunityReq,
                com.xhpolaris.idlgen.meowchat.system.DeleteCommunityResp>(
                  this, METHODID_DELETE_COMMUNITY)))
          .build();
    }
  }

  /**
   */
  public static final class system_rpcStub extends io.grpc.stub.AbstractAsyncStub<system_rpcStub> {
    private system_rpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected system_rpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new system_rpcStub(channel, callOptions);
    }

    /**
     * <pre>
     * 公告
     * </pre>
     */
    public void retrieveNotice(com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveNoticeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNotice(com.xhpolaris.idlgen.meowchat.system.ListNoticeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.ListNoticeResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNoticeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createNotice(com.xhpolaris.idlgen.meowchat.system.CreateNoticeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.CreateNoticeResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNoticeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateNotice(com.xhpolaris.idlgen.meowchat.system.UpdateNoticeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.UpdateNoticeResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNoticeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNotice(com.xhpolaris.idlgen.meowchat.system.DeleteNoticeReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.DeleteNoticeResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNoticeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 轮播图
     * </pre>
     */
    public void retrieveNews(com.xhpolaris.idlgen.meowchat.system.RetrieveNewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.RetrieveNewsResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveNewsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNews(com.xhpolaris.idlgen.meowchat.system.ListNewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.ListNewsResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNewsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createNews(com.xhpolaris.idlgen.meowchat.system.CreateNewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.CreateNewsResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNewsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateNews(com.xhpolaris.idlgen.meowchat.system.UpdateNewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.UpdateNewsResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNewsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNews(com.xhpolaris.idlgen.meowchat.system.DeleteNewsReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.DeleteNewsResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNewsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 社区联系人
     * </pre>
     */
    public void retrieveAdmin(com.xhpolaris.idlgen.meowchat.system.RetrieveAdminReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.RetrieveAdminResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAdmin(com.xhpolaris.idlgen.meowchat.system.ListAdminReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.ListAdminResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAdmin(com.xhpolaris.idlgen.meowchat.system.CreateAdminReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.CreateAdminResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAdmin(com.xhpolaris.idlgen.meowchat.system.UpdateAdminReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.UpdateAdminResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAdmin(com.xhpolaris.idlgen.meowchat.system.DeleteAdminReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.DeleteAdminResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 用户角色
     * </pre>
     */
    public void retrieveUserRole(com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveUserRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listUserIdByRole(com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUserIdByRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUserRole(com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void containsRole(com.xhpolaris.idlgen.meowchat.system.ContainsRoleReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.ContainsRoleResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContainsRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createApply(com.xhpolaris.idlgen.meowchat.system.CreateApplyReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.CreateApplyResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateApplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handleApply(com.xhpolaris.idlgen.meowchat.system.HandleApplyReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.HandleApplyResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandleApplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listApply(com.xhpolaris.idlgen.meowchat.system.ListApplyReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.ListApplyResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListApplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 社区
     * </pre>
     */
    public void retrieveCommunity(com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveCommunityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCommunity(com.xhpolaris.idlgen.meowchat.system.ListCommunityReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.ListCommunityResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCommunityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCommunity(com.xhpolaris.idlgen.meowchat.system.CreateCommunityReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.CreateCommunityResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCommunityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCommunity(com.xhpolaris.idlgen.meowchat.system.UpdateCommunityReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.UpdateCommunityResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCommunityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCommunity(com.xhpolaris.idlgen.meowchat.system.DeleteCommunityReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.DeleteCommunityResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCommunityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class system_rpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<system_rpcBlockingStub> {
    private system_rpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected system_rpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new system_rpcBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 公告
     * </pre>
     */
    public com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeResp retrieveNotice(com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveNoticeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.system.ListNoticeResp listNotice(com.xhpolaris.idlgen.meowchat.system.ListNoticeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNoticeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.system.CreateNoticeResp createNotice(com.xhpolaris.idlgen.meowchat.system.CreateNoticeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNoticeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.system.UpdateNoticeResp updateNotice(com.xhpolaris.idlgen.meowchat.system.UpdateNoticeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNoticeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.system.DeleteNoticeResp deleteNotice(com.xhpolaris.idlgen.meowchat.system.DeleteNoticeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNoticeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 轮播图
     * </pre>
     */
    public com.xhpolaris.idlgen.meowchat.system.RetrieveNewsResp retrieveNews(com.xhpolaris.idlgen.meowchat.system.RetrieveNewsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveNewsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.system.ListNewsResp listNews(com.xhpolaris.idlgen.meowchat.system.ListNewsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNewsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.system.CreateNewsResp createNews(com.xhpolaris.idlgen.meowchat.system.CreateNewsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNewsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.system.UpdateNewsResp updateNews(com.xhpolaris.idlgen.meowchat.system.UpdateNewsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNewsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.system.DeleteNewsResp deleteNews(com.xhpolaris.idlgen.meowchat.system.DeleteNewsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNewsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 社区联系人
     * </pre>
     */
    public com.xhpolaris.idlgen.meowchat.system.RetrieveAdminResp retrieveAdmin(com.xhpolaris.idlgen.meowchat.system.RetrieveAdminReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveAdminMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.system.ListAdminResp listAdmin(com.xhpolaris.idlgen.meowchat.system.ListAdminReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAdminMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.system.CreateAdminResp createAdmin(com.xhpolaris.idlgen.meowchat.system.CreateAdminReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAdminMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.system.UpdateAdminResp updateAdmin(com.xhpolaris.idlgen.meowchat.system.UpdateAdminReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAdminMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.system.DeleteAdminResp deleteAdmin(com.xhpolaris.idlgen.meowchat.system.DeleteAdminReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAdminMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 用户角色
     * </pre>
     */
    public com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleResp retrieveUserRole(com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveUserRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleResp listUserIdByRole(com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUserIdByRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleResp updateUserRole(com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.system.ContainsRoleResp containsRole(com.xhpolaris.idlgen.meowchat.system.ContainsRoleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContainsRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.system.CreateApplyResp createApply(com.xhpolaris.idlgen.meowchat.system.CreateApplyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateApplyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.system.HandleApplyResp handleApply(com.xhpolaris.idlgen.meowchat.system.HandleApplyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandleApplyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.system.ListApplyResp listApply(com.xhpolaris.idlgen.meowchat.system.ListApplyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListApplyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 社区
     * </pre>
     */
    public com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityResp retrieveCommunity(com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveCommunityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.system.ListCommunityResp listCommunity(com.xhpolaris.idlgen.meowchat.system.ListCommunityReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCommunityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.system.CreateCommunityResp createCommunity(com.xhpolaris.idlgen.meowchat.system.CreateCommunityReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCommunityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.system.UpdateCommunityResp updateCommunity(com.xhpolaris.idlgen.meowchat.system.UpdateCommunityReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCommunityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.system.DeleteCommunityResp deleteCommunity(com.xhpolaris.idlgen.meowchat.system.DeleteCommunityReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCommunityMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class system_rpcFutureStub extends io.grpc.stub.AbstractFutureStub<system_rpcFutureStub> {
    private system_rpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected system_rpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new system_rpcFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 公告
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeResp> retrieveNotice(
        com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveNoticeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.ListNoticeResp> listNotice(
        com.xhpolaris.idlgen.meowchat.system.ListNoticeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNoticeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.CreateNoticeResp> createNotice(
        com.xhpolaris.idlgen.meowchat.system.CreateNoticeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNoticeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.UpdateNoticeResp> updateNotice(
        com.xhpolaris.idlgen.meowchat.system.UpdateNoticeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNoticeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.DeleteNoticeResp> deleteNotice(
        com.xhpolaris.idlgen.meowchat.system.DeleteNoticeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNoticeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 轮播图
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.RetrieveNewsResp> retrieveNews(
        com.xhpolaris.idlgen.meowchat.system.RetrieveNewsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveNewsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.ListNewsResp> listNews(
        com.xhpolaris.idlgen.meowchat.system.ListNewsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNewsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.CreateNewsResp> createNews(
        com.xhpolaris.idlgen.meowchat.system.CreateNewsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNewsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.UpdateNewsResp> updateNews(
        com.xhpolaris.idlgen.meowchat.system.UpdateNewsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNewsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.DeleteNewsResp> deleteNews(
        com.xhpolaris.idlgen.meowchat.system.DeleteNewsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNewsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 社区联系人
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.RetrieveAdminResp> retrieveAdmin(
        com.xhpolaris.idlgen.meowchat.system.RetrieveAdminReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveAdminMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.ListAdminResp> listAdmin(
        com.xhpolaris.idlgen.meowchat.system.ListAdminReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAdminMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.CreateAdminResp> createAdmin(
        com.xhpolaris.idlgen.meowchat.system.CreateAdminReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAdminMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.UpdateAdminResp> updateAdmin(
        com.xhpolaris.idlgen.meowchat.system.UpdateAdminReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAdminMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.DeleteAdminResp> deleteAdmin(
        com.xhpolaris.idlgen.meowchat.system.DeleteAdminReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAdminMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 用户角色
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleResp> retrieveUserRole(
        com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveUserRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleResp> listUserIdByRole(
        com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUserIdByRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleResp> updateUserRole(
        com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.ContainsRoleResp> containsRole(
        com.xhpolaris.idlgen.meowchat.system.ContainsRoleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContainsRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.CreateApplyResp> createApply(
        com.xhpolaris.idlgen.meowchat.system.CreateApplyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateApplyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.HandleApplyResp> handleApply(
        com.xhpolaris.idlgen.meowchat.system.HandleApplyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandleApplyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.ListApplyResp> listApply(
        com.xhpolaris.idlgen.meowchat.system.ListApplyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListApplyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 社区
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityResp> retrieveCommunity(
        com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveCommunityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.ListCommunityResp> listCommunity(
        com.xhpolaris.idlgen.meowchat.system.ListCommunityReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCommunityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.CreateCommunityResp> createCommunity(
        com.xhpolaris.idlgen.meowchat.system.CreateCommunityReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCommunityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.UpdateCommunityResp> updateCommunity(
        com.xhpolaris.idlgen.meowchat.system.UpdateCommunityReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCommunityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.system.DeleteCommunityResp> deleteCommunity(
        com.xhpolaris.idlgen.meowchat.system.DeleteCommunityReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCommunityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RETRIEVE_NOTICE = 0;
  private static final int METHODID_LIST_NOTICE = 1;
  private static final int METHODID_CREATE_NOTICE = 2;
  private static final int METHODID_UPDATE_NOTICE = 3;
  private static final int METHODID_DELETE_NOTICE = 4;
  private static final int METHODID_RETRIEVE_NEWS = 5;
  private static final int METHODID_LIST_NEWS = 6;
  private static final int METHODID_CREATE_NEWS = 7;
  private static final int METHODID_UPDATE_NEWS = 8;
  private static final int METHODID_DELETE_NEWS = 9;
  private static final int METHODID_RETRIEVE_ADMIN = 10;
  private static final int METHODID_LIST_ADMIN = 11;
  private static final int METHODID_CREATE_ADMIN = 12;
  private static final int METHODID_UPDATE_ADMIN = 13;
  private static final int METHODID_DELETE_ADMIN = 14;
  private static final int METHODID_RETRIEVE_USER_ROLE = 15;
  private static final int METHODID_LIST_USER_ID_BY_ROLE = 16;
  private static final int METHODID_UPDATE_USER_ROLE = 17;
  private static final int METHODID_CONTAINS_ROLE = 18;
  private static final int METHODID_CREATE_APPLY = 19;
  private static final int METHODID_HANDLE_APPLY = 20;
  private static final int METHODID_LIST_APPLY = 21;
  private static final int METHODID_RETRIEVE_COMMUNITY = 22;
  private static final int METHODID_LIST_COMMUNITY = 23;
  private static final int METHODID_CREATE_COMMUNITY = 24;
  private static final int METHODID_UPDATE_COMMUNITY = 25;
  private static final int METHODID_DELETE_COMMUNITY = 26;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final system_rpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(system_rpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RETRIEVE_NOTICE:
          serviceImpl.retrieveNotice((com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.RetrieveNoticeResp>) responseObserver);
          break;
        case METHODID_LIST_NOTICE:
          serviceImpl.listNotice((com.xhpolaris.idlgen.meowchat.system.ListNoticeReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.ListNoticeResp>) responseObserver);
          break;
        case METHODID_CREATE_NOTICE:
          serviceImpl.createNotice((com.xhpolaris.idlgen.meowchat.system.CreateNoticeReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.CreateNoticeResp>) responseObserver);
          break;
        case METHODID_UPDATE_NOTICE:
          serviceImpl.updateNotice((com.xhpolaris.idlgen.meowchat.system.UpdateNoticeReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.UpdateNoticeResp>) responseObserver);
          break;
        case METHODID_DELETE_NOTICE:
          serviceImpl.deleteNotice((com.xhpolaris.idlgen.meowchat.system.DeleteNoticeReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.DeleteNoticeResp>) responseObserver);
          break;
        case METHODID_RETRIEVE_NEWS:
          serviceImpl.retrieveNews((com.xhpolaris.idlgen.meowchat.system.RetrieveNewsReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.RetrieveNewsResp>) responseObserver);
          break;
        case METHODID_LIST_NEWS:
          serviceImpl.listNews((com.xhpolaris.idlgen.meowchat.system.ListNewsReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.ListNewsResp>) responseObserver);
          break;
        case METHODID_CREATE_NEWS:
          serviceImpl.createNews((com.xhpolaris.idlgen.meowchat.system.CreateNewsReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.CreateNewsResp>) responseObserver);
          break;
        case METHODID_UPDATE_NEWS:
          serviceImpl.updateNews((com.xhpolaris.idlgen.meowchat.system.UpdateNewsReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.UpdateNewsResp>) responseObserver);
          break;
        case METHODID_DELETE_NEWS:
          serviceImpl.deleteNews((com.xhpolaris.idlgen.meowchat.system.DeleteNewsReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.DeleteNewsResp>) responseObserver);
          break;
        case METHODID_RETRIEVE_ADMIN:
          serviceImpl.retrieveAdmin((com.xhpolaris.idlgen.meowchat.system.RetrieveAdminReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.RetrieveAdminResp>) responseObserver);
          break;
        case METHODID_LIST_ADMIN:
          serviceImpl.listAdmin((com.xhpolaris.idlgen.meowchat.system.ListAdminReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.ListAdminResp>) responseObserver);
          break;
        case METHODID_CREATE_ADMIN:
          serviceImpl.createAdmin((com.xhpolaris.idlgen.meowchat.system.CreateAdminReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.CreateAdminResp>) responseObserver);
          break;
        case METHODID_UPDATE_ADMIN:
          serviceImpl.updateAdmin((com.xhpolaris.idlgen.meowchat.system.UpdateAdminReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.UpdateAdminResp>) responseObserver);
          break;
        case METHODID_DELETE_ADMIN:
          serviceImpl.deleteAdmin((com.xhpolaris.idlgen.meowchat.system.DeleteAdminReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.DeleteAdminResp>) responseObserver);
          break;
        case METHODID_RETRIEVE_USER_ROLE:
          serviceImpl.retrieveUserRole((com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.RetrieveUserRoleResp>) responseObserver);
          break;
        case METHODID_LIST_USER_ID_BY_ROLE:
          serviceImpl.listUserIdByRole((com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.ListUserIdByRoleResp>) responseObserver);
          break;
        case METHODID_UPDATE_USER_ROLE:
          serviceImpl.updateUserRole((com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.UpdateUserRoleResp>) responseObserver);
          break;
        case METHODID_CONTAINS_ROLE:
          serviceImpl.containsRole((com.xhpolaris.idlgen.meowchat.system.ContainsRoleReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.ContainsRoleResp>) responseObserver);
          break;
        case METHODID_CREATE_APPLY:
          serviceImpl.createApply((com.xhpolaris.idlgen.meowchat.system.CreateApplyReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.CreateApplyResp>) responseObserver);
          break;
        case METHODID_HANDLE_APPLY:
          serviceImpl.handleApply((com.xhpolaris.idlgen.meowchat.system.HandleApplyReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.HandleApplyResp>) responseObserver);
          break;
        case METHODID_LIST_APPLY:
          serviceImpl.listApply((com.xhpolaris.idlgen.meowchat.system.ListApplyReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.ListApplyResp>) responseObserver);
          break;
        case METHODID_RETRIEVE_COMMUNITY:
          serviceImpl.retrieveCommunity((com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.RetrieveCommunityResp>) responseObserver);
          break;
        case METHODID_LIST_COMMUNITY:
          serviceImpl.listCommunity((com.xhpolaris.idlgen.meowchat.system.ListCommunityReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.ListCommunityResp>) responseObserver);
          break;
        case METHODID_CREATE_COMMUNITY:
          serviceImpl.createCommunity((com.xhpolaris.idlgen.meowchat.system.CreateCommunityReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.CreateCommunityResp>) responseObserver);
          break;
        case METHODID_UPDATE_COMMUNITY:
          serviceImpl.updateCommunity((com.xhpolaris.idlgen.meowchat.system.UpdateCommunityReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.UpdateCommunityResp>) responseObserver);
          break;
        case METHODID_DELETE_COMMUNITY:
          serviceImpl.deleteCommunity((com.xhpolaris.idlgen.meowchat.system.DeleteCommunityReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.system.DeleteCommunityResp>) responseObserver);
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

  private static abstract class system_rpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    system_rpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xhpolaris.idlgen.meowchat.system.SystemProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("system_rpc");
    }
  }

  private static final class system_rpcFileDescriptorSupplier
      extends system_rpcBaseDescriptorSupplier {
    system_rpcFileDescriptorSupplier() {}
  }

  private static final class system_rpcMethodDescriptorSupplier
      extends system_rpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    system_rpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (system_rpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new system_rpcFileDescriptorSupplier())
              .addMethod(getRetrieveNoticeMethod())
              .addMethod(getListNoticeMethod())
              .addMethod(getCreateNoticeMethod())
              .addMethod(getUpdateNoticeMethod())
              .addMethod(getDeleteNoticeMethod())
              .addMethod(getRetrieveNewsMethod())
              .addMethod(getListNewsMethod())
              .addMethod(getCreateNewsMethod())
              .addMethod(getUpdateNewsMethod())
              .addMethod(getDeleteNewsMethod())
              .addMethod(getRetrieveAdminMethod())
              .addMethod(getListAdminMethod())
              .addMethod(getCreateAdminMethod())
              .addMethod(getUpdateAdminMethod())
              .addMethod(getDeleteAdminMethod())
              .addMethod(getRetrieveUserRoleMethod())
              .addMethod(getListUserIdByRoleMethod())
              .addMethod(getUpdateUserRoleMethod())
              .addMethod(getContainsRoleMethod())
              .addMethod(getCreateApplyMethod())
              .addMethod(getHandleApplyMethod())
              .addMethod(getListApplyMethod())
              .addMethod(getRetrieveCommunityMethod())
              .addMethod(getListCommunityMethod())
              .addMethod(getCreateCommunityMethod())
              .addMethod(getUpdateCommunityMethod())
              .addMethod(getDeleteCommunityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
