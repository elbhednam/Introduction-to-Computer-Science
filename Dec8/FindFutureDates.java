import java.util.Scanner;

public class FindFutureDates {
	public static void main(String[] args) {
		
		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer for the current day of the week: ");
		int day = input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int elapsed = input.nextInt();
		int futureday = day + elapsed % 7;
		
		System.out.println("Today is " + days[day] + " and the future day is " + days[futureday]);
	}
}
