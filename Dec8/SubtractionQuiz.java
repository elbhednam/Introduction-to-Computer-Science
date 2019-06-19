import java.util.Scanner;

public class SubtractionQuiz {
	public static void main(String[] args) {
		
		final int Q = 5;
		int correctCount = 0;
		long startTime = System.currentTimeMillis();
		String output = " ";
		Scanner input = new Scanner(System.in);
		
		for (int count = 0; count < Q; count++) {
			int num1 = (int)(Math.random() * 10) + 1;
			int num2 = (int)(Math.random() * 10) + 1;
			
			if (num1 < num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			
			System.out.print("What is " + num1 + " - " + num2 + "? ");
			int answer = input.nextInt();
			
			if (num1 - num2 == answer) {
				System.out.println("You are correct.");
				correctCount++;
			}
			else
				System.out.println("You are incorrect. \n" + num1 + " - " + num2 + " = " + (num1 - num2));
			
			output += "\n" + num1 + " - " + num2 + " = " + answer + ((num1 - num2 == answer) ? " correct" : " wrong");
		}
		
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		
		System.out.println("The correct count is " + correctCount + "\nThe test time is " + testTime / 1000 + " seconds\n" + output);
		
	}//
}//
