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
// source: google/cloud/eventarc/publishing/v1/publisher.proto

package com.google.cloud.eventarc.publishing.v1;

public interface PublishChannelConnectionEventsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The channel_connection that the events are published from. For example:
   * `projects/{partner_project_id}/locations/{location}/channelConnections/{channel_connection_id}`.
   * </pre>
   *
   * <code>string channel_connection = 1;</code>
   *
   * @return The channelConnection.
   */
  java.lang.String getChannelConnection();
  /**
   *
   *
   * <pre>
   * The channel_connection that the events are published from. For example:
   * `projects/{partner_project_id}/locations/{location}/channelConnections/{channel_connection_id}`.
   * </pre>
   *
   * <code>string channel_connection = 1;</code>
   *
   * @return The bytes for channelConnection.
   */
  com.google.protobuf.ByteString getChannelConnectionBytes();

  /**
   *
   *
   * <pre>
   * The CloudEvents v1.0 events to publish. No other types are allowed.
   * If this field is set, then the `text_events` fields must not be set.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any events = 2;</code>
   */
  java.util.List<com.google.protobuf.Any> getEventsList();
  /**
   *
   *
   * <pre>
   * The CloudEvents v1.0 events to publish. No other types are allowed.
   * If this field is set, then the `text_events` fields must not be set.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any events = 2;</code>
   */
  com.google.protobuf.Any getEvents(int index);
  /**
   *
   *
   * <pre>
   * The CloudEvents v1.0 events to publish. No other types are allowed.
   * If this field is set, then the `text_events` fields must not be set.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any events = 2;</code>
   */
  int getEventsCount();
  /**
   *
   *
   * <pre>
   * The CloudEvents v1.0 events to publish. No other types are allowed.
   * If this field is set, then the `text_events` fields must not be set.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any events = 2;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> getEventsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The CloudEvents v1.0 events to publish. No other types are allowed.
   * If this field is set, then the `text_events` fields must not be set.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any events = 2;</code>
   */
  com.google.protobuf.AnyOrBuilder getEventsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The text representation of events to publish.
   * CloudEvent v1.0 in JSON format is the only allowed type. Refer to
   * https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/formats/json-format.md
   * for specification.
   * If this field is set, then the `events` fields must not be set.
   * </pre>
   *
   * <code>repeated string text_events = 3;</code>
   *
   * @return A list containing the textEvents.
   */
  java.util.List<java.lang.String> getTextEventsList();
  /**
   *
   *
   * <pre>
   * The text representation of events to publish.
   * CloudEvent v1.0 in JSON format is the only allowed type. Refer to
   * https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/formats/json-format.md
   * for specification.
   * If this field is set, then the `events` fields must not be set.
   * </pre>
   *
   * <code>repeated string text_events = 3;</code>
   *
   * @return The count of textEvents.
   */
  int getTextEventsCount();
  /**
   *
   *
   * <pre>
   * The text representation of events to publish.
   * CloudEvent v1.0 in JSON format is the only allowed type. Refer to
   * https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/formats/json-format.md
   * for specification.
   * If this field is set, then the `events` fields must not be set.
   * </pre>
   *
   * <code>repeated string text_events = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The textEvents at the given index.
   */
  java.lang.String getTextEvents(int index);
  /**
   *
   *
   * <pre>
   * The text representation of events to publish.
   * CloudEvent v1.0 in JSON format is the only allowed type. Refer to
   * https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/formats/json-format.md
   * for specification.
   * If this field is set, then the `events` fields must not be set.
   * </pre>
   *
   * <code>repeated string text_events = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the textEvents at the given index.
   */
  com.google.protobuf.ByteString getTextEventsBytes(int index);
}
