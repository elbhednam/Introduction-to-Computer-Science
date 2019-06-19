public class SumSeries {
	public static void main(String[] args) {
		
	
		double series = 0;
		double d = 1;
		
		for (int n = 1; n <= 97; n += 2) {
			d += 2;
			series += n / d;
		}
		System.out.print("The sum of the series is " + series);
	}//
}//
