import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class FrancTest {

	@Test
	public void testEquality() {
		   assertTrue(Money.dollar(5).equals(Money.dollar(5))); 
		   assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		   assertFalse(Money.franc(5).equals(Money.dollar(5)));
		}
	
	
}
