package com.tcp.service;

import org.springframework.stereotype.Service;

import com.tcp.model.DisRates;
import com.tcp.stc.RequestUtil;

@Service
public class SimpleService {

	public String getData(DisRates rates) throws Exception {
		
		RequestUtil.validate(rates);

		return rates.getName();
	}

}
