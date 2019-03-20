package com.salaboy.snomedtest.client.swagger.api;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="branchingApi", url="${snowstorm.url:https://snowstorm.msal.gov.ar}")
public interface BranchingApiClient extends BranchingApi {
}