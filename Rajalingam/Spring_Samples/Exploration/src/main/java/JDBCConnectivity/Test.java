package JDBCConnectivity;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test {  
  
public static void main(String[] args) {  
    ApplicationContext ctx=new ClassPathXmlApplicationContext("beanProperties.xml");  
      
    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
    int status=dao.saveEmployee(new EmployeeBean(102,"Amit","ft0"));  
    System.out.println(status);  
          

      
}  
  
}   