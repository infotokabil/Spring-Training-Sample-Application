package com.aspire.aopdemos;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.aspire.aopdemo.dao", "com.aspire.aopdemo.aspect"})
public class JavaConfig {
	

}
