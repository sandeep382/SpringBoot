package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("post")
public interface WishMsgClient {
	
	@GetMapping("/msg")
	public String getWishMsg(@PathVariable String msg);
	
	
	

}
