import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDistantPositive {
	@Test
	public void testDistantPositive() {
		int a = 50;
		int b = 30;
		int expected = 20; // 50 - 30
		int result = Distant.distant(a, b);
		assertEquals(expected, result);
	}
}
