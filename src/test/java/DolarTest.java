
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
	public void testCurrency() {
		   assertEquals("USD", Money.dollar(1).currency());
		   assertEquals("CHF", Money.franc(1).currency());
		}
	
	@Test
	public void testEquality() {
		   assertTrue(Money.dollar(5).equals(Money.dollar(5))); 
		   assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		   assertFalse(Money.franc(5).equals(Money.dollar(5)));
		}	
	
	
}	
