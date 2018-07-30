package FrontController_demo;

public class HomeView implements View {
	private static HomeView instance = null;

	private HomeView() {
	}

	public static synchronized HomeView getInstance() {
		if (instance == null) {
			System.out.println("Home Instance Created");
			instance = new HomeView();
		}

		return instance;

	}

	public static void close() {
		if (instance != null) {
			instance = null;
		}

	}

	public void show() {
		System.out.println("Displaying Home Page");
	}
}
