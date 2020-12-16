/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.recommender.v1beta1;

import com.google.api.core.BetaApi;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.pathtemplate.ValidationException;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class InsightTypeName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_INSIGHT_TYPE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/insightTypes/{insight_type}");
  private static final PathTemplate BILLING_ACCOUNT_LOCATION_INSIGHT_TYPE =
      PathTemplate.createWithoutUrlEncoding(
          "billingAccounts/{billing_account}/locations/{location}/insightTypes/{insight_type}");
  private volatile Map<String, String> fieldValuesMap;
  private PathTemplate pathTemplate;
  private String fixedValue;
  private final String project;
  private final String location;
  private final String insightType;
  private final String billingAccount;

  @Deprecated
  protected InsightTypeName() {
    project = null;
    location = null;
    insightType = null;
    billingAccount = null;
  }

  private InsightTypeName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    insightType = Preconditions.checkNotNull(builder.getInsightType());
    billingAccount = null;
    pathTemplate = PROJECT_LOCATION_INSIGHT_TYPE;
  }

  private InsightTypeName(BillingAccountLocationInsightTypeBuilder builder) {
    billingAccount = Preconditions.checkNotNull(builder.getBillingAccount());
    location = Preconditions.checkNotNull(builder.getLocation());
    insightType = Preconditions.checkNotNull(builder.getInsightType());
    project = null;
    pathTemplate = BILLING_ACCOUNT_LOCATION_INSIGHT_TYPE;
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getInsightType() {
    return insightType;
  }

  public String getBillingAccount() {
    return billingAccount;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  @BetaApi("The per-pattern Builders are not stable yet and may be changed in the future.")
  public static Builder newProjectLocationInsightTypeBuilder() {
    return new Builder();
  }

  @BetaApi("The per-pattern Builders are not stable yet and may be changed in the future.")
  public static BillingAccountLocationInsightTypeBuilder
      newBillingAccountLocationInsightTypeBuilder() {
    return new BillingAccountLocationInsightTypeBuilder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static InsightTypeName of(String project, String location, String insightType) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setInsightType(insightType)
        .build();
  }

  @BetaApi("The static create methods are not stable yet and may be changed in the future.")
  public static InsightTypeName ofProjectLocationInsightTypeName(
      String project, String location, String insightType) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setInsightType(insightType)
        .build();
  }

  @BetaApi("The static create methods are not stable yet and may be changed in the future.")
  public static InsightTypeName ofBillingAccountLocationInsightTypeName(
      String billingAccount, String location, String insightType) {
    return newBillingAccountLocationInsightTypeBuilder()
        .setBillingAccount(billingAccount)
        .setLocation(location)
        .setInsightType(insightType)
        .build();
  }

  public static String format(String project, String location, String insightType) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setInsightType(insightType)
        .build()
        .toString();
  }

  @BetaApi("The static format methods are not stable yet and may be changed in the future.")
  public static String formatProjectLocationInsightTypeName(
      String project, String location, String insightType) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setInsightType(insightType)
        .build()
        .toString();
  }

  @BetaApi("The static format methods are not stable yet and may be changed in the future.")
  public static String formatBillingAccountLocationInsightTypeName(
      String billingAccount, String location, String insightType) {
    return newBillingAccountLocationInsightTypeBuilder()
        .setBillingAccount(billingAccount)
        .setLocation(location)
        .setInsightType(insightType)
        .build()
        .toString();
  }

  public static InsightTypeName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    if (PROJECT_LOCATION_INSIGHT_TYPE.matches(formattedString)) {
      Map<String, String> matchMap = PROJECT_LOCATION_INSIGHT_TYPE.match(formattedString);
      return ofProjectLocationInsightTypeName(
          matchMap.get("project"), matchMap.get("location"), matchMap.get("insight_type"));
    } else if (BILLING_ACCOUNT_LOCATION_INSIGHT_TYPE.matches(formattedString)) {
      Map<String, String> matchMap = BILLING_ACCOUNT_LOCATION_INSIGHT_TYPE.match(formattedString);
      return ofBillingAccountLocationInsightTypeName(
          matchMap.get("billing_account"), matchMap.get("location"), matchMap.get("insight_type"));
    }
    throw new ValidationException("InsightTypeName.parse: formattedString not in valid format");
  }

  public static List<InsightTypeName> parseList(List<String> formattedStrings) {
    List<InsightTypeName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<InsightTypeName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (InsightTypeName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_INSIGHT_TYPE.matches(formattedString)
        || BILLING_ACCOUNT_LOCATION_INSIGHT_TYPE.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (project != null) {
            fieldMapBuilder.put("project", project);
          }
          if (location != null) {
            fieldMapBuilder.put("location", location);
          }
          if (insightType != null) {
            fieldMapBuilder.put("insight_type", insightType);
          }
          if (billingAccount != null) {
            fieldMapBuilder.put("billing_account", billingAccount);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return fixedValue != null ? fixedValue : pathTemplate.instantiate(getFieldValuesMap());
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      InsightTypeName that = ((InsightTypeName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.insightType, that.insightType)
          && Objects.equals(this.billingAccount, that.billingAccount);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(fixedValue);
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(location);
    h *= 1000003;
    h ^= Objects.hashCode(insightType);
    h *= 1000003;
    h ^= Objects.hashCode(billingAccount);
    return h;
  }

  /** Builder for projects/{project}/locations/{location}/insightTypes/{insight_type}. */
  public static class Builder {
    private String project;
    private String location;
    private String insightType;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getInsightType() {
      return insightType;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setInsightType(String insightType) {
      this.insightType = insightType;
      return this;
    }

    private Builder(InsightTypeName insightTypeName) {
      Preconditions.checkArgument(
          Objects.equals(insightTypeName.pathTemplate, PROJECT_LOCATION_INSIGHT_TYPE),
          "toBuilder is only supported when InsightTypeName has the pattern of projects/{project}/locations/{location}/insightTypes/{insight_type}");
      project = insightTypeName.project;
      location = insightTypeName.location;
      insightType = insightTypeName.insightType;
    }

    public InsightTypeName build() {
      return new InsightTypeName(this);
    }
  }

  /**
   * Builder for billingAccounts/{billing_account}/locations/{location}/insightTypes/{insight_type}.
   */
  @BetaApi("The per-pattern Builders are not stable yet and may be changed in the future.")
  public static class BillingAccountLocationInsightTypeBuilder {
    private String billingAccount;
    private String location;
    private String insightType;

    protected BillingAccountLocationInsightTypeBuilder() {}

    public String getBillingAccount() {
      return billingAccount;
    }

    public String getLocation() {
      return location;
    }

    public String getInsightType() {
      return insightType;
    }

    public BillingAccountLocationInsightTypeBuilder setBillingAccount(String billingAccount) {
      this.billingAccount = billingAccount;
      return this;
    }

    public BillingAccountLocationInsightTypeBuilder setLocation(String location) {
      this.location = location;
      return this;
    }

    public BillingAccountLocationInsightTypeBuilder setInsightType(String insightType) {
      this.insightType = insightType;
      return this;
    }

    public InsightTypeName build() {
      return new InsightTypeName(this);
    }
  }
}
