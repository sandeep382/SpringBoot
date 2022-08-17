package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurrantController {

	@GetMapping("/res")
	public ResponseEntity<Dishes> getAllDishes() {
		List<String> dishes = new ArrayList<String>();
		Dishes dishes2 = new Dishes();
		dishes.add("Chicken Biryani");
		dishes.add("Mutton Biryani");
		dishes.add("Fish Biryani");
		dishes.add("Prance Biryani");
		dishes.add("Natukodi Biryani");
		dishes.add("Chilli Chicken");
		dishes2.setDishes(dishes);
		return new ResponseEntity<Dishes>(dishes2, HttpStatus.OK);

	}

}
