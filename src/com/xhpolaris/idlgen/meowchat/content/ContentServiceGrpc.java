package com.xhpolaris.idlgen.meowchat.content;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: meowchat/content/content.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ContentServiceGrpc {

  private ContentServiceGrpc() {}

  public static final String SERVICE_NAME = "meowchat.content.ContentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.SearchCatReq,
      com.xhpolaris.idlgen.meowchat.content.SearchCatResp> getSearchCatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchCat",
      requestType = com.xhpolaris.idlgen.meowchat.content.SearchCatReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.SearchCatResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.SearchCatReq,
      com.xhpolaris.idlgen.meowchat.content.SearchCatResp> getSearchCatMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.SearchCatReq, com.xhpolaris.idlgen.meowchat.content.SearchCatResp> getSearchCatMethod;
    if ((getSearchCatMethod = ContentServiceGrpc.getSearchCatMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getSearchCatMethod = ContentServiceGrpc.getSearchCatMethod) == null) {
          ContentServiceGrpc.getSearchCatMethod = getSearchCatMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.SearchCatReq, com.xhpolaris.idlgen.meowchat.content.SearchCatResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchCat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.SearchCatReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.SearchCatResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("SearchCat"))
              .build();
        }
      }
    }
    return getSearchCatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.ListCatReq,
      com.xhpolaris.idlgen.meowchat.content.ListCatResp> getListCatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCat",
      requestType = com.xhpolaris.idlgen.meowchat.content.ListCatReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.ListCatResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.ListCatReq,
      com.xhpolaris.idlgen.meowchat.content.ListCatResp> getListCatMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.ListCatReq, com.xhpolaris.idlgen.meowchat.content.ListCatResp> getListCatMethod;
    if ((getListCatMethod = ContentServiceGrpc.getListCatMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getListCatMethod = ContentServiceGrpc.getListCatMethod) == null) {
          ContentServiceGrpc.getListCatMethod = getListCatMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.ListCatReq, com.xhpolaris.idlgen.meowchat.content.ListCatResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.ListCatReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.ListCatResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("ListCat"))
              .build();
        }
      }
    }
    return getListCatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.RetrieveCatReq,
      com.xhpolaris.idlgen.meowchat.content.RetrieveCatResp> getRetrieveCatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrieveCat",
      requestType = com.xhpolaris.idlgen.meowchat.content.RetrieveCatReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.RetrieveCatResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.RetrieveCatReq,
      com.xhpolaris.idlgen.meowchat.content.RetrieveCatResp> getRetrieveCatMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.RetrieveCatReq, com.xhpolaris.idlgen.meowchat.content.RetrieveCatResp> getRetrieveCatMethod;
    if ((getRetrieveCatMethod = ContentServiceGrpc.getRetrieveCatMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getRetrieveCatMethod = ContentServiceGrpc.getRetrieveCatMethod) == null) {
          ContentServiceGrpc.getRetrieveCatMethod = getRetrieveCatMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.RetrieveCatReq, com.xhpolaris.idlgen.meowchat.content.RetrieveCatResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetrieveCat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.RetrieveCatReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.RetrieveCatResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("RetrieveCat"))
              .build();
        }
      }
    }
    return getRetrieveCatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CreateCatReq,
      com.xhpolaris.idlgen.meowchat.content.CreateCatResp> getCreateCatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCat",
      requestType = com.xhpolaris.idlgen.meowchat.content.CreateCatReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.CreateCatResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CreateCatReq,
      com.xhpolaris.idlgen.meowchat.content.CreateCatResp> getCreateCatMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CreateCatReq, com.xhpolaris.idlgen.meowchat.content.CreateCatResp> getCreateCatMethod;
    if ((getCreateCatMethod = ContentServiceGrpc.getCreateCatMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getCreateCatMethod = ContentServiceGrpc.getCreateCatMethod) == null) {
          ContentServiceGrpc.getCreateCatMethod = getCreateCatMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.CreateCatReq, com.xhpolaris.idlgen.meowchat.content.CreateCatResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.CreateCatReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.CreateCatResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("CreateCat"))
              .build();
        }
      }
    }
    return getCreateCatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.UpdateCatReq,
      com.xhpolaris.idlgen.meowchat.content.UpdateCatResp> getUpdateCatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCat",
      requestType = com.xhpolaris.idlgen.meowchat.content.UpdateCatReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.UpdateCatResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.UpdateCatReq,
      com.xhpolaris.idlgen.meowchat.content.UpdateCatResp> getUpdateCatMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.UpdateCatReq, com.xhpolaris.idlgen.meowchat.content.UpdateCatResp> getUpdateCatMethod;
    if ((getUpdateCatMethod = ContentServiceGrpc.getUpdateCatMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getUpdateCatMethod = ContentServiceGrpc.getUpdateCatMethod) == null) {
          ContentServiceGrpc.getUpdateCatMethod = getUpdateCatMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.UpdateCatReq, com.xhpolaris.idlgen.meowchat.content.UpdateCatResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.UpdateCatReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.UpdateCatResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("UpdateCat"))
              .build();
        }
      }
    }
    return getUpdateCatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.DeleteCatReq,
      com.xhpolaris.idlgen.meowchat.content.DeleteCatResp> getDeleteCatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCat",
      requestType = com.xhpolaris.idlgen.meowchat.content.DeleteCatReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.DeleteCatResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.DeleteCatReq,
      com.xhpolaris.idlgen.meowchat.content.DeleteCatResp> getDeleteCatMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.DeleteCatReq, com.xhpolaris.idlgen.meowchat.content.DeleteCatResp> getDeleteCatMethod;
    if ((getDeleteCatMethod = ContentServiceGrpc.getDeleteCatMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getDeleteCatMethod = ContentServiceGrpc.getDeleteCatMethod) == null) {
          ContentServiceGrpc.getDeleteCatMethod = getDeleteCatMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.DeleteCatReq, com.xhpolaris.idlgen.meowchat.content.DeleteCatResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.DeleteCatReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.DeleteCatResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("DeleteCat"))
              .build();
        }
      }
    }
    return getDeleteCatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CreateImageReq,
      com.xhpolaris.idlgen.meowchat.content.CreateImageResp> getCreateImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateImage",
      requestType = com.xhpolaris.idlgen.meowchat.content.CreateImageReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.CreateImageResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CreateImageReq,
      com.xhpolaris.idlgen.meowchat.content.CreateImageResp> getCreateImageMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CreateImageReq, com.xhpolaris.idlgen.meowchat.content.CreateImageResp> getCreateImageMethod;
    if ((getCreateImageMethod = ContentServiceGrpc.getCreateImageMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getCreateImageMethod = ContentServiceGrpc.getCreateImageMethod) == null) {
          ContentServiceGrpc.getCreateImageMethod = getCreateImageMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.CreateImageReq, com.xhpolaris.idlgen.meowchat.content.CreateImageResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.CreateImageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.CreateImageResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("CreateImage"))
              .build();
        }
      }
    }
    return getCreateImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.DeleteImageReq,
      com.xhpolaris.idlgen.meowchat.content.DeleteImageResp> getDeleteImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteImage",
      requestType = com.xhpolaris.idlgen.meowchat.content.DeleteImageReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.DeleteImageResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.DeleteImageReq,
      com.xhpolaris.idlgen.meowchat.content.DeleteImageResp> getDeleteImageMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.DeleteImageReq, com.xhpolaris.idlgen.meowchat.content.DeleteImageResp> getDeleteImageMethod;
    if ((getDeleteImageMethod = ContentServiceGrpc.getDeleteImageMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getDeleteImageMethod = ContentServiceGrpc.getDeleteImageMethod) == null) {
          ContentServiceGrpc.getDeleteImageMethod = getDeleteImageMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.DeleteImageReq, com.xhpolaris.idlgen.meowchat.content.DeleteImageResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.DeleteImageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.DeleteImageResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("DeleteImage"))
              .build();
        }
      }
    }
    return getDeleteImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.ListImageReq,
      com.xhpolaris.idlgen.meowchat.content.ListImageResp> getListImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListImage",
      requestType = com.xhpolaris.idlgen.meowchat.content.ListImageReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.ListImageResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.ListImageReq,
      com.xhpolaris.idlgen.meowchat.content.ListImageResp> getListImageMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.ListImageReq, com.xhpolaris.idlgen.meowchat.content.ListImageResp> getListImageMethod;
    if ((getListImageMethod = ContentServiceGrpc.getListImageMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getListImageMethod = ContentServiceGrpc.getListImageMethod) == null) {
          ContentServiceGrpc.getListImageMethod = getListImageMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.ListImageReq, com.xhpolaris.idlgen.meowchat.content.ListImageResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.ListImageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.ListImageResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("ListImage"))
              .build();
        }
      }
    }
    return getListImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.ListMomentReq,
      com.xhpolaris.idlgen.meowchat.content.ListMomentResp> getListMomentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMoment",
      requestType = com.xhpolaris.idlgen.meowchat.content.ListMomentReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.ListMomentResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.ListMomentReq,
      com.xhpolaris.idlgen.meowchat.content.ListMomentResp> getListMomentMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.ListMomentReq, com.xhpolaris.idlgen.meowchat.content.ListMomentResp> getListMomentMethod;
    if ((getListMomentMethod = ContentServiceGrpc.getListMomentMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getListMomentMethod = ContentServiceGrpc.getListMomentMethod) == null) {
          ContentServiceGrpc.getListMomentMethod = getListMomentMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.ListMomentReq, com.xhpolaris.idlgen.meowchat.content.ListMomentResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMoment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.ListMomentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.ListMomentResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("ListMoment"))
              .build();
        }
      }
    }
    return getListMomentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CountMomentReq,
      com.xhpolaris.idlgen.meowchat.content.CountMomentResp> getCountMomentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CountMoment",
      requestType = com.xhpolaris.idlgen.meowchat.content.CountMomentReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.CountMomentResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CountMomentReq,
      com.xhpolaris.idlgen.meowchat.content.CountMomentResp> getCountMomentMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CountMomentReq, com.xhpolaris.idlgen.meowchat.content.CountMomentResp> getCountMomentMethod;
    if ((getCountMomentMethod = ContentServiceGrpc.getCountMomentMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getCountMomentMethod = ContentServiceGrpc.getCountMomentMethod) == null) {
          ContentServiceGrpc.getCountMomentMethod = getCountMomentMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.CountMomentReq, com.xhpolaris.idlgen.meowchat.content.CountMomentResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CountMoment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.CountMomentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.CountMomentResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("CountMoment"))
              .build();
        }
      }
    }
    return getCountMomentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.RetrieveMomentReq,
      com.xhpolaris.idlgen.meowchat.content.RetrieveMomentResp> getRetrieveMomentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrieveMoment",
      requestType = com.xhpolaris.idlgen.meowchat.content.RetrieveMomentReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.RetrieveMomentResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.RetrieveMomentReq,
      com.xhpolaris.idlgen.meowchat.content.RetrieveMomentResp> getRetrieveMomentMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.RetrieveMomentReq, com.xhpolaris.idlgen.meowchat.content.RetrieveMomentResp> getRetrieveMomentMethod;
    if ((getRetrieveMomentMethod = ContentServiceGrpc.getRetrieveMomentMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getRetrieveMomentMethod = ContentServiceGrpc.getRetrieveMomentMethod) == null) {
          ContentServiceGrpc.getRetrieveMomentMethod = getRetrieveMomentMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.RetrieveMomentReq, com.xhpolaris.idlgen.meowchat.content.RetrieveMomentResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetrieveMoment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.RetrieveMomentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.RetrieveMomentResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("RetrieveMoment"))
              .build();
        }
      }
    }
    return getRetrieveMomentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CreateMomentReq,
      com.xhpolaris.idlgen.meowchat.content.CreateMomentResp> getCreateMomentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMoment",
      requestType = com.xhpolaris.idlgen.meowchat.content.CreateMomentReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.CreateMomentResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CreateMomentReq,
      com.xhpolaris.idlgen.meowchat.content.CreateMomentResp> getCreateMomentMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CreateMomentReq, com.xhpolaris.idlgen.meowchat.content.CreateMomentResp> getCreateMomentMethod;
    if ((getCreateMomentMethod = ContentServiceGrpc.getCreateMomentMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getCreateMomentMethod = ContentServiceGrpc.getCreateMomentMethod) == null) {
          ContentServiceGrpc.getCreateMomentMethod = getCreateMomentMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.CreateMomentReq, com.xhpolaris.idlgen.meowchat.content.CreateMomentResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMoment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.CreateMomentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.CreateMomentResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("CreateMoment"))
              .build();
        }
      }
    }
    return getCreateMomentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.UpdateMomentReq,
      com.xhpolaris.idlgen.meowchat.content.UpdateMomentResp> getUpdateMomentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMoment",
      requestType = com.xhpolaris.idlgen.meowchat.content.UpdateMomentReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.UpdateMomentResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.UpdateMomentReq,
      com.xhpolaris.idlgen.meowchat.content.UpdateMomentResp> getUpdateMomentMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.UpdateMomentReq, com.xhpolaris.idlgen.meowchat.content.UpdateMomentResp> getUpdateMomentMethod;
    if ((getUpdateMomentMethod = ContentServiceGrpc.getUpdateMomentMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getUpdateMomentMethod = ContentServiceGrpc.getUpdateMomentMethod) == null) {
          ContentServiceGrpc.getUpdateMomentMethod = getUpdateMomentMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.UpdateMomentReq, com.xhpolaris.idlgen.meowchat.content.UpdateMomentResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMoment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.UpdateMomentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.UpdateMomentResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("UpdateMoment"))
              .build();
        }
      }
    }
    return getUpdateMomentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.DeleteMomentReq,
      com.xhpolaris.idlgen.meowchat.content.DeleteMomentResp> getDeleteMomentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMoment",
      requestType = com.xhpolaris.idlgen.meowchat.content.DeleteMomentReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.DeleteMomentResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.DeleteMomentReq,
      com.xhpolaris.idlgen.meowchat.content.DeleteMomentResp> getDeleteMomentMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.DeleteMomentReq, com.xhpolaris.idlgen.meowchat.content.DeleteMomentResp> getDeleteMomentMethod;
    if ((getDeleteMomentMethod = ContentServiceGrpc.getDeleteMomentMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getDeleteMomentMethod = ContentServiceGrpc.getDeleteMomentMethod) == null) {
          ContentServiceGrpc.getDeleteMomentMethod = getDeleteMomentMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.DeleteMomentReq, com.xhpolaris.idlgen.meowchat.content.DeleteMomentResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMoment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.DeleteMomentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.DeleteMomentResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("DeleteMoment"))
              .build();
        }
      }
    }
    return getDeleteMomentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CreatePostReq,
      com.xhpolaris.idlgen.meowchat.content.CreatePostResp> getCreatePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePost",
      requestType = com.xhpolaris.idlgen.meowchat.content.CreatePostReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.CreatePostResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CreatePostReq,
      com.xhpolaris.idlgen.meowchat.content.CreatePostResp> getCreatePostMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CreatePostReq, com.xhpolaris.idlgen.meowchat.content.CreatePostResp> getCreatePostMethod;
    if ((getCreatePostMethod = ContentServiceGrpc.getCreatePostMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getCreatePostMethod = ContentServiceGrpc.getCreatePostMethod) == null) {
          ContentServiceGrpc.getCreatePostMethod = getCreatePostMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.CreatePostReq, com.xhpolaris.idlgen.meowchat.content.CreatePostResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.CreatePostReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.CreatePostResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("CreatePost"))
              .build();
        }
      }
    }
    return getCreatePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.RetrievePostReq,
      com.xhpolaris.idlgen.meowchat.content.RetrievePostResp> getRetrievePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrievePost",
      requestType = com.xhpolaris.idlgen.meowchat.content.RetrievePostReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.RetrievePostResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.RetrievePostReq,
      com.xhpolaris.idlgen.meowchat.content.RetrievePostResp> getRetrievePostMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.RetrievePostReq, com.xhpolaris.idlgen.meowchat.content.RetrievePostResp> getRetrievePostMethod;
    if ((getRetrievePostMethod = ContentServiceGrpc.getRetrievePostMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getRetrievePostMethod = ContentServiceGrpc.getRetrievePostMethod) == null) {
          ContentServiceGrpc.getRetrievePostMethod = getRetrievePostMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.RetrievePostReq, com.xhpolaris.idlgen.meowchat.content.RetrievePostResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetrievePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.RetrievePostReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.RetrievePostResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("RetrievePost"))
              .build();
        }
      }
    }
    return getRetrievePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.UpdatePostReq,
      com.xhpolaris.idlgen.meowchat.content.UpdatePostResp> getUpdatePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePost",
      requestType = com.xhpolaris.idlgen.meowchat.content.UpdatePostReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.UpdatePostResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.UpdatePostReq,
      com.xhpolaris.idlgen.meowchat.content.UpdatePostResp> getUpdatePostMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.UpdatePostReq, com.xhpolaris.idlgen.meowchat.content.UpdatePostResp> getUpdatePostMethod;
    if ((getUpdatePostMethod = ContentServiceGrpc.getUpdatePostMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getUpdatePostMethod = ContentServiceGrpc.getUpdatePostMethod) == null) {
          ContentServiceGrpc.getUpdatePostMethod = getUpdatePostMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.UpdatePostReq, com.xhpolaris.idlgen.meowchat.content.UpdatePostResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.UpdatePostReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.UpdatePostResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("UpdatePost"))
              .build();
        }
      }
    }
    return getUpdatePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.DeletePostReq,
      com.xhpolaris.idlgen.meowchat.content.DeletePostResp> getDeletePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePost",
      requestType = com.xhpolaris.idlgen.meowchat.content.DeletePostReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.DeletePostResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.DeletePostReq,
      com.xhpolaris.idlgen.meowchat.content.DeletePostResp> getDeletePostMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.DeletePostReq, com.xhpolaris.idlgen.meowchat.content.DeletePostResp> getDeletePostMethod;
    if ((getDeletePostMethod = ContentServiceGrpc.getDeletePostMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getDeletePostMethod = ContentServiceGrpc.getDeletePostMethod) == null) {
          ContentServiceGrpc.getDeletePostMethod = getDeletePostMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.DeletePostReq, com.xhpolaris.idlgen.meowchat.content.DeletePostResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.DeletePostReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.DeletePostResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("DeletePost"))
              .build();
        }
      }
    }
    return getDeletePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.ListPostReq,
      com.xhpolaris.idlgen.meowchat.content.ListPostResp> getListPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPost",
      requestType = com.xhpolaris.idlgen.meowchat.content.ListPostReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.ListPostResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.ListPostReq,
      com.xhpolaris.idlgen.meowchat.content.ListPostResp> getListPostMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.ListPostReq, com.xhpolaris.idlgen.meowchat.content.ListPostResp> getListPostMethod;
    if ((getListPostMethod = ContentServiceGrpc.getListPostMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getListPostMethod = ContentServiceGrpc.getListPostMethod) == null) {
          ContentServiceGrpc.getListPostMethod = getListPostMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.ListPostReq, com.xhpolaris.idlgen.meowchat.content.ListPostResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.ListPostReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.ListPostResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("ListPost"))
              .build();
        }
      }
    }
    return getListPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CountPostReq,
      com.xhpolaris.idlgen.meowchat.content.CountPostResp> getCountPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CountPost",
      requestType = com.xhpolaris.idlgen.meowchat.content.CountPostReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.CountPostResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CountPostReq,
      com.xhpolaris.idlgen.meowchat.content.CountPostResp> getCountPostMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CountPostReq, com.xhpolaris.idlgen.meowchat.content.CountPostResp> getCountPostMethod;
    if ((getCountPostMethod = ContentServiceGrpc.getCountPostMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getCountPostMethod = ContentServiceGrpc.getCountPostMethod) == null) {
          ContentServiceGrpc.getCountPostMethod = getCountPostMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.CountPostReq, com.xhpolaris.idlgen.meowchat.content.CountPostResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CountPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.CountPostReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.CountPostResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("CountPost"))
              .build();
        }
      }
    }
    return getCountPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.SetOfficialReq,
      com.xhpolaris.idlgen.meowchat.content.SetOfficialResp> getSetOfficialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetOfficial",
      requestType = com.xhpolaris.idlgen.meowchat.content.SetOfficialReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.SetOfficialResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.SetOfficialReq,
      com.xhpolaris.idlgen.meowchat.content.SetOfficialResp> getSetOfficialMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.SetOfficialReq, com.xhpolaris.idlgen.meowchat.content.SetOfficialResp> getSetOfficialMethod;
    if ((getSetOfficialMethod = ContentServiceGrpc.getSetOfficialMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getSetOfficialMethod = ContentServiceGrpc.getSetOfficialMethod) == null) {
          ContentServiceGrpc.getSetOfficialMethod = getSetOfficialMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.SetOfficialReq, com.xhpolaris.idlgen.meowchat.content.SetOfficialResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetOfficial"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.SetOfficialReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.SetOfficialResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("SetOfficial"))
              .build();
        }
      }
    }
    return getSetOfficialMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.ListPlanReq,
      com.xhpolaris.idlgen.meowchat.content.ListPlanResp> getListPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPlan",
      requestType = com.xhpolaris.idlgen.meowchat.content.ListPlanReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.ListPlanResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.ListPlanReq,
      com.xhpolaris.idlgen.meowchat.content.ListPlanResp> getListPlanMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.ListPlanReq, com.xhpolaris.idlgen.meowchat.content.ListPlanResp> getListPlanMethod;
    if ((getListPlanMethod = ContentServiceGrpc.getListPlanMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getListPlanMethod = ContentServiceGrpc.getListPlanMethod) == null) {
          ContentServiceGrpc.getListPlanMethod = getListPlanMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.ListPlanReq, com.xhpolaris.idlgen.meowchat.content.ListPlanResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.ListPlanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.ListPlanResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("ListPlan"))
              .build();
        }
      }
    }
    return getListPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CountPlanReq,
      com.xhpolaris.idlgen.meowchat.content.CountPlanResp> getCountPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CountPlan",
      requestType = com.xhpolaris.idlgen.meowchat.content.CountPlanReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.CountPlanResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CountPlanReq,
      com.xhpolaris.idlgen.meowchat.content.CountPlanResp> getCountPlanMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CountPlanReq, com.xhpolaris.idlgen.meowchat.content.CountPlanResp> getCountPlanMethod;
    if ((getCountPlanMethod = ContentServiceGrpc.getCountPlanMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getCountPlanMethod = ContentServiceGrpc.getCountPlanMethod) == null) {
          ContentServiceGrpc.getCountPlanMethod = getCountPlanMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.CountPlanReq, com.xhpolaris.idlgen.meowchat.content.CountPlanResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CountPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.CountPlanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.CountPlanResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("CountPlan"))
              .build();
        }
      }
    }
    return getCountPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.RetrievePlanReq,
      com.xhpolaris.idlgen.meowchat.content.RetrievePlanResp> getRetrievePlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrievePlan",
      requestType = com.xhpolaris.idlgen.meowchat.content.RetrievePlanReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.RetrievePlanResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.RetrievePlanReq,
      com.xhpolaris.idlgen.meowchat.content.RetrievePlanResp> getRetrievePlanMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.RetrievePlanReq, com.xhpolaris.idlgen.meowchat.content.RetrievePlanResp> getRetrievePlanMethod;
    if ((getRetrievePlanMethod = ContentServiceGrpc.getRetrievePlanMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getRetrievePlanMethod = ContentServiceGrpc.getRetrievePlanMethod) == null) {
          ContentServiceGrpc.getRetrievePlanMethod = getRetrievePlanMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.RetrievePlanReq, com.xhpolaris.idlgen.meowchat.content.RetrievePlanResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetrievePlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.RetrievePlanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.RetrievePlanResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("RetrievePlan"))
              .build();
        }
      }
    }
    return getRetrievePlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CreatePlanReq,
      com.xhpolaris.idlgen.meowchat.content.CreatePlanResp> getCreatePlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePlan",
      requestType = com.xhpolaris.idlgen.meowchat.content.CreatePlanReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.CreatePlanResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CreatePlanReq,
      com.xhpolaris.idlgen.meowchat.content.CreatePlanResp> getCreatePlanMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.CreatePlanReq, com.xhpolaris.idlgen.meowchat.content.CreatePlanResp> getCreatePlanMethod;
    if ((getCreatePlanMethod = ContentServiceGrpc.getCreatePlanMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getCreatePlanMethod = ContentServiceGrpc.getCreatePlanMethod) == null) {
          ContentServiceGrpc.getCreatePlanMethod = getCreatePlanMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.CreatePlanReq, com.xhpolaris.idlgen.meowchat.content.CreatePlanResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.CreatePlanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.CreatePlanResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("CreatePlan"))
              .build();
        }
      }
    }
    return getCreatePlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.UpdatePlanReq,
      com.xhpolaris.idlgen.meowchat.content.UpdatePlanResp> getUpdatePlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePlan",
      requestType = com.xhpolaris.idlgen.meowchat.content.UpdatePlanReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.UpdatePlanResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.UpdatePlanReq,
      com.xhpolaris.idlgen.meowchat.content.UpdatePlanResp> getUpdatePlanMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.UpdatePlanReq, com.xhpolaris.idlgen.meowchat.content.UpdatePlanResp> getUpdatePlanMethod;
    if ((getUpdatePlanMethod = ContentServiceGrpc.getUpdatePlanMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getUpdatePlanMethod = ContentServiceGrpc.getUpdatePlanMethod) == null) {
          ContentServiceGrpc.getUpdatePlanMethod = getUpdatePlanMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.UpdatePlanReq, com.xhpolaris.idlgen.meowchat.content.UpdatePlanResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.UpdatePlanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.UpdatePlanResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("UpdatePlan"))
              .build();
        }
      }
    }
    return getUpdatePlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.DeletePlanReq,
      com.xhpolaris.idlgen.meowchat.content.DeletePlanResp> getDeletePlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePlan",
      requestType = com.xhpolaris.idlgen.meowchat.content.DeletePlanReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.DeletePlanResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.DeletePlanReq,
      com.xhpolaris.idlgen.meowchat.content.DeletePlanResp> getDeletePlanMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.DeletePlanReq, com.xhpolaris.idlgen.meowchat.content.DeletePlanResp> getDeletePlanMethod;
    if ((getDeletePlanMethod = ContentServiceGrpc.getDeletePlanMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getDeletePlanMethod = ContentServiceGrpc.getDeletePlanMethod) == null) {
          ContentServiceGrpc.getDeletePlanMethod = getDeletePlanMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.DeletePlanReq, com.xhpolaris.idlgen.meowchat.content.DeletePlanResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.DeletePlanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.DeletePlanResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("DeletePlan"))
              .build();
        }
      }
    }
    return getDeletePlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.DonateFishReq,
      com.xhpolaris.idlgen.meowchat.content.DonateFishResp> getDonateFishMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DonateFish",
      requestType = com.xhpolaris.idlgen.meowchat.content.DonateFishReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.DonateFishResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.DonateFishReq,
      com.xhpolaris.idlgen.meowchat.content.DonateFishResp> getDonateFishMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.DonateFishReq, com.xhpolaris.idlgen.meowchat.content.DonateFishResp> getDonateFishMethod;
    if ((getDonateFishMethod = ContentServiceGrpc.getDonateFishMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getDonateFishMethod = ContentServiceGrpc.getDonateFishMethod) == null) {
          ContentServiceGrpc.getDonateFishMethod = getDonateFishMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.DonateFishReq, com.xhpolaris.idlgen.meowchat.content.DonateFishResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DonateFish"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.DonateFishReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.DonateFishResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("DonateFish"))
              .build();
        }
      }
    }
    return getDonateFishMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.AddUserFishReq,
      com.xhpolaris.idlgen.meowchat.content.AddUserFishResp> getAddUserFishMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserFish",
      requestType = com.xhpolaris.idlgen.meowchat.content.AddUserFishReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.AddUserFishResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.AddUserFishReq,
      com.xhpolaris.idlgen.meowchat.content.AddUserFishResp> getAddUserFishMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.AddUserFishReq, com.xhpolaris.idlgen.meowchat.content.AddUserFishResp> getAddUserFishMethod;
    if ((getAddUserFishMethod = ContentServiceGrpc.getAddUserFishMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getAddUserFishMethod = ContentServiceGrpc.getAddUserFishMethod) == null) {
          ContentServiceGrpc.getAddUserFishMethod = getAddUserFishMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.AddUserFishReq, com.xhpolaris.idlgen.meowchat.content.AddUserFishResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserFish"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.AddUserFishReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.AddUserFishResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("AddUserFish"))
              .build();
        }
      }
    }
    return getAddUserFishMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.ListFishByPlanReq,
      com.xhpolaris.idlgen.meowchat.content.ListFishByPlanResp> getListFishByPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFishByPlan",
      requestType = com.xhpolaris.idlgen.meowchat.content.ListFishByPlanReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.ListFishByPlanResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.ListFishByPlanReq,
      com.xhpolaris.idlgen.meowchat.content.ListFishByPlanResp> getListFishByPlanMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.ListFishByPlanReq, com.xhpolaris.idlgen.meowchat.content.ListFishByPlanResp> getListFishByPlanMethod;
    if ((getListFishByPlanMethod = ContentServiceGrpc.getListFishByPlanMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getListFishByPlanMethod = ContentServiceGrpc.getListFishByPlanMethod) == null) {
          ContentServiceGrpc.getListFishByPlanMethod = getListFishByPlanMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.ListFishByPlanReq, com.xhpolaris.idlgen.meowchat.content.ListFishByPlanResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFishByPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.ListFishByPlanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.ListFishByPlanResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("ListFishByPlan"))
              .build();
        }
      }
    }
    return getListFishByPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishReq,
      com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishResp> getRetrieveUserFishMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrieveUserFish",
      requestType = com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishReq.class,
      responseType = com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishReq,
      com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishResp> getRetrieveUserFishMethod() {
    io.grpc.MethodDescriptor<com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishReq, com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishResp> getRetrieveUserFishMethod;
    if ((getRetrieveUserFishMethod = ContentServiceGrpc.getRetrieveUserFishMethod) == null) {
      synchronized (ContentServiceGrpc.class) {
        if ((getRetrieveUserFishMethod = ContentServiceGrpc.getRetrieveUserFishMethod) == null) {
          ContentServiceGrpc.getRetrieveUserFishMethod = getRetrieveUserFishMethod =
              io.grpc.MethodDescriptor.<com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishReq, com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetrieveUserFish"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishResp.getDefaultInstance()))
              .setSchemaDescriptor(new ContentServiceMethodDescriptorSupplier("RetrieveUserFish"))
              .build();
        }
      }
    }
    return getRetrieveUserFishMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContentServiceStub>() {
        @java.lang.Override
        public ContentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContentServiceStub(channel, callOptions);
        }
      };
    return ContentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContentServiceBlockingStub>() {
        @java.lang.Override
        public ContentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContentServiceBlockingStub(channel, callOptions);
        }
      };
    return ContentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContentServiceFutureStub>() {
        @java.lang.Override
        public ContentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContentServiceFutureStub(channel, callOptions);
        }
      };
    return ContentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ContentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void searchCat(com.xhpolaris.idlgen.meowchat.content.SearchCatReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.SearchCatResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchCatMethod(), responseObserver);
    }

    /**
     */
    public void listCat(com.xhpolaris.idlgen.meowchat.content.ListCatReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.ListCatResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCatMethod(), responseObserver);
    }

    /**
     */
    public void retrieveCat(com.xhpolaris.idlgen.meowchat.content.RetrieveCatReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.RetrieveCatResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveCatMethod(), responseObserver);
    }

    /**
     */
    public void createCat(com.xhpolaris.idlgen.meowchat.content.CreateCatReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CreateCatResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCatMethod(), responseObserver);
    }

    /**
     */
    public void updateCat(com.xhpolaris.idlgen.meowchat.content.UpdateCatReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.UpdateCatResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCatMethod(), responseObserver);
    }

    /**
     */
    public void deleteCat(com.xhpolaris.idlgen.meowchat.content.DeleteCatReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.DeleteCatResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCatMethod(), responseObserver);
    }

    /**
     */
    public void createImage(com.xhpolaris.idlgen.meowchat.content.CreateImageReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CreateImageResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateImageMethod(), responseObserver);
    }

    /**
     */
    public void deleteImage(com.xhpolaris.idlgen.meowchat.content.DeleteImageReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.DeleteImageResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteImageMethod(), responseObserver);
    }

    /**
     */
    public void listImage(com.xhpolaris.idlgen.meowchat.content.ListImageReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.ListImageResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListImageMethod(), responseObserver);
    }

    /**
     */
    public void listMoment(com.xhpolaris.idlgen.meowchat.content.ListMomentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.ListMomentResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMomentMethod(), responseObserver);
    }

    /**
     */
    public void countMoment(com.xhpolaris.idlgen.meowchat.content.CountMomentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CountMomentResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMomentMethod(), responseObserver);
    }

    /**
     */
    public void retrieveMoment(com.xhpolaris.idlgen.meowchat.content.RetrieveMomentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.RetrieveMomentResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveMomentMethod(), responseObserver);
    }

    /**
     */
    public void createMoment(com.xhpolaris.idlgen.meowchat.content.CreateMomentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CreateMomentResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMomentMethod(), responseObserver);
    }

    /**
     */
    public void updateMoment(com.xhpolaris.idlgen.meowchat.content.UpdateMomentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.UpdateMomentResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMomentMethod(), responseObserver);
    }

    /**
     */
    public void deleteMoment(com.xhpolaris.idlgen.meowchat.content.DeleteMomentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.DeleteMomentResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMomentMethod(), responseObserver);
    }

    /**
     */
    public void createPost(com.xhpolaris.idlgen.meowchat.content.CreatePostReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CreatePostResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePostMethod(), responseObserver);
    }

    /**
     */
    public void retrievePost(com.xhpolaris.idlgen.meowchat.content.RetrievePostReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.RetrievePostResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrievePostMethod(), responseObserver);
    }

    /**
     */
    public void updatePost(com.xhpolaris.idlgen.meowchat.content.UpdatePostReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.UpdatePostResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePostMethod(), responseObserver);
    }

    /**
     */
    public void deletePost(com.xhpolaris.idlgen.meowchat.content.DeletePostReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.DeletePostResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePostMethod(), responseObserver);
    }

    /**
     */
    public void listPost(com.xhpolaris.idlgen.meowchat.content.ListPostReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.ListPostResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPostMethod(), responseObserver);
    }

    /**
     */
    public void countPost(com.xhpolaris.idlgen.meowchat.content.CountPostReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CountPostResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountPostMethod(), responseObserver);
    }

    /**
     */
    public void setOfficial(com.xhpolaris.idlgen.meowchat.content.SetOfficialReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.SetOfficialResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetOfficialMethod(), responseObserver);
    }

    /**
     */
    public void listPlan(com.xhpolaris.idlgen.meowchat.content.ListPlanReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.ListPlanResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPlanMethod(), responseObserver);
    }

    /**
     */
    public void countPlan(com.xhpolaris.idlgen.meowchat.content.CountPlanReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CountPlanResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountPlanMethod(), responseObserver);
    }

    /**
     */
    public void retrievePlan(com.xhpolaris.idlgen.meowchat.content.RetrievePlanReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.RetrievePlanResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrievePlanMethod(), responseObserver);
    }

    /**
     */
    public void createPlan(com.xhpolaris.idlgen.meowchat.content.CreatePlanReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CreatePlanResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePlanMethod(), responseObserver);
    }

    /**
     */
    public void updatePlan(com.xhpolaris.idlgen.meowchat.content.UpdatePlanReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.UpdatePlanResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePlanMethod(), responseObserver);
    }

    /**
     */
    public void deletePlan(com.xhpolaris.idlgen.meowchat.content.DeletePlanReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.DeletePlanResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePlanMethod(), responseObserver);
    }

    /**
     */
    public void donateFish(com.xhpolaris.idlgen.meowchat.content.DonateFishReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.DonateFishResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDonateFishMethod(), responseObserver);
    }

    /**
     */
    public void addUserFish(com.xhpolaris.idlgen.meowchat.content.AddUserFishReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.AddUserFishResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserFishMethod(), responseObserver);
    }

    /**
     */
    public void listFishByPlan(com.xhpolaris.idlgen.meowchat.content.ListFishByPlanReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.ListFishByPlanResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFishByPlanMethod(), responseObserver);
    }

    /**
     */
    public void retrieveUserFish(com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveUserFishMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchCatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.SearchCatReq,
                com.xhpolaris.idlgen.meowchat.content.SearchCatResp>(
                  this, METHODID_SEARCH_CAT)))
          .addMethod(
            getListCatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.ListCatReq,
                com.xhpolaris.idlgen.meowchat.content.ListCatResp>(
                  this, METHODID_LIST_CAT)))
          .addMethod(
            getRetrieveCatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.RetrieveCatReq,
                com.xhpolaris.idlgen.meowchat.content.RetrieveCatResp>(
                  this, METHODID_RETRIEVE_CAT)))
          .addMethod(
            getCreateCatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.CreateCatReq,
                com.xhpolaris.idlgen.meowchat.content.CreateCatResp>(
                  this, METHODID_CREATE_CAT)))
          .addMethod(
            getUpdateCatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.UpdateCatReq,
                com.xhpolaris.idlgen.meowchat.content.UpdateCatResp>(
                  this, METHODID_UPDATE_CAT)))
          .addMethod(
            getDeleteCatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.DeleteCatReq,
                com.xhpolaris.idlgen.meowchat.content.DeleteCatResp>(
                  this, METHODID_DELETE_CAT)))
          .addMethod(
            getCreateImageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.CreateImageReq,
                com.xhpolaris.idlgen.meowchat.content.CreateImageResp>(
                  this, METHODID_CREATE_IMAGE)))
          .addMethod(
            getDeleteImageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.DeleteImageReq,
                com.xhpolaris.idlgen.meowchat.content.DeleteImageResp>(
                  this, METHODID_DELETE_IMAGE)))
          .addMethod(
            getListImageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.ListImageReq,
                com.xhpolaris.idlgen.meowchat.content.ListImageResp>(
                  this, METHODID_LIST_IMAGE)))
          .addMethod(
            getListMomentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.ListMomentReq,
                com.xhpolaris.idlgen.meowchat.content.ListMomentResp>(
                  this, METHODID_LIST_MOMENT)))
          .addMethod(
            getCountMomentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.CountMomentReq,
                com.xhpolaris.idlgen.meowchat.content.CountMomentResp>(
                  this, METHODID_COUNT_MOMENT)))
          .addMethod(
            getRetrieveMomentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.RetrieveMomentReq,
                com.xhpolaris.idlgen.meowchat.content.RetrieveMomentResp>(
                  this, METHODID_RETRIEVE_MOMENT)))
          .addMethod(
            getCreateMomentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.CreateMomentReq,
                com.xhpolaris.idlgen.meowchat.content.CreateMomentResp>(
                  this, METHODID_CREATE_MOMENT)))
          .addMethod(
            getUpdateMomentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.UpdateMomentReq,
                com.xhpolaris.idlgen.meowchat.content.UpdateMomentResp>(
                  this, METHODID_UPDATE_MOMENT)))
          .addMethod(
            getDeleteMomentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.DeleteMomentReq,
                com.xhpolaris.idlgen.meowchat.content.DeleteMomentResp>(
                  this, METHODID_DELETE_MOMENT)))
          .addMethod(
            getCreatePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.CreatePostReq,
                com.xhpolaris.idlgen.meowchat.content.CreatePostResp>(
                  this, METHODID_CREATE_POST)))
          .addMethod(
            getRetrievePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.RetrievePostReq,
                com.xhpolaris.idlgen.meowchat.content.RetrievePostResp>(
                  this, METHODID_RETRIEVE_POST)))
          .addMethod(
            getUpdatePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.UpdatePostReq,
                com.xhpolaris.idlgen.meowchat.content.UpdatePostResp>(
                  this, METHODID_UPDATE_POST)))
          .addMethod(
            getDeletePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.DeletePostReq,
                com.xhpolaris.idlgen.meowchat.content.DeletePostResp>(
                  this, METHODID_DELETE_POST)))
          .addMethod(
            getListPostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.ListPostReq,
                com.xhpolaris.idlgen.meowchat.content.ListPostResp>(
                  this, METHODID_LIST_POST)))
          .addMethod(
            getCountPostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.CountPostReq,
                com.xhpolaris.idlgen.meowchat.content.CountPostResp>(
                  this, METHODID_COUNT_POST)))
          .addMethod(
            getSetOfficialMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.SetOfficialReq,
                com.xhpolaris.idlgen.meowchat.content.SetOfficialResp>(
                  this, METHODID_SET_OFFICIAL)))
          .addMethod(
            getListPlanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.ListPlanReq,
                com.xhpolaris.idlgen.meowchat.content.ListPlanResp>(
                  this, METHODID_LIST_PLAN)))
          .addMethod(
            getCountPlanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.CountPlanReq,
                com.xhpolaris.idlgen.meowchat.content.CountPlanResp>(
                  this, METHODID_COUNT_PLAN)))
          .addMethod(
            getRetrievePlanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.RetrievePlanReq,
                com.xhpolaris.idlgen.meowchat.content.RetrievePlanResp>(
                  this, METHODID_RETRIEVE_PLAN)))
          .addMethod(
            getCreatePlanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.CreatePlanReq,
                com.xhpolaris.idlgen.meowchat.content.CreatePlanResp>(
                  this, METHODID_CREATE_PLAN)))
          .addMethod(
            getUpdatePlanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.UpdatePlanReq,
                com.xhpolaris.idlgen.meowchat.content.UpdatePlanResp>(
                  this, METHODID_UPDATE_PLAN)))
          .addMethod(
            getDeletePlanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.DeletePlanReq,
                com.xhpolaris.idlgen.meowchat.content.DeletePlanResp>(
                  this, METHODID_DELETE_PLAN)))
          .addMethod(
            getDonateFishMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.DonateFishReq,
                com.xhpolaris.idlgen.meowchat.content.DonateFishResp>(
                  this, METHODID_DONATE_FISH)))
          .addMethod(
            getAddUserFishMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.AddUserFishReq,
                com.xhpolaris.idlgen.meowchat.content.AddUserFishResp>(
                  this, METHODID_ADD_USER_FISH)))
          .addMethod(
            getListFishByPlanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.ListFishByPlanReq,
                com.xhpolaris.idlgen.meowchat.content.ListFishByPlanResp>(
                  this, METHODID_LIST_FISH_BY_PLAN)))
          .addMethod(
            getRetrieveUserFishMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishReq,
                com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishResp>(
                  this, METHODID_RETRIEVE_USER_FISH)))
          .build();
    }
  }

  /**
   */
  public static final class ContentServiceStub extends io.grpc.stub.AbstractAsyncStub<ContentServiceStub> {
    private ContentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContentServiceStub(channel, callOptions);
    }

    /**
     */
    public void searchCat(com.xhpolaris.idlgen.meowchat.content.SearchCatReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.SearchCatResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchCatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCat(com.xhpolaris.idlgen.meowchat.content.ListCatReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.ListCatResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrieveCat(com.xhpolaris.idlgen.meowchat.content.RetrieveCatReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.RetrieveCatResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveCatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCat(com.xhpolaris.idlgen.meowchat.content.CreateCatReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CreateCatResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCat(com.xhpolaris.idlgen.meowchat.content.UpdateCatReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.UpdateCatResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCat(com.xhpolaris.idlgen.meowchat.content.DeleteCatReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.DeleteCatResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createImage(com.xhpolaris.idlgen.meowchat.content.CreateImageReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CreateImageResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteImage(com.xhpolaris.idlgen.meowchat.content.DeleteImageReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.DeleteImageResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listImage(com.xhpolaris.idlgen.meowchat.content.ListImageReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.ListImageResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listMoment(com.xhpolaris.idlgen.meowchat.content.ListMomentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.ListMomentResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMomentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countMoment(com.xhpolaris.idlgen.meowchat.content.CountMomentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CountMomentResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountMomentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrieveMoment(com.xhpolaris.idlgen.meowchat.content.RetrieveMomentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.RetrieveMomentResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveMomentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createMoment(com.xhpolaris.idlgen.meowchat.content.CreateMomentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CreateMomentResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMomentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMoment(com.xhpolaris.idlgen.meowchat.content.UpdateMomentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.UpdateMomentResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMomentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMoment(com.xhpolaris.idlgen.meowchat.content.DeleteMomentReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.DeleteMomentResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMomentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPost(com.xhpolaris.idlgen.meowchat.content.CreatePostReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CreatePostResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrievePost(com.xhpolaris.idlgen.meowchat.content.RetrievePostReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.RetrievePostResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrievePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePost(com.xhpolaris.idlgen.meowchat.content.UpdatePostReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.UpdatePostResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePost(com.xhpolaris.idlgen.meowchat.content.DeletePostReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.DeletePostResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPost(com.xhpolaris.idlgen.meowchat.content.ListPostReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.ListPostResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countPost(com.xhpolaris.idlgen.meowchat.content.CountPostReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CountPostResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setOfficial(com.xhpolaris.idlgen.meowchat.content.SetOfficialReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.SetOfficialResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetOfficialMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPlan(com.xhpolaris.idlgen.meowchat.content.ListPlanReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.ListPlanResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countPlan(com.xhpolaris.idlgen.meowchat.content.CountPlanReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CountPlanResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrievePlan(com.xhpolaris.idlgen.meowchat.content.RetrievePlanReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.RetrievePlanResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrievePlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPlan(com.xhpolaris.idlgen.meowchat.content.CreatePlanReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CreatePlanResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePlan(com.xhpolaris.idlgen.meowchat.content.UpdatePlanReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.UpdatePlanResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePlan(com.xhpolaris.idlgen.meowchat.content.DeletePlanReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.DeletePlanResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void donateFish(com.xhpolaris.idlgen.meowchat.content.DonateFishReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.DonateFishResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDonateFishMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addUserFish(com.xhpolaris.idlgen.meowchat.content.AddUserFishReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.AddUserFishResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUserFishMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listFishByPlan(com.xhpolaris.idlgen.meowchat.content.ListFishByPlanReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.ListFishByPlanResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFishByPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrieveUserFish(com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishReq request,
        io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveUserFishMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ContentServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ContentServiceBlockingStub> {
    private ContentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.SearchCatResp searchCat(com.xhpolaris.idlgen.meowchat.content.SearchCatReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchCatMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.ListCatResp listCat(com.xhpolaris.idlgen.meowchat.content.ListCatReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCatMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.RetrieveCatResp retrieveCat(com.xhpolaris.idlgen.meowchat.content.RetrieveCatReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveCatMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.CreateCatResp createCat(com.xhpolaris.idlgen.meowchat.content.CreateCatReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCatMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.UpdateCatResp updateCat(com.xhpolaris.idlgen.meowchat.content.UpdateCatReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCatMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.DeleteCatResp deleteCat(com.xhpolaris.idlgen.meowchat.content.DeleteCatReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCatMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.CreateImageResp createImage(com.xhpolaris.idlgen.meowchat.content.CreateImageReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateImageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.DeleteImageResp deleteImage(com.xhpolaris.idlgen.meowchat.content.DeleteImageReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteImageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.ListImageResp listImage(com.xhpolaris.idlgen.meowchat.content.ListImageReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListImageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.ListMomentResp listMoment(com.xhpolaris.idlgen.meowchat.content.ListMomentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMomentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.CountMomentResp countMoment(com.xhpolaris.idlgen.meowchat.content.CountMomentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMomentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.RetrieveMomentResp retrieveMoment(com.xhpolaris.idlgen.meowchat.content.RetrieveMomentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveMomentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.CreateMomentResp createMoment(com.xhpolaris.idlgen.meowchat.content.CreateMomentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMomentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.UpdateMomentResp updateMoment(com.xhpolaris.idlgen.meowchat.content.UpdateMomentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMomentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.DeleteMomentResp deleteMoment(com.xhpolaris.idlgen.meowchat.content.DeleteMomentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMomentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.CreatePostResp createPost(com.xhpolaris.idlgen.meowchat.content.CreatePostReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.RetrievePostResp retrievePost(com.xhpolaris.idlgen.meowchat.content.RetrievePostReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrievePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.UpdatePostResp updatePost(com.xhpolaris.idlgen.meowchat.content.UpdatePostReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.DeletePostResp deletePost(com.xhpolaris.idlgen.meowchat.content.DeletePostReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.ListPostResp listPost(com.xhpolaris.idlgen.meowchat.content.ListPostReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.CountPostResp countPost(com.xhpolaris.idlgen.meowchat.content.CountPostReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.SetOfficialResp setOfficial(com.xhpolaris.idlgen.meowchat.content.SetOfficialReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetOfficialMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.ListPlanResp listPlan(com.xhpolaris.idlgen.meowchat.content.ListPlanReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPlanMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.CountPlanResp countPlan(com.xhpolaris.idlgen.meowchat.content.CountPlanReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountPlanMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.RetrievePlanResp retrievePlan(com.xhpolaris.idlgen.meowchat.content.RetrievePlanReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrievePlanMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.CreatePlanResp createPlan(com.xhpolaris.idlgen.meowchat.content.CreatePlanReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePlanMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.UpdatePlanResp updatePlan(com.xhpolaris.idlgen.meowchat.content.UpdatePlanReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePlanMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.DeletePlanResp deletePlan(com.xhpolaris.idlgen.meowchat.content.DeletePlanReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePlanMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.DonateFishResp donateFish(com.xhpolaris.idlgen.meowchat.content.DonateFishReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDonateFishMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.AddUserFishResp addUserFish(com.xhpolaris.idlgen.meowchat.content.AddUserFishReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserFishMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.ListFishByPlanResp listFishByPlan(com.xhpolaris.idlgen.meowchat.content.ListFishByPlanReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFishByPlanMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishResp retrieveUserFish(com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveUserFishMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ContentServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ContentServiceFutureStub> {
    private ContentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.SearchCatResp> searchCat(
        com.xhpolaris.idlgen.meowchat.content.SearchCatReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchCatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.ListCatResp> listCat(
        com.xhpolaris.idlgen.meowchat.content.ListCatReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.RetrieveCatResp> retrieveCat(
        com.xhpolaris.idlgen.meowchat.content.RetrieveCatReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveCatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.CreateCatResp> createCat(
        com.xhpolaris.idlgen.meowchat.content.CreateCatReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.UpdateCatResp> updateCat(
        com.xhpolaris.idlgen.meowchat.content.UpdateCatReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.DeleteCatResp> deleteCat(
        com.xhpolaris.idlgen.meowchat.content.DeleteCatReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.CreateImageResp> createImage(
        com.xhpolaris.idlgen.meowchat.content.CreateImageReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateImageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.DeleteImageResp> deleteImage(
        com.xhpolaris.idlgen.meowchat.content.DeleteImageReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteImageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.ListImageResp> listImage(
        com.xhpolaris.idlgen.meowchat.content.ListImageReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListImageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.ListMomentResp> listMoment(
        com.xhpolaris.idlgen.meowchat.content.ListMomentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMomentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.CountMomentResp> countMoment(
        com.xhpolaris.idlgen.meowchat.content.CountMomentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountMomentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.RetrieveMomentResp> retrieveMoment(
        com.xhpolaris.idlgen.meowchat.content.RetrieveMomentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveMomentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.CreateMomentResp> createMoment(
        com.xhpolaris.idlgen.meowchat.content.CreateMomentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMomentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.UpdateMomentResp> updateMoment(
        com.xhpolaris.idlgen.meowchat.content.UpdateMomentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMomentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.DeleteMomentResp> deleteMoment(
        com.xhpolaris.idlgen.meowchat.content.DeleteMomentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMomentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.CreatePostResp> createPost(
        com.xhpolaris.idlgen.meowchat.content.CreatePostReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.RetrievePostResp> retrievePost(
        com.xhpolaris.idlgen.meowchat.content.RetrievePostReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrievePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.UpdatePostResp> updatePost(
        com.xhpolaris.idlgen.meowchat.content.UpdatePostReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.DeletePostResp> deletePost(
        com.xhpolaris.idlgen.meowchat.content.DeletePostReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.ListPostResp> listPost(
        com.xhpolaris.idlgen.meowchat.content.ListPostReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.CountPostResp> countPost(
        com.xhpolaris.idlgen.meowchat.content.CountPostReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountPostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.SetOfficialResp> setOfficial(
        com.xhpolaris.idlgen.meowchat.content.SetOfficialReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetOfficialMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.ListPlanResp> listPlan(
        com.xhpolaris.idlgen.meowchat.content.ListPlanReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPlanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.CountPlanResp> countPlan(
        com.xhpolaris.idlgen.meowchat.content.CountPlanReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountPlanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.RetrievePlanResp> retrievePlan(
        com.xhpolaris.idlgen.meowchat.content.RetrievePlanReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrievePlanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.CreatePlanResp> createPlan(
        com.xhpolaris.idlgen.meowchat.content.CreatePlanReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePlanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.UpdatePlanResp> updatePlan(
        com.xhpolaris.idlgen.meowchat.content.UpdatePlanReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePlanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.DeletePlanResp> deletePlan(
        com.xhpolaris.idlgen.meowchat.content.DeletePlanReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePlanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.DonateFishResp> donateFish(
        com.xhpolaris.idlgen.meowchat.content.DonateFishReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDonateFishMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.AddUserFishResp> addUserFish(
        com.xhpolaris.idlgen.meowchat.content.AddUserFishReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUserFishMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.ListFishByPlanResp> listFishByPlan(
        com.xhpolaris.idlgen.meowchat.content.ListFishByPlanReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFishByPlanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishResp> retrieveUserFish(
        com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveUserFishMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_CAT = 0;
  private static final int METHODID_LIST_CAT = 1;
  private static final int METHODID_RETRIEVE_CAT = 2;
  private static final int METHODID_CREATE_CAT = 3;
  private static final int METHODID_UPDATE_CAT = 4;
  private static final int METHODID_DELETE_CAT = 5;
  private static final int METHODID_CREATE_IMAGE = 6;
  private static final int METHODID_DELETE_IMAGE = 7;
  private static final int METHODID_LIST_IMAGE = 8;
  private static final int METHODID_LIST_MOMENT = 9;
  private static final int METHODID_COUNT_MOMENT = 10;
  private static final int METHODID_RETRIEVE_MOMENT = 11;
  private static final int METHODID_CREATE_MOMENT = 12;
  private static final int METHODID_UPDATE_MOMENT = 13;
  private static final int METHODID_DELETE_MOMENT = 14;
  private static final int METHODID_CREATE_POST = 15;
  private static final int METHODID_RETRIEVE_POST = 16;
  private static final int METHODID_UPDATE_POST = 17;
  private static final int METHODID_DELETE_POST = 18;
  private static final int METHODID_LIST_POST = 19;
  private static final int METHODID_COUNT_POST = 20;
  private static final int METHODID_SET_OFFICIAL = 21;
  private static final int METHODID_LIST_PLAN = 22;
  private static final int METHODID_COUNT_PLAN = 23;
  private static final int METHODID_RETRIEVE_PLAN = 24;
  private static final int METHODID_CREATE_PLAN = 25;
  private static final int METHODID_UPDATE_PLAN = 26;
  private static final int METHODID_DELETE_PLAN = 27;
  private static final int METHODID_DONATE_FISH = 28;
  private static final int METHODID_ADD_USER_FISH = 29;
  private static final int METHODID_LIST_FISH_BY_PLAN = 30;
  private static final int METHODID_RETRIEVE_USER_FISH = 31;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ContentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ContentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_CAT:
          serviceImpl.searchCat((com.xhpolaris.idlgen.meowchat.content.SearchCatReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.SearchCatResp>) responseObserver);
          break;
        case METHODID_LIST_CAT:
          serviceImpl.listCat((com.xhpolaris.idlgen.meowchat.content.ListCatReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.ListCatResp>) responseObserver);
          break;
        case METHODID_RETRIEVE_CAT:
          serviceImpl.retrieveCat((com.xhpolaris.idlgen.meowchat.content.RetrieveCatReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.RetrieveCatResp>) responseObserver);
          break;
        case METHODID_CREATE_CAT:
          serviceImpl.createCat((com.xhpolaris.idlgen.meowchat.content.CreateCatReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CreateCatResp>) responseObserver);
          break;
        case METHODID_UPDATE_CAT:
          serviceImpl.updateCat((com.xhpolaris.idlgen.meowchat.content.UpdateCatReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.UpdateCatResp>) responseObserver);
          break;
        case METHODID_DELETE_CAT:
          serviceImpl.deleteCat((com.xhpolaris.idlgen.meowchat.content.DeleteCatReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.DeleteCatResp>) responseObserver);
          break;
        case METHODID_CREATE_IMAGE:
          serviceImpl.createImage((com.xhpolaris.idlgen.meowchat.content.CreateImageReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CreateImageResp>) responseObserver);
          break;
        case METHODID_DELETE_IMAGE:
          serviceImpl.deleteImage((com.xhpolaris.idlgen.meowchat.content.DeleteImageReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.DeleteImageResp>) responseObserver);
          break;
        case METHODID_LIST_IMAGE:
          serviceImpl.listImage((com.xhpolaris.idlgen.meowchat.content.ListImageReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.ListImageResp>) responseObserver);
          break;
        case METHODID_LIST_MOMENT:
          serviceImpl.listMoment((com.xhpolaris.idlgen.meowchat.content.ListMomentReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.ListMomentResp>) responseObserver);
          break;
        case METHODID_COUNT_MOMENT:
          serviceImpl.countMoment((com.xhpolaris.idlgen.meowchat.content.CountMomentReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CountMomentResp>) responseObserver);
          break;
        case METHODID_RETRIEVE_MOMENT:
          serviceImpl.retrieveMoment((com.xhpolaris.idlgen.meowchat.content.RetrieveMomentReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.RetrieveMomentResp>) responseObserver);
          break;
        case METHODID_CREATE_MOMENT:
          serviceImpl.createMoment((com.xhpolaris.idlgen.meowchat.content.CreateMomentReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CreateMomentResp>) responseObserver);
          break;
        case METHODID_UPDATE_MOMENT:
          serviceImpl.updateMoment((com.xhpolaris.idlgen.meowchat.content.UpdateMomentReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.UpdateMomentResp>) responseObserver);
          break;
        case METHODID_DELETE_MOMENT:
          serviceImpl.deleteMoment((com.xhpolaris.idlgen.meowchat.content.DeleteMomentReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.DeleteMomentResp>) responseObserver);
          break;
        case METHODID_CREATE_POST:
          serviceImpl.createPost((com.xhpolaris.idlgen.meowchat.content.CreatePostReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CreatePostResp>) responseObserver);
          break;
        case METHODID_RETRIEVE_POST:
          serviceImpl.retrievePost((com.xhpolaris.idlgen.meowchat.content.RetrievePostReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.RetrievePostResp>) responseObserver);
          break;
        case METHODID_UPDATE_POST:
          serviceImpl.updatePost((com.xhpolaris.idlgen.meowchat.content.UpdatePostReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.UpdatePostResp>) responseObserver);
          break;
        case METHODID_DELETE_POST:
          serviceImpl.deletePost((com.xhpolaris.idlgen.meowchat.content.DeletePostReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.DeletePostResp>) responseObserver);
          break;
        case METHODID_LIST_POST:
          serviceImpl.listPost((com.xhpolaris.idlgen.meowchat.content.ListPostReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.ListPostResp>) responseObserver);
          break;
        case METHODID_COUNT_POST:
          serviceImpl.countPost((com.xhpolaris.idlgen.meowchat.content.CountPostReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CountPostResp>) responseObserver);
          break;
        case METHODID_SET_OFFICIAL:
          serviceImpl.setOfficial((com.xhpolaris.idlgen.meowchat.content.SetOfficialReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.SetOfficialResp>) responseObserver);
          break;
        case METHODID_LIST_PLAN:
          serviceImpl.listPlan((com.xhpolaris.idlgen.meowchat.content.ListPlanReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.ListPlanResp>) responseObserver);
          break;
        case METHODID_COUNT_PLAN:
          serviceImpl.countPlan((com.xhpolaris.idlgen.meowchat.content.CountPlanReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CountPlanResp>) responseObserver);
          break;
        case METHODID_RETRIEVE_PLAN:
          serviceImpl.retrievePlan((com.xhpolaris.idlgen.meowchat.content.RetrievePlanReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.RetrievePlanResp>) responseObserver);
          break;
        case METHODID_CREATE_PLAN:
          serviceImpl.createPlan((com.xhpolaris.idlgen.meowchat.content.CreatePlanReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.CreatePlanResp>) responseObserver);
          break;
        case METHODID_UPDATE_PLAN:
          serviceImpl.updatePlan((com.xhpolaris.idlgen.meowchat.content.UpdatePlanReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.UpdatePlanResp>) responseObserver);
          break;
        case METHODID_DELETE_PLAN:
          serviceImpl.deletePlan((com.xhpolaris.idlgen.meowchat.content.DeletePlanReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.DeletePlanResp>) responseObserver);
          break;
        case METHODID_DONATE_FISH:
          serviceImpl.donateFish((com.xhpolaris.idlgen.meowchat.content.DonateFishReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.DonateFishResp>) responseObserver);
          break;
        case METHODID_ADD_USER_FISH:
          serviceImpl.addUserFish((com.xhpolaris.idlgen.meowchat.content.AddUserFishReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.AddUserFishResp>) responseObserver);
          break;
        case METHODID_LIST_FISH_BY_PLAN:
          serviceImpl.listFishByPlan((com.xhpolaris.idlgen.meowchat.content.ListFishByPlanReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.ListFishByPlanResp>) responseObserver);
          break;
        case METHODID_RETRIEVE_USER_FISH:
          serviceImpl.retrieveUserFish((com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishReq) request,
              (io.grpc.stub.StreamObserver<com.xhpolaris.idlgen.meowchat.content.RetrieveUserFishResp>) responseObserver);
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

  private static abstract class ContentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xhpolaris.idlgen.meowchat.content.ContentProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ContentService");
    }
  }

  private static final class ContentServiceFileDescriptorSupplier
      extends ContentServiceBaseDescriptorSupplier {
    ContentServiceFileDescriptorSupplier() {}
  }

  private static final class ContentServiceMethodDescriptorSupplier
      extends ContentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ContentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ContentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContentServiceFileDescriptorSupplier())
              .addMethod(getSearchCatMethod())
              .addMethod(getListCatMethod())
              .addMethod(getRetrieveCatMethod())
              .addMethod(getCreateCatMethod())
              .addMethod(getUpdateCatMethod())
              .addMethod(getDeleteCatMethod())
              .addMethod(getCreateImageMethod())
              .addMethod(getDeleteImageMethod())
              .addMethod(getListImageMethod())
              .addMethod(getListMomentMethod())
              .addMethod(getCountMomentMethod())
              .addMethod(getRetrieveMomentMethod())
              .addMethod(getCreateMomentMethod())
              .addMethod(getUpdateMomentMethod())
              .addMethod(getDeleteMomentMethod())
              .addMethod(getCreatePostMethod())
              .addMethod(getRetrievePostMethod())
              .addMethod(getUpdatePostMethod())
              .addMethod(getDeletePostMethod())
              .addMethod(getListPostMethod())
              .addMethod(getCountPostMethod())
              .addMethod(getSetOfficialMethod())
              .addMethod(getListPlanMethod())
              .addMethod(getCountPlanMethod())
              .addMethod(getRetrievePlanMethod())
              .addMethod(getCreatePlanMethod())
              .addMethod(getUpdatePlanMethod())
              .addMethod(getDeletePlanMethod())
              .addMethod(getDonateFishMethod())
              .addMethod(getAddUserFishMethod())
              .addMethod(getListFishByPlanMethod())
              .addMethod(getRetrieveUserFishMethod())
              .build();
        }
      }
    }
    return result;
  }
}
