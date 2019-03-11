import org.junit.Test;
import org.junit.*; // before after ...

public class TestBeforeAfter {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
    }

    @Before
    public void before() {
        System.out.println("Before");
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }

    @Test
    public void Case1() {
        System.out.println("Test case 1");
    }

    @Test
    public void Case2() {
        System.out.println("Test case 2");
    }
}
