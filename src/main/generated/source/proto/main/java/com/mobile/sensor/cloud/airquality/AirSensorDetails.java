// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: airqualitysensor.proto

package com.mobile.sensor.cloud.airquality;

/**
 * <pre>
 * model repesenting sensor details
 * </pre>
 *
 * Protobuf type {@code AirSensorDetails}
 */
public  final class AirSensorDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AirSensorDetails)
    AirSensorDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AirSensorDetails.newBuilder() to construct.
  private AirSensorDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AirSensorDetails() {
    ipaddress_ = "";
    latitude_ = 0F;
    longitue_ = 0F;
    provider_ = "";
    type_ = 0;
    status_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AirSensorDetails(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            ipaddress_ = s;
            break;
          }
          case 21: {

            latitude_ = input.readFloat();
            break;
          }
          case 29: {

            longitue_ = input.readFloat();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            provider_ = s;
            break;
          }
          case 40: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 48: {
            int rawValue = input.readEnum();

            type_ = rawValue;
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
    return com.mobile.sensor.cloud.airquality.AirQualitySensorProto.internal_static_AirSensorDetails_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.mobile.sensor.cloud.airquality.AirQualitySensorProto.internal_static_AirSensorDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.mobile.sensor.cloud.airquality.AirSensorDetails.class, com.mobile.sensor.cloud.airquality.AirSensorDetails.Builder.class);
  }

  /**
   * Protobuf enum {@code AirSensorDetails.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>INACTIVE = 0;</code>
     */
    INACTIVE(0),
    /**
     * <code>ACTIVE = 1;</code>
     */
    ACTIVE(1),
    /**
     * <code>MAINT = 2;</code>
     */
    MAINT(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>INACTIVE = 0;</code>
     */
    public static final int INACTIVE_VALUE = 0;
    /**
     * <code>ACTIVE = 1;</code>
     */
    public static final int ACTIVE_VALUE = 1;
    /**
     * <code>MAINT = 2;</code>
     */
    public static final int MAINT_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    public static Status forNumber(int value) {
      switch (value) {
        case 0: return INACTIVE;
        case 1: return ACTIVE;
        case 2: return MAINT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.mobile.sensor.cloud.airquality.AirSensorDetails.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:AirSensorDetails.Status)
  }

  /**
   * Protobuf enum {@code AirSensorDetails.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>WATER = 0;</code>
     */
    WATER(0),
    /**
     * <code>AIR = 1;</code>
     */
    AIR(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>WATER = 0;</code>
     */
    public static final int WATER_VALUE = 0;
    /**
     * <code>AIR = 1;</code>
     */
    public static final int AIR_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    public static Type forNumber(int value) {
      switch (value) {
        case 0: return WATER;
        case 1: return AIR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.mobile.sensor.cloud.airquality.AirSensorDetails.getDescriptor().getEnumTypes().get(1);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:AirSensorDetails.Type)
  }

  public static final int IPADDRESS_FIELD_NUMBER = 1;
  private volatile java.lang.Object ipaddress_;
  /**
   * <code>string ipaddress = 1;</code>
   */
  public java.lang.String getIpaddress() {
    java.lang.Object ref = ipaddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipaddress_ = s;
      return s;
    }
  }
  /**
   * <code>string ipaddress = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIpaddressBytes() {
    java.lang.Object ref = ipaddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ipaddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LATITUDE_FIELD_NUMBER = 2;
  private float latitude_;
  /**
   * <code>float latitude = 2;</code>
   */
  public float getLatitude() {
    return latitude_;
  }

  public static final int LONGITUE_FIELD_NUMBER = 3;
  private float longitue_;
  /**
   * <code>float longitue = 3;</code>
   */
  public float getLongitue() {
    return longitue_;
  }

  public static final int PROVIDER_FIELD_NUMBER = 4;
  private volatile java.lang.Object provider_;
  /**
   * <code>string provider = 4;</code>
   */
  public java.lang.String getProvider() {
    java.lang.Object ref = provider_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      provider_ = s;
      return s;
    }
  }
  /**
   * <code>string provider = 4;</code>
   */
  public com.google.protobuf.ByteString
      getProviderBytes() {
    java.lang.Object ref = provider_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      provider_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 6;
  private int type_;
  /**
   * <code>.AirSensorDetails.Type type = 6;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.AirSensorDetails.Type type = 6;</code>
   */
  public com.mobile.sensor.cloud.airquality.AirSensorDetails.Type getType() {
    com.mobile.sensor.cloud.airquality.AirSensorDetails.Type result = com.mobile.sensor.cloud.airquality.AirSensorDetails.Type.valueOf(type_);
    return result == null ? com.mobile.sensor.cloud.airquality.AirSensorDetails.Type.UNRECOGNIZED : result;
  }

  public static final int STATUS_FIELD_NUMBER = 5;
  private int status_;
  /**
   * <code>.AirSensorDetails.Status status = 5;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.AirSensorDetails.Status status = 5;</code>
   */
  public com.mobile.sensor.cloud.airquality.AirSensorDetails.Status getStatus() {
    com.mobile.sensor.cloud.airquality.AirSensorDetails.Status result = com.mobile.sensor.cloud.airquality.AirSensorDetails.Status.valueOf(status_);
    return result == null ? com.mobile.sensor.cloud.airquality.AirSensorDetails.Status.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getIpaddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ipaddress_);
    }
    if (latitude_ != 0F) {
      output.writeFloat(2, latitude_);
    }
    if (longitue_ != 0F) {
      output.writeFloat(3, longitue_);
    }
    if (!getProviderBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, provider_);
    }
    if (status_ != com.mobile.sensor.cloud.airquality.AirSensorDetails.Status.INACTIVE.getNumber()) {
      output.writeEnum(5, status_);
    }
    if (type_ != com.mobile.sensor.cloud.airquality.AirSensorDetails.Type.WATER.getNumber()) {
      output.writeEnum(6, type_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIpaddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ipaddress_);
    }
    if (latitude_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, latitude_);
    }
    if (longitue_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, longitue_);
    }
    if (!getProviderBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, provider_);
    }
    if (status_ != com.mobile.sensor.cloud.airquality.AirSensorDetails.Status.INACTIVE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, status_);
    }
    if (type_ != com.mobile.sensor.cloud.airquality.AirSensorDetails.Type.WATER.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, type_);
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
    if (!(obj instanceof com.mobile.sensor.cloud.airquality.AirSensorDetails)) {
      return super.equals(obj);
    }
    com.mobile.sensor.cloud.airquality.AirSensorDetails other = (com.mobile.sensor.cloud.airquality.AirSensorDetails) obj;

    boolean result = true;
    result = result && getIpaddress()
        .equals(other.getIpaddress());
    result = result && (
        java.lang.Float.floatToIntBits(getLatitude())
        == java.lang.Float.floatToIntBits(
            other.getLatitude()));
    result = result && (
        java.lang.Float.floatToIntBits(getLongitue())
        == java.lang.Float.floatToIntBits(
            other.getLongitue()));
    result = result && getProvider()
        .equals(other.getProvider());
    result = result && type_ == other.type_;
    result = result && status_ == other.status_;
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
    hash = (37 * hash) + IPADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getIpaddress().hashCode();
    hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getLatitude());
    hash = (37 * hash) + LONGITUE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getLongitue());
    hash = (37 * hash) + PROVIDER_FIELD_NUMBER;
    hash = (53 * hash) + getProvider().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.mobile.sensor.cloud.airquality.AirSensorDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mobile.sensor.cloud.airquality.AirSensorDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mobile.sensor.cloud.airquality.AirSensorDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mobile.sensor.cloud.airquality.AirSensorDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mobile.sensor.cloud.airquality.AirSensorDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mobile.sensor.cloud.airquality.AirSensorDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mobile.sensor.cloud.airquality.AirSensorDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mobile.sensor.cloud.airquality.AirSensorDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mobile.sensor.cloud.airquality.AirSensorDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.mobile.sensor.cloud.airquality.AirSensorDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mobile.sensor.cloud.airquality.AirSensorDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mobile.sensor.cloud.airquality.AirSensorDetails parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.mobile.sensor.cloud.airquality.AirSensorDetails prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * model repesenting sensor details
   * </pre>
   *
   * Protobuf type {@code AirSensorDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AirSensorDetails)
      com.mobile.sensor.cloud.airquality.AirSensorDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mobile.sensor.cloud.airquality.AirQualitySensorProto.internal_static_AirSensorDetails_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mobile.sensor.cloud.airquality.AirQualitySensorProto.internal_static_AirSensorDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mobile.sensor.cloud.airquality.AirSensorDetails.class, com.mobile.sensor.cloud.airquality.AirSensorDetails.Builder.class);
    }

    // Construct using com.mobile.sensor.cloud.airquality.AirSensorDetails.newBuilder()
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
    public Builder clear() {
      super.clear();
      ipaddress_ = "";

      latitude_ = 0F;

      longitue_ = 0F;

      provider_ = "";

      type_ = 0;

      status_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.mobile.sensor.cloud.airquality.AirQualitySensorProto.internal_static_AirSensorDetails_descriptor;
    }

    public com.mobile.sensor.cloud.airquality.AirSensorDetails getDefaultInstanceForType() {
      return com.mobile.sensor.cloud.airquality.AirSensorDetails.getDefaultInstance();
    }

    public com.mobile.sensor.cloud.airquality.AirSensorDetails build() {
      com.mobile.sensor.cloud.airquality.AirSensorDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.mobile.sensor.cloud.airquality.AirSensorDetails buildPartial() {
      com.mobile.sensor.cloud.airquality.AirSensorDetails result = new com.mobile.sensor.cloud.airquality.AirSensorDetails(this);
      result.ipaddress_ = ipaddress_;
      result.latitude_ = latitude_;
      result.longitue_ = longitue_;
      result.provider_ = provider_;
      result.type_ = type_;
      result.status_ = status_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.mobile.sensor.cloud.airquality.AirSensorDetails) {
        return mergeFrom((com.mobile.sensor.cloud.airquality.AirSensorDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.mobile.sensor.cloud.airquality.AirSensorDetails other) {
      if (other == com.mobile.sensor.cloud.airquality.AirSensorDetails.getDefaultInstance()) return this;
      if (!other.getIpaddress().isEmpty()) {
        ipaddress_ = other.ipaddress_;
        onChanged();
      }
      if (other.getLatitude() != 0F) {
        setLatitude(other.getLatitude());
      }
      if (other.getLongitue() != 0F) {
        setLongitue(other.getLongitue());
      }
      if (!other.getProvider().isEmpty()) {
        provider_ = other.provider_;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.mobile.sensor.cloud.airquality.AirSensorDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.mobile.sensor.cloud.airquality.AirSensorDetails) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object ipaddress_ = "";
    /**
     * <code>string ipaddress = 1;</code>
     */
    public java.lang.String getIpaddress() {
      java.lang.Object ref = ipaddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipaddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ipaddress = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIpaddressBytes() {
      java.lang.Object ref = ipaddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipaddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ipaddress = 1;</code>
     */
    public Builder setIpaddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ipaddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ipaddress = 1;</code>
     */
    public Builder clearIpaddress() {
      
      ipaddress_ = getDefaultInstance().getIpaddress();
      onChanged();
      return this;
    }
    /**
     * <code>string ipaddress = 1;</code>
     */
    public Builder setIpaddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ipaddress_ = value;
      onChanged();
      return this;
    }

    private float latitude_ ;
    /**
     * <code>float latitude = 2;</code>
     */
    public float getLatitude() {
      return latitude_;
    }
    /**
     * <code>float latitude = 2;</code>
     */
    public Builder setLatitude(float value) {
      
      latitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float latitude = 2;</code>
     */
    public Builder clearLatitude() {
      
      latitude_ = 0F;
      onChanged();
      return this;
    }

    private float longitue_ ;
    /**
     * <code>float longitue = 3;</code>
     */
    public float getLongitue() {
      return longitue_;
    }
    /**
     * <code>float longitue = 3;</code>
     */
    public Builder setLongitue(float value) {
      
      longitue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float longitue = 3;</code>
     */
    public Builder clearLongitue() {
      
      longitue_ = 0F;
      onChanged();
      return this;
    }

    private java.lang.Object provider_ = "";
    /**
     * <code>string provider = 4;</code>
     */
    public java.lang.String getProvider() {
      java.lang.Object ref = provider_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        provider_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string provider = 4;</code>
     */
    public com.google.protobuf.ByteString
        getProviderBytes() {
      java.lang.Object ref = provider_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        provider_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string provider = 4;</code>
     */
    public Builder setProvider(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      provider_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string provider = 4;</code>
     */
    public Builder clearProvider() {
      
      provider_ = getDefaultInstance().getProvider();
      onChanged();
      return this;
    }
    /**
     * <code>string provider = 4;</code>
     */
    public Builder setProviderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      provider_ = value;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.AirSensorDetails.Type type = 6;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.AirSensorDetails.Type type = 6;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.AirSensorDetails.Type type = 6;</code>
     */
    public com.mobile.sensor.cloud.airquality.AirSensorDetails.Type getType() {
      com.mobile.sensor.cloud.airquality.AirSensorDetails.Type result = com.mobile.sensor.cloud.airquality.AirSensorDetails.Type.valueOf(type_);
      return result == null ? com.mobile.sensor.cloud.airquality.AirSensorDetails.Type.UNRECOGNIZED : result;
    }
    /**
     * <code>.AirSensorDetails.Type type = 6;</code>
     */
    public Builder setType(com.mobile.sensor.cloud.airquality.AirSensorDetails.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.AirSensorDetails.Type type = 6;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.AirSensorDetails.Status status = 5;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.AirSensorDetails.Status status = 5;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.AirSensorDetails.Status status = 5;</code>
     */
    public com.mobile.sensor.cloud.airquality.AirSensorDetails.Status getStatus() {
      com.mobile.sensor.cloud.airquality.AirSensorDetails.Status result = com.mobile.sensor.cloud.airquality.AirSensorDetails.Status.valueOf(status_);
      return result == null ? com.mobile.sensor.cloud.airquality.AirSensorDetails.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.AirSensorDetails.Status status = 5;</code>
     */
    public Builder setStatus(com.mobile.sensor.cloud.airquality.AirSensorDetails.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.AirSensorDetails.Status status = 5;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:AirSensorDetails)
  }

  // @@protoc_insertion_point(class_scope:AirSensorDetails)
  private static final com.mobile.sensor.cloud.airquality.AirSensorDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.mobile.sensor.cloud.airquality.AirSensorDetails();
  }

  public static com.mobile.sensor.cloud.airquality.AirSensorDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AirSensorDetails>
      PARSER = new com.google.protobuf.AbstractParser<AirSensorDetails>() {
    public AirSensorDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AirSensorDetails(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AirSensorDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AirSensorDetails> getParserForType() {
    return PARSER;
  }

  public com.mobile.sensor.cloud.airquality.AirSensorDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
