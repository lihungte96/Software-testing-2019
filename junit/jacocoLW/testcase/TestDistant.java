import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDistant {
	@Test
	public void testDistant1() throws UnhandledCaseException {
		int a = 50;
		int b = 30;
		int expected = 20; // 50 - 30
		int result = Distant.distant(a, b);
		assertEquals(expected, result);
	}

	@Test
	public void testDistant2() throws UnhandledCaseException {
		int a = -50;
		int b = 30;
		int expected = 80; // 30 + 50
		int result = Distant.distant(a, b);
		assertEquals(expected, result);
	}
}
