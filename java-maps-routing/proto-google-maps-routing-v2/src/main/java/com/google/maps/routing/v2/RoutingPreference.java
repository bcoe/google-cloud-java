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
// source: google/maps/routing/v2/routing_preference.proto

package com.google.maps.routing.v2;

/**
 *
 *
 * <pre>
 * A set of values that specify factors to take into consideration when
 * calculating the route.
 * </pre>
 *
 * Protobuf enum {@code google.maps.routing.v2.RoutingPreference}
 */
public enum RoutingPreference implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * No routing preference specified. Default to `TRAFFIC_UNAWARE`.
   * </pre>
   *
   * <code>ROUTING_PREFERENCE_UNSPECIFIED = 0;</code>
   */
  ROUTING_PREFERENCE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Computes routes without taking live traffic conditions into consideration.
   * Suitable when traffic conditions don't matter or are not applicable.
   * Using this value produces the lowest latency.
   * Note: For `RouteTravelMode` DRIVE and TWO_WHEELER choice of route and
   * duration are based on road network and average time-independent traffic
   * conditions. Results for a given request may vary over time due to changes
   * in the road network, updated average traffic conditions, and the
   * distributed nature of the service. Results may also vary between
   * nearly-equivalent routes at any time or frequency.
   * </pre>
   *
   * <code>TRAFFIC_UNAWARE = 1;</code>
   */
  TRAFFIC_UNAWARE(1),
  /**
   *
   *
   * <pre>
   * Calculates routes taking live traffic conditions into consideration.
   * In contrast to `TRAFFIC_AWARE_OPTIMAL`, some optimizations are applied to
   * significantly reduce latency.
   * </pre>
   *
   * <code>TRAFFIC_AWARE = 2;</code>
   */
  TRAFFIC_AWARE(2),
  /**
   *
   *
   * <pre>
   * Calculates the routes taking live traffic conditions into consideration,
   * without applying most performance optimizations. Using this value produces
   * the highest latency.
   * </pre>
   *
   * <code>TRAFFIC_AWARE_OPTIMAL = 3;</code>
   */
  TRAFFIC_AWARE_OPTIMAL(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * No routing preference specified. Default to `TRAFFIC_UNAWARE`.
   * </pre>
   *
   * <code>ROUTING_PREFERENCE_UNSPECIFIED = 0;</code>
   */
  public static final int ROUTING_PREFERENCE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Computes routes without taking live traffic conditions into consideration.
   * Suitable when traffic conditions don't matter or are not applicable.
   * Using this value produces the lowest latency.
   * Note: For `RouteTravelMode` DRIVE and TWO_WHEELER choice of route and
   * duration are based on road network and average time-independent traffic
   * conditions. Results for a given request may vary over time due to changes
   * in the road network, updated average traffic conditions, and the
   * distributed nature of the service. Results may also vary between
   * nearly-equivalent routes at any time or frequency.
   * </pre>
   *
   * <code>TRAFFIC_UNAWARE = 1;</code>
   */
  public static final int TRAFFIC_UNAWARE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Calculates routes taking live traffic conditions into consideration.
   * In contrast to `TRAFFIC_AWARE_OPTIMAL`, some optimizations are applied to
   * significantly reduce latency.
   * </pre>
   *
   * <code>TRAFFIC_AWARE = 2;</code>
   */
  public static final int TRAFFIC_AWARE_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Calculates the routes taking live traffic conditions into consideration,
   * without applying most performance optimizations. Using this value produces
   * the highest latency.
   * </pre>
   *
   * <code>TRAFFIC_AWARE_OPTIMAL = 3;</code>
   */
  public static final int TRAFFIC_AWARE_OPTIMAL_VALUE = 3;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static RoutingPreference valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RoutingPreference forNumber(int value) {
    switch (value) {
      case 0:
        return ROUTING_PREFERENCE_UNSPECIFIED;
      case 1:
        return TRAFFIC_UNAWARE;
      case 2:
        return TRAFFIC_AWARE;
      case 3:
        return TRAFFIC_AWARE_OPTIMAL;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RoutingPreference> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<RoutingPreference>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RoutingPreference>() {
            public RoutingPreference findValueByNumber(int number) {
              return RoutingPreference.forNumber(number);
            }
          };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.maps.routing.v2.RoutingPreferenceProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final RoutingPreference[] VALUES = values();

  public static RoutingPreference valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private RoutingPreference(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.maps.routing.v2.RoutingPreference)
}
