package proxy;

import java.io.IOException;

public class commandexecutorimpl implements commandexecutor{
	public void runCommand(String cmd) throws IOException {
                //some heavy implementation
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");
	}

}
