package com.tcp.stc;

import com.tcp.model.DisRates;

public class RequestUtil {
	
	public static void validate(DisRates dis) throws Exception
	{
		if(dis.getId()!=null)
		{
			System.out.println("Hi!...");
		}
		else {
			throw new Exception("Invalid Input!...");
		}
	}

}
