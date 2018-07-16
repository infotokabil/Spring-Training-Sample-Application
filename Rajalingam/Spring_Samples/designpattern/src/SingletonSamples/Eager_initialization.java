package SingletonSamples;

public class Eager_initialization {

	private static final Eager_initialization INSTANCE = new Eager_initialization();

	private Eager_initialization() {
	}

	public static Eager_initialization getInstance() {
		return INSTANCE;
	}
	
}
