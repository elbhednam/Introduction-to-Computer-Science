public class ShuffleRows {
	public static void main(String[] args) {
		
		int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
	
		shuffle(m);
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
		}
	}//
	
	public static void shuffle(int[][] m) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				int k = (int)(Math.random() * m.length);
				int temp = m[i][j];
				m[i][j] = m[k][j];
				m[k][j] = temp;
			}
		}
	}
}//
