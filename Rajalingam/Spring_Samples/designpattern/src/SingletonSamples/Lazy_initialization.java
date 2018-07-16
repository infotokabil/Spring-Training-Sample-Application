package SingletonSamples;

public class Lazy_initialization {

	private static Lazy_initialization instance = null;
	private String check;

	private Lazy_initialization() {

	}

	public static synchronized Lazy_initialization getInstance() {
		if (instance == null) {
			System.out.println("yes");
			instance = new Lazy_initialization();
		}

		return instance;

	}

	public static void close() {
		if (instance != null) {
			instance = null;
		}

	}

}
