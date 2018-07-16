package com.aspire.springsample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.aspire.springsample")
@PropertySource("classpath:userInformation.properties")
public class SampleConfig {
	
	
	//define bean for SecondClass2
	@Bean
	public SecondInterface secondClass2(){
		return new SecondClass2();
	}

	//define bean FirstClass and inject dependency
	@Bean
	public FirstInterface firstClass2(){
		return new FirstClass2(secondClass2());
	}
}
