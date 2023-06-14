package semana14;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RetanguloTest {    

    @Test
    public void constroiComBaseNegativa() {
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(-5.0, 5.0));
    }
    
    @Test
    public void constroiComBaseZero() {
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(0.0, 5.0));
    }
    
    @Test
    public void constroiComAlturaZero() {
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(5.0, 0.0));
    }

    @Test
    public void constroiComAlturaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(8.0, -9.0));
    }
    
    @Test
    public void setComBaseNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            Retangulo pessoa = new Retangulo(5.0, 5.0);
            pessoa.setBase(-5.0);
        });
    }
    
    @Test
    public void setComBaseZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Retangulo pessoa = new Retangulo(5.0, 5.0);
            pessoa.setBase(0.0);
        });
    }
    
    @Test
    public void setComAlturaZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Retangulo pessoa = new Retangulo(5.0, 5.0);
            pessoa.setAltura(0.0);
        });
    }
    
    @Test
    public void setComAlturaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            Retangulo pessoa = new Retangulo(5.0, 5.0);
            pessoa.setAltura(-5.0);
        });
    }

   @Test
    public void constroiComValorValidoAltura() {
        Retangulo pessoa = new Retangulo(5.0, 5.0);
        assertEquals(pessoa.getAltura(), 5);
    }     

   @Test
    public void constroiComValorValidoBase() {
        Retangulo pessoa = new Retangulo(5.0, 5.0);
        assertEquals(pessoa.getBase(), 5);
    }  

   @Test
    public void setComValorValidoAltura() {
        Retangulo pessoa = new Retangulo(5.0, 5.0);
        pessoa.setAltura(2);
        assertEquals(pessoa.getAltura(), 2);
    }     

   @Test
    public void setComValorValidoBase() {
        Retangulo pessoa = new Retangulo(5.0, 5.0);
        pessoa.setBase(2);
        assertEquals(pessoa.getBase(), 2);
    }  
    
}