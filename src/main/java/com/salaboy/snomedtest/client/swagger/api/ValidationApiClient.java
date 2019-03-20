package com.salaboy.snomedtest.client.swagger.api;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="validationApi", url="${snowstorm.url:https://snowstorm.msal.gov.ar}")
public interface ValidationApiClient extends ValidationApi {
}