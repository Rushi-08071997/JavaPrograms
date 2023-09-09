package JavaProgs;

public class EvenLengthWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="there you go";
		 
		String[] arr=s1.split(" ");
		
		for(String tmp:arr) {
			
			int length=tmp.length();
			
			if(length%2==0) {
				
				System.out.println(tmp);
			}
		}
		

	}

}
