package FrontControllerDesignPattern;

public class FrontController {
	  private Dispatcher Dispatcher;
	  
	    public FrontController()
	    {
	        Dispatcher = new Dispatcher();
	    }
	 
	    private boolean isAuthenticUser()
	    {
	        System.out.println("Authentication successfull.");
	        return true;
	    }
	 
	    private void trackRequest(String request)
	    {
	        System.out.println("Requested View: " + request);
	    }
	 
	    public void dispatchRequest(String request)
	    {
	        trackRequest(request);
	       
	        if(isAuthenticUser())
	        {
	            Dispatcher.dispatch(request);
	        }    
	    }
}
