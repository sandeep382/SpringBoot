package com.example.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.StockPrice;
import com.example.exception.CompanyNotFoundExceptionTest;
import com.example.service.StockPriceService;

@RestController
public class StockPriceRestConntroller {

	@Autowired
	private StockPriceService stockPiceService;

	@GetMapping(value = "/price/{companyName}")
	public ResponseEntity<List<StockPrice>> getStockPriceByCompanyName(@PathVariable String companyName) {
		List<String> companyNames = new ArrayList<>();
		companyNames.add("tcs");
		companyNames.add("hcl");
		companyNames.add("wipro");
		if (!companyNames.contains(companyName)) {
			throw new CompanyNotFoundExceptionTest("Provided company name not found, please give the valid company name");
		}
		List<StockPrice> stockPrice = stockPiceService.fetchStockPriceByCompanyName(companyName);
		return new ResponseEntity<>(stockPrice, HttpStatus.OK);
	}

}
