package FrontControllerDesignPattern;

public class Dispatcher {
	 private StudentView studentView;
	    private TeacherView teacherView;
	    
	    public Dispatcher()
	    {
	        studentView = new StudentView();
	        teacherView = new TeacherView();
	    }
	 
	    public void dispatch(String request)
	    {
	        if(request.equalsIgnoreCase("Student"))
	        {
	            studentView.display();
	        }
	        else
	        {
	            teacherView.display();
	        }    
	    }
}
