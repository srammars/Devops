import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testMulti() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multi(2, 3));
    }

    @Test
    public void testDiv() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.div(6, 3));
    }
}
