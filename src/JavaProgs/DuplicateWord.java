package JavaProgs;

public class DuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getdups("you are the reason are not you");

	}

	public static void getdups(String message) {

		String[] arr = message.split(" ");

		for (int i = 0; i < arr.length; i++) {

			int count = 1;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i].equals(arr[j])) {

					count++;

					System.out.println(arr[i] + ":-" + count);

				}
			}
		}
	}

}
