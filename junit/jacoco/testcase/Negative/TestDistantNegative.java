import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDistantNegative {
	@Test
	public void testDistant2() {
		int a = -50;
		int b = 30;
		int expected = 80; // 30 + 50
		int result = Distant.distant(a, b);
		assertEquals(expected, result);
	}
}
