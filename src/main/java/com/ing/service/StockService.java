package com.ing.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.domain.Stock;
import com.ing.repository.StockRepository;

@Service
@Transactional
public class StockService {
	
	@Autowired
	StockRepository stockRepository;

	public List<Stock> getStockDetails() {
		
		return (List<Stock>) stockRepository.findAll();
	}

}
