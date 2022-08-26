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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface NodeGroupAutoscalingPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NodeGroupAutoscalingPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The maximum number of nodes that the group should have. Must be set if autoscaling is enabled. Maximum value allowed is 100.
   * </pre>
   *
   * <code>optional int32 max_nodes = 297762838;</code>
   *
   * @return Whether the maxNodes field is set.
   */
  boolean hasMaxNodes();
  /**
   *
   *
   * <pre>
   * The maximum number of nodes that the group should have. Must be set if autoscaling is enabled. Maximum value allowed is 100.
   * </pre>
   *
   * <code>optional int32 max_nodes = 297762838;</code>
   *
   * @return The maxNodes.
   */
  int getMaxNodes();

  /**
   *
   *
   * <pre>
   * The minimum number of nodes that the group should have.
   * </pre>
   *
   * <code>optional int32 min_nodes = 533370500;</code>
   *
   * @return Whether the minNodes field is set.
   */
  boolean hasMinNodes();
  /**
   *
   *
   * <pre>
   * The minimum number of nodes that the group should have.
   * </pre>
   *
   * <code>optional int32 min_nodes = 533370500;</code>
   *
   * @return The minNodes.
   */
  int getMinNodes();

  /**
   *
   *
   * <pre>
   * The autoscaling mode. Set to one of: ON, OFF, or ONLY_SCALE_OUT. For more information, see Autoscaler modes.
   * Check the Mode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string mode = 3357091;</code>
   *
   * @return Whether the mode field is set.
   */
  boolean hasMode();
  /**
   *
   *
   * <pre>
   * The autoscaling mode. Set to one of: ON, OFF, or ONLY_SCALE_OUT. For more information, see Autoscaler modes.
   * Check the Mode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string mode = 3357091;</code>
   *
   * @return The mode.
   */
  java.lang.String getMode();
  /**
   *
   *
   * <pre>
   * The autoscaling mode. Set to one of: ON, OFF, or ONLY_SCALE_OUT. For more information, see Autoscaler modes.
   * Check the Mode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string mode = 3357091;</code>
   *
   * @return The bytes for mode.
   */
  com.google.protobuf.ByteString getModeBytes();
}