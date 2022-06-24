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

// [START dialogflow_v2beta1_generated_intentsclient_batchdeleteintents_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dialogflow.v2beta1.AgentName;
import com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest;
import com.google.cloud.dialogflow.v2beta1.Intent;
import com.google.cloud.dialogflow.v2beta1.IntentsClient;
import com.google.longrunning.Operation;
import java.util.ArrayList;

public class AsyncBatchDeleteIntents {

  public static void main(String[] args) throws Exception {
    asyncBatchDeleteIntents();
  }

  public static void asyncBatchDeleteIntents() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (IntentsClient intentsClient = IntentsClient.create()) {
      BatchDeleteIntentsRequest request =
          BatchDeleteIntentsRequest.newBuilder()
              .setParent(AgentName.ofProjectName("[PROJECT]").toString())
              .addAllIntents(new ArrayList<Intent>())
              .build();
      ApiFuture<Operation> future = intentsClient.batchDeleteIntentsCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END dialogflow_v2beta1_generated_intentsclient_batchdeleteintents_async]
