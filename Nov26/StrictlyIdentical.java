import java.util.Scanner;

public class StrictlyIdentical {
	public static void main(String[] args) {
		
		int[][] list1 = new int[3][3];
		int[][] list2 = new int[3][3];
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter list 1: ");
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list1[i].length; j++) {
				list1[i][j] = input.nextInt();
			}
		}
		
		System.out.print("Enter list 2: ");
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list1[i].length; j++) {
				list1[i][j] = input.nextInt();
			}
		}
		
		if (equals(list1, list2)) {
			System.out.println("The two arrays are strictly identical.");
		}
		else
			System.out.println("The two arrays are not strictly identical");
		
	}//
	
	public static boolean equals(int[][] m1, int[][] m2) {
		
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				if (m1[i][j] != m2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}//
