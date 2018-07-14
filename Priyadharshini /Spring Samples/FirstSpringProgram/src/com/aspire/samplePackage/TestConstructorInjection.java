package com.aspire.samplePackage;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestConstructorInjection {
	 public static void main(String[] args) {  
         
	        Resource r=new ClassPathResource("appConfig.xml");  
	        BeanFactory factory=new XmlBeanFactory(r);  
	          
	        Employee s=(Employee)factory.getBean("e");  
	        s.show();  
	          
	    }  
}
