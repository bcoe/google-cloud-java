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

package com.google.cloud.privatecatalog.v1beta1.samples;

// [START privatecatalog_v1beta1_generated_privatecatalogclient_searchproducts_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.privatecatalog.v1beta1.PrivateCatalogClient;
import com.google.cloud.privatecatalog.v1beta1.Product;
import com.google.cloud.privatecatalog.v1beta1.SearchProductsRequest;

public class AsyncSearchProducts {

  public static void main(String[] args) throws Exception {
    asyncSearchProducts();
  }

  public static void asyncSearchProducts() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (PrivateCatalogClient privateCatalogClient = PrivateCatalogClient.create()) {
      SearchProductsRequest request =
          SearchProductsRequest.newBuilder()
              .setResource("resource-341064690")
              .setQuery("query107944136")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      ApiFuture<Product> future =
          privateCatalogClient.searchProductsPagedCallable().futureCall(request);
      // Do something.
      for (Product element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END privatecatalog_v1beta1_generated_privatecatalogclient_searchproducts_async]