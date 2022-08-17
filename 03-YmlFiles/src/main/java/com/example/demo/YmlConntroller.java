package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YmlConntroller {
	
	@Autowired
	private YmlConfig config;
	
	@GetMapping("/get")
	public void  getVkaue() {
		Map<String, String> properties = config.getProperties();
		String string = properties.get("name");
		String string2 = properties.get("address");
		
		
		List<String> main = config.getMain();
		System.out.println(main.get(0) + "and the size is " + main.size());
		
		System.out.println(string);
		
		System.out.println(properties.size());
		System.out.println(string2);
		
	}

}
