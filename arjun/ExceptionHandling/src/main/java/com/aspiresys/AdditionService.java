package com.aspiresys;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Component
public class AdditionService {
	public int add(int i,int j) throws Exception
	{
		int c;
		c=i/j;
		return c;
	}
	
	
}
