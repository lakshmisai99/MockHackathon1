package com.ing.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
public class Stock {
	
	@Id
	@GeneratedValue
	private Long stockId;
	private String name;
	
	
	public Stock() {
		super();
	}

	public Stock(Long stockId) {
		super();
		this.stockId = stockId;
	}

	public Long getStockId() {
		return stockId;
	}

	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * public String getPrice() { return price; }
	 * 
	 * public void setPrice(String price) { this.price = price; }
	 */

}
