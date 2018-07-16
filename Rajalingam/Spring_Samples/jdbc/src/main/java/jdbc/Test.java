package jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Application.xml");
		
		EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");
		dao.saveEmployeeByPreparedStatement(new Employee(144, "Amit", "6666"));
		/*
		 * for(Employee employee:dao.getAllEmployees()) {
		 * System.out.println(employee.getName());
		 */

	}
}
