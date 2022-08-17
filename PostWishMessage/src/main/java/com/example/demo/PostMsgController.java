package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostMsgController {

	@GetMapping("/msg")
	public String getWishMsg(@PathVariable String msg) {
		return "Good Afternoon....";
	}

}
