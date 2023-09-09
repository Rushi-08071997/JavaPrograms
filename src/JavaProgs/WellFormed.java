package JavaProgs;

import java.util.Stack;

public class WellFormed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "{([)}";

		Stack<Character> st = new Stack<>();
		char[] arr = str.toCharArray();

		for (char ch : arr) {

			if (st.empty()) {

				st.push(ch);
			} else if (ch == '{' || ch == '(' || ch == '[') {
				st.push(ch);
			} else if (st.peek() == '{' && ch == '}') {
				st.pop();
			} else if (st.peek() == '(' && ch == ')') {
				st.pop();
			} else if (st.peek() == '[' && ch == ']') {
				st.pop();
			}

		}

		if (st.empty()) {
			System.out.println("String is well formed");
		} else
			System.out.println("String is not well formed");

	}

}
