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

package com.google.cloud.clouddms.v1.samples;

// [START clouddms_v1_generated_datamigrationserviceclient_getconnectionprofile_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.clouddms.v1.ConnectionProfile;
import com.google.cloud.clouddms.v1.ConnectionProfileName;
import com.google.cloud.clouddms.v1.DataMigrationServiceClient;
import com.google.cloud.clouddms.v1.GetConnectionProfileRequest;

public class AsyncGetConnectionProfile {

  public static void main(String[] args) throws Exception {
    asyncGetConnectionProfile();
  }

  public static void asyncGetConnectionProfile() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DataMigrationServiceClient dataMigrationServiceClient =
        DataMigrationServiceClient.create()) {
      GetConnectionProfileRequest request =
          GetConnectionProfileRequest.newBuilder()
              .setName(
                  ConnectionProfileName.of("[PROJECT]", "[LOCATION]", "[CONNECTION_PROFILE]")
                      .toString())
              .build();
      ApiFuture<ConnectionProfile> future =
          dataMigrationServiceClient.getConnectionProfileCallable().futureCall(request);
      // Do something.
      ConnectionProfile response = future.get();
    }
  }
}
// [END clouddms_v1_generated_datamigrationserviceclient_getconnectionprofile_async]