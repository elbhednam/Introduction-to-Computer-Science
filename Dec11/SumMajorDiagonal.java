import java.util.Scanner;

public class SumMajorDiagonal {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size for an n x n matrix: \n");
		int n = input.nextInt();
		int[][] matrix = new int[n][n];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random() * 9) + 1;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nThe sum of the main diagonal is " + sumDiagonal(matrix));
	
	}//
	
	public static int sumDiagonal(int[][] m) {
		int sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][i];
		}
		return sum;
	}
}//
