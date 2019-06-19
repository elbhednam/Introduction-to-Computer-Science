import java.util.Scanner;

public class Occurrences {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String stringy = input.nextLine();
		System.out.print("Enter a character: ");
		char charry = input.nextLine().charAt(0);
		
		System.out.println(stringy + " has " + count(stringy, charry) + " occurrences of the letter " + charry);
		
		input.close();
		
	}//
	
	public static int count(String str, char a) {
		
		int count = 0;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == a)
				count++;
		}
		return count;
	}
}// I'm pretty sure I've done this one before
