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
// source: google/cloud/securitycenter/v1/exfiltration.proto

package com.google.cloud.securitycenter.v1;

public interface ExfiltrationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.Exfiltration)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If there are multiple sources, then the data is considered "joined" between
   * them. For instance, BigQuery can join multiple tables, and each
   * table would be considered a source.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.ExfilResource sources = 1;</code>
   */
  java.util.List<com.google.cloud.securitycenter.v1.ExfilResource> getSourcesList();
  /**
   *
   *
   * <pre>
   * If there are multiple sources, then the data is considered "joined" between
   * them. For instance, BigQuery can join multiple tables, and each
   * table would be considered a source.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.ExfilResource sources = 1;</code>
   */
  com.google.cloud.securitycenter.v1.ExfilResource getSources(int index);
  /**
   *
   *
   * <pre>
   * If there are multiple sources, then the data is considered "joined" between
   * them. For instance, BigQuery can join multiple tables, and each
   * table would be considered a source.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.ExfilResource sources = 1;</code>
   */
  int getSourcesCount();
  /**
   *
   *
   * <pre>
   * If there are multiple sources, then the data is considered "joined" between
   * them. For instance, BigQuery can join multiple tables, and each
   * table would be considered a source.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.ExfilResource sources = 1;</code>
   */
  java.util.List<? extends com.google.cloud.securitycenter.v1.ExfilResourceOrBuilder>
      getSourcesOrBuilderList();
  /**
   *
   *
   * <pre>
   * If there are multiple sources, then the data is considered "joined" between
   * them. For instance, BigQuery can join multiple tables, and each
   * table would be considered a source.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.ExfilResource sources = 1;</code>
   */
  com.google.cloud.securitycenter.v1.ExfilResourceOrBuilder getSourcesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If there are multiple targets, each target would get a complete copy of the
   * "joined" source data.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.ExfilResource targets = 2;</code>
   */
  java.util.List<com.google.cloud.securitycenter.v1.ExfilResource> getTargetsList();
  /**
   *
   *
   * <pre>
   * If there are multiple targets, each target would get a complete copy of the
   * "joined" source data.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.ExfilResource targets = 2;</code>
   */
  com.google.cloud.securitycenter.v1.ExfilResource getTargets(int index);
  /**
   *
   *
   * <pre>
   * If there are multiple targets, each target would get a complete copy of the
   * "joined" source data.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.ExfilResource targets = 2;</code>
   */
  int getTargetsCount();
  /**
   *
   *
   * <pre>
   * If there are multiple targets, each target would get a complete copy of the
   * "joined" source data.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.ExfilResource targets = 2;</code>
   */
  java.util.List<? extends com.google.cloud.securitycenter.v1.ExfilResourceOrBuilder>
      getTargetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * If there are multiple targets, each target would get a complete copy of the
   * "joined" source data.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.ExfilResource targets = 2;</code>
   */
  com.google.cloud.securitycenter.v1.ExfilResourceOrBuilder getTargetsOrBuilder(int index);
}