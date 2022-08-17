package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

	@Autowired
	private HelloClient client;

	@GetMapping(value = "/hi")
	public String getName() {
		String s = client.invokehelloService("Sandeep");
		return "HiMsg" + s;
	}

}
