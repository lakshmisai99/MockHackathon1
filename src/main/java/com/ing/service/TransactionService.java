package com.ing.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ing.domain.ReviewHistory;
import com.ing.domain.Stock;
import com.ing.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	TransactionRepository repository;

	public List <ReviewHistory>  viewHistory(int i) {
		// TODO Auto-generated method stub
		List <ReviewHistory> list=repository.findByUserId(i);
		
		return list;
	}
	
	public List <ReviewHistory>  getAllHistory() {
		// TODO Auto-generated method stub
		List <ReviewHistory> list=repository.findAll();
		
		return list;
	}
	
	
}
