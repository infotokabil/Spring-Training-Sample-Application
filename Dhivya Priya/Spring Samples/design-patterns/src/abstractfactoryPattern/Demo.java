package abstractfactoryPattern;


	public class Demo {

		public static void main(String[] args) {
			AbstractFactory abstractFactory = new AbstractFactory();

			EmployeeFactory employeeFactory1 = abstractFactory.getEmployeeFactory("development");
			Employee a1 = employeeFactory1.getEmployee("java");
			System.out.println("a1 work: " + a1.doWork());
			Employee a2 = employeeFactory1.getEmployee("LAMP");
			System.out.println("a2 work: " + a2.doWork());

			EmployeeFactory employeeFactory2 = abstractFactory.getEmployeeFactory("testing");
			Employee a3 = employeeFactory2.getEmployee("QA");
			System.out.println("a3 work: " + a3.doWork());
			Employee a4 = employeeFactory2.getEmployee("test");
			System.out.println("a4 work: " + a4.doWork());

		}

	}

