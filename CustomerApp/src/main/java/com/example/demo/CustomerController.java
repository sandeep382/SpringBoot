package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private RestaurrantClient restaurrantClient;

	@GetMapping("/dish")
	public String getDishes() {
		ResponseEntity<Dishes> dishesFromCustoer = restaurrantClient.getDishesFromCustoer();
		Dishes body = dishesFromCustoer.getBody();
		List<String> dishes = body.getDishes();
		if (dishes.contains("Biryani")) {
			return "Your DISH is available...";
		} else {
			return "your DISH is not available";
		}
	}

}
