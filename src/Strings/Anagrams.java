package Strings;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="rshi";
		String s2="shiru";
		
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1,c2)) {
			
			System.out.println("Strings are anagrams");
		}else
			System.out.println("Strings are not anagrams");

	}

}
