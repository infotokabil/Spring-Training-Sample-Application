package abstractfactoryPattern;

	public class TestingFactory extends EmployeeFactory {

		@Override
		public Employee getEmployee(String type) {
			if ("QA".equals(type)) {
				return new QA();
			} else {
				return new Test();
			}
		}

	}

