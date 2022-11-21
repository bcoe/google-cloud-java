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
// source: google/maps/routing/v2/route.proto

package com.google.maps.routing.v2;

public interface RouteLegOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.routing.v2.RouteLeg)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The travel distance of the route leg, in meters.
   * </pre>
   *
   * <code>int32 distance_meters = 1;</code>
   *
   * @return The distanceMeters.
   */
  int getDistanceMeters();

  /**
   *
   *
   * <pre>
   * The length of time needed to navigate the leg. If the `route_preference`
   * is set to `TRAFFIC_UNAWARE`, then this value is the same as
   * `static_duration`. If the `route_preference` is either `TRAFFIC_AWARE` or
   * `TRAFFIC_AWARE_OPTIMAL`, then this value is calculated taking traffic
   * conditions into account.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   *
   * @return Whether the duration field is set.
   */
  boolean hasDuration();
  /**
   *
   *
   * <pre>
   * The length of time needed to navigate the leg. If the `route_preference`
   * is set to `TRAFFIC_UNAWARE`, then this value is the same as
   * `static_duration`. If the `route_preference` is either `TRAFFIC_AWARE` or
   * `TRAFFIC_AWARE_OPTIMAL`, then this value is calculated taking traffic
   * conditions into account.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   *
   * @return The duration.
   */
  com.google.protobuf.Duration getDuration();
  /**
   *
   *
   * <pre>
   * The length of time needed to navigate the leg. If the `route_preference`
   * is set to `TRAFFIC_UNAWARE`, then this value is the same as
   * `static_duration`. If the `route_preference` is either `TRAFFIC_AWARE` or
   * `TRAFFIC_AWARE_OPTIMAL`, then this value is calculated taking traffic
   * conditions into account.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * The duration of traveling through the leg, calculated without taking
   * traffic conditions into consideration.
   * </pre>
   *
   * <code>.google.protobuf.Duration static_duration = 3;</code>
   *
   * @return Whether the staticDuration field is set.
   */
  boolean hasStaticDuration();
  /**
   *
   *
   * <pre>
   * The duration of traveling through the leg, calculated without taking
   * traffic conditions into consideration.
   * </pre>
   *
   * <code>.google.protobuf.Duration static_duration = 3;</code>
   *
   * @return The staticDuration.
   */
  com.google.protobuf.Duration getStaticDuration();
  /**
   *
   *
   * <pre>
   * The duration of traveling through the leg, calculated without taking
   * traffic conditions into consideration.
   * </pre>
   *
   * <code>.google.protobuf.Duration static_duration = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getStaticDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * The overall polyline for this leg. This includes that each `step`'s
   * polyline.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Polyline polyline = 4;</code>
   *
   * @return Whether the polyline field is set.
   */
  boolean hasPolyline();
  /**
   *
   *
   * <pre>
   * The overall polyline for this leg. This includes that each `step`'s
   * polyline.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Polyline polyline = 4;</code>
   *
   * @return The polyline.
   */
  com.google.maps.routing.v2.Polyline getPolyline();
  /**
   *
   *
   * <pre>
   * The overall polyline for this leg. This includes that each `step`'s
   * polyline.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Polyline polyline = 4;</code>
   */
  com.google.maps.routing.v2.PolylineOrBuilder getPolylineOrBuilder();

  /**
   *
   *
   * <pre>
   * The start location of this leg. This might be different from the provided
   * `origin`. For example, when the provided `origin` is not near a road, this
   * is a point on the road.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Location start_location = 5;</code>
   *
   * @return Whether the startLocation field is set.
   */
  boolean hasStartLocation();
  /**
   *
   *
   * <pre>
   * The start location of this leg. This might be different from the provided
   * `origin`. For example, when the provided `origin` is not near a road, this
   * is a point on the road.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Location start_location = 5;</code>
   *
   * @return The startLocation.
   */
  com.google.maps.routing.v2.Location getStartLocation();
  /**
   *
   *
   * <pre>
   * The start location of this leg. This might be different from the provided
   * `origin`. For example, when the provided `origin` is not near a road, this
   * is a point on the road.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Location start_location = 5;</code>
   */
  com.google.maps.routing.v2.LocationOrBuilder getStartLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * The end location of this leg. This might be different from the provided
   * `destination`. For example, when the provided `destination` is not near a
   * road, this is a point on the road.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Location end_location = 6;</code>
   *
   * @return Whether the endLocation field is set.
   */
  boolean hasEndLocation();
  /**
   *
   *
   * <pre>
   * The end location of this leg. This might be different from the provided
   * `destination`. For example, when the provided `destination` is not near a
   * road, this is a point on the road.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Location end_location = 6;</code>
   *
   * @return The endLocation.
   */
  com.google.maps.routing.v2.Location getEndLocation();
  /**
   *
   *
   * <pre>
   * The end location of this leg. This might be different from the provided
   * `destination`. For example, when the provided `destination` is not near a
   * road, this is a point on the road.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Location end_location = 6;</code>
   */
  com.google.maps.routing.v2.LocationOrBuilder getEndLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * An array of steps denoting segments within this leg. Each step represents
   * one navigation instruction.
   * </pre>
   *
   * <code>repeated .google.maps.routing.v2.RouteLegStep steps = 7;</code>
   */
  java.util.List<com.google.maps.routing.v2.RouteLegStep> getStepsList();
  /**
   *
   *
   * <pre>
   * An array of steps denoting segments within this leg. Each step represents
   * one navigation instruction.
   * </pre>
   *
   * <code>repeated .google.maps.routing.v2.RouteLegStep steps = 7;</code>
   */
  com.google.maps.routing.v2.RouteLegStep getSteps(int index);
  /**
   *
   *
   * <pre>
   * An array of steps denoting segments within this leg. Each step represents
   * one navigation instruction.
   * </pre>
   *
   * <code>repeated .google.maps.routing.v2.RouteLegStep steps = 7;</code>
   */
  int getStepsCount();
  /**
   *
   *
   * <pre>
   * An array of steps denoting segments within this leg. Each step represents
   * one navigation instruction.
   * </pre>
   *
   * <code>repeated .google.maps.routing.v2.RouteLegStep steps = 7;</code>
   */
  java.util.List<? extends com.google.maps.routing.v2.RouteLegStepOrBuilder>
      getStepsOrBuilderList();
  /**
   *
   *
   * <pre>
   * An array of steps denoting segments within this leg. Each step represents
   * one navigation instruction.
   * </pre>
   *
   * <code>repeated .google.maps.routing.v2.RouteLegStep steps = 7;</code>
   */
  com.google.maps.routing.v2.RouteLegStepOrBuilder getStepsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Encapsulates the additional information that the user should be informed
   * about, such as possible traffic zone restriction etc. on a route leg.
   * </pre>
   *
   * <code>.google.maps.routing.v2.RouteLegTravelAdvisory travel_advisory = 8;</code>
   *
   * @return Whether the travelAdvisory field is set.
   */
  boolean hasTravelAdvisory();
  /**
   *
   *
   * <pre>
   * Encapsulates the additional information that the user should be informed
   * about, such as possible traffic zone restriction etc. on a route leg.
   * </pre>
   *
   * <code>.google.maps.routing.v2.RouteLegTravelAdvisory travel_advisory = 8;</code>
   *
   * @return The travelAdvisory.
   */
  com.google.maps.routing.v2.RouteLegTravelAdvisory getTravelAdvisory();
  /**
   *
   *
   * <pre>
   * Encapsulates the additional information that the user should be informed
   * about, such as possible traffic zone restriction etc. on a route leg.
   * </pre>
   *
   * <code>.google.maps.routing.v2.RouteLegTravelAdvisory travel_advisory = 8;</code>
   */
  com.google.maps.routing.v2.RouteLegTravelAdvisoryOrBuilder getTravelAdvisoryOrBuilder();
}
