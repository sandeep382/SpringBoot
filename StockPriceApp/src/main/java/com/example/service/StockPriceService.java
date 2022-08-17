package com.example.service;

import java.util.List;

import com.example.entity.StockPrice;

public interface StockPriceService {
	
	public List<StockPrice> fetchStockPriceByCompanyName(String companyName);

}
