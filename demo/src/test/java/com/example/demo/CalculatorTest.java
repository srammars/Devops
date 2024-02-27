import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(Integer.valueOf(5), Calculator.add(2, 3));
    }

    @Test
    public void testMulti() {
        assertEquals(Integer.valueOf(6), Calculator.multi(2, 3));
    }

    @Test
    public void testDiv() {
        assertEquals(Integer.valueOf(2), Calculator.div(6, 3));
    }
}
