/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.gkehub.v1beta1.samples;

// [START gkehub_v1beta1_generated_gkehubmembershipserviceclient_getmembership_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.gkehub.v1beta1.GetMembershipRequest;
import com.google.cloud.gkehub.v1beta1.GkeHubMembershipServiceClient;
import com.google.cloud.gkehub.v1beta1.Membership;
import com.google.cloud.gkehub.v1beta1.MembershipName;

public class AsyncGetMembership {

  public static void main(String[] args) throws Exception {
    asyncGetMembership();
  }

  public static void asyncGetMembership() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (GkeHubMembershipServiceClient gkeHubMembershipServiceClient =
        GkeHubMembershipServiceClient.create()) {
      GetMembershipRequest request =
          GetMembershipRequest.newBuilder()
              .setName(MembershipName.of("[PROJECT]", "[LOCATION]", "[MEMBERSHIP]").toString())
              .build();
      ApiFuture<Membership> future =
          gkeHubMembershipServiceClient.getMembershipCallable().futureCall(request);
      // Do something.
      Membership response = future.get();
    }
  }
}
// [END gkehub_v1beta1_generated_gkehubmembershipserviceclient_getmembership_async]