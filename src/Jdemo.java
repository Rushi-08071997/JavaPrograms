import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Jdemo {

	/*int count;
	public int getlist() throws NumberFormatException, IOException {		

		
			if(!new File("C:\\\\Users\\\\HP\\\\OneDrive\\\\Documents\\\\Demo.txt").exists())
			
			return 1;
			
			else {
				BufferedReader br=new BufferedReader(new FileReader(new File("C:\\Users\\HP\\OneDrive\\Documents\\Demo.txt")));
				String s=br.readLine();
				count=Integer.parseInt(s);
				br.close();
			}
		return count;
		
		
	}*/

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new FileReader(new File("C:\\Users\\HP\\OneDrive\\Documents\\Demo.txt")));
		
        while(br.readLine().matches("rushi")) {
        	
        	System.out.println(br.readLine());
        }
        
        br.close();
	}

}
