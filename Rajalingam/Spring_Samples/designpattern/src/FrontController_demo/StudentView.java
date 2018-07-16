package FrontController_demo;

public class StudentView implements View {
	
	private static StudentView instance = null;

	private StudentView() {
	}

	public static synchronized StudentView getInstance() {
		if (instance == null) {
			System.out.println("Student Instance Created");
			instance = new StudentView();
		}

		return instance;

	}

	public static void close() {
		if (instance != null) {
			instance = null;
		}

	}

	public void show() {
		System.out.println("Displaying Student Page");
	}
}
