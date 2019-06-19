import java.util.Scanner;

public class SortChars {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String stringy = input.nextLine();
		
		System.out.println(sort(stringy));
	}//
	
	public static String sort(String s) {
		 char[] array = s.toCharArray();
		 for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					char temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		 }
		 s = String.valueOf(array);
		 return s;
	}
}//
