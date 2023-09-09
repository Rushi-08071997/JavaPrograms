import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;



public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] tools= {"selenium","QTP","salesforce","jenkins","QTP","salesforce"};
		
		System.out.println("**********brute force********");
		
		for(int i=0;i<tools.length;i++) {
			for(int j=i+1;j<tools.length;j++) {
				
				if(tools[i].equals(tools[j])){
					
					System.out.println(tools[i]);
				}
			}
		}
		
		System.out.println("*********HashSet*********");
		
		Set<String> data=new HashSet<String>();
		
		for(String e:tools) {
			
			//here we have used negation as we need to find duplicate value from array
			if(!data.add(e)) {
				
				System.out.println(e);
			}
		}
		
		System.out.println("******HashMap*****");
		
		Map<String,Integer> obj=new HashMap<String,Integer>();
		
		
		for(String et:tools) {
			
		Integer count=obj.get(et);
		
		if(count==null) {
			
			obj.put(et,1);
		}else {
			
			obj.put(et, ++count);
		}
		
		Set<Entry<String,Integer>> entryset=obj.entrySet();
		
		for(Entry<String,Integer> entry:entryset) {
			
			if(entry.getValue() >1) {
				
				System.out.println(entry.getKey());
			
		}
		
		
		}
			
		}
		
		System.out.println("******Stream set & filter*******");
		
		Set<String> dataset=new HashSet<String>();
		
		Set dupset=Arrays.asList(tools).stream().filter(e->!dataset.add(e)).collect(Collectors.toSet());
		
		System.out.println(dupset);
		
		
		
		System.out.println("********Streams grouping by*********");
		
		
		
		
	}

}
