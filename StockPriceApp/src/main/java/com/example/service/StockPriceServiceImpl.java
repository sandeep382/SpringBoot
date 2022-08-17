package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.StockPrice;
import com.example.jpa.StockPriceJpa;

@Service
public class StockPriceServiceImpl implements StockPriceService {

	@Autowired
	private StockPriceJpa stockPriceJpa;

	@Override
	public List<StockPrice> fetchStockPriceByCompanyName(String companyName) {
		
		StockPrice s = new StockPrice();
		s.setCompanyName("TCS");
		s.setStockId(100);
		s.setStockPrice(100.87);
		
		StockPrice s1 = new StockPrice();
		s1.setCompanyName("TCS");
		s1.setStockId(101);
		s1.setStockPrice(100.87);
		
		StockPrice s2 = new StockPrice();
		s2.setCompanyName("TCS");
		s2.setStockId(102);
		s2.setStockPrice(100.87);
		stockPriceJpa.save(s1);
		stockPriceJpa.save(s2);
		
		StockPrice save = stockPriceJpa.save(s);
		
		List<StockPrice> stockPriceEntity = stockPriceJpa.findByCompanyName(save.getCompanyName());
		
		
		return stockPriceEntity;
	}

}
