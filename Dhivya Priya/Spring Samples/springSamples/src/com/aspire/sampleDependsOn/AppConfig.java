package com.aspire.sampleDependsOn;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class AppConfig {

	
		@Bean(name="office")
		public Office getOffice(){
			Office c= new Office();
			c.setLocation("Chennai");
			c.setName("Aspire");
			return c;
		}
		@Bean(name="employee")
		@DependsOn("office")
		public Employee getName(){
			Employee s= new Employee();
			s.setName("Ram");
			s.setOffice(getOffice());
			return s;
		}
	} 

