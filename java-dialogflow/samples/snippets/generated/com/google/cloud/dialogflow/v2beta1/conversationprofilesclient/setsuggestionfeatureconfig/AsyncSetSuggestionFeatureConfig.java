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

// [START dialogflow_v2beta1_generated_conversationprofilesclient_setsuggestionfeatureconfig_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dialogflow.v2beta1.ConversationProfilesClient;
import com.google.cloud.dialogflow.v2beta1.HumanAgentAssistantConfig;
import com.google.cloud.dialogflow.v2beta1.SetSuggestionFeatureConfigRequest;
import com.google.longrunning.Operation;

public class AsyncSetSuggestionFeatureConfig {

  public static void main(String[] args) throws Exception {
    asyncSetSuggestionFeatureConfig();
  }

  public static void asyncSetSuggestionFeatureConfig() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ConversationProfilesClient conversationProfilesClient =
        ConversationProfilesClient.create()) {
      SetSuggestionFeatureConfigRequest request =
          SetSuggestionFeatureConfigRequest.newBuilder()
              .setConversationProfile("conversationProfile1691597734")
              .setSuggestionFeatureConfig(
                  HumanAgentAssistantConfig.SuggestionFeatureConfig.newBuilder().build())
              .build();
      ApiFuture<Operation> future =
          conversationProfilesClient.setSuggestionFeatureConfigCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END dialogflow_v2beta1_generated_conversationprofilesclient_setsuggestionfeatureconfig_async]
