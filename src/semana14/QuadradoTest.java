package semana14;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class QuadradoTest {
    @Test
    public void controiComValorNegativo() {
        assertThrows(IllegalArgumentException.class, () -> new Quadrado(-5));
    }

    @Test
    public void controiComZero() {
        assertThrows(IllegalArgumentException.class, () -> new Quadrado(0));
    }

    @Test
    public void setComValorNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            Quadrado quadrado = new Quadrado(5);
            quadrado.setLado(-5);
        });
    }

    @Test
    public void setComValorZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Quadrado quadrado = new Quadrado(5);
            quadrado.setLado(0);
        });
    }

    @Test
    public void constroiComValorValido() {
        Quadrado quadrado = new Quadrado(5);
        assertEquals(quadrado.getLado(), 5);
    }

    @Test
    public void setComValorValido() {
        Quadrado quadrado = new Quadrado(5);
        quadrado.setLado(10);
        assertEquals(quadrado.getLado(), 10);
    }
    
}