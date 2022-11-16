/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/eventarc/v1/eventarc.proto

package com.google.cloud.eventarc.v1;

/**
 *
 *
 * <pre>
 * The request message for the UpdateGoogleChannelConfig method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest}
 */
public final class UpdateGoogleChannelConfigRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest)
    UpdateGoogleChannelConfigRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateGoogleChannelConfigRequest.newBuilder() to construct.
  private UpdateGoogleChannelConfigRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateGoogleChannelConfigRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateGoogleChannelConfigRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.eventarc.v1.EventarcProto
        .internal_static_google_cloud_eventarc_v1_UpdateGoogleChannelConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.eventarc.v1.EventarcProto
        .internal_static_google_cloud_eventarc_v1_UpdateGoogleChannelConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest.class,
            com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest.Builder.class);
  }

  public static final int GOOGLE_CHANNEL_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.eventarc.v1.GoogleChannelConfig googleChannelConfig_;
  /**
   *
   *
   * <pre>
   * Required. The config to be updated.
   * </pre>
   *
   * <code>
   * .google.cloud.eventarc.v1.GoogleChannelConfig google_channel_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the googleChannelConfig field is set.
   */
  @java.lang.Override
  public boolean hasGoogleChannelConfig() {
    return googleChannelConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The config to be updated.
   * </pre>
   *
   * <code>
   * .google.cloud.eventarc.v1.GoogleChannelConfig google_channel_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The googleChannelConfig.
   */
  @java.lang.Override
  public com.google.cloud.eventarc.v1.GoogleChannelConfig getGoogleChannelConfig() {
    return googleChannelConfig_ == null
        ? com.google.cloud.eventarc.v1.GoogleChannelConfig.getDefaultInstance()
        : googleChannelConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. The config to be updated.
   * </pre>
   *
   * <code>
   * .google.cloud.eventarc.v1.GoogleChannelConfig google_channel_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.eventarc.v1.GoogleChannelConfigOrBuilder
      getGoogleChannelConfigOrBuilder() {
    return getGoogleChannelConfig();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The fields to be updated; only fields explicitly provided are updated.
   * If no field mask is provided, all provided fields in the request are
   * updated. To update all fields, provide a field mask of "*".
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The fields to be updated; only fields explicitly provided are updated.
   * If no field mask is provided, all provided fields in the request are
   * updated. To update all fields, provide a field mask of "*".
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The fields to be updated; only fields explicitly provided are updated.
   * If no field mask is provided, all provided fields in the request are
   * updated. To update all fields, provide a field mask of "*".
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (googleChannelConfig_ != null) {
      output.writeMessage(1, getGoogleChannelConfig());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (googleChannelConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getGoogleChannelConfig());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest other =
        (com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest) obj;

    if (hasGoogleChannelConfig() != other.hasGoogleChannelConfig()) return false;
    if (hasGoogleChannelConfig()) {
      if (!getGoogleChannelConfig().equals(other.getGoogleChannelConfig())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasGoogleChannelConfig()) {
      hash = (37 * hash) + GOOGLE_CHANNEL_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getGoogleChannelConfig().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The request message for the UpdateGoogleChannelConfig method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest)
      com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.eventarc.v1.EventarcProto
          .internal_static_google_cloud_eventarc_v1_UpdateGoogleChannelConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.eventarc.v1.EventarcProto
          .internal_static_google_cloud_eventarc_v1_UpdateGoogleChannelConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest.class,
              com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest.Builder.class);
    }

    // Construct using com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (googleChannelConfigBuilder_ == null) {
        googleChannelConfig_ = null;
      } else {
        googleChannelConfig_ = null;
        googleChannelConfigBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.eventarc.v1.EventarcProto
          .internal_static_google_cloud_eventarc_v1_UpdateGoogleChannelConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest
        getDefaultInstanceForType() {
      return com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest build() {
      com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest buildPartial() {
      com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest result =
          new com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest(this);
      if (googleChannelConfigBuilder_ == null) {
        result.googleChannelConfig_ = googleChannelConfig_;
      } else {
        result.googleChannelConfig_ = googleChannelConfigBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest) {
        return mergeFrom((com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest other) {
      if (other
          == com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest.getDefaultInstance())
        return this;
      if (other.hasGoogleChannelConfig()) {
        mergeGoogleChannelConfig(other.getGoogleChannelConfig());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(
                    getGoogleChannelConfigFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private com.google.cloud.eventarc.v1.GoogleChannelConfig googleChannelConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.eventarc.v1.GoogleChannelConfig,
            com.google.cloud.eventarc.v1.GoogleChannelConfig.Builder,
            com.google.cloud.eventarc.v1.GoogleChannelConfigOrBuilder>
        googleChannelConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The config to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.GoogleChannelConfig google_channel_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the googleChannelConfig field is set.
     */
    public boolean hasGoogleChannelConfig() {
      return googleChannelConfigBuilder_ != null || googleChannelConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The config to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.GoogleChannelConfig google_channel_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The googleChannelConfig.
     */
    public com.google.cloud.eventarc.v1.GoogleChannelConfig getGoogleChannelConfig() {
      if (googleChannelConfigBuilder_ == null) {
        return googleChannelConfig_ == null
            ? com.google.cloud.eventarc.v1.GoogleChannelConfig.getDefaultInstance()
            : googleChannelConfig_;
      } else {
        return googleChannelConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The config to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.GoogleChannelConfig google_channel_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setGoogleChannelConfig(com.google.cloud.eventarc.v1.GoogleChannelConfig value) {
      if (googleChannelConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        googleChannelConfig_ = value;
        onChanged();
      } else {
        googleChannelConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The config to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.GoogleChannelConfig google_channel_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setGoogleChannelConfig(
        com.google.cloud.eventarc.v1.GoogleChannelConfig.Builder builderForValue) {
      if (googleChannelConfigBuilder_ == null) {
        googleChannelConfig_ = builderForValue.build();
        onChanged();
      } else {
        googleChannelConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The config to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.GoogleChannelConfig google_channel_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeGoogleChannelConfig(
        com.google.cloud.eventarc.v1.GoogleChannelConfig value) {
      if (googleChannelConfigBuilder_ == null) {
        if (googleChannelConfig_ != null) {
          googleChannelConfig_ =
              com.google.cloud.eventarc.v1.GoogleChannelConfig.newBuilder(googleChannelConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          googleChannelConfig_ = value;
        }
        onChanged();
      } else {
        googleChannelConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The config to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.GoogleChannelConfig google_channel_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearGoogleChannelConfig() {
      if (googleChannelConfigBuilder_ == null) {
        googleChannelConfig_ = null;
        onChanged();
      } else {
        googleChannelConfig_ = null;
        googleChannelConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The config to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.GoogleChannelConfig google_channel_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.eventarc.v1.GoogleChannelConfig.Builder
        getGoogleChannelConfigBuilder() {

      onChanged();
      return getGoogleChannelConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The config to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.GoogleChannelConfig google_channel_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.eventarc.v1.GoogleChannelConfigOrBuilder
        getGoogleChannelConfigOrBuilder() {
      if (googleChannelConfigBuilder_ != null) {
        return googleChannelConfigBuilder_.getMessageOrBuilder();
      } else {
        return googleChannelConfig_ == null
            ? com.google.cloud.eventarc.v1.GoogleChannelConfig.getDefaultInstance()
            : googleChannelConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The config to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.GoogleChannelConfig google_channel_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.eventarc.v1.GoogleChannelConfig,
            com.google.cloud.eventarc.v1.GoogleChannelConfig.Builder,
            com.google.cloud.eventarc.v1.GoogleChannelConfigOrBuilder>
        getGoogleChannelConfigFieldBuilder() {
      if (googleChannelConfigBuilder_ == null) {
        googleChannelConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.eventarc.v1.GoogleChannelConfig,
                com.google.cloud.eventarc.v1.GoogleChannelConfig.Builder,
                com.google.cloud.eventarc.v1.GoogleChannelConfigOrBuilder>(
                getGoogleChannelConfig(), getParentForChildren(), isClean());
        googleChannelConfig_ = null;
      }
      return googleChannelConfigBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * The fields to be updated; only fields explicitly provided are updated.
     * If no field mask is provided, all provided fields in the request are
     * updated. To update all fields, provide a field mask of "*".
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * The fields to be updated; only fields explicitly provided are updated.
     * If no field mask is provided, all provided fields in the request are
     * updated. To update all fields, provide a field mask of "*".
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The fields to be updated; only fields explicitly provided are updated.
     * If no field mask is provided, all provided fields in the request are
     * updated. To update all fields, provide a field mask of "*".
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The fields to be updated; only fields explicitly provided are updated.
     * If no field mask is provided, all provided fields in the request are
     * updated. To update all fields, provide a field mask of "*".
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The fields to be updated; only fields explicitly provided are updated.
     * If no field mask is provided, all provided fields in the request are
     * updated. To update all fields, provide a field mask of "*".
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The fields to be updated; only fields explicitly provided are updated.
     * If no field mask is provided, all provided fields in the request are
     * updated. To update all fields, provide a field mask of "*".
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The fields to be updated; only fields explicitly provided are updated.
     * If no field mask is provided, all provided fields in the request are
     * updated. To update all fields, provide a field mask of "*".
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The fields to be updated; only fields explicitly provided are updated.
     * If no field mask is provided, all provided fields in the request are
     * updated. To update all fields, provide a field mask of "*".
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * The fields to be updated; only fields explicitly provided are updated.
     * If no field mask is provided, all provided fields in the request are
     * updated. To update all fields, provide a field mask of "*".
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest)
  private static final com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest();
  }

  public static com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateGoogleChannelConfigRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateGoogleChannelConfigRequest>() {
        @java.lang.Override
        public UpdateGoogleChannelConfigRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<UpdateGoogleChannelConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateGoogleChannelConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.eventarc.v1.UpdateGoogleChannelConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
