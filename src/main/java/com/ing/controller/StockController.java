package com.ing.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.domain.ReviewHistory;
import com.ing.domain.Stock;
import com.ing.domain.StockCount;
import com.ing.service.StockService;
import com.ing.service.TransactionService;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin
@RestController
@EnableSwagger2
@RequestMapping("api/v1/")
public class StockController {
	
	@Autowired
	StockService stockService;
	
	
//	StockCount stockcount=new StockCount();
	
	@Autowired
	TransactionService transactionService;

	@GetMapping("/stock")
	public List<Stock> getStockDetails() {
		List<Stock> stocklist  = stockService.getStockDetails();
		return stocklist;
	}
	
	@GetMapping("/hourlyCount")
	public Map getHourlyCount() {
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date1 = null,d1,d2;
		int count=0;
		List<StockCount> stockcountlist = new ArrayList<StockCount>();
		long diff,diffHours = 0;
		Calendar calobj = Calendar.getInstance();
		//String sDate1="2019/04/07 13:48:17";  //this string will come from db
		String sDate1 = null;
		StockCount stockcountObj=new StockCount();
		try {
			for(ReviewHistory reviewhistory : transactionService.getAllHistory()) {
				sDate1=reviewhistory.getTradedTime();
				date1 = format.parse(sDate1);
				d1 = format.parse(df.format(date1));
				d2 = format.parse(df.format(calobj.getTime()));
				diff = d2.getTime() - d1.getTime();
				diffHours = diff / (60 * 60 * 1000) % 24;
				boolean status=false;
				if(diffHours<=1) {
					if(stockcountlist.size()==0) {
						stockcountObj=new StockCount();
						stockcountObj.setCount(count+1);
						stockcountObj.setQuantity(reviewhistory.getQuantity());
						stockcountObj.setStockname(reviewhistory.getStockName());
						stockcountlist.add(stockcountObj);
						//System.out.println("stockcountlist  "+reviewhistory.getStockName());
						//System.out.println("count  "+stockcountObj.getCount());
					}else {
						
						for(int i=0;i<stockcountlist.size();i++) {
							//System.out.println("else part "+stockcountlist.get(i).getStockname());
							stockcountObj=stockcountlist.get(i);
							System.out.println(stockcountlist.contains(reviewhistory.getStockName()));
							if(stockcountlist.contains(reviewhistory.getStockName()))
								System.out.println("cont");
							else
								System.out.println("not");
							if(stockcountObj.getStockname().equals(reviewhistory.getStockName())){
								//System.out.println(reviewhistory.getStockName()+"  equal  "+stockcountlist.get(i).getStockname());
								int temp=stockcountObj.getCount();
								int qua=stockcountObj.getQuantity();
								stockcountObj.setCount(temp+1);
								stockcountObj.setQuantity(reviewhistory.getQuantity()+qua);
								stockcountlist.remove(i);
								stockcountlist.add(stockcountObj);
								status=true;
							}
						}
						if(!status) {
							//System.out.println("second else "+stockcountlist.get(i).getStockname());
							stockcountObj=new StockCount();
							count=0;
							stockcountObj.setCount(count+1);
							stockcountObj.setStockname(reviewhistory.getStockName());
							stockcountObj.setQuantity(reviewhistory.getQuantity());
							stockcountlist.add(stockcountObj);
							
						}
					}
						
					
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		} 
	    System.out.println("Date from DB  "+df.format(date1));
		
	    System.out.println("Current Date Time : "+df.format(calobj.getTime()));
	    
	    System.out.println("Diff----------->>>> "+diffHours);
	    Map map =new HashMap();
	    map.put("stockcountlist",stockcountlist);
	    
		return map;
	}
	
	@GetMapping("/dayCount")
	public Map getDayCount() {
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date1 = null,d1,d2;
		int count=0;
		List<StockCount> stockcountlist = new ArrayList<StockCount>();
		long diff,diffHours = 0;
		Calendar calobj = Calendar.getInstance();
		//String sDate1="2019/04/07 13:48:17";  //this string will come from db
		String sDate1 = null;
		StockCount stockcountObj=new StockCount();
		try {
			for(ReviewHistory reviewhistory : transactionService.getAllHistory()) {
				sDate1=reviewhistory.getTradedTime();
				date1 = format.parse(sDate1);
				d1 = format.parse(df.format(date1));
				d2 = format.parse(df.format(calobj.getTime()));
				diff = d2.getTime() - d1.getTime();
				diffHours = diff / (60 * 60 * 1000) % 24;
				boolean status=false;
				if(diffHours<=24) {
					if(stockcountlist.size()==0) {
						stockcountObj=new StockCount();
						stockcountObj.setCount(count+1);
						stockcountObj.setQuantity(reviewhistory.getQuantity());
						stockcountObj.setStockname(reviewhistory.getStockName());
						stockcountlist.add(stockcountObj);
						//System.out.println("stockcountlist  "+reviewhistory.getStockName());
						//System.out.println("count  "+stockcountObj.getCount());
					}else {
						
						for(int i=0;i<stockcountlist.size();i++) {
							//System.out.println("else part "+stockcountlist.get(i).getStockname());
							stockcountObj=stockcountlist.get(i);
							System.out.println(stockcountlist.contains(reviewhistory.getStockName()));
							if(stockcountlist.contains(reviewhistory.getStockName()))
								System.out.println("cont");
							else
								System.out.println("not");
							if(stockcountObj.getStockname().equals(reviewhistory.getStockName())){
								//System.out.println(reviewhistory.getStockName()+"  equal  "+stockcountlist.get(i).getStockname());
								int temp=stockcountObj.getCount();
								int qua=stockcountObj.getQuantity();
								stockcountObj.setCount(temp+1);
								stockcountObj.setQuantity(reviewhistory.getQuantity()+qua);
								stockcountlist.remove(i);
								stockcountlist.add(stockcountObj);
								status=true;
							}
						}
						if(!status) {
							//System.out.println("second else "+stockcountlist.get(i).getStockname());
							stockcountObj=new StockCount();
							count=0;
							stockcountObj.setCount(count+1);
							stockcountObj.setStockname(reviewhistory.getStockName());
							stockcountObj.setQuantity(reviewhistory.getQuantity());
							stockcountlist.add(stockcountObj);
							
						}
					}
						
					
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		} 
	    
	    Map map =new HashMap();
	    map.put("stockcountlist",stockcountlist);
	    
		return map;
	}
}
