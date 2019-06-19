import java.util.Scanner;

public class ChineseZodiac {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		int i = year % 12;
		
		String[] ZodiacAnimals = { "monkey", "rooster", "dog", "pig", "rat", "ox",
			    "tiger", "rabbit", "dragon", "snake", "horse", "sheep", };
		
		System.out.println();
		System.out.println("Your sign is " + ZodiacAnimals[i]);
	}
}
