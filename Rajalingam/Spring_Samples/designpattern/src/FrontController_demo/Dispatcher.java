package FrontController_demo;

public class Dispatcher {
	public Dispatcher() {
	}

	public void dispatch(String request) {
		View view = InstanceCreation.getinstance(request);
		if (request.equalsIgnoreCase("STUDENT")) {
			view.show();
		} else {
			view.show();
		}
	}
}
