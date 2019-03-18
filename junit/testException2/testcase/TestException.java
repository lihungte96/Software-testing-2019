import org.junit.Test;
import org.junit.*; // before after ...
import static org.junit.Assert.assertEquals;
import org.junit.rules.ExpectedException;

public class TestException {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private static Stack stack;

    @BeforeClass
    public static void beforeClass() {
        stack = new Stack();
    }

    @Before
    public void before() throws Exception {
        // initial some node in stack structure
        stack.push(3);
        stack.push(2);
    }

    @After
    public void after() throws Exception {
        // clean all node in stack
        while (stack.size() != 0) {
            stack.pop();
        }
        // try to create some exception
        // stack.pop();
    }

    @AfterClass
    public static void afterClass() {
        stack = null;
    }

    @Test
    public void CaseInt() throws Exception {
        int value = 0xc8763;
        stack.push(value);
        assertEquals(value, stack.pop());
    }

    @Test
    public void CaseMagic() throws Exception {
        String magic = "c8763";
        stack.push(magic);
        assertEquals(magic, stack.pop());
    }

    @Test
    public void CaseFullException() throws Exception {
        thrown.expect(FullStackException.class);

        // try to overflow
        while (true) {
            stack.push("overflow");
        }
    }

    @Test
    public void CaseEmptyException() throws Exception {
        thrown.expect(EmptyStackException.class);

        // try to underflow
        while (stack.size() != 0) {
            stack.pop();
        }
        stack.pop();
    }
}
