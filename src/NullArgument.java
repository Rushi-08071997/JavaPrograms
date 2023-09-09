
public class NullArgument {

	//pass null arument with method overloading with string & object types
	
	public static void Test(Object o) {
		
		System.out.println("object argument");
	}
	
    public static void Test(String a) {
		
		System.out.println("string argument");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test(null);
		
		
		
	}
	
	//it will take string argument although object is a parent of a string

}
