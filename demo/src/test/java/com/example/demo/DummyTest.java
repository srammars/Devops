import org.junit.Test;
import static org.junit.Assert.*;

public class DummyTest {

    @Test
    public void testAdd() {
        DummyTest dummy = new DummyTest();
        assertEquals(4, dummy.add(2, 2));
    }

    @Test
    public void testMulti() {
        DummyTest dummy = new DummyTest();
        assertEquals(6, dummy.multi(2, 3));
    }

    @Test
    public void testDiv() {
        DummyTest dummy = new DummyTest();
        assertEquals(2, dummy.div(6, 3));
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
