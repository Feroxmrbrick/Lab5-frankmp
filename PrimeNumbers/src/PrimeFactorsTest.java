import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class PrimeFactorsTest {

	@Test
	public void testOne() {
		assertEquals(list(), PrimeNumbers.generatePrimes(1));
	}
	
	@Test
	public void testTwo() {
		assertEquals(list(2), PrimeNumbers.generatePrimes(2));
	}
	
	@Test
	public void testThree() {
		assertEquals(list(3), PrimeNumbers.generatePrimes(3));
	}
	
	@Test
	public void testFour() {
		assertEquals(list(2, 2), PrimeNumbers.generatePrimes(4));
	}
	
	@Test
	public void testSix() {
		assertEquals(list(2, 3), PrimeNumbers.generatePrimes(6));
	}
	
	@Test
	public void testEight() {
		assertEquals(list(2, 2, 2), PrimeNumbers.generatePrimes(8));
	}
	
	@Test
	public void testNine() {
		assertEquals(list(3, 3), PrimeNumbers.generatePrimes(9));
	}
	
	@Test
	public void testTen() {
		assertEquals(list(2, 5), PrimeNumbers.generatePrimes(10));
	}
	
	@Test
	public void testTwelve() {
		assertEquals(list(2, 2, 3), PrimeNumbers.generatePrimes(12));
	}
	
	@Test
	public void testBigNumber() {
		assertEquals(list(2, 3, 3, 5, 7, 631, 937), PrimeNumbers.generatePrimes(372485610));
	}

	private ArrayList<Integer> list(int... ints) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		for (int i : ints) {
			ret.add(i);
		}
		
		return ret;
	}
}
