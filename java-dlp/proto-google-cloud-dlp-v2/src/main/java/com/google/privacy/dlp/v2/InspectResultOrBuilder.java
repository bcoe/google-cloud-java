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

public interface InspectResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.InspectResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of findings for an item.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.Finding> getFindingsList();
  /**
   *
   *
   * <pre>
   * List of findings for an item.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
   */
  com.google.privacy.dlp.v2.Finding getFindings(int index);
  /**
   *
   *
   * <pre>
   * List of findings for an item.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
   */
  int getFindingsCount();
  /**
   *
   *
   * <pre>
   * List of findings for an item.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.FindingOrBuilder> getFindingsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of findings for an item.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Finding findings = 1;</code>
   */
  com.google.privacy.dlp.v2.FindingOrBuilder getFindingsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If true, then this item might have more findings than were returned,
   * and the findings returned are an arbitrary subset of all findings.
   * The findings list might be truncated because the input items were too
   * large, or because the server reached the maximum amount of resources
   * allowed for a single API call. For best results, divide the input into
   * smaller batches.
   * </pre>
   *
   * <code>bool findings_truncated = 2;</code>
   *
   * @return The findingsTruncated.
   */
  boolean getFindingsTruncated();
}