# Auto-generated by generate-config.sh
terraform {
  required_providers {
    google = {
      source = "hashicorp/google"
    }
  }
}
provider "google" {
  project = var.project_id
  region  = var.region
  zone    = var.zone
}
locals {
  # Objects with additional key-value entries may be passed as variables
  # to modules needing an object with only a subset of those entries.
  # So this 'data' object is a superset of key-value entries that may be
  # needed, and we pass it to every module.
  data = {
    project_id                      = var.project_id
    region                          = var.region
    zone                            = var.zone
    should_create_container_network = var.should_create_container_network
    should_create_redis_network     = var.should_create_redis_network
    should_enable_apis_on_apply     = var.should_enable_apis_on_apply
    should_disable_apis_on_destroy  = var.should_disable_apis_on_destroy
  }
}
resource "google_project_service" "cloudresourcemanager" {
  service            = "cloudresourcemanager.googleapis.com"
  project            = local.data.project_id
  count              = local.data.should_enable_apis_on_apply ? 1 : 0
  disable_on_destroy = local.data.should_disable_apis_on_destroy
}
resource "google_project_service" "iam" {
  service            = "iam.googleapis.com"
  project            = local.data.project_id
  count              = local.data.should_enable_apis_on_apply ? 1 : 0
  disable_on_destroy = local.data.should_disable_apis_on_destroy
}
resource "google_project_service" "iamcredentials" {
  service            = "iamcredentials.googleapis.com"
  project            = local.data.project_id
  count              = local.data.should_enable_apis_on_apply ? 1 : 0
  disable_on_destroy = local.data.should_disable_apis_on_destroy
}
resource "google_project_service" "serviceusage" {
  service            = "serviceusage.googleapis.com"
  project            = local.data.project_id
  count              = local.data.should_enable_apis_on_apply ? 1 : 0
  disable_on_destroy = local.data.should_disable_apis_on_destroy
}
resource "time_sleep" "for_1m_allowBaseCloudApisToFullyEnable" {
  create_duration = "1m"
  depends_on      = [
    google_project_service.cloudresourcemanager,
    google_project_service.iam,
    google_project_service.iamcredentials,
    google_project_service.serviceusage
  ]
  triggers = {
    when_project_created = local.data.project_id
  }
}
