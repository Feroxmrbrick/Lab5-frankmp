import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class PrimeFactorsTest {

	@Test
	public void testOne() {
		assertEquals(new ArrayList<Integer>(), PrimeNumbers.generatePrimes(1));
	}

}
