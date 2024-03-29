package com.tcp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcp.model.Data;
import com.tcp.model.DisRates;
import com.tcp.service.SimpleService;

@RestController
	@RequestMapping("/data")
	

public class SimpleController {
	
	@Autowired
	SimpleService simpleService;
	
	@Autowired
	Data data;
	@PostMapping(value = "/postdata",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public String getData(@RequestBody DisRates rates) throws Exception
	{
		return simpleService.getData(rates);
	}
	
	@GetMapping("/fetch")
	public String ping()
	{
		return  data.toString();
	}

}
