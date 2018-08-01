package frontControllerPattern;

public class FrontController {
	
	    private Dispatcher dispatcher;
	 
	    public FrontController()
	    {
	        dispatcher = new Dispatcher();
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
	            dispatcher.dispatch(request);
	        }    
	    }
	}
	 

