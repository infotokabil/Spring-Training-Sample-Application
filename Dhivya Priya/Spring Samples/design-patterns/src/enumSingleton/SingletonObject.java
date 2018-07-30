package enumSingleton;

public class SingletonObject {

	
		 //public static SingletonObject instance1 = new SingletonObject();
		private static SingletonObject instance = null;

		private SingletonObject() {

		}

		public static SingletonObject getInstance() {
			if (instance == null)
				instance = new SingletonObject();
			return instance;
		}

	}

