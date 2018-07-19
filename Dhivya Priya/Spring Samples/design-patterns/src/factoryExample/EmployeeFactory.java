package factoryExample;

public class EmployeeFactory {
	

		public Employee getEmployee(String type) {
			if ("canine".equals(type)) {
				return new Developer();
			} else {
				return new Tester();
			}
		}

	}

