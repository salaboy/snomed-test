package com.salaboy.snomedtest.client.swagger.api;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="descriptionsApi", url="${snowstorm.url:https://snowstorm.msal.gov.ar}")
public interface DescriptionsApiClient extends DescriptionsApi {
}