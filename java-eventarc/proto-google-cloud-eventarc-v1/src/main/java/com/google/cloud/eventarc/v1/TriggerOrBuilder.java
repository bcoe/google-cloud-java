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
// source: google/cloud/eventarc/v1/trigger.proto

package com.google.cloud.eventarc.v1;

public interface TriggerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.eventarc.v1.Trigger)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the trigger. Must be unique within the location of the
   * project and must be in
   * `projects/{project}/locations/{location}/triggers/{trigger}` format.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the trigger. Must be unique within the location of the
   * project and must be in
   * `projects/{project}/locations/{location}/triggers/{trigger}` format.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Server-assigned unique identifier for the trigger. The value is a UUID4
   * string and guaranteed to remain unchanged until the resource is deleted.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. Server-assigned unique identifier for the trigger. The value is a UUID4
   * string and guaranteed to remain unchanged until the resource is deleted.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Unordered list. The list of filters that applies to event attributes. Only events that
   * match all the provided filters are sent to the destination.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.eventarc.v1.EventFilter event_filters = 8 [(.google.api.field_behavior) = UNORDERED_LIST, (.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.eventarc.v1.EventFilter> getEventFiltersList();
  /**
   *
   *
   * <pre>
   * Required. Unordered list. The list of filters that applies to event attributes. Only events that
   * match all the provided filters are sent to the destination.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.eventarc.v1.EventFilter event_filters = 8 [(.google.api.field_behavior) = UNORDERED_LIST, (.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.eventarc.v1.EventFilter getEventFilters(int index);
  /**
   *
   *
   * <pre>
   * Required. Unordered list. The list of filters that applies to event attributes. Only events that
   * match all the provided filters are sent to the destination.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.eventarc.v1.EventFilter event_filters = 8 [(.google.api.field_behavior) = UNORDERED_LIST, (.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getEventFiltersCount();
  /**
   *
   *
   * <pre>
   * Required. Unordered list. The list of filters that applies to event attributes. Only events that
   * match all the provided filters are sent to the destination.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.eventarc.v1.EventFilter event_filters = 8 [(.google.api.field_behavior) = UNORDERED_LIST, (.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.eventarc.v1.EventFilterOrBuilder>
      getEventFiltersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. Unordered list. The list of filters that applies to event attributes. Only events that
   * match all the provided filters are sent to the destination.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.eventarc.v1.EventFilter event_filters = 8 [(.google.api.field_behavior) = UNORDERED_LIST, (.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.eventarc.v1.EventFilterOrBuilder getEventFiltersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. The IAM service account email associated with the trigger. The
   * service account represents the identity of the trigger.
   * The principal who calls this API must have the `iam.serviceAccounts.actAs`
   * permission in the service account. See
   * https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common
   * for more information.
   * For Cloud Run destinations, this service account is used to generate
   * identity tokens when invoking the service. See
   * https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account
   * for information on how to invoke authenticated Cloud Run services.
   * To create Audit Log triggers, the service account should also
   * have the `roles/eventarc.eventReceiver` IAM role.
   * </pre>
   *
   * <code>
   * string service_account = 9 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * Optional. The IAM service account email associated with the trigger. The
   * service account represents the identity of the trigger.
   * The principal who calls this API must have the `iam.serviceAccounts.actAs`
   * permission in the service account. See
   * https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common
   * for more information.
   * For Cloud Run destinations, this service account is used to generate
   * identity tokens when invoking the service. See
   * https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account
   * for information on how to invoke authenticated Cloud Run services.
   * To create Audit Log triggers, the service account should also
   * have the `roles/eventarc.eventReceiver` IAM role.
   * </pre>
   *
   * <code>
   * string service_account = 9 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * Required. Destination specifies where the events should be sent to.
   * </pre>
   *
   * <code>
   * .google.cloud.eventarc.v1.Destination destination = 10 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the destination field is set.
   */
  boolean hasDestination();
  /**
   *
   *
   * <pre>
   * Required. Destination specifies where the events should be sent to.
   * </pre>
   *
   * <code>
   * .google.cloud.eventarc.v1.Destination destination = 10 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The destination.
   */
  com.google.cloud.eventarc.v1.Destination getDestination();
  /**
   *
   *
   * <pre>
   * Required. Destination specifies where the events should be sent to.
   * </pre>
   *
   * <code>
   * .google.cloud.eventarc.v1.Destination destination = 10 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.eventarc.v1.DestinationOrBuilder getDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. To deliver messages, Eventarc might use other GCP
   * products as a transport intermediary. This field contains a reference to
   * that transport intermediary. This information can be used for debugging
   * purposes.
   * </pre>
   *
   * <code>
   * .google.cloud.eventarc.v1.Transport transport = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the transport field is set.
   */
  boolean hasTransport();
  /**
   *
   *
   * <pre>
   * Optional. To deliver messages, Eventarc might use other GCP
   * products as a transport intermediary. This field contains a reference to
   * that transport intermediary. This information can be used for debugging
   * purposes.
   * </pre>
   *
   * <code>
   * .google.cloud.eventarc.v1.Transport transport = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The transport.
   */
  com.google.cloud.eventarc.v1.Transport getTransport();
  /**
   *
   *
   * <pre>
   * Optional. To deliver messages, Eventarc might use other GCP
   * products as a transport intermediary. This field contains a reference to
   * that transport intermediary. This information can be used for debugging
   * purposes.
   * </pre>
   *
   * <code>
   * .google.cloud.eventarc.v1.Transport transport = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.eventarc.v1.TransportOrBuilder getTransportOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. User labels attached to the triggers that can be used to group resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. User labels attached to the triggers that can be used to group resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. User labels attached to the triggers that can be used to group resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. User labels attached to the triggers that can be used to group resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   */

  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. User labels attached to the triggers that can be used to group resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. The name of the channel associated with the trigger in
   * `projects/{project}/locations/{location}/channels/{channel}` format.
   * You must provide a channel to receive events from Eventarc SaaS partners.
   * </pre>
   *
   * <code>string channel = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The channel.
   */
  java.lang.String getChannel();
  /**
   *
   *
   * <pre>
   * Optional. The name of the channel associated with the trigger in
   * `projects/{project}/locations/{location}/channels/{channel}` format.
   * You must provide a channel to receive events from Eventarc SaaS partners.
   * </pre>
   *
   * <code>string channel = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for channel.
   */
  com.google.protobuf.ByteString getChannelBytes();

  /**
   *
   *
   * <pre>
   * Output only. The reason(s) why a trigger is in FAILED state.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.eventarc.v1.StateCondition&gt; conditions = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getConditionsCount();
  /**
   *
   *
   * <pre>
   * Output only. The reason(s) why a trigger is in FAILED state.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.eventarc.v1.StateCondition&gt; conditions = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsConditions(java.lang.String key);
  /** Use {@link #getConditionsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.eventarc.v1.StateCondition> getConditions();
  /**
   *
   *
   * <pre>
   * Output only. The reason(s) why a trigger is in FAILED state.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.eventarc.v1.StateCondition&gt; conditions = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.eventarc.v1.StateCondition> getConditionsMap();
  /**
   *
   *
   * <pre>
   * Output only. The reason(s) why a trigger is in FAILED state.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.eventarc.v1.StateCondition&gt; conditions = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */

  /* nullable */
  com.google.cloud.eventarc.v1.StateCondition getConditionsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.eventarc.v1.StateCondition defaultValue);
  /**
   *
   *
   * <pre>
   * Output only. The reason(s) why a trigger is in FAILED state.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.eventarc.v1.StateCondition&gt; conditions = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.eventarc.v1.StateCondition getConditionsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. This checksum is computed by the server based on the value of other
   * fields, and might be sent only on create requests to ensure that the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 99 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Output only. This checksum is computed by the server based on the value of other
   * fields, and might be sent only on create requests to ensure that the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 99 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}
