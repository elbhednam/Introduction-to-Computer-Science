import java.util.Scanner;
public class IdentityMatrix {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the n x n identity matrix: ");
		int n = input.nextInt();
		int[][] matrix = new int[n][n];
		
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][i] = 1;
			System.out.println();
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(" ");
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
