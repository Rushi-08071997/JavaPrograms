package JavaProgs;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="abcd";
		String str2="bda";
		
		String Rotatedstring=str1+str1;
		
		if(Rotatedstring.contains(str2)) {
			
			System.out.println("strings are rotation of each other");
		}else
			System.out.println("strings are not rotation of each other");

	}

}
