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

package com.google.cloud.dialogflow.v2.samples;

// [START dialogflow_v2_generated_versionsclient_listversions_paged_async]
import com.google.cloud.dialogflow.v2.AgentName;
import com.google.cloud.dialogflow.v2.ListVersionsRequest;
import com.google.cloud.dialogflow.v2.ListVersionsResponse;
import com.google.cloud.dialogflow.v2.Version;
import com.google.cloud.dialogflow.v2.VersionsClient;
import com.google.common.base.Strings;

public class AsyncListVersionsPaged {

  public static void main(String[] args) throws Exception {
    asyncListVersionsPaged();
  }

  public static void asyncListVersionsPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (VersionsClient versionsClient = VersionsClient.create()) {
      ListVersionsRequest request =
          ListVersionsRequest.newBuilder()
              .setParent(AgentName.ofProjectName("[PROJECT]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListVersionsResponse response = versionsClient.listVersionsCallable().call(request);
        for (Version element : response.getVersionsList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END dialogflow_v2_generated_versionsclient_listversions_paged_async]
