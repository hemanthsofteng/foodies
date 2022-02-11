package com.tcp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.springframework.boot.test.context.SpringBootTest;

import com.tcp.model.DisRates;
import com.tcp.stc.RequestUtil;

@SpringBootTest
public class SimpleServiceTest {

@Mock
SimpleService service;

@Mock
MockedStatic<RequestUtil> util;
	
@Test
public void disTest() throws Exception
{
	DisRates ds=new DisRates();
	ds.setName("Name");
	RequestUtil.validate(ds);	
	when(service.getData(any())).thenReturn("Name");
	String s=service.getData(ds);
	
	assertEquals("Name", s);
}
	
}
