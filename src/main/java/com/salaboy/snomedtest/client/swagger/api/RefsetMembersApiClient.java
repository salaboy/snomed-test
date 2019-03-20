package com.salaboy.snomedtest.client.swagger.api;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="refsetMembersApi", url="${snowstorm.url:https://snowstorm.msal.gov.ar}")
public interface RefsetMembersApiClient extends RefsetMembersApi {
}