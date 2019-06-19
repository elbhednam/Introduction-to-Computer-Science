import java.util.Scanner;

public class FormatInteger {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int i = input.nextInt();
		System.out.print("Enter the width of the integer: ");
		int w = input.nextInt();
		
		System.out.println("Formatted integer: " + format(i, w));
		
	}//
	
	public static String format(int number, int width) {
		String str = String.valueOf(number);
		String s = String.valueOf(number);
		for (int i = 0; i < width - s.length(); i++) {
			str = 0 + str;
		}
		
		return str;
	}
}//
