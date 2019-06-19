
public class MatrixDiagonal {
	public static void main(String[] args) {
		
		int[][] nMatrix = new int[4][4];
		
		for (int row = 0; row < nMatrix.length; row++) {
			for (int column = 0; column < nMatrix[row].length; column++) {
				nMatrix[row][column] = (int)(Math.random() * 20) + 1;
				System.out.print(nMatrix[row][column] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("The sum of the elements in the main diagonal is " + sumMajorDiagonal(nMatrix));
		
	}//
	
	public static int sumMajorDiagonal(int[][] matrix) {
		int sum = 0;
		for (int row = 0; row < matrix.length; row++) {
			sum += matrix[row][row];
			}
		return sum;
		}
	
}//
