package JavaProgs;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {9};
		for(int i=0;i<getPlusOneArray(arr).length;i++) {
			
			System.out.println(getPlusOneArray(arr)[i]);
		}
		

	}
	
	public static int[] getPlusOneArray(int[] arr) {
		String tmp ="";
		for(int i=0;i<arr.length;i++) {
			
			tmp=tmp+arr[i];
			
		}
		
		int num = Integer.parseInt(tmp);
		int expectednum =num+1;
		String input = String.valueOf(expectednum);
		int[] result = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            result[i] = Character.getNumericValue(input.charAt(i));
        }
        
        return result;
		
	}

}
