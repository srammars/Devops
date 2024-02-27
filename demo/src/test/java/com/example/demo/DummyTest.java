import org.junit.Test;
import static org.junit.Assert.*;

public class DummyTest {

    @Test
    public void testAdd() {
        assertEquals(4, add(2, 2));
    }

    @Test
    public void testMulti() {
        assertEquals(6, multi(2, 3));
    }

    @Test
    public void testDiv() {
        assertEquals(2, div(6, 3));
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