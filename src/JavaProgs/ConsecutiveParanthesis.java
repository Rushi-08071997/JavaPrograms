package JavaProgs;

import java.util.Stack;

public class ConsecutiveParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "(((()))){(})({)}][";

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
			} else if (ch == '}' || ch == ')' || ch == ']') {
				st.push(ch);
			}

		}

		for (char ch : st) {
			System.out.print(ch);
		}

	}

}
