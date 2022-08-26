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
// source: google/monitoring/v3/uptime_service.proto

package com.google.monitoring.v3;

public interface UpdateUptimeCheckConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.UpdateUptimeCheckConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. If present, only the listed fields in the current Uptime check
   * configuration are updated with values from the new configuration. If this
   * field is empty, then the current configuration is completely replaced with
   * the new configuration.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. If present, only the listed fields in the current Uptime check
   * configuration are updated with values from the new configuration. If this
   * field is empty, then the current configuration is completely replaced with
   * the new configuration.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. If present, only the listed fields in the current Uptime check
   * configuration are updated with values from the new configuration. If this
   * field is empty, then the current configuration is completely replaced with
   * the new configuration.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. If an `updateMask` has been specified, this field gives
   * the values for the set of fields mentioned in the `updateMask`. If an
   * `updateMask` has not been given, this Uptime check configuration replaces
   * the current configuration. If a field is mentioned in `updateMask` but
   * the corresonding field is omitted in this partial Uptime check
   * configuration, it has the effect of deleting/clearing the field from the
   * configuration on the server.
   * The following fields can be updated: `display_name`,
   * `http_check`, `tcp_check`, `timeout`, `content_matchers`, and
   * `selected_regions`.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.UptimeCheckConfig uptime_check_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the uptimeCheckConfig field is set.
   */
  boolean hasUptimeCheckConfig();
  /**
   *
   *
   * <pre>
   * Required. If an `updateMask` has been specified, this field gives
   * the values for the set of fields mentioned in the `updateMask`. If an
   * `updateMask` has not been given, this Uptime check configuration replaces
   * the current configuration. If a field is mentioned in `updateMask` but
   * the corresonding field is omitted in this partial Uptime check
   * configuration, it has the effect of deleting/clearing the field from the
   * configuration on the server.
   * The following fields can be updated: `display_name`,
   * `http_check`, `tcp_check`, `timeout`, `content_matchers`, and
   * `selected_regions`.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.UptimeCheckConfig uptime_check_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The uptimeCheckConfig.
   */
  com.google.monitoring.v3.UptimeCheckConfig getUptimeCheckConfig();
  /**
   *
   *
   * <pre>
   * Required. If an `updateMask` has been specified, this field gives
   * the values for the set of fields mentioned in the `updateMask`. If an
   * `updateMask` has not been given, this Uptime check configuration replaces
   * the current configuration. If a field is mentioned in `updateMask` but
   * the corresonding field is omitted in this partial Uptime check
   * configuration, it has the effect of deleting/clearing the field from the
   * configuration on the server.
   * The following fields can be updated: `display_name`,
   * `http_check`, `tcp_check`, `timeout`, `content_matchers`, and
   * `selected_regions`.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.UptimeCheckConfig uptime_check_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.monitoring.v3.UptimeCheckConfigOrBuilder getUptimeCheckConfigOrBuilder();
}