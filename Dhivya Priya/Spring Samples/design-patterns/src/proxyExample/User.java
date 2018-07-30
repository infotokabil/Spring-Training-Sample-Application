package proxyExample;


	public class User
	{
	    public static void main (String[] args)
	    {
	        Internet internet = new ProxyClass();
	        try
	        {
	            internet.connectTo("gmail.com");
	            internet.connectTo("facebook.com");
	        }
	        catch (Exception e)
	        {
	            System.out.println(e.getMessage());
	        }
	    }
	}

