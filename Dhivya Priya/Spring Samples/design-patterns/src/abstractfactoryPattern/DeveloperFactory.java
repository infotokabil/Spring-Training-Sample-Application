package abstractfactoryPattern;

public class DeveloperFactory extends EmployeeFactory {

		@Override
		public Employee getEmployee(String type) {
			if ("java".equals(type)) {
				return new Java();
			} else {
				return new LAMP();
			}
		}

	}

