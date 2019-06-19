
public class ConvertTime {
	public static void main(String[] args) {
		
		System.out.println("The current time is " + convertMillis(System.currentTimeMillis()) + " GMT.");
	}//
	
	public static String convertMillis(long millis) {
		
		long totalSeconds = millis / 1000;
		
		long currentSecond = totalSeconds % 60; 
		
		long totalMinutes = totalSeconds / 60;
		
		long currentMinute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		long currentHour = totalHours % 24;
		
		return currentHour + ":" + currentMinute + ":" + currentSecond;
	}
}//
