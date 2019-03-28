import java.util.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class TestParameterized<T extends Comparable<? super T>> {
    List<? extends T> list;
    T expected;

    public TestParameterized(List<? extends T> list, T expected) {
        this.list = list;
        this.expected = expected;
    }

    @Parameters(name = "{index}: Min.min({0})={1}")
    public static Iterable<Object[]> data1() {
        return Arrays.asList(new Object[][] { { Arrays.asList(1, 2, 3, 4, 5, 6, 7), 1 },
                { Arrays.asList("a", "b", "c", "d", "e", "f"), "a" }, { Arrays.asList("aba", "acb", "abc"), "aba" } });
    }

    @Test
    public void testDistant() {
        T result = Min.min(list);
        assertEquals(expected, result);
    }
}
