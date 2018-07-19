package singletonExample;

public class Singleton {

	private static Singleton singleton = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton= new Singleton();
		}
		return singleton;
	}

	public void sayHello() {
		System.out.println("Hello");
	}
}


