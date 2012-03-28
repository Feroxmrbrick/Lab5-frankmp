import java.util.ArrayList;

public class PrimeNumbers {
	public static ArrayList<Integer> generatePrimes(int n) {

		ArrayList<Integer> ret = new ArrayList<Integer>();

		for (int candidate = 2; n > 1; candidate++) {
			while (n % candidate == 0) {
				ret.add(candidate);
				n /= candidate;
			}
		} 

		return ret;
	}
	
	public static ArrayList<Integer> primeNumberGen(int n) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		int candidate = 2;
		boolean isPrime;
		
		while (candidate < n) {
			isPrime = true; 
			
			for (int i : ret) {
				if (candidate % i == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				ret.add(candidate);
			}
			
			candidate++;
		}
		
		return ret;
	}
}
