import java.util.Scanner;

public class SpecifiedCharacter {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String stringy = input.nextLine();
		
		for (int i = 0; i < stringy.length(); i++) {
			if (count(stringy, stringy.charAt(i)) < 2) {
				System.out.println("There is 1 occurrence of " + stringy.charAt(i));
			}
			else
			System.out.println("There are " + count(stringy, stringy.charAt(i)) + " occurrences of " + stringy.charAt(i));
		}
	}//
	
	public static int count(String str, char a) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				count++;
			}
		}
		return count;
	}
}//
