package bridgeExample;

public class MainApp {

public static void main(String[] args) 
{
	PC pc=new PC();
	Laptop laptop=new Laptop();
	 
	WindowsOS windowsOS1=new WindowsOS(laptop);
	WindowsOS windowsOS2=new WindowsOS(pc);
	MAC mac1=new MAC(laptop);
	MAC mac2=new MAC(pc);
	 
	windowsOS1.useOS();
	windowsOS2.useOS();
	mac1.useOS();
	mac2.useOS();

  }

}















