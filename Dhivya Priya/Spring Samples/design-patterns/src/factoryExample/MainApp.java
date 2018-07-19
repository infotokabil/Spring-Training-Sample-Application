package factoryExample;

public class MainApp {
	

		public static void main(String[] args) {
			EmployeeFactory employeeFactory = new EmployeeFactory();

			Employee a1 = employeeFactory.getEmployee("feline");
			System.out.println("work : " + a1.makeWork());

			Employee a2 = employeeFactory.getEmployee("canine");
			System.out.println("work : " + a2.makeWork());
		}

	}

