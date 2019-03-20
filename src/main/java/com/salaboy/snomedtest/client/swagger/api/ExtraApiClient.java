package com.salaboy.snomedtest.client.swagger.api;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="extraApi",url="${snowstorm.url:https://snowstorm.msal.gov.ar}")
public interface ExtraApiClient extends ExtraApi {
}