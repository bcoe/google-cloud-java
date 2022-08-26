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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface ContentLocationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ContentLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the container where the finding is located.
   * The top level name is the source file name or table name. Names of some
   * common storage containers are formatted as follows:
   * * BigQuery tables:  `{project_id}:{dataset_id}.{table_id}`
   * * Cloud Storage files: `gs://{bucket}/{path}`
   * * Datastore namespace: {namespace}
   * Nested names could be absent if the embedded object has no string
   * identifier (for an example an image contained within a document).
   * </pre>
   *
   * <code>string container_name = 1;</code>
   *
   * @return The containerName.
   */
  java.lang.String getContainerName();
  /**
   *
   *
   * <pre>
   * Name of the container where the finding is located.
   * The top level name is the source file name or table name. Names of some
   * common storage containers are formatted as follows:
   * * BigQuery tables:  `{project_id}:{dataset_id}.{table_id}`
   * * Cloud Storage files: `gs://{bucket}/{path}`
   * * Datastore namespace: {namespace}
   * Nested names could be absent if the embedded object has no string
   * identifier (for an example an image contained within a document).
   * </pre>
   *
   * <code>string container_name = 1;</code>
   *
   * @return The bytes for containerName.
   */
  com.google.protobuf.ByteString getContainerNameBytes();

  /**
   *
   *
   * <pre>
   * Location within a row or record of a database table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordLocation record_location = 2;</code>
   *
   * @return Whether the recordLocation field is set.
   */
  boolean hasRecordLocation();
  /**
   *
   *
   * <pre>
   * Location within a row or record of a database table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordLocation record_location = 2;</code>
   *
   * @return The recordLocation.
   */
  com.google.privacy.dlp.v2.RecordLocation getRecordLocation();
  /**
   *
   *
   * <pre>
   * Location within a row or record of a database table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordLocation record_location = 2;</code>
   */
  com.google.privacy.dlp.v2.RecordLocationOrBuilder getRecordLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * Location within an image's pixels.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ImageLocation image_location = 3;</code>
   *
   * @return Whether the imageLocation field is set.
   */
  boolean hasImageLocation();
  /**
   *
   *
   * <pre>
   * Location within an image's pixels.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ImageLocation image_location = 3;</code>
   *
   * @return The imageLocation.
   */
  com.google.privacy.dlp.v2.ImageLocation getImageLocation();
  /**
   *
   *
   * <pre>
   * Location within an image's pixels.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ImageLocation image_location = 3;</code>
   */
  com.google.privacy.dlp.v2.ImageLocationOrBuilder getImageLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * Location data for document files.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DocumentLocation document_location = 5;</code>
   *
   * @return Whether the documentLocation field is set.
   */
  boolean hasDocumentLocation();
  /**
   *
   *
   * <pre>
   * Location data for document files.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DocumentLocation document_location = 5;</code>
   *
   * @return The documentLocation.
   */
  com.google.privacy.dlp.v2.DocumentLocation getDocumentLocation();
  /**
   *
   *
   * <pre>
   * Location data for document files.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DocumentLocation document_location = 5;</code>
   */
  com.google.privacy.dlp.v2.DocumentLocationOrBuilder getDocumentLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * Location within the metadata for inspected content.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.MetadataLocation metadata_location = 8;</code>
   *
   * @return Whether the metadataLocation field is set.
   */
  boolean hasMetadataLocation();
  /**
   *
   *
   * <pre>
   * Location within the metadata for inspected content.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.MetadataLocation metadata_location = 8;</code>
   *
   * @return The metadataLocation.
   */
  com.google.privacy.dlp.v2.MetadataLocation getMetadataLocation();
  /**
   *
   *
   * <pre>
   * Location within the metadata for inspected content.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.MetadataLocation metadata_location = 8;</code>
   */
  com.google.privacy.dlp.v2.MetadataLocationOrBuilder getMetadataLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * Findings container modification timestamp, if applicable.
   * For Google Cloud Storage contains last file modification timestamp.
   * For BigQuery table contains last_modified_time property.
   * For Datastore - not populated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp container_timestamp = 6;</code>
   *
   * @return Whether the containerTimestamp field is set.
   */
  boolean hasContainerTimestamp();
  /**
   *
   *
   * <pre>
   * Findings container modification timestamp, if applicable.
   * For Google Cloud Storage contains last file modification timestamp.
   * For BigQuery table contains last_modified_time property.
   * For Datastore - not populated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp container_timestamp = 6;</code>
   *
   * @return The containerTimestamp.
   */
  com.google.protobuf.Timestamp getContainerTimestamp();
  /**
   *
   *
   * <pre>
   * Findings container modification timestamp, if applicable.
   * For Google Cloud Storage contains last file modification timestamp.
   * For BigQuery table contains last_modified_time property.
   * For Datastore - not populated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp container_timestamp = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getContainerTimestampOrBuilder();

  /**
   *
   *
   * <pre>
   * Findings container version, if available
   * ("generation" for Google Cloud Storage).
   * </pre>
   *
   * <code>string container_version = 7;</code>
   *
   * @return The containerVersion.
   */
  java.lang.String getContainerVersion();
  /**
   *
   *
   * <pre>
   * Findings container version, if available
   * ("generation" for Google Cloud Storage).
   * </pre>
   *
   * <code>string container_version = 7;</code>
   *
   * @return The bytes for containerVersion.
   */
  com.google.protobuf.ByteString getContainerVersionBytes();

  public com.google.privacy.dlp.v2.ContentLocation.LocationCase getLocationCase();
}