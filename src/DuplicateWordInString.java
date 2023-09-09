import java.util.HashMap;
import java.util.Set;

public class DuplicateWordInString {

	// you are the reason are not you
	// you:-2
	// are:-2

	public static void duplicatewords(String inputstring) {

		// firstly we will split

		String words[] = inputstring.split(" ");

		// craete hashmap to enter values

		HashMap<String, Integer> wc = new HashMap<String, Integer>();

		for (String word : words) {

			if (wc.containsKey(word)) {

				wc.put(word.toLowerCase(), wc.get(word) + 1);
			} else {

				wc.put(word.toLowerCase(), 1);
			}

		}

		// to create set to store string values

		Set<String> st = wc.keySet();

		for (String word : st) {

			if (wc.get(word) > 1) {

				System.out.println(word + " : " + wc.get(word));

			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		duplicatewords("Hey hey hey");

	}

}
