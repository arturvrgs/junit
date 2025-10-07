import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        Calculadora calc = new Calculadora();
        calc.soma(2, 3);

        Assertions.assertTrue(calc.soma(2, 3) == 5);
        Assertions.assertEquals(5, calc.soma(2, 3));
    }

    @Test
    public void assertivas() {
        Assertions.assertEquals("Casa", "Casa");
        Assertions.assertNotEquals("Casa", "casa");
        Assertions.assertTrue("casa".equalsIgnoreCase("CASA"));
        Assertions.assertTrue("Casa".endsWith("sa"));
        Assertions.assertTrue("Casa".startsWith("Ca"));

        List<String> s1 = new ArrayList<>();
        //s1.add("a"); daria erro
        List<String> s2 = new ArrayList<>();
        List<String> s3 = null;

        Assertions.assertEquals(s1, s2);

        //compara referencias de memoria
        Assertions.assertSame(s1, s1);

        //verifica null
        Assertions.assertNull(s3);
        Assertions.assertNotNull(s1);
    }
}
