import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String []Duplicates =new String[]{"java", "python", "ruby", "python"};
		
		Set nonduplicateset =new HashSet<>();
		
		Set duplicateset =new HashSet<>();
		
		for(String string:Duplicates) {
			
			if(!nonduplicateset.contains(string)) {
				
				nonduplicateset.add(string);
			}else
			{
				duplicateset.add(string);
			}
		}
		
		
		System.out.println(duplicateset  );
		
		
		

	}

}
