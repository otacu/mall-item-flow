package com.egoist.mall.grpc.generated.item.basic;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: item_basic_proto.proto")
public final class ItemBasicServiceGrpc {

  private ItemBasicServiceGrpc() {}

  public static final String SERVICE_NAME = "com.egoist.mall.grpc.generated.item.basic.ItemBasicService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdRequest,
      com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdResponse> getQuerySpuByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "querySpuById",
      requestType = com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdRequest.class,
      responseType = com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdRequest,
      com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdResponse> getQuerySpuByIdMethod() {
    io.grpc.MethodDescriptor<com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdRequest, com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdResponse> getQuerySpuByIdMethod;
    if ((getQuerySpuByIdMethod = ItemBasicServiceGrpc.getQuerySpuByIdMethod) == null) {
      synchronized (ItemBasicServiceGrpc.class) {
        if ((getQuerySpuByIdMethod = ItemBasicServiceGrpc.getQuerySpuByIdMethod) == null) {
          ItemBasicServiceGrpc.getQuerySpuByIdMethod = getQuerySpuByIdMethod = 
              io.grpc.MethodDescriptor.<com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdRequest, com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.egoist.mall.grpc.generated.item.basic.ItemBasicService", "querySpuById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemBasicServiceMethodDescriptorSupplier("querySpuById"))
                  .build();
          }
        }
     }
     return getQuerySpuByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ItemBasicServiceStub newStub(io.grpc.Channel channel) {
    return new ItemBasicServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ItemBasicServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ItemBasicServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ItemBasicServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ItemBasicServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ItemBasicServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void querySpuById(com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdRequest request,
        io.grpc.stub.StreamObserver<com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQuerySpuByIdMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQuerySpuByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdRequest,
                com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdResponse>(
                  this, METHODID_QUERY_SPU_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class ItemBasicServiceStub extends io.grpc.stub.AbstractStub<ItemBasicServiceStub> {
    private ItemBasicServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemBasicServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ItemBasicServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemBasicServiceStub(channel, callOptions);
    }

    /**
     */
    public void querySpuById(com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdRequest request,
        io.grpc.stub.StreamObserver<com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQuerySpuByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ItemBasicServiceBlockingStub extends io.grpc.stub.AbstractStub<ItemBasicServiceBlockingStub> {
    private ItemBasicServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemBasicServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ItemBasicServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemBasicServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdResponse querySpuById(com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getQuerySpuByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ItemBasicServiceFutureStub extends io.grpc.stub.AbstractStub<ItemBasicServiceFutureStub> {
    private ItemBasicServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemBasicServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ItemBasicServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemBasicServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdResponse> querySpuById(
        com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQuerySpuByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_SPU_BY_ID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ItemBasicServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ItemBasicServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY_SPU_BY_ID:
          serviceImpl.querySpuById((com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.QuerySpuByIdResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ItemBasicServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ItemBasicServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.egoist.mall.grpc.generated.item.basic.ItemBasicProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ItemBasicService");
    }
  }

  private static final class ItemBasicServiceFileDescriptorSupplier
      extends ItemBasicServiceBaseDescriptorSupplier {
    ItemBasicServiceFileDescriptorSupplier() {}
  }

  private static final class ItemBasicServiceMethodDescriptorSupplier
      extends ItemBasicServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ItemBasicServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ItemBasicServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ItemBasicServiceFileDescriptorSupplier())
              .addMethod(getQuerySpuByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
