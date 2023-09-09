 
import java.io.*;

public class Bufferreaderexample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("Enter your name");
		String name=br.readLine();
		
		System.out.println("welcome "+ name);
		
	}

}
