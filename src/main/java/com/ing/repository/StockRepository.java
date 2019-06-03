package com.ing.repository;

import org.springframework.data.repository.CrudRepository;

import com.ing.domain.Stock;

public interface StockRepository extends CrudRepository<Stock, Long> {

}
