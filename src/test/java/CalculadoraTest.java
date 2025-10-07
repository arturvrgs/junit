import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        Calculadora calc = new Calculadora();
        calc.soma(2, 3);

        Assertions.assertTrue(calc.soma(2, 3) == 5);
        Assertions.assertEquals(5, calc.soma(2, 3));
    }
}
