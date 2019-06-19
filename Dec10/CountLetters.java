import java.util.Scanner;

public class CountLetters {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String stringy = input.nextLine();
		
		System.out.println("There are " + countLetters(stringy) + " letters in the string.");
		
	}//
	
	public static int countLetters(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'|| s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				count++;
			}
		}
		return count;
	}
}//
