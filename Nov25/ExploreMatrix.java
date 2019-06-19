import java.util.Scanner;

public class ExploreMatrix {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the matrix: ");
		int size = input.nextInt();
		int[][] matrix = new int[size][size];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random() * 2);
				System.out.print(" ");
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}	
		
		
		for (int i = 0; i < matrix[0].length; i++) {
			sumColumn(matrix, i);
			
			if (sumColumn(matrix, i) == 0) {
				System.out.println("All zeros in column " + i); 
				
			}
			else if (sumColumn(matrix, i) == size) {
				System.out.println("All ones in column " + i);

			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			sumRow(matrix, i);
			if (sumRow(matrix, i) == 0) {
				System.out.println("All zeros in row " + i); 
				
			}
			else if (sumRow(matrix, i) == size) {
				System.out.println("All ones in row " + i);

			}
		}
	}//
	
	public static int sumColumn(int[][] m, int columnIndex) {
		int sum = 0; 
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}
		return sum;
	}
	
	public static int sumRow(int[][] m, int rowIndex) {
		int sum = 0; 
		for (int i = 0; i < m.length; i++) {
			sum += m[rowIndex][i];
		}
		return sum;
	}
}//
