package semana17.exercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VendedorFixoTest {

    @Test
    public void testCalcularSalario() {
        VendedorFixo vendedorFixo = new VendedorFixo("João", 10000, 5, 1500);
        double salarioCalculado = vendedorFixo.calcularSalario();
        assertEquals(2000, salarioCalculado);
    }

    @Test
    public void testGetSetSalario() {
        VendedorFixo vendedorFixo = new VendedorFixo("Maria", 8000, 4, 1200);

        assertEquals(1200, vendedorFixo.getSalario());

        vendedorFixo.setSalario(1300);
        assertEquals(1300, vendedorFixo.getSalario());
    }
}
