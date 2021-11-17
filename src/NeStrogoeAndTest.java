import static org.junit.Assert.*;

import org.junit.Test;

public class NeStrogoeAndTest {

	@Test
	public void testGetNeStrogoeAnd() {
		NeStrogoeAnd numbers = new NeStrogoeAnd();
		String actual = numbers.getNeStrogoeAnd("1001010", "0111010");
		String expected = "1111010";
		assertEquals(actual, expected);
	}

}
