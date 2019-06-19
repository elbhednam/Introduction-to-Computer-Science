import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		char[][] seating = {
				{'A', 'B', ' ', 'C', 'D'},
				{'A', 'B', ' ', 'C', 'D'},
				{'A', 'B', ' ', 'C', 'D'},
				{'A', 'B', ' ', 'C', 'D'},
				{'A', 'B', ' ', 'C', 'D'},
				{'A', 'B', ' ', 'C', 'D'},
				};
		
		int[] numbers = {1, 2, 3, 4, 5, 6};
		
		for (int i = 0; i < seating.length; i++) {
			for (int j = 0; j < seating[i].length; j++) {
				int ix = (int)(Math.random() * seating.length);
				int jx = (int)(Math.random() * seating[i].length);
				if (seating[ix][jx] != ' ') {
					seating[ix][jx] = 'X';
				}
			}
		}
		
		for (int row = 0; row < seating.length; row++) {
			System.out.print(numbers[row] + "    ");
			for (int column = 0; column < seating[row].length; column++) {
				System.out.print(seating[row][column] + " ");
			}
			System.out.println();
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.print("Please select your desired seat: ");
		int seatn = input.nextInt();
		char seatl = input.next().charAt(0);
		char c = Character.toUpperCase(seatl);
		
		
		for (int row = 0; row < seating.length; row++) {
			for (int column = 0; column < seating[row].length; column++) {
				if (seating[seatn - 1][column] != c) {
					
				}
			}
		}
	}//
}//
