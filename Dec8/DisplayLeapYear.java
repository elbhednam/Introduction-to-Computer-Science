public class DisplayLeapYear {
	public static void main(String[] args) {
		
		int leaps = 0;
		
		for (int year = 101; year < 2100; year++) {
			isLeapYear(year);
			
			if (isLeapYear(year)) {
				leaps++;
				System.out.print(year + " ");
				if (leaps % 10 == 0) {
					System.out.println();
				}
			}
		}
		
		System.out.println();
		System.out.println("There are " + leaps + " leap years from the year 101 to the year 2100.");
	}//
	
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 ^ year % 400 == 0) {
			return true;
		}
		return false;
	}
}//
