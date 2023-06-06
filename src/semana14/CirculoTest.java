package semana14;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CirculoTest {
    @Test
    public void controiComValorNegativo() {
        assertThrows(IllegalArgumentException.class, () -> new Circulo(-5));
    }

    @Test
    public void controiComZero() {
        assertThrows(IllegalArgumentException.class, () -> new Circulo(0));
    }

    @Test
    public void setComValorNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            Circulo circulo = new Circulo(5);
            circulo.setRaio(-5);
        });
    }

    @Test
    public void setComValorZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Circulo circulo = new Circulo(5);
            circulo.setRaio(0);
        });
    }

    @Test
    public void constroiComValorValido() {
        Circulo circulo = new Circulo(5);
        assertEquals(circulo.getRaio(), 5);
    }

    @Test
    public void setComValorValido() {
        Circulo circulo = new Circulo(5);
        circulo.setRaio(10);
        assertEquals(circulo.getRaio(), 10);
    }
    
}