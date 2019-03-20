package com.salaboy.snomedtest.client.swagger.api;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="relationshipsApi", url="${snowstorm.url:https://snowstorm.msal.gov.ar}")
public interface RelationshipsApiClient extends RelationshipsApi {
}