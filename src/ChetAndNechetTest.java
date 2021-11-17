import static org.junit.Assert.*;

import org.junit.Test;

public class ChetAndNechetTest {

	@Test
	public void testGetNumberOfChetAndNechet() {
		ChetAndNechet numbers = new ChetAndNechet();
		String actual = numbers.getNumberOfChetAndNechet(1234874825);
		String expected = "Number of chet is 6\n"
				+ "Number of nechet is 4";
		assertEquals(actual, expected);
	}

}
