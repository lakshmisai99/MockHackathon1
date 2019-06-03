package com.ing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ing.domain.ReviewHistory;
import com.ing.service.QuoteService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin
@RestController
@EnableSwagger2
@RequestMapping("api/v1/")
public class GetQuoteController {

	@Autowired
	QuoteService quoteService;
	
	@RequestMapping(value="/getQuote",method=RequestMethod.POST,consumes="application/json" )
	public ReviewHistory getQuote(@RequestBody ReviewHistory reviewHistory) {
		ReviewHistory reviewHistory1= quoteService.getQuote(reviewHistory);
		
		return reviewHistory1;
	}

	
}
