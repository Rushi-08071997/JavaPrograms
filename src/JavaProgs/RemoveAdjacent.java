package JavaProgs;

import java.util.Stack;

public class RemoveAdjacent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String getremovedups(String abc) {

		Stack<Character> st = new Stack<>();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < abc.length(); i++) {
			if (!st.empty() && st.peek() == abc.charAt(i)) {

				st.pop();

			} else {

				st.push(abc.charAt(i));
			}

		}

		for (char ch : st) {
			sb.append(ch);
		}

		return sb.toString();

	}

}
