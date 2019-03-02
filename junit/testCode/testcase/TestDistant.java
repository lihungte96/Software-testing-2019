import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDistant {
	@Test
	public void testDistant1() {
		int a = 50;
		int b = 30;
		// 50 - 30
		assertEquals(Distant.distant(a, b), 20);
	}
	@Test

	public void testDistant2() {
		int a = -50;
		int b = 30;
		// 30 + 50
		assertEquals(Distant.distant(a, b), 80);
	}
}
