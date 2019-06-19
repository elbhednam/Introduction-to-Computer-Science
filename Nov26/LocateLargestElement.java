import java.util.Scanner;

public class LocateLargestElement {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows of the array: ");
		int row = input.nextInt();
		System.out.print("Enter the number of columns of the array: " );
		int column = input.nextInt();
		System.out.println();
		int[][] array = new int[row][column];
		int[] returnValue = new int[2];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random() * 100) + 1;
				System.out.print(" ");
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}	
		System.out.println();
		
		returnValue = locateLargest(array);
		System.out.println("The largest element is at index (" + returnValue[0] + ", " + returnValue[1] + ").");
	}//
	
	public static int[] locateLargest(int[][] m) {
		int max = 0;
		int [] returnValue = new int[2];
		
		for (int i = 0; i < m.length - 1; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] > max) {
					max = m[i][j];
					returnValue[0] = i;
					returnValue[1] = j;
				}
			}
		}
		return returnValue;
	}
}//
