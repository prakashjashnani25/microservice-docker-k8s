package com.prakash.docker.service.controller;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/v1/api")
@Slf4j
public class DummyController {
	
	@GetMapping("/greet")
	public String greetPErson(@RequestParam("name") String name) {
//		log.info("Inside Method Greet {}",name);
		return "Hello "+name;
	}
	
	@GetMapping(produces = "application/json" )
	public String greetPErson1() {
//		log.info("Inside Method Greet {}",name);
		return "Hello ";
	}
	
	@PostConstruct
	public void postContruct() {
		System.out.println("test");
	}
}
