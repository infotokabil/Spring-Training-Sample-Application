import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aspire.models.Employee;
import com.aspire.models.EmployeeDao;

public class TestDb {
	public static void main(String[] args) {  
	    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
	      
	    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
	   
	  List<Employee> List=dao.saveEmployeeByPreparedStatement(new Employee(123,"priya",66));  
	    System.out.println(List);  
	    for(Employee emp: List) {
	    	System.out.println(emp.toString());
	    }
	          
	    /*int status=dao.updateEmployee(new Employee(102,"Sonoo",15000)); 
	    System.out.println(status); 
	    */  
	          
	    /*Employee e=new Employee(); 
	    e.setId(102); 
	    int status=dao.deleteEmployee(e); 
	    System.out.println(status);*/  
	      
	}
}
