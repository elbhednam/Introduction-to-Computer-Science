/**
 * Amanda Bakalarczyk
 * COSC 1046
 * Assignment 7: pt. 1
 */
import java.util.Scanner;

public class AirplaneSeats {
	public static void main(String[] args) {
		
		//seat letters
		char[][] seating = {
				{'A', 'B', 'C', 'D'},
				{'A', 'B', 'C', 'D'},
				{'A', 'B', 'C', 'D'},
				{'A', 'B', 'C', 'D'},
				{'A', 'B', 'C', 'D'},
				{'A', 'B', 'C', 'D'},
				};
		
		//seat numbers
		int[] numbers = {1, 2, 3, 4, 5, 6}; 
		
		//randomly assign Xs to some of the seats
		for (int i = 0; i < seating.length; i++) {
			for (int j = 0; j < seating[i].length; j++) {
				int ix = (int)(Math.random() * seating.length);
				int jx = (int)(Math.random() * seating[i].length);
				if (seating[ix][jx] != ' ') {
					seating[ix][jx] = 'X';
				}
			}
		}
		
		// print the arrays for seats numbers and letters plus a space for the aisle
		for (int row = 0; row < seating.length; row++) {
			System.out.print(numbers[row] + "    ");
			System.out.print(seating[row][0] + " " + seating[row][1] + "  " + seating[row][2] + " " + seating[row][3]);
			System.out.println();
		}
		boolean choosing = true;
		while (choosing) {
			// user input for seat choice
			Scanner input = new Scanner(System.in);
			System.out.println();
			System.out.print("Please select your desired seat: ");
			String seat = input.nextLine();
            seat = seat.toUpperCase(); // convert to upper case
            
            // convert to user input to integers
            int seatn = (int)(seat.charAt(0) - '1');
            int seatl = (int)(seat.charAt(1) - 'A');
            
            // if input is 0X, terminate. This part doesn't work
            if (seat == "0X") {
            	choosing = false;
            	
            }
            // invalid input for numbers that are not 1 to 6 and letters not A to D. choose again.
            if (seatn > 5 || seatn < 0 || seatl > 3 || seatl < 0) {
            	System.out.println();
            	System.out.println("The seat choice is invalid.");
            	continue;
            }
            // if there's an X, the seat has already been assigned. choose again.
            if (seating[seatn][seatl] == 'X') {
            	System.out.println();
            	System.out.println("The seat has already been assigned");
            	continue;
            }
            // If the seat isn't taken, assign it to user. put an X on it and print the array again to show the seat has been assigned.
            if (seating[seatn][seatl] != 'X') {
            	System.out.println();
            	System.out.println("Thank you for choosing. Your seat has been assigned.");
            	System.out.println();
            	seating[seatn][seatl] = 'X';
            	for (int row = 0; row < seating.length; row++) {
        			System.out.print(numbers[row] + "    ");
        			System.out.print(seating[row][0] + " " + seating[row][1] + "  " + seating[row][2] + " " + seating[row][3]);
        			System.out.println();
        		}
            	break;
            }
		}
	}//
}//
