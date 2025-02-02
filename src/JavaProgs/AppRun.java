package JavaProgs;

import java.io.IOException;

public class AppRun {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		Runtime runtime=Runtime.getRuntime();
		
		Process pr=runtime.exec("notepad.exe");
		
		Thread.sleep(4000);
		
		pr.destroy();
		
		
	}

}
