
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class DolarTest {
	@Test
	public void testMultiplication() {
		   Money five = Money.dollar(5);
		   assertEquals(Money.dollar(10), five.times(2));
		   assertEquals(Money.dollar(15), five.times(3));
		}
	
	@Test
	public void testEquality() {
//		   assertTrue(new Dollar(5).equals(new Dollar(5)));
//		   assertFalse(new Dollar(5).equals(new Dollar(6)));
		}
	
	@Test
	public void testCurrency() {
		   assertEquals("USD", Money.dollar(1).currency());
		   assertEquals("CHF", Money.franc(1).currency());
		}
}	
