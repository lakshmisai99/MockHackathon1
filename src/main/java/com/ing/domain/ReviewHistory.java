package com.ing.domain;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="submit_stock")
public class ReviewHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int userId;
	private int stockId;
	private String tradedTime;
	private String stockName; 
	private Double stockPrice;
	@Column(name="quantityPurchased")
	private int quantity;
	private Double totalStockPurchasePrice;
	private Double totalFees;
	private Double totalIncludingFee;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getTradedTime() {
		return tradedTime;
	}
	public void setTradedTime(String tradedTime) {
		this.tradedTime = tradedTime;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public Double getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(Double stockPrice) {
		this.stockPrice = stockPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Double getTotalStockPurchasePrice() {
		return totalStockPurchasePrice;
	}
	public void setTotalStockPurchasePrice(Double totalStockPurchasePrice) {
		this.totalStockPurchasePrice = totalStockPurchasePrice;
	}
	public Double getTotalFees() {
		return totalFees;
	}
	public void setTotalFees(Double totalFees) {
		this.totalFees = totalFees;
	}
	public Double getTotalIncludingFee() {
		return totalIncludingFee;
	}
	public void setTotalIncludingFee(Double totalIncludingFee) {
		this.totalIncludingFee = totalIncludingFee;
	}
	
	
		
	
}
