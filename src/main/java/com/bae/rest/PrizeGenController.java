package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bae.service.PrizeGenService;

@RestController
public class PrizeGenController {
	
	@Autowired
	public PrizeGenService service;
	
	@GetMapping("/getPrize/{accountNumber}")
	public String getPrize(@PathVariable String accountNumber) {
		return service.genPrize(accountNumber);
	}
}