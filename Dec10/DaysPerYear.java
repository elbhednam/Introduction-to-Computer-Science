public class DaysPerYear {
	public static void main(String[] args) {
		
		for (int i = 2000; i < 2020; i++) {
			System.out.println("The year " + i + " has " + numberOfDaysInAYear(i) + " days.");
		}
		System.out.print(" ");
	}//
	
	public static int numberOfDaysInAYear(int n) {
		int days = 365;
		
		if (n % 4 == 0 && n % 100 != 0 ^ n % 400 == 0) {
			days += 1;
		}
		return days;
	}
}//
