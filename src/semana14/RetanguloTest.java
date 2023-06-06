package semana14;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RetanguloTest {
    @Test
    public void controiComBaseNegativaEAlturaZero() {
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(-5, 0));
    }
    
    @Test
    public void controiComBaseZeroEAlturaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(0, -5));
    }
    
    @Test
    public void controiComBaseZeroEAlturaZero() {
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(0, 0));
    }
    
    @Test
    public void controiComBaseNegativaEAlturaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(-8, -9));
    }
    
    @Test
    public void controiComBasePositivaEAlturaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(8, -9));
    }
    
    @Test
    public void controiComBaseNegativaEAlturaPositiva() {
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(-8, 9));
    }

    @Test
    public void setComBaseNegativaEAlturaZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Retangulo retangulo = new Retangulo(-5, 0);
            retangulo.setBase(-5);
            retangulo.setAltura(-5);
        });
    }
    
    @Test
    public void setComBaseZeroEAlturaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            Retangulo retangulo = new Retangulo(0, -8);
            retangulo.setBase(-5);
            retangulo.setAltura(-5);
        });
    }
    
    @Test
    public void setComBaseZeroEAlturaZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Retangulo retangulo = new Retangulo(0, 0);
            retangulo.setBase(-5);
            retangulo.setAltura(-5);
        });
    }
    
    @Test
    public void setComBaseNegativaEAlturaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            Retangulo retangulo = new Retangulo(-5, -8);
            retangulo.setBase(-5);
            retangulo.setAltura(-5);
        });
    }
    
    @Test
    public void setComBasePositivaEAlturaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            Retangulo retangulo = new Retangulo(5, -8);
            retangulo.setBase(-5);
            retangulo.setAltura(-5);
        });
    }
    
    @Test
    public void setComBaseNegativaEAlturaPositiva() {
        assertThrows(IllegalArgumentException.class, () -> {
            Retangulo retangulo = new Retangulo(-5, 8);
            retangulo.setBase(-5);
            retangulo.setAltura(-5);
        });
    }

   @Test
    public void constroiComValorValido() {
        Retangulo retangulo = new Retangulo(5, 6);
        assertEquals((retangulo.getAltura() + retangulo.getBase()), 11);
    }

    @Test
    public void setComValorValido() {
        Retangulo retangulo = new Retangulo(5, 6);
        retangulo.setBase(10);
        retangulo.setAltura(11);
        assertEquals((retangulo.getAltura() + retangulo.getBase()), 21);
    }
    
}