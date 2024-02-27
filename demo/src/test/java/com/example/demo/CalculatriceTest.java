// CalculatriceTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatriceTest {

    @Test
    public void testAdd() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(5, calculatrice.add(2, 3));
    }

    @Test
    public void testMulti() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(6, calculatrice.multi(2, 3));
    }

    @Test
    public void testDiv() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(2, calculatrice.div(6, 3));
    }

    @Test
    public void testDivByZero() {
        Calculatrice calculatrice = new Calculatrice();
        assertThrows(IllegalArgumentException.class, () -> calculatrice.div(6, 0));
    }
}
