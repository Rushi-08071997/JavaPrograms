package JavaProgs;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = new String[] { "java", "Ruby", "python", "React", "Ruby", "java"};

		/*Set nonduplicateset = new HashSet<>();

		Set duplicateset = new HashSet<>();

		for (String st : arr) {

			if (!nonduplicateset.contains(st)) {

				nonduplicateset.add(st);
			} else

				duplicateset.add(st);

		}
		
		System.out.println(duplicateset);*/
		
		
		for(int i=0;i<arr.length;i++) {
			
			int count=0;
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
					count++;
					
					System.out.println(arr[i]+":-"+count);
					 
				}
			}
		}

	}
}