import java.util.Scanner;

public class MarkovMatrix {
	public static void main(String[] args) {
		
		double[][] matrix = new double[3][3];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 3 x 3 matrix row by row: ");
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
			System.out.println();
		}
		System.out.println();
		
		if (isMarkovMatrix(matrix)) {
			System.out.println("It is a Markov matrix.");
			System.out.println();
			System.out.println("   >»-(:-_~:)-«<");
		}
		
		if (!isMarkovMatrix(matrix)) {
			System.out.println("It is not a Markov matrix.");
			System.out.println();
			System.out.println("    >»-(.__.)-«<");
		}
	}//
	
	public static boolean isMarkovMatrix(double[][] m) {
		int sum = 0;
		for (int i = 0; i < m[0].length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] < 0) {
					return false;
				}
				sum += m[i][j];
			}
		}
		if (sum != 1) {
			return false;
		}
		
		return true;
	}
}//
