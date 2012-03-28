import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PrimeGeneratorTest {

	@Test
	public void testOne() {
		assertEquals(list(), PrimeNumbers.primeNumberGen(1));
	}
	
	@Test
	public void testTwo() {
		assertEquals(list(), PrimeNumbers.primeNumberGen(2));
	}
	
	@Test
	public void testThree() {
		assertEquals(list(2), PrimeNumbers.primeNumberGen(3));
	}
	
	@Test
	public void testFour() {
		assertEquals(list(2, 3), PrimeNumbers.primeNumberGen(4));
	}
	
	@Test
	public void testFive() {
		assertEquals(list(2, 3), PrimeNumbers.primeNumberGen(5));
	}
	
	@Test
	public void testSix() {
		assertEquals(list(2, 3, 5), PrimeNumbers.primeNumberGen(6));
	}

	private ArrayList<Integer> list(int... ints) {
		ArrayList<Integer> ret = new ArrayList<Integer>();

		for (int i : ints) {
			ret.add(i);
		}

		return ret;
	}
}
