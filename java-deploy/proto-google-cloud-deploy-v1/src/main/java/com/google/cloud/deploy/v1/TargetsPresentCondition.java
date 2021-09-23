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
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * TargetsPresentCondition contains information on any Targets defined in
 * the Delivery Pipeline that do not actually exist.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.TargetsPresentCondition}
 */
public final class TargetsPresentCondition extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.TargetsPresentCondition)
    TargetsPresentConditionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TargetsPresentCondition.newBuilder() to construct.
  private TargetsPresentCondition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TargetsPresentCondition() {
    missingTargets_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TargetsPresentCondition();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TargetsPresentCondition(
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
          case 8:
            {
              status_ = input.readBool();
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                missingTargets_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              missingTargets_.add(s);
              break;
            }
          case 34:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (updateTime_ != null) {
                subBuilder = updateTime_.toBuilder();
              }
              updateTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateTime_);
                updateTime_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        missingTargets_ = missingTargets_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_TargetsPresentCondition_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_TargetsPresentCondition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.TargetsPresentCondition.class,
            com.google.cloud.deploy.v1.TargetsPresentCondition.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private boolean status_;
  /**
   *
   *
   * <pre>
   * True if there aren't any missing Targets.
   * </pre>
   *
   * <code>bool status = 1;</code>
   *
   * @return The status.
   */
  @java.lang.Override
  public boolean getStatus() {
    return status_;
  }

  public static final int MISSING_TARGETS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList missingTargets_;
  /**
   *
   *
   * <pre>
   * The list of Target names that are missing. For example,
   * projects/{project_id}/locations/{location_name}/targets/{target_name}.
   * </pre>
   *
   * <code>repeated string missing_targets = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return A list containing the missingTargets.
   */
  public com.google.protobuf.ProtocolStringList getMissingTargetsList() {
    return missingTargets_;
  }
  /**
   *
   *
   * <pre>
   * The list of Target names that are missing. For example,
   * projects/{project_id}/locations/{location_name}/targets/{target_name}.
   * </pre>
   *
   * <code>repeated string missing_targets = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The count of missingTargets.
   */
  public int getMissingTargetsCount() {
    return missingTargets_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of Target names that are missing. For example,
   * projects/{project_id}/locations/{location_name}/targets/{target_name}.
   * </pre>
   *
   * <code>repeated string missing_targets = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the element to return.
   * @return The missingTargets at the given index.
   */
  public java.lang.String getMissingTargets(int index) {
    return missingTargets_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of Target names that are missing. For example,
   * projects/{project_id}/locations/{location_name}/targets/{target_name}.
   * </pre>
   *
   * <code>repeated string missing_targets = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the missingTargets at the given index.
   */
  public com.google.protobuf.ByteString getMissingTargetsBytes(int index) {
    return missingTargets_.getByteString(index);
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   *
   *
   * <pre>
   * Last time the condition was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   *
   * @return Whether the updateTime field is set.
   */
  @java.lang.Override
  public boolean hasUpdateTime() {
    return updateTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Last time the condition was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   *
   * @return The updateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdateTime() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }
  /**
   *
   *
   * <pre>
   * Last time the condition was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return getUpdateTime();
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
    if (status_ != false) {
      output.writeBool(1, status_);
    }
    for (int i = 0; i < missingTargets_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, missingTargets_.getRaw(i));
    }
    if (updateTime_ != null) {
      output.writeMessage(4, getUpdateTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, status_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < missingTargets_.size(); i++) {
        dataSize += computeStringSizeNoTag(missingTargets_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMissingTargetsList().size();
    }
    if (updateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getUpdateTime());
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
    if (!(obj instanceof com.google.cloud.deploy.v1.TargetsPresentCondition)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.TargetsPresentCondition other =
        (com.google.cloud.deploy.v1.TargetsPresentCondition) obj;

    if (getStatus() != other.getStatus()) return false;
    if (!getMissingTargetsList().equals(other.getMissingTargetsList())) return false;
    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime().equals(other.getUpdateTime())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getStatus());
    if (getMissingTargetsCount() > 0) {
      hash = (37 * hash) + MISSING_TARGETS_FIELD_NUMBER;
      hash = (53 * hash) + getMissingTargetsList().hashCode();
    }
    if (hasUpdateTime()) {
      hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.TargetsPresentCondition parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.TargetsPresentCondition parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.TargetsPresentCondition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.TargetsPresentCondition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.TargetsPresentCondition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.TargetsPresentCondition parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.TargetsPresentCondition parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.TargetsPresentCondition parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.TargetsPresentCondition parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.TargetsPresentCondition parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.TargetsPresentCondition parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.TargetsPresentCondition parseFrom(
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

  public static Builder newBuilder(com.google.cloud.deploy.v1.TargetsPresentCondition prototype) {
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
   * TargetsPresentCondition contains information on any Targets defined in
   * the Delivery Pipeline that do not actually exist.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.TargetsPresentCondition}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.TargetsPresentCondition)
      com.google.cloud.deploy.v1.TargetsPresentConditionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_TargetsPresentCondition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_TargetsPresentCondition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.TargetsPresentCondition.class,
              com.google.cloud.deploy.v1.TargetsPresentCondition.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.TargetsPresentCondition.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      status_ = false;

      missingTargets_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (updateTimeBuilder_ == null) {
        updateTime_ = null;
      } else {
        updateTime_ = null;
        updateTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_TargetsPresentCondition_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.TargetsPresentCondition getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.TargetsPresentCondition.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.TargetsPresentCondition build() {
      com.google.cloud.deploy.v1.TargetsPresentCondition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.TargetsPresentCondition buildPartial() {
      com.google.cloud.deploy.v1.TargetsPresentCondition result =
          new com.google.cloud.deploy.v1.TargetsPresentCondition(this);
      int from_bitField0_ = bitField0_;
      result.status_ = status_;
      if (((bitField0_ & 0x00000001) != 0)) {
        missingTargets_ = missingTargets_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.missingTargets_ = missingTargets_;
      if (updateTimeBuilder_ == null) {
        result.updateTime_ = updateTime_;
      } else {
        result.updateTime_ = updateTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.deploy.v1.TargetsPresentCondition) {
        return mergeFrom((com.google.cloud.deploy.v1.TargetsPresentCondition) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.TargetsPresentCondition other) {
      if (other == com.google.cloud.deploy.v1.TargetsPresentCondition.getDefaultInstance())
        return this;
      if (other.getStatus() != false) {
        setStatus(other.getStatus());
      }
      if (!other.missingTargets_.isEmpty()) {
        if (missingTargets_.isEmpty()) {
          missingTargets_ = other.missingTargets_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMissingTargetsIsMutable();
          missingTargets_.addAll(other.missingTargets_);
        }
        onChanged();
      }
      if (other.hasUpdateTime()) {
        mergeUpdateTime(other.getUpdateTime());
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
      com.google.cloud.deploy.v1.TargetsPresentCondition parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.deploy.v1.TargetsPresentCondition) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private boolean status_;
    /**
     *
     *
     * <pre>
     * True if there aren't any missing Targets.
     * </pre>
     *
     * <code>bool status = 1;</code>
     *
     * @return The status.
     */
    @java.lang.Override
    public boolean getStatus() {
      return status_;
    }
    /**
     *
     *
     * <pre>
     * True if there aren't any missing Targets.
     * </pre>
     *
     * <code>bool status = 1;</code>
     *
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(boolean value) {

      status_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * True if there aren't any missing Targets.
     * </pre>
     *
     * <code>bool status = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStatus() {

      status_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList missingTargets_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureMissingTargetsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        missingTargets_ = new com.google.protobuf.LazyStringArrayList(missingTargets_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Target names that are missing. For example,
     * projects/{project_id}/locations/{location_name}/targets/{target_name}.
     * </pre>
     *
     * <code>repeated string missing_targets = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return A list containing the missingTargets.
     */
    public com.google.protobuf.ProtocolStringList getMissingTargetsList() {
      return missingTargets_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * The list of Target names that are missing. For example,
     * projects/{project_id}/locations/{location_name}/targets/{target_name}.
     * </pre>
     *
     * <code>repeated string missing_targets = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The count of missingTargets.
     */
    public int getMissingTargetsCount() {
      return missingTargets_.size();
    }
    /**
     *
     *
     * <pre>
     * The list of Target names that are missing. For example,
     * projects/{project_id}/locations/{location_name}/targets/{target_name}.
     * </pre>
     *
     * <code>repeated string missing_targets = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param index The index of the element to return.
     * @return The missingTargets at the given index.
     */
    public java.lang.String getMissingTargets(int index) {
      return missingTargets_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The list of Target names that are missing. For example,
     * projects/{project_id}/locations/{location_name}/targets/{target_name}.
     * </pre>
     *
     * <code>repeated string missing_targets = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the missingTargets at the given index.
     */
    public com.google.protobuf.ByteString getMissingTargetsBytes(int index) {
      return missingTargets_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The list of Target names that are missing. For example,
     * projects/{project_id}/locations/{location_name}/targets/{target_name}.
     * </pre>
     *
     * <code>repeated string missing_targets = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param index The index to set the value at.
     * @param value The missingTargets to set.
     * @return This builder for chaining.
     */
    public Builder setMissingTargets(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureMissingTargetsIsMutable();
      missingTargets_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Target names that are missing. For example,
     * projects/{project_id}/locations/{location_name}/targets/{target_name}.
     * </pre>
     *
     * <code>repeated string missing_targets = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The missingTargets to add.
     * @return This builder for chaining.
     */
    public Builder addMissingTargets(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureMissingTargetsIsMutable();
      missingTargets_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Target names that are missing. For example,
     * projects/{project_id}/locations/{location_name}/targets/{target_name}.
     * </pre>
     *
     * <code>repeated string missing_targets = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param values The missingTargets to add.
     * @return This builder for chaining.
     */
    public Builder addAllMissingTargets(java.lang.Iterable<java.lang.String> values) {
      ensureMissingTargetsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, missingTargets_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Target names that are missing. For example,
     * projects/{project_id}/locations/{location_name}/targets/{target_name}.
     * </pre>
     *
     * <code>repeated string missing_targets = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMissingTargets() {
      missingTargets_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Target names that are missing. For example,
     * projects/{project_id}/locations/{location_name}/targets/{target_name}.
     * </pre>
     *
     * <code>repeated string missing_targets = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes of the missingTargets to add.
     * @return This builder for chaining.
     */
    public Builder addMissingTargetsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureMissingTargetsIsMutable();
      missingTargets_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp updateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        updateTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Last time the condition was updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     *
     * @return Whether the updateTime field is set.
     */
    public boolean hasUpdateTime() {
      return updateTimeBuilder_ != null || updateTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * Last time the condition was updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     *
     * @return The updateTime.
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      if (updateTimeBuilder_ == null) {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      } else {
        return updateTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Last time the condition was updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateTime_ = value;
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Last time the condition was updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updateTimeBuilder_ == null) {
        updateTime_ = builderForValue.build();
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Last time the condition was updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (updateTime_ != null) {
          updateTime_ =
              com.google.protobuf.Timestamp.newBuilder(updateTime_).mergeFrom(value).buildPartial();
        } else {
          updateTime_ = value;
        }
        onChanged();
      } else {
        updateTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Last time the condition was updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     */
    public Builder clearUpdateTime() {
      if (updateTimeBuilder_ == null) {
        updateTime_ = null;
        onChanged();
      } else {
        updateTime_ = null;
        updateTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Last time the condition was updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdateTimeBuilder() {

      onChanged();
      return getUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Last time the condition was updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
      if (updateTimeBuilder_ != null) {
        return updateTimeBuilder_.getMessageOrBuilder();
      } else {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Last time the condition was updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getUpdateTimeFieldBuilder() {
      if (updateTimeBuilder_ == null) {
        updateTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getUpdateTime(), getParentForChildren(), isClean());
        updateTime_ = null;
      }
      return updateTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.TargetsPresentCondition)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.TargetsPresentCondition)
  private static final com.google.cloud.deploy.v1.TargetsPresentCondition DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.TargetsPresentCondition();
  }

  public static com.google.cloud.deploy.v1.TargetsPresentCondition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetsPresentCondition> PARSER =
      new com.google.protobuf.AbstractParser<TargetsPresentCondition>() {
        @java.lang.Override
        public TargetsPresentCondition parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TargetsPresentCondition(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TargetsPresentCondition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetsPresentCondition> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.TargetsPresentCondition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
