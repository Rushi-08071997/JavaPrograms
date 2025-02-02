package JavaProgs;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int charcount =	count("jiya jiya re jiya re", 'r');
	System.out.println(charcount);
		

	}

	public static int count(String one, char val) {

		char[] arr = one.toCharArray();

		int count = 0;

		for (char ch:arr) {
			
			
			if(ch==val) {
				
				count++;
			}

		}
		return count;
	}

}
