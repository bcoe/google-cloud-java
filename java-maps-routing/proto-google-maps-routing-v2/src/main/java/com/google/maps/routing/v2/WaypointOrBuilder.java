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
// source: google/maps/routing/v2/waypoint.proto

package com.google.maps.routing.v2;

public interface WaypointOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.routing.v2.Waypoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A point specified using geographic coordinates, including an optional
   * heading.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Location location = 1;</code>
   *
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   *
   *
   * <pre>
   * A point specified using geographic coordinates, including an optional
   * heading.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Location location = 1;</code>
   *
   * @return The location.
   */
  com.google.maps.routing.v2.Location getLocation();
  /**
   *
   *
   * <pre>
   * A point specified using geographic coordinates, including an optional
   * heading.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Location location = 1;</code>
   */
  com.google.maps.routing.v2.LocationOrBuilder getLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * The POI Place ID associated with the waypoint.
   * </pre>
   *
   * <code>string place_id = 2;</code>
   *
   * @return Whether the placeId field is set.
   */
  boolean hasPlaceId();
  /**
   *
   *
   * <pre>
   * The POI Place ID associated with the waypoint.
   * </pre>
   *
   * <code>string place_id = 2;</code>
   *
   * @return The placeId.
   */
  java.lang.String getPlaceId();
  /**
   *
   *
   * <pre>
   * The POI Place ID associated with the waypoint.
   * </pre>
   *
   * <code>string place_id = 2;</code>
   *
   * @return The bytes for placeId.
   */
  com.google.protobuf.ByteString getPlaceIdBytes();

  /**
   *
   *
   * <pre>
   * Marks this waypoint as a milestone rather a stopping point. For
   * each non-via waypoint in the request, the response appends an entry to the
   * `legs` array to provide the details for stopovers on that leg of the
   * trip. Set this value to true when you want the route to pass through this
   * waypoint without stopping over. Via waypoints don't cause an entry to be
   * added to the `legs` array, but they do route the journey through the
   * waypoint. You can only set this value on waypoints that are intermediates.
   * The request fails if you set this field on terminal waypoints.
   * If `ComputeRoutesRequest.optimize_waypoint_order`
   * is set to true then this field cannot be set to
   * true; otherwise, the request fails.
   * </pre>
   *
   * <code>bool via = 3;</code>
   *
   * @return The via.
   */
  boolean getVia();

  /**
   *
   *
   * <pre>
   * Indicates that the waypoint is meant for vehicles to stop at, where the
   * intention is to either pickup or drop-off. When you set this value, the
   * calculated route won't include non-`via` waypoints on roads that are
   * unsuitable for pickup and drop-off. This option works only for `DRIVE` and
   * `TWO_WHEELER` travel modes, and when the `location_type` is `location`.
   * </pre>
   *
   * <code>bool vehicle_stopover = 4;</code>
   *
   * @return The vehicleStopover.
   */
  boolean getVehicleStopover();

  /**
   *
   *
   * <pre>
   * Indicates that the location of this waypoint is meant to have a preference
   * for the vehicle to stop at a particular side of road. When you set this
   * value, the route will pass through the location so that the vehicle can
   * stop at the side of road that the location is biased towards from the
   * center of the road. This option works only for 'DRIVE' and 'TWO_WHEELER'
   * travel modes.
   * </pre>
   *
   * <code>bool side_of_road = 5;</code>
   *
   * @return The sideOfRoad.
   */
  boolean getSideOfRoad();

  public com.google.maps.routing.v2.Waypoint.LocationTypeCase getLocationTypeCase();
}
