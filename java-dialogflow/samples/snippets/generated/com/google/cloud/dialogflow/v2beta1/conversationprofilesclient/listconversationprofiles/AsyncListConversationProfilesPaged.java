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

package com.google.cloud.dialogflow.v2beta1.samples;

// [START
// dialogflow_v2beta1_generated_conversationprofilesclient_listconversationprofiles_paged_async]
import com.google.cloud.dialogflow.v2beta1.ConversationProfile;
import com.google.cloud.dialogflow.v2beta1.ConversationProfilesClient;
import com.google.cloud.dialogflow.v2beta1.ListConversationProfilesRequest;
import com.google.cloud.dialogflow.v2beta1.ListConversationProfilesResponse;
import com.google.cloud.dialogflow.v2beta1.ProjectName;
import com.google.common.base.Strings;

public class AsyncListConversationProfilesPaged {

  public static void main(String[] args) throws Exception {
    asyncListConversationProfilesPaged();
  }

  public static void asyncListConversationProfilesPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ConversationProfilesClient conversationProfilesClient =
        ConversationProfilesClient.create()) {
      ListConversationProfilesRequest request =
          ListConversationProfilesRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListConversationProfilesResponse response =
            conversationProfilesClient.listConversationProfilesCallable().call(request);
        for (ConversationProfile element : response.getConversationProfilesList()) {
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
// [END
// dialogflow_v2beta1_generated_conversationprofilesclient_listconversationprofiles_paged_async]
