import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

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

    @Test
    public void deveRetornarNumeroInteiroNaDivisao() {
        Calculadora calculadora = new Calculadora();

        float resultado = calculadora.dividir(6, 2);

        Assertions.assertEquals(3, resultado);
    }

    @Test
    public void deveRetornarNumeroNegativoNaDivisao() {
        Calculadora calculadora = new Calculadora();

        float resultado = calculadora.dividir(6, -2);

        Assertions.assertEquals(-3, resultado);
    }

    @Test
    public void deveRetornarNumeroDecimalNaDivisao() {
        Calculadora calculadora = new Calculadora();

        float resultado = calculadora.dividir(10, 3);

        Assertions.assertEquals(3.3333332538604736, resultado);
        Assertions.assertEquals(3.33, resultado, 0.01);
    }

    @Test
    public void deveRetornarNumeradorZeroNaDivisao() {
        Calculadora calculadora = new Calculadora();

        float resultado = calculadora.dividir(0, 2);

        Assertions.assertEquals(0, resultado);
    }

    @Test
    public void deveLancarExcecaoQuandoDividirPorZero_Junit4() {
        try {
            float resultado = 10/10;
        } catch (ArithmeticException e) {
            Assertions.assertEquals("/ by zero", e.getMessage());
        }
    }

}
