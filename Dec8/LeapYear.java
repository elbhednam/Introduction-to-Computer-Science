import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		input.close();
		
		System.out.println(isLeapYear(year) ? year + " is a leap year." : year + " is not a leap year.");
	}//
	
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 ^ year % 400 == 0) {
			return true;
		}
		return false;
	}
}//
