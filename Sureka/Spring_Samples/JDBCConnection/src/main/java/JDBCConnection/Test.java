package JDBCConnection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {  
	    ApplicationContext ctx=new ClassPathXmlApplicationContext("Databean.xml");  
	      
	    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
	    int status=dao.saveEmployee(new Employee(104,"Amit","45"));  
	    System.out.println(status);  
 
		/*ApplicationContext ctx=new ClassPathXmlApplicationContext("Databean.xml");  
        
	    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
	    dao.saveEmployeeByPreparedStatement(new Employee(108,"Amit","88"));  
*/
	      
	}  
}
