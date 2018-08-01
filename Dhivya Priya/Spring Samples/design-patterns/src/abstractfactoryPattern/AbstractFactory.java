package abstractfactoryPattern;

public class AbstractFactory {

		public EmployeeFactory getEmployeeFactory(String type) {
			if ("development".equals(type)) {
				return new DeveloperFactory();
			} else {
				return new TestingFactory();
			}
		}

	}


