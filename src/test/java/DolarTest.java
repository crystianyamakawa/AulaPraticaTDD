
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class DolarTest {
	@Test
	public void testMultiplication() {
		   Dollar five = new Dollar(5);
		   Dollar product = five.times(2);
		   assertEquals(10, product.amount);
		   product = five.times(3);
		   assertEquals(new Dollar(15), product);
		}
	@Test
	public void testEquality() {
		   assertTrue(new Dollar(5).equals(new Dollar(5)));
		   assertFalse(new Dollar(5).equals(new Dollar(6)));
		}
}	
