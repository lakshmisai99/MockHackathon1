package com.ing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ing.domain.SubmitStock;
import com.ing.repository.SubmitstockRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin
@RestController
@EnableSwagger2
@RequestMapping("/api/v1/")
public class SubmitStockController {
	@Autowired
	SubmitstockRepository submitStockRepository;

	@RequestMapping(value="/submit",method=RequestMethod.POST,consumes="application/json" )
	public SubmitStock submitStock(@RequestBody SubmitStock submitstock) {
		return submitStockRepository.save(submitstock);
	}

}
