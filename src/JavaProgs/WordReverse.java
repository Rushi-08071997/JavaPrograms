package JavaProgs;

public class WordReverse {
	
	public static void main(String[] args) {
		
		String s="Hey how are you";
		//o/p:- "you are how hey"
		String result=" ";
		System.out.println(getstring(s,result)); 
		
		
	}
	
	public static String getstring(String s,String result) {
		
		
		String[] arr=s.split(" ");
		
		for(int i=arr.length-1;i>=0;i--) {
			
			result=result+arr[i]+ " ";
		}
		return result;
	}

}
