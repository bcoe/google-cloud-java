# Changelog

## [0.2.0](https://github.com/googleapis/google-cloud-java/compare/gapic-libraries-bom-v0.1.1-SNAPSHOT...gapic-libraries-bom-v0.2.0) (2022-10-24)


### Features

* [analyticsdata] add `subject_to_thresholding` field to `ResponseMetadata` type ([#8545](https://github.com/googleapis/google-cloud-java/issues/8545)) ([8fdc6c1](https://github.com/googleapis/google-cloud-java/commit/8fdc6c1f10f88f30f4d1407579d645f75366b4cf))
* add `tokens_per_project_per_hour` field to `PropertyQuota` type ([8fdc6c1](https://github.com/googleapis/google-cloud-java/commit/8fdc6c1f10f88f30f4d1407579d645f75366b4cf))


### Bug Fixes

* fixed non-GA logic for gapic-bom ([#8631](https://github.com/googleapis/google-cloud-java/issues/8631)) ([a959a35](https://github.com/googleapis/google-cloud-java/commit/a959a35eb4cc742c4163e477a0f971ca8dbe22b1))
* owl-bot-staging should not be commited ([#8337](https://github.com/googleapis/google-cloud-java/issues/8337)) ([c9bb4a9](https://github.com/googleapis/google-cloud-java/commit/c9bb4a97aa19032b78c86c951fe9920f24ac4eec))


### Dependencies

* The following workspace dependencies were updated
    * com.google.cloud:google-cloud-accessapproval-bom bumped to 2.6.0,
    * com.google.cloud:google-identity-accesscontextmanager-bom bumped to 1.6.0,
    * com.google.cloud:google-cloud-aiplatform-bom bumped to 3.6.0,
    * com.google.cloud:google-cloud-api-gateway-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-apigee-connect-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-appengine-admin-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-artifact-registry-bom bumped to 1.4.0,
    * com.google.cloud:google-cloud-asset-bom bumped to 3.9.0,
    * com.google.cloud:google-cloud-assured-workloads-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-automl-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-bigqueryconnection-bom bumped to 2.7.0,
    * com.google.cloud:google-cloud-bigquerydatatransfer-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-bigqueryreservation-bom bumped to 2.6.0,
    * com.google.cloud:google-cloud-billing-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-billingbudgets-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-binary-authorization-bom bumped to 1.4.0,
    * com.google.cloud:google-cloud-channel-bom bumped to 3.9.0,
    * com.google.cloud:google-cloud-build-bom bumped to 3.7.0,
    * com.google.cloud:google-cloud-compute-bom bumped to 1.15.0,
    * com.google.cloud:google-cloud-contact-center-insights-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-container-bom bumped to 2.8.0,
    * com.google.cloud:google-cloud-containeranalysis-bom bumped to 2.6.0,
    * com.google.cloud:google-cloud-data-fusion-bom bumped to 1.5.0,
    * com.google.cloud:google-cloud-datacatalog-bom bumped to 1.11.0,
    * com.google.cloud:google-cloud-datalabeling-bom bumped to 0.125.0,
    * com.google.cloud:google-cloud-dataplex-bom bumped to 1.3.0,
    * com.google.cloud:google-cloud-dataproc-metastore-bom bumped to 2.6.0,
    * com.google.cloud:google-cloud-dataproc-bom bumped to 4.2.0,
    * com.google.cloud:google-cloud-datastream-bom bumped to 1.4.0,
    * com.google.cloud:google-cloud-debugger-client-bom bumped to 1.5.0,
    * com.google.cloud:google-cloud-deploy-bom bumped to 1.3.0,
    * com.google.cloud:google-cloud-dialogflow-bom bumped to 4.11.0,
    * com.google.cloud:google-cloud-dlp-bom bumped to 3.9.0,
    * com.google.cloud:google-cloud-dms-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-dns bumped to 2.3.0,
    * com.google.cloud:google-cloud-document-ai-bom bumped to 2.9.0,
    * com.google.cloud:google-cloud-domains-bom bumped to 1.2.0,
    * com.google.cloud:google-cloud-errorreporting-bom bumped to 0.126.0-beta,
    * com.google.cloud:google-cloud-essential-contacts-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-eventarc-bom bumped to 1.5.0,
    * com.google.cloud:google-cloud-filestore-bom bumped to 1.6.0,
    * com.google.cloud:google-cloud-functions-bom bumped to 2.7.0,
    * com.google.cloud:google-cloud-game-servers-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-gkehub-bom bumped to 1.5.0,
    * io.grafeas:grafeas bumped to 2.6.0,
    * com.google.cloud:google-cloud-gsuite-addons-bom bumped to 2.5.0,
    * com.google.cloud:google-iam-admin-bom bumped to 3.0.0,
    * com.google.cloud:google-cloud-iamcredentials-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-ids-bom bumped to 1.4.0,
    * com.google.cloud:google-cloud-iot-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-kms-bom bumped to 2.8.0,
    * com.google.cloud:google-cloud-language-bom bumped to 2.6.0,
    * com.google.cloud:google-cloud-managed-identities-bom bumped to 1.3.0,
    * com.google.cloud:google-cloud-mediatranslation-bom bumped to 0.11.0,
    * com.google.cloud:google-cloud-memcache-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-monitoring-dashboard-bom bumped to 2.7.0,
    * com.google.cloud:google-cloud-monitoring-bom bumped to 3.6.0,
    * com.google.cloud:google-cloud-network-management-bom bumped to 1.6.0,
    * com.google.cloud:google-cloud-networkconnectivity-bom bumped to 1.4.0,
    * com.google.cloud:google-cloud-notebooks-bom bumped to 1.3.0,
    * com.google.cloud:google-cloud-optimization-bom bumped to 1.3.0,
    * com.google.cloud:google-cloud-orchestration-airflow-bom bumped to 1.5.0,
    * com.google.cloud:google-cloud-orgpolicy-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-os-config-bom bumped to 2.7.0,
    * com.google.cloud:google-cloud-os-login-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-phishingprotection-bom bumped to 0.36.0,
    * com.google.cloud:google-cloud-policy-troubleshooter-bom bumped to 1.4.0,
    * com.google.cloud:google-cloud-profiler-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-recaptchaenterprise-bom bumped to 3.2.0,
    * com.google.cloud:google-cloud-recommender-bom bumped to 2.7.0,
    * com.google.cloud:google-cloud-redis-bom bumped to 2.8.0,
    * com.google.cloud:google-cloud-resource-settings-bom bumped to 1.5.0,
    * com.google.cloud:google-cloud-resourcemanager-bom bumped to 1.7.0,
    * com.google.cloud:google-cloud-retail-bom bumped to 2.7.0,
    * com.google.cloud:google-cloud-scheduler-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-secretmanager-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-security-private-ca-bom bumped to 2.7.0,
    * com.google.cloud:google-cloud-securitycenter-bom bumped to 2.13.0,
    * com.google.cloud:google-cloud-service-control-bom bumped to 1.5.0,
    * com.google.cloud:google-cloud-service-management-bom bumped to 3.3.0,
    * com.google.cloud:google-cloud-service-usage-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-servicedirectory-bom bumped to 2.6.0,
    * com.google.cloud:google-cloud-shell-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-speech-bom bumped to 4.0.0,
    * com.google.cloud:google-cloud-storage-transfer-bom bumped to 1.5.0,
    * com.google.cloud:google-cloud-talent-bom bumped to 2.6.0,
    * com.google.cloud:google-cloud-tasks-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-texttospeech-bom bumped to 2.6.0,
    * com.google.cloud:google-cloud-tpu-bom bumped to 2.6.0,
    * com.google.cloud:google-cloud-trace-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-translate-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-video-intelligence-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-video-transcoder-bom bumped to 1.4.0,
    * com.google.cloud:google-cloud-vision-bom bumped to 3.3.0,
    * com.google.cloud:google-cloud-vmmigration-bom bumped to 1.5.0,
    * com.google.cloud:google-cloud-vpcaccess-bom bumped to 2.6.0,
    * com.google.cloud:google-cloud-webrisk-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-websecurityscanner-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-workflow-executions-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-workflows-bom bumped to 2.5.0

## 0.1.0 (2022-10-17)


### Features

* [analyticsdata] add `subject_to_thresholding` field to `ResponseMetadata` type ([#8545](https://github.com/googleapis/google-cloud-java/issues/8545)) ([8fdc6c1](https://github.com/googleapis/google-cloud-java/commit/8fdc6c1f10f88f30f4d1407579d645f75366b4cf))
* add `tokens_per_project_per_hour` field to `PropertyQuota` type ([8fdc6c1](https://github.com/googleapis/google-cloud-java/commit/8fdc6c1f10f88f30f4d1407579d645f75366b4cf))


### Bug Fixes

* owl-bot-staging should not be commited ([#8337](https://github.com/googleapis/google-cloud-java/issues/8337)) ([c9bb4a9](https://github.com/googleapis/google-cloud-java/commit/c9bb4a97aa19032b78c86c951fe9920f24ac4eec))


### Dependencies

* The following workspace dependencies were updated
    * com.google.cloud:google-cloud-accessapproval-bom bumped to 2.5.0,
    * com.google.cloud:google-identity-accesscontextmanager-bom bumped to 1.5.0,
    * com.google.cloud:google-cloud-aiplatform-bom bumped to 3.5.0,
    * com.google.cloud:google-cloud-api-gateway-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-apigee-connect-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-appengine-admin-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-artifact-registry-bom bumped to 1.3.0,
    * com.google.cloud:google-cloud-asset-bom bumped to 3.8.0,
    * com.google.cloud:google-cloud-assured-workloads-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-automl-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-bigqueryconnection-bom bumped to 2.6.0,
    * com.google.cloud:google-cloud-bigquerydatatransfer-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-bigqueryreservation-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-billing-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-billingbudgets-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-binary-authorization-bom bumped to 1.3.0,
    * com.google.cloud:google-cloud-channel-bom bumped to 3.8.0,
    * com.google.cloud:google-cloud-build-bom bumped to 3.6.0,
    * com.google.cloud:google-cloud-compute-bom bumped to 1.14.0,
    * com.google.cloud:google-cloud-contact-center-insights-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-container-bom bumped to 2.7.0,
    * com.google.cloud:google-cloud-containeranalysis-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-data-fusion-bom bumped to 1.4.0,
    * com.google.cloud:google-cloud-datacatalog-bom bumped to 1.10.0,
    * com.google.cloud:google-cloud-dataplex-bom bumped to 1.2.0,
    * com.google.cloud:google-cloud-dataproc-metastore-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-dataproc-bom bumped to 4.1.0,
    * com.google.cloud:google-cloud-datastream-bom bumped to 1.3.0,
    * com.google.cloud:google-cloud-debugger-client-bom bumped to 1.4.0,
    * com.google.cloud:google-cloud-deploy-bom bumped to 1.2.0,
    * com.google.cloud:google-cloud-dialogflow-bom bumped to 4.10.0,
    * com.google.cloud:google-cloud-dlp-bom bumped to 3.8.0,
    * com.google.cloud:google-cloud-dms-bom bumped to 2.3.0,
    * com.google.cloud:google-cloud-dns bumped to 2.2.0,
    * com.google.cloud:google-cloud-document-ai-bom bumped to 2.8.0,
    * com.google.cloud:google-cloud-domains-bom bumped to 1.1.0,
    * com.google.cloud:google-cloud-essential-contacts-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-eventarc-bom bumped to 1.4.0,
    * com.google.cloud:google-cloud-filestore-bom bumped to 1.5.0,
    * com.google.cloud:google-cloud-functions-bom bumped to 2.6.0,
    * com.google.cloud:google-cloud-game-servers-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-gkehub-bom bumped to 1.4.0,
    * io.grafeas:grafeas bumped to 2.5.0,
    * com.google.cloud:google-cloud-gsuite-addons-bom bumped to 2.4.0,
    * com.google.cloud:google-iam-admin-bom bumped to 2.0.0,
    * com.google.cloud:google-cloud-iamcredentials-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-ids-bom bumped to 1.3.0,
    * com.google.cloud:google-cloud-iot-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-kms-bom bumped to 2.7.0,
    * com.google.cloud:google-cloud-language-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-managed-identities-bom bumped to 1.2.0,
    * com.google.cloud:google-cloud-memcache-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-monitoring-dashboard-bom bumped to 2.6.0,
    * com.google.cloud:google-cloud-monitoring-bom bumped to 3.5.0,
    * com.google.cloud:google-cloud-network-management-bom bumped to 1.5.0,
    * com.google.cloud:google-cloud-networkconnectivity-bom bumped to 1.3.0,
    * com.google.cloud:google-cloud-notebooks-bom bumped to 1.2.0,
    * com.google.cloud:google-cloud-optimization-bom bumped to 1.2.0,
    * com.google.cloud:google-cloud-orchestration-airflow-bom bumped to 1.4.0,
    * com.google.cloud:google-cloud-orgpolicy-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-os-config-bom bumped to 2.6.0,
    * com.google.cloud:google-cloud-os-login-bom bumped to 2.3.0,
    * com.google.cloud:google-cloud-policy-troubleshooter-bom bumped to 1.3.0,
    * com.google.cloud:google-cloud-profiler-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-recaptchaenterprise-bom bumped to 3.1.0,
    * com.google.cloud:google-cloud-recommender-bom bumped to 2.6.0,
    * com.google.cloud:google-cloud-redis-bom bumped to 2.7.0,
    * com.google.cloud:google-cloud-resource-settings-bom bumped to 1.4.0,
    * com.google.cloud:google-cloud-resourcemanager-bom bumped to 1.6.0,
    * com.google.cloud:google-cloud-retail-bom bumped to 2.6.0,
    * com.google.cloud:google-cloud-scheduler-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-secretmanager-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-security-private-ca-bom bumped to 2.6.0,
    * com.google.cloud:google-cloud-securitycenter-bom bumped to 2.12.0,
    * com.google.cloud:google-cloud-service-control-bom bumped to 1.4.0,
    * com.google.cloud:google-cloud-service-management-bom bumped to 3.2.0,
    * com.google.cloud:google-cloud-service-usage-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-servicedirectory-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-shell-bom bumped to 2.3.0,
    * com.google.cloud:google-cloud-speech-bom bumped to 3.0.0,
    * com.google.cloud:google-cloud-storage-transfer-bom bumped to 1.4.0,
    * com.google.cloud:google-cloud-talent-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-tasks-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-texttospeech-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-tpu-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-trace-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-translate-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-video-intelligence-bom bumped to 2.3.0,
    * com.google.cloud:google-cloud-video-transcoder-bom bumped to 1.3.0,
    * com.google.cloud:google-cloud-vision-bom bumped to 3.2.0,
    * com.google.cloud:google-cloud-vmmigration-bom bumped to 1.4.0,
    * com.google.cloud:google-cloud-vpcaccess-bom bumped to 2.5.0,
    * com.google.cloud:google-cloud-webrisk-bom bumped to 2.3.0,
    * com.google.cloud:google-cloud-websecurityscanner-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-workflow-executions-bom bumped to 2.4.0,
    * com.google.cloud:google-cloud-workflows-bom bumped to 2.4.0
