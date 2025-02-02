package JavaProgs;

public class RevreseWordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String beta="what you doing";
		//o/p:- "tahw uoy gniod"
		
		String result=" ";
		
		
		
		
		String[] arr=beta.split(" ");
	
		
		for(String st:arr) {
				int j=st.length()-1;
				String reverse=" ";
				for(int i=j;i>=0;i--) {
				
				reverse=reverse+st.charAt(i);
			}
				result=result + reverse+" ";
		}
		
		System.out.println(result);

	}

}
