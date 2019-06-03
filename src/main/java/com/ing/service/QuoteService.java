package com.ing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.domain.ReviewHistory;

@Service
public class QuoteService {

	// @Autowired
	// ReviewHistory reviewHistoryObj;

	public ReviewHistory getQuote(ReviewHistory reviewHistory) {
		// TODO Auto-generated method stub
		ReviewHistory reviewHistoryObj = new ReviewHistory();
		int quantity = reviewHistory.getQuantity();
		int stockId = reviewHistory.getStockId();
		Double stockPrice = reviewHistory.getStockPrice();
		Double totalPurchasedPrice = 0.0;
		Double totalFees = 0.0;
		Double fees = 0.0;

		if (quantity <= 500) {
			totalFees = quantity * 0.10;
			//totalFees = .10 * quantity;
			// totalPurchasedPrice=stockPrice+(.10*quantity);
		} else {
			totalFees = (quantity / 100) * 0.15;
			//totalFees = .15 * quantity;
			// totalPurchasedPrice = stockPrice + (.15 * quantity / 100);
		}

		reviewHistoryObj.setId(reviewHistory.getId());
		reviewHistoryObj.setStockName(reviewHistory.getStockName());
		reviewHistoryObj.setStockPrice(stockPrice);
		reviewHistoryObj.setQuantity(quantity);
		reviewHistoryObj.setTotalStockPurchasePrice(quantity * stockPrice);
		reviewHistoryObj.setTotalFees(totalFees);
		reviewHistoryObj.setTotalIncludingFee((quantity * stockPrice) + totalFees);
		
		
		
		

		return reviewHistoryObj;
	}

}
