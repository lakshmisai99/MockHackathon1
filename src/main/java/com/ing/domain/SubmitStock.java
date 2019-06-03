package com.ing.domain;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ch.qos.logback.core.net.SyslogOutputStream;


@Entity
@Table(name = "submit_stock")

public class SubmitStock implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private Long stockId;
	
	private String stockName;
	
	private Long userId;
	@Column(name = "quantityPurchased")
	private Long quantity;
	
	private Long stockPrice;
	
	private Long totalStockPurchasePrice;
	
	private Long totalFees;
	
	private Long totalIncludingFee;
	
	
	//Date date1 = new Date();
	//SimpleDateFormat dtf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    
	private String date="2019/04/07 19:15:00";
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Long getStockId() {
		return stockId;
	}

	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(Long stockPrice) {
		this.stockPrice = stockPrice;
	}

	public Long getTotalStockPurchasePrice() {
		return totalStockPurchasePrice;
	}

	public void setTotalStockPurchasePrice(Long totalStockPurchasePrice) {
		this.totalStockPurchasePrice = totalStockPurchasePrice;
	}

	public Long getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(Long totalFees) {
		this.totalFees = totalFees;
	}

	public Long getTotalIncludingFee() {
		return totalIncludingFee;
	}

	public void setTotalIncludingFee(Long totalIncludingFee) {
		this.totalIncludingFee = totalIncludingFee;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	/*
	 * public Date getTradedTime() { return tradedTime; }
	 * 
	 * public void setTradedTime(Date tradedTime) { this.tradedTime = tradedTime; }
	 */

}
