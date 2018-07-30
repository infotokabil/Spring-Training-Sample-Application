package FrontController_demo;



public class InstanceCreation {
	View view=null;
	public static View getinstance(String str) {
		if (str.equalsIgnoreCase("STUDENT"))
			return StudentView.getInstance();
		else
			return HomeView.getInstance();
	}
}
