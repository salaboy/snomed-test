package com.salaboy.snomedtest.client.swagger.api;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="adminApi", url="${snowstorm.url:https://snowstorm.msal.gov.ar}")
public interface AdminApiClient extends AdminApi {
}