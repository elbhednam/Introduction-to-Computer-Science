import java.util.Scanner;

public class ColumnSum {
	public static void main(String[] args) {
		
		int[][] matrix = new int[3][4];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = (int)(Math.random() * 9) + 1;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 3 x 4 matrix:\n");
		
		for (int i = 0; i < matrix.length; i++) {
			System.out.println("The sum of the elements in column " + i + " is " + sumColumn(matrix, i));
		}
	}//
	
	public static int sumColumn(int[][] m, int columnIndex) {
		int sum = 0;
		for (int i = 0; i < m.length; i++) {
				sum += m[i][columnIndex];
			
		}
		return sum;
	}
}//
