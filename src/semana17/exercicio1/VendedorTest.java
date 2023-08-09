package semana17.exercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class VendedorTest {

    @Test
    public void testCalcularSalario() {
        Vendedor vendedor = new Vendedor("Carlos", 12000, 3);
        double salarioCalculado = vendedor.calcularSalario();
        assertEquals(360, salarioCalculado);
    }

    @Test
    public void testGetSetNome() {
        Vendedor vendedor = new Vendedor("Ana", 9000, 2);

        assertEquals("Ana", vendedor.getNome());

        vendedor.setNome("Paula");
        assertEquals("Paula", vendedor.getNome());
    }

    @Test
    public void testGetSetVendas() {
        Vendedor vendedor = new Vendedor("Rafael", 15000, 4);

        assertEquals(15000, vendedor.getVendas());

        vendedor.setVendas(18000);
        assertEquals(18000, vendedor.getVendas());
    }

    @Test
    public void testGetSetComissao() {
        Vendedor vendedor = new Vendedor("Lara", 8000, 3);

        assertEquals(3, vendedor.getComissao());

        vendedor.setComissao(4);
        assertEquals(4, vendedor.getComissao());
    }
}