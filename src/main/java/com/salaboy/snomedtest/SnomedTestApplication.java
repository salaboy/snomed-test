package com.salaboy.snomedtest;

import com.salaboy.snomedtest.client.swagger.api.ConceptsApiClient;

import com.salaboy.snomedtest.client.swagger.model.ConceptView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.salaboy.snomedtest")
@RestController
public class SnomedTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnomedTestApplication.class, args);
	}

	@Autowired
	private ConceptsApiClient conceptsApiClient;

	@GetMapping
	public ResponseEntity<ConceptView> helloSnomed(){
		 return conceptsApiClient.findConceptUsingGET("MAIN", "40638003", "en");
	}

}
