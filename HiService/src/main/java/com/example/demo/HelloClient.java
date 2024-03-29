package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "HELLO")
public interface HelloClient {
	
	@GetMapping(value = "/name/{name}")
	public String invokehelloService(@PathVariable("name") String name);

}
