package JavaProgs;

public class PowerofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base=5;
	    int power=4;
	    
	    int result=1;
	    
	    
	    while(power>0) {
	    	
	    	result=result*base;
	    	power--;
	    }
	    
	    System.out.println(result);

	}

}
