package proxyExample;


import java.util.ArrayList;
import java.util.List;
 
 
public class ProxyClass implements Internet
{
    private Internet internet = new RealInternet();
    private static List<String> bannedSites;
     
    static
    {
        bannedSites = new ArrayList<String>();
        bannedSites.add("facebook.com");
        bannedSites.add("youtube.com");
      
    }
     
    @Override
    public void connectTo(String serverhost) throws Exception
    {
        if(bannedSites.contains(serverhost.toLowerCase()))
        {
            throw new Exception("Access Denied");
        }
         
        internet.connectTo(serverhost);
    }
 
}


