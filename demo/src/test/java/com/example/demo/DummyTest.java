import org.junit.Test;
import static org.junit.Assert.*;

public class DummyTest {

    @Test
    public void testAdd() {
        DummyTest dummyTest = new DummyTest();
        assertEquals(4, dummyTest.add(2, 2));
    }

    @Test
    public void testMulti() {
        DummyTest dummyTest = new DummyTest();
        assertEquals(6, dummyTest.multi(2, 3));
    }

    @Test
    public void testDiv() {
        DummyTest dummyTest = new DummyTest();
        assertEquals(2, dummyTest.div(6, 3));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}
