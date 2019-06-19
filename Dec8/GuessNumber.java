import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		
		int number = (int)(Math.random() * 100) + 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Guess a number between 1 and 100: ");
		
		int guess = 0;
		do {
			System.out.print("\nEnter your guess: ");
			guess = input.nextInt();
			
			if (guess == number) {
				System.out.println("You are correct. The number is " + number);
			}
			else if (guess > number) {
				System.out.println("Your guess is too high. Try again.");
			}
			else
				System.out.println("Your guess is too low.");
		} while (guess != number);
	}
}
