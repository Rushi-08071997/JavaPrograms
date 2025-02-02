package JavaProgs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExcelSheetColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(convertToTitle(9));

	}

	public static String convertToTitle(int columnNumber) {
		
		 StringBuilder result = new StringBuilder();
	        while (columnNumber > 0) {
	            columnNumber--;
	            result.append((char) (columnNumber % 26 + 'A'));
	            columnNumber /= 26;
	        }
	        return result.reverse().toString();
		
			
	}

}
