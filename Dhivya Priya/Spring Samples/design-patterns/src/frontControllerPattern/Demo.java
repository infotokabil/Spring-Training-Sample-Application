package frontControllerPattern;

public class Demo {
	  public static void main(String[] args) 
	    {
	        FrontController frontController = new FrontController();
	        frontController.dispatchRequest("Manager");
	        System.out.println("------------------------------------");
	        frontController.dispatchRequest("Trainer");
	    }
	  }

	
	 
	
	 
	
	

