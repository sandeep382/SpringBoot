package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	

	@Autowired
	private WishMsgClient client;
	
	@GetMapping("/test")
	public void msg() {
		client.getWishMsg("hello");
		
	}

}
