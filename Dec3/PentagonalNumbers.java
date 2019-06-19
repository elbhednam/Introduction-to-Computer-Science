public class PentagonalNumbers {
	public static void main(String[] args) {
		
		int count = 0;
		for (int i = 1; i < 100; i++) {
			count++;
			if (count % 10 == 0) {
				System.out.println();
			}
			else 
				System.out.print(getPentagonalNumber(i) + " ");
		}
	}//
	
	public static int getPentagonalNumber(int n) {
		
		n = n * (3 * n - 1) / 2;
		return n;
	}
}//
