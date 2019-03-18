import java.util.Arrays;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class TestParameterized {
	private int numberA;
    private int numberB;
    private int expected;

    public TestParameterized(int numberA, int numberB, int expected) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
	}

    @Parameters(name = "{index}: Distant.distant({0}, {1})={2}")
    public static Iterable<Object[]> data1() {
        return Arrays.asList(new Object[][] {
            { 1, 1, 0 },
            { 2, 2, 0 },
            { 8, 2, 6 },
            { 4, 5, 1 },
			{ 50, 30, 20},
			{ 50, -30, 80}
        });
    }

    @Test
	public void testDistant() {
		int result = Distant.distant(numberA, numberB);
		assertEquals(expected, result);
	}
}
