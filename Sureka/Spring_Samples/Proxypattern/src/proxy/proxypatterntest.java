package proxy;

public class proxypatterntest {
	public static void main(String[] args){
		commandexecutorproxy executor = new commandexecutorproxy("Pankaj", "wrong_pwd");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}
}
