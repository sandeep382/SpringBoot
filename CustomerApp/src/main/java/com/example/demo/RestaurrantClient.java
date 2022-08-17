package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "Customer", url = "http://localhost:8080")
public interface RestaurrantClient {
	
	@GetMapping("/res")
	public ResponseEntity<Dishes> getDishesFromCustoer();

}
