/* Amanda Bakalarczyk
 * COSC 1406
 */
public class d {
	public static void main(String[] args) {
		
		int[] myNums = new int[100];
		int count = 0;
		
		for (int i = 0; i < myNums.length; i++) {
			count++;
			myNums[i] = (int)(Math.random() * 200);
			if (count % 20 == 0) {
			System.out.println(" ");
			}
			else
				System.out.print(myNums[i] + " ");
		}
		
		if (isDuplicate(myNums)) {
			System.out.println("\nThe array is not unique.");
		}
		else 
			System.out.println("\nThe array is unique.");
	}
	public static boolean isDuplicate(int[] array) {
		for (int j = 0; j < array.length - 1; j++) {
			for (int k = j + 1; k < array.length; k++) {
				if (array[j] == array[k]) {	
					return true;
				}
			}
		}return false;
	}
}
