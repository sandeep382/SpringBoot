package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {
	
	@GetMapping("/get")
	public String getPrice() {  
		return "No price";
	}
	
	

}
