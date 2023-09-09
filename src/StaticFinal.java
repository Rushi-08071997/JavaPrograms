
public class StaticFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Main.x);
		
	}

}

class Main{
	
	public static final int x=100;
	
	static {
		
		System.out.println("main--class static block");
	}
}

//static block will not be executed with final variable 
//in case of final variable main class will not be loaded
//it will directly take int x value