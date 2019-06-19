/**
 * Amanda Bakalarczyk
 * COSC 1046
 * Assignment 7: pt. 2
 */
public class Sort2D {
	public static void main(String[] args) {
		
		// array to be sorted
		int array[][] = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
		
		// call method
		sort(array);
		
		// print sorted array
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {
				System.out.print(array[row][column] + " ");
			}
		}	
	}//
	public static void sort(int m[][]) {
	// sort ascending
		for (int j = 0; j < m.length - 1; j++) {
			for (int k = j + 1; k < m.length; k++) {
				if (m[j][0] > m[k][0]) {
					// swap using temp array
					int[] temp = m[j];
					m[j] = m[k];
					m[k] = temp;
				}
			}
		} 
	} 
}//
