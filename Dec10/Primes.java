public class Primes {
	public static void main(String[] args) {
		System.out.println("There are " + primeCount(300) + " prime numbers under 300\n");
		printPrimes(62);
	}//
	
	public static boolean isPrime(int number) {
		for (int div = 2; div <= number / 2; div++) {
			if (number % div == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void printPrimes(int numberOfPrimes) {
		int count = 0;
		int number = 2;
		
		while (count < numberOfPrimes) {
			if (isPrime(number)) {
				count++;
				
				if (count % 10 == 0) {
					System.out.println(number);
				}
				
				else
					System.out.print(number + " ");
			}
			
			number++;
		}
	}
	
	
	public static int primeCount(int n) {
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}
}//
