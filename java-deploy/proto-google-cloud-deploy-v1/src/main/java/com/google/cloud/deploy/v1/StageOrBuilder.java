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

public interface StageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.Stage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The target_id to which this stage points. This field refers exclusively to
   * the last segment of a target name. For example, this field would just be
   * `my-target` (rather than
   * `projects/project/deliveryPipelines/pipeline/targets/my-target`). The
   * parent `DeliveryPipeline` of the `Target` is inferred to be the parent
   * `DeliveryPipeline` of the `Release` in which this `Stage` lives.
   * </pre>
   *
   * <code>string target_id = 1;</code>
   *
   * @return The targetId.
   */
  java.lang.String getTargetId();
  /**
   *
   *
   * <pre>
   * The target_id to which this stage points. This field refers exclusively to
   * the last segment of a target name. For example, this field would just be
   * `my-target` (rather than
   * `projects/project/deliveryPipelines/pipeline/targets/my-target`). The
   * parent `DeliveryPipeline` of the `Target` is inferred to be the parent
   * `DeliveryPipeline` of the `Release` in which this `Stage` lives.
   * </pre>
   *
   * <code>string target_id = 1;</code>
   *
   * @return The bytes for targetId.
   */
  com.google.protobuf.ByteString getTargetIdBytes();

  /**
   *
   *
   * <pre>
   * Skaffold profiles to use when rendering the manifest for this stage's
   * `Target`.
   * </pre>
   *
   * <code>repeated string profiles = 2;</code>
   *
   * @return A list containing the profiles.
   */
  java.util.List<java.lang.String> getProfilesList();
  /**
   *
   *
   * <pre>
   * Skaffold profiles to use when rendering the manifest for this stage's
   * `Target`.
   * </pre>
   *
   * <code>repeated string profiles = 2;</code>
   *
   * @return The count of profiles.
   */
  int getProfilesCount();
  /**
   *
   *
   * <pre>
   * Skaffold profiles to use when rendering the manifest for this stage's
   * `Target`.
   * </pre>
   *
   * <code>repeated string profiles = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The profiles at the given index.
   */
  java.lang.String getProfiles(int index);
  /**
   *
   *
   * <pre>
   * Skaffold profiles to use when rendering the manifest for this stage's
   * `Target`.
   * </pre>
   *
   * <code>repeated string profiles = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the profiles at the given index.
   */
  com.google.protobuf.ByteString getProfilesBytes(int index);
}
