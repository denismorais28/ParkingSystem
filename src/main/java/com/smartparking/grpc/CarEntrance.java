// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ParkingSystem.proto

package com.smartparking.grpc;

/**
 * Protobuf type {@code ParkingSystem.CarEntrance}
 */
public  final class CarEntrance extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ParkingSystem.CarEntrance)
    CarEntranceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CarEntrance.newBuilder() to construct.
  private CarEntrance(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CarEntrance() {
    licensePlate_ = "";
    checkin_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CarEntrance(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            licensePlate_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            checkin_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.smartparking.grpc.ParkingSystemServiceImpl.internal_static_ParkingSystem_CarEntrance_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.smartparking.grpc.ParkingSystemServiceImpl.internal_static_ParkingSystem_CarEntrance_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.smartparking.grpc.CarEntrance.class, com.smartparking.grpc.CarEntrance.Builder.class);
  }

  public static final int LICENSEPLATE_FIELD_NUMBER = 1;
  private volatile java.lang.Object licensePlate_;
  /**
   * <code>string licensePlate = 1;</code>
   */
  public java.lang.String getLicensePlate() {
    java.lang.Object ref = licensePlate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      licensePlate_ = s;
      return s;
    }
  }
  /**
   * <code>string licensePlate = 1;</code>
   */
  public com.google.protobuf.ByteString
      getLicensePlateBytes() {
    java.lang.Object ref = licensePlate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      licensePlate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHECKIN_FIELD_NUMBER = 2;
  private volatile java.lang.Object checkin_;
  /**
   * <code>string checkin = 2;</code>
   */
  public java.lang.String getCheckin() {
    java.lang.Object ref = checkin_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      checkin_ = s;
      return s;
    }
  }
  /**
   * <code>string checkin = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCheckinBytes() {
    java.lang.Object ref = checkin_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      checkin_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getLicensePlateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, licensePlate_);
    }
    if (!getCheckinBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, checkin_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLicensePlateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, licensePlate_);
    }
    if (!getCheckinBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, checkin_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.smartparking.grpc.CarEntrance)) {
      return super.equals(obj);
    }
    com.smartparking.grpc.CarEntrance other = (com.smartparking.grpc.CarEntrance) obj;

    boolean result = true;
    result = result && getLicensePlate()
        .equals(other.getLicensePlate());
    result = result && getCheckin()
        .equals(other.getCheckin());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LICENSEPLATE_FIELD_NUMBER;
    hash = (53 * hash) + getLicensePlate().hashCode();
    hash = (37 * hash) + CHECKIN_FIELD_NUMBER;
    hash = (53 * hash) + getCheckin().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.smartparking.grpc.CarEntrance parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smartparking.grpc.CarEntrance parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smartparking.grpc.CarEntrance parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smartparking.grpc.CarEntrance parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smartparking.grpc.CarEntrance parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smartparking.grpc.CarEntrance parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smartparking.grpc.CarEntrance parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.smartparking.grpc.CarEntrance parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.smartparking.grpc.CarEntrance parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.smartparking.grpc.CarEntrance parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.smartparking.grpc.CarEntrance parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.smartparking.grpc.CarEntrance parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.smartparking.grpc.CarEntrance prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ParkingSystem.CarEntrance}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ParkingSystem.CarEntrance)
      com.smartparking.grpc.CarEntranceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.smartparking.grpc.ParkingSystemServiceImpl.internal_static_ParkingSystem_CarEntrance_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.smartparking.grpc.ParkingSystemServiceImpl.internal_static_ParkingSystem_CarEntrance_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.smartparking.grpc.CarEntrance.class, com.smartparking.grpc.CarEntrance.Builder.class);
    }

    // Construct using com.smartparking.grpc.CarEntrance.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      licensePlate_ = "";

      checkin_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.smartparking.grpc.ParkingSystemServiceImpl.internal_static_ParkingSystem_CarEntrance_descriptor;
    }

    @java.lang.Override
    public com.smartparking.grpc.CarEntrance getDefaultInstanceForType() {
      return com.smartparking.grpc.CarEntrance.getDefaultInstance();
    }

    @java.lang.Override
    public com.smartparking.grpc.CarEntrance build() {
      com.smartparking.grpc.CarEntrance result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.smartparking.grpc.CarEntrance buildPartial() {
      com.smartparking.grpc.CarEntrance result = new com.smartparking.grpc.CarEntrance(this);
      result.licensePlate_ = licensePlate_;
      result.checkin_ = checkin_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.smartparking.grpc.CarEntrance) {
        return mergeFrom((com.smartparking.grpc.CarEntrance)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.smartparking.grpc.CarEntrance other) {
      if (other == com.smartparking.grpc.CarEntrance.getDefaultInstance()) return this;
      if (!other.getLicensePlate().isEmpty()) {
        licensePlate_ = other.licensePlate_;
        onChanged();
      }
      if (!other.getCheckin().isEmpty()) {
        checkin_ = other.checkin_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.smartparking.grpc.CarEntrance parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.smartparking.grpc.CarEntrance) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object licensePlate_ = "";
    /**
     * <code>string licensePlate = 1;</code>
     */
    public java.lang.String getLicensePlate() {
      java.lang.Object ref = licensePlate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        licensePlate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string licensePlate = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLicensePlateBytes() {
      java.lang.Object ref = licensePlate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        licensePlate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string licensePlate = 1;</code>
     */
    public Builder setLicensePlate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      licensePlate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string licensePlate = 1;</code>
     */
    public Builder clearLicensePlate() {
      
      licensePlate_ = getDefaultInstance().getLicensePlate();
      onChanged();
      return this;
    }
    /**
     * <code>string licensePlate = 1;</code>
     */
    public Builder setLicensePlateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      licensePlate_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object checkin_ = "";
    /**
     * <code>string checkin = 2;</code>
     */
    public java.lang.String getCheckin() {
      java.lang.Object ref = checkin_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        checkin_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string checkin = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCheckinBytes() {
      java.lang.Object ref = checkin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        checkin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string checkin = 2;</code>
     */
    public Builder setCheckin(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      checkin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string checkin = 2;</code>
     */
    public Builder clearCheckin() {
      
      checkin_ = getDefaultInstance().getCheckin();
      onChanged();
      return this;
    }
    /**
     * <code>string checkin = 2;</code>
     */
    public Builder setCheckinBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      checkin_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ParkingSystem.CarEntrance)
  }

  // @@protoc_insertion_point(class_scope:ParkingSystem.CarEntrance)
  private static final com.smartparking.grpc.CarEntrance DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.smartparking.grpc.CarEntrance();
  }

  public static com.smartparking.grpc.CarEntrance getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CarEntrance>
      PARSER = new com.google.protobuf.AbstractParser<CarEntrance>() {
    @java.lang.Override
    public CarEntrance parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CarEntrance(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CarEntrance> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CarEntrance> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.smartparking.grpc.CarEntrance getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

