package com.example.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.StockPrice;

public interface StockPriceJpa extends JpaRepository<StockPrice, Integer> {
	
	public List<StockPrice> findByCompanyName(String companyName);

}
