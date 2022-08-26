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
// source: google/devtools/containeranalysis/v1beta1/grafeas/grafeas.proto

package io.grafeas.v1beta1;

/**
 *
 *
 * <pre>
 * An entity that can have metadata. For example, a Docker image.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.Resource}
 */
public final class Resource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.Resource)
    ResourceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Resource.newBuilder() to construct.
  private Resource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Resource() {
    name_ = "";
    uri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Resource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Resource(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              uri_ = s;
              break;
            }
          case 26:
            {
              io.grafeas.v1beta1.provenance.Hash.Builder subBuilder = null;
              if (contentHash_ != null) {
                subBuilder = contentHash_.toBuilder();
              }
              contentHash_ =
                  input.readMessage(io.grafeas.v1beta1.provenance.Hash.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(contentHash_);
                contentHash_ = subBuilder.buildPartial();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1beta1.Grafeas.internal_static_grafeas_v1beta1_Resource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.Grafeas.internal_static_grafeas_v1beta1_Resource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.Resource.class, io.grafeas.v1beta1.Resource.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * The name of the resource. For example, the name of a Docker image -
   * "Debian".
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the resource. For example, the name of a Docker image -
   * "Debian".
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URI_FIELD_NUMBER = 2;
  private volatile java.lang.Object uri_;
  /**
   *
   *
   * <pre>
   * Required. The unique URI of the resource. For example,
   * `https://gcr.io/project/image&#64;sha256:foo` for a Docker image.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The uri.
   */
  @java.lang.Override
  public java.lang.String getUri() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The unique URI of the resource. For example,
   * `https://gcr.io/project/image&#64;sha256:foo` for a Docker image.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The bytes for uri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUriBytes() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      uri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTENT_HASH_FIELD_NUMBER = 3;
  private io.grafeas.v1beta1.provenance.Hash contentHash_;
  /**
   *
   *
   * <pre>
   * The hash of the resource content. For example, the Docker digest.
   * </pre>
   *
   * <code>.grafeas.v1beta1.provenance.Hash content_hash = 3;</code>
   *
   * @return Whether the contentHash field is set.
   */
  @java.lang.Override
  public boolean hasContentHash() {
    return contentHash_ != null;
  }
  /**
   *
   *
   * <pre>
   * The hash of the resource content. For example, the Docker digest.
   * </pre>
   *
   * <code>.grafeas.v1beta1.provenance.Hash content_hash = 3;</code>
   *
   * @return The contentHash.
   */
  @java.lang.Override
  public io.grafeas.v1beta1.provenance.Hash getContentHash() {
    return contentHash_ == null
        ? io.grafeas.v1beta1.provenance.Hash.getDefaultInstance()
        : contentHash_;
  }
  /**
   *
   *
   * <pre>
   * The hash of the resource content. For example, the Docker digest.
   * </pre>
   *
   * <code>.grafeas.v1beta1.provenance.Hash content_hash = 3;</code>
   */
  @java.lang.Override
  public io.grafeas.v1beta1.provenance.HashOrBuilder getContentHashOrBuilder() {
    return getContentHash();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, uri_);
    }
    if (contentHash_ != null) {
      output.writeMessage(3, getContentHash());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, uri_);
    }
    if (contentHash_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getContentHash());
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
    if (!(obj instanceof io.grafeas.v1beta1.Resource)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.Resource other = (io.grafeas.v1beta1.Resource) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getUri().equals(other.getUri())) return false;
    if (hasContentHash() != other.hasContentHash()) return false;
    if (hasContentHash()) {
      if (!getContentHash().equals(other.getContentHash())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    if (hasContentHash()) {
      hash = (37 * hash) + CONTENT_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getContentHash().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.Resource parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.Resource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.Resource parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.Resource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.Resource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.Resource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.Resource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.Resource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.Resource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.Resource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.Resource parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.Resource parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1beta1.Resource prototype) {
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
   * An entity that can have metadata. For example, a Docker image.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.Resource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.Resource)
      io.grafeas.v1beta1.ResourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1beta1.Grafeas.internal_static_grafeas_v1beta1_Resource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.Grafeas.internal_static_grafeas_v1beta1_Resource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.Resource.class, io.grafeas.v1beta1.Resource.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.Resource.newBuilder()
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
      name_ = "";

      uri_ = "";

      if (contentHashBuilder_ == null) {
        contentHash_ = null;
      } else {
        contentHash_ = null;
        contentHashBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1beta1.Grafeas.internal_static_grafeas_v1beta1_Resource_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.Resource getDefaultInstanceForType() {
      return io.grafeas.v1beta1.Resource.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1beta1.Resource build() {
      io.grafeas.v1beta1.Resource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.Resource buildPartial() {
      io.grafeas.v1beta1.Resource result = new io.grafeas.v1beta1.Resource(this);
      result.name_ = name_;
      result.uri_ = uri_;
      if (contentHashBuilder_ == null) {
        result.contentHash_ = contentHash_;
      } else {
        result.contentHash_ = contentHashBuilder_.build();
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
      if (other instanceof io.grafeas.v1beta1.Resource) {
        return mergeFrom((io.grafeas.v1beta1.Resource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.Resource other) {
      if (other == io.grafeas.v1beta1.Resource.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        onChanged();
      }
      if (other.hasContentHash()) {
        mergeContentHash(other.getContentHash());
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
      io.grafeas.v1beta1.Resource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1beta1.Resource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * The name of the resource. For example, the name of a Docker image -
     * "Debian".
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the resource. For example, the name of a Docker image -
     * "Debian".
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the resource. For example, the name of a Docker image -
     * "Debian".
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the resource. For example, the name of a Docker image -
     * "Debian".
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the resource. For example, the name of a Docker image -
     * "Debian".
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object uri_ = "";
    /**
     *
     *
     * <pre>
     * Required. The unique URI of the resource. For example,
     * `https://gcr.io/project/image&#64;sha256:foo` for a Docker image.
     * </pre>
     *
     * <code>string uri = 2;</code>
     *
     * @return The uri.
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The unique URI of the resource. For example,
     * `https://gcr.io/project/image&#64;sha256:foo` for a Docker image.
     * </pre>
     *
     * <code>string uri = 2;</code>
     *
     * @return The bytes for uri.
     */
    public com.google.protobuf.ByteString getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The unique URI of the resource. For example,
     * `https://gcr.io/project/image&#64;sha256:foo` for a Docker image.
     * </pre>
     *
     * <code>string uri = 2;</code>
     *
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      uri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The unique URI of the resource. For example,
     * `https://gcr.io/project/image&#64;sha256:foo` for a Docker image.
     * </pre>
     *
     * <code>string uri = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUri() {

      uri_ = getDefaultInstance().getUri();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The unique URI of the resource. For example,
     * `https://gcr.io/project/image&#64;sha256:foo` for a Docker image.
     * </pre>
     *
     * <code>string uri = 2;</code>
     *
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      uri_ = value;
      onChanged();
      return this;
    }

    private io.grafeas.v1beta1.provenance.Hash contentHash_;
    private com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1beta1.provenance.Hash,
            io.grafeas.v1beta1.provenance.Hash.Builder,
            io.grafeas.v1beta1.provenance.HashOrBuilder>
        contentHashBuilder_;
    /**
     *
     *
     * <pre>
     * The hash of the resource content. For example, the Docker digest.
     * </pre>
     *
     * <code>.grafeas.v1beta1.provenance.Hash content_hash = 3;</code>
     *
     * @return Whether the contentHash field is set.
     */
    public boolean hasContentHash() {
      return contentHashBuilder_ != null || contentHash_ != null;
    }
    /**
     *
     *
     * <pre>
     * The hash of the resource content. For example, the Docker digest.
     * </pre>
     *
     * <code>.grafeas.v1beta1.provenance.Hash content_hash = 3;</code>
     *
     * @return The contentHash.
     */
    public io.grafeas.v1beta1.provenance.Hash getContentHash() {
      if (contentHashBuilder_ == null) {
        return contentHash_ == null
            ? io.grafeas.v1beta1.provenance.Hash.getDefaultInstance()
            : contentHash_;
      } else {
        return contentHashBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The hash of the resource content. For example, the Docker digest.
     * </pre>
     *
     * <code>.grafeas.v1beta1.provenance.Hash content_hash = 3;</code>
     */
    public Builder setContentHash(io.grafeas.v1beta1.provenance.Hash value) {
      if (contentHashBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        contentHash_ = value;
        onChanged();
      } else {
        contentHashBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The hash of the resource content. For example, the Docker digest.
     * </pre>
     *
     * <code>.grafeas.v1beta1.provenance.Hash content_hash = 3;</code>
     */
    public Builder setContentHash(io.grafeas.v1beta1.provenance.Hash.Builder builderForValue) {
      if (contentHashBuilder_ == null) {
        contentHash_ = builderForValue.build();
        onChanged();
      } else {
        contentHashBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The hash of the resource content. For example, the Docker digest.
     * </pre>
     *
     * <code>.grafeas.v1beta1.provenance.Hash content_hash = 3;</code>
     */
    public Builder mergeContentHash(io.grafeas.v1beta1.provenance.Hash value) {
      if (contentHashBuilder_ == null) {
        if (contentHash_ != null) {
          contentHash_ =
              io.grafeas.v1beta1.provenance.Hash.newBuilder(contentHash_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          contentHash_ = value;
        }
        onChanged();
      } else {
        contentHashBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The hash of the resource content. For example, the Docker digest.
     * </pre>
     *
     * <code>.grafeas.v1beta1.provenance.Hash content_hash = 3;</code>
     */
    public Builder clearContentHash() {
      if (contentHashBuilder_ == null) {
        contentHash_ = null;
        onChanged();
      } else {
        contentHash_ = null;
        contentHashBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The hash of the resource content. For example, the Docker digest.
     * </pre>
     *
     * <code>.grafeas.v1beta1.provenance.Hash content_hash = 3;</code>
     */
    public io.grafeas.v1beta1.provenance.Hash.Builder getContentHashBuilder() {

      onChanged();
      return getContentHashFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The hash of the resource content. For example, the Docker digest.
     * </pre>
     *
     * <code>.grafeas.v1beta1.provenance.Hash content_hash = 3;</code>
     */
    public io.grafeas.v1beta1.provenance.HashOrBuilder getContentHashOrBuilder() {
      if (contentHashBuilder_ != null) {
        return contentHashBuilder_.getMessageOrBuilder();
      } else {
        return contentHash_ == null
            ? io.grafeas.v1beta1.provenance.Hash.getDefaultInstance()
            : contentHash_;
      }
    }
    /**
     *
     *
     * <pre>
     * The hash of the resource content. For example, the Docker digest.
     * </pre>
     *
     * <code>.grafeas.v1beta1.provenance.Hash content_hash = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1beta1.provenance.Hash,
            io.grafeas.v1beta1.provenance.Hash.Builder,
            io.grafeas.v1beta1.provenance.HashOrBuilder>
        getContentHashFieldBuilder() {
      if (contentHashBuilder_ == null) {
        contentHashBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                io.grafeas.v1beta1.provenance.Hash,
                io.grafeas.v1beta1.provenance.Hash.Builder,
                io.grafeas.v1beta1.provenance.HashOrBuilder>(
                getContentHash(), getParentForChildren(), isClean());
        contentHash_ = null;
      }
      return contentHashBuilder_;
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.Resource)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.Resource)
  private static final io.grafeas.v1beta1.Resource DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.Resource();
  }

  public static io.grafeas.v1beta1.Resource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Resource> PARSER =
      new com.google.protobuf.AbstractParser<Resource>() {
        @java.lang.Override
        public Resource parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Resource(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Resource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Resource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1beta1.Resource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}