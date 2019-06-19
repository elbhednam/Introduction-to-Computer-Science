public class SumColumns {
	public static void main(String[] args) {
	
		int[][] matrix = new int[3][4];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random() * 40) + 1;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int k = 0; k < matrix[0].length; k++) {
			System.out.println("The sum of the elements at column " + k + " is " + sumColumn(matrix, k));
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
