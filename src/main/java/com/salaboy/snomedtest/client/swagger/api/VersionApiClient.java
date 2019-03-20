package com.salaboy.snomedtest.client.swagger.api;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="versionApi", url="${snowstorm.url:https://snowstorm.msal.gov.ar}")
public interface VersionApiClient extends VersionApi {
}