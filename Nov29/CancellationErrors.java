
public class CancellationErrors {
	public static void main(String[] args) {
		
		int n = 50000;
		double rsum = 0;
		double lsum = 0;
		
		for (int i = 1; i <= n; i++) {
			lsum += 1.0 / i;
		}
		
		for (int i = n; i >= 1; i--) {
			rsum += 1.0 / i;
		}
		
		System.out.println("Right summation: " + rsum);
		System.out.println();
		System.out.println("Left summation: " + lsum);
	}//
}//
