public class LargestRowAndColumn {
	public static void main(String[] args) {
		
		int[][] matrix = new int[4][4];
		
		System.out.println("----------- ");
		for (int i = 0; i < matrix.length; i++) {
			System.out.print("[ ");
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random() * 9) + 1;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("]");
			System.out.println();
		}
		System.out.println("----------- ");
		System.out.println();
		
		System.out.println("The largest row index is " + maxRowIndex(matrix));
		System.out.println("The largest column index is " + maxColIndex(matrix));
	}//
	public static int maxRowIndex(int[][] m) {
		int maxRow = 0;
		int maxRowIndex = 0;
		
		for (int column = 0; column < m.length; column++) {
			maxRow += m[0][column];
		}
		
		for (int row = 1; row < m.length; row++) {
			int rowTotal = 0;
			for (int column = 0; column < m[row].length; column++) {
				rowTotal += m[row][column];
				
				if (rowTotal > maxRow) {
					maxRow = rowTotal;
					maxRowIndex = row;
				}
			}
		}
		return maxRowIndex;
	}
	
	public static int maxColIndex(int[][] m) {
		int maxCol = 0;
		int maxColIndex = 0;
		for (int column = 0; column < m[0].length; column++) {
			int colTotal = 0;
			for (int row = 0; row < m.length; row++) {
				colTotal += m[row][column];
				if (colTotal > maxCol) {
					maxCol = colTotal;
					maxColIndex = column;
				}
			}
		}
		return maxColIndex;
	}
}//
