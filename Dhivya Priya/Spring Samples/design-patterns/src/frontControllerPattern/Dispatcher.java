package frontControllerPattern;

public class Dispatcher {
	
	    private Trainer trainer;
	    private Manager manager;
	    
	    public Dispatcher()
	    {
	        trainer = new Trainer();
	        manager = new Manager();
	    }
	 
	    public void dispatch(String request)
	    {
	        if(request.equalsIgnoreCase("Trainer"))
	        {
	            trainer.display();
	        }
	        else
	        {
	            manager.display();
	        }    
	    }
	}
	 

