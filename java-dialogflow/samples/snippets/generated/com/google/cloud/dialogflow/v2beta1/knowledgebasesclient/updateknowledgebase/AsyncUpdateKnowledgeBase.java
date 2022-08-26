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

// [START dialogflow_v2beta1_generated_knowledgebasesclient_updateknowledgebase_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dialogflow.v2beta1.KnowledgeBase;
import com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient;
import com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest;
import com.google.protobuf.FieldMask;

public class AsyncUpdateKnowledgeBase {

  public static void main(String[] args) throws Exception {
    asyncUpdateKnowledgeBase();
  }

  public static void asyncUpdateKnowledgeBase() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (KnowledgeBasesClient knowledgeBasesClient = KnowledgeBasesClient.create()) {
      UpdateKnowledgeBaseRequest request =
          UpdateKnowledgeBaseRequest.newBuilder()
              .setKnowledgeBase(KnowledgeBase.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      ApiFuture<KnowledgeBase> future =
          knowledgeBasesClient.updateKnowledgeBaseCallable().futureCall(request);
      // Do something.
      KnowledgeBase response = future.get();
    }
  }
}
// [END dialogflow_v2beta1_generated_knowledgebasesclient_updateknowledgebase_async]
