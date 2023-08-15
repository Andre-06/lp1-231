package semana19;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class ContaSalarioTest {

    private ContaSalario contaSalario;
    private Correntista correntista;
    private Empresa empresa;

    @BeforeEach
    public void setUp() {
        correntista = new Correntista(1, "João", null);
        empresa = new Empresa("123456789", "Empresa XYZ");
        contaSalario = new ContaSalario(123, LocalDate.now(), 1000.0, 10.0, correntista, empresa);
    }

    @Test
    public void testCalcularTarifa() {
        double tarifa = contaSalario.calcularTarifa();
        assertEquals(0.0, tarifa);
    }

    @Test
    public void testSacar() {
        contaSalario.sacar(500.0);
        assertEquals(500.0, contaSalario.getSaldo());
    }

    @Test
    public void testSacarValorMaiorQueSaldo() {
        assertThrows(IllegalArgumentException.class, () -> contaSalario.sacar(1500.0));
    }

    @Test
    public void testSacarValorNegativo() {
        assertThrows(IllegalArgumentException.class, () -> contaSalario.sacar(-100.0));
    }

    @Test
    public void testSacarValorMaiorQueLimite() {
        assertThrows(IllegalArgumentException.class, () -> contaSalario.sacar(600.0));
    }

    @Test
    public void testConstrutor() {
        assertEquals(123, contaSalario.getNumero());
        assertEquals(LocalDate.now(), contaSalario.getDataAbertura());
        assertEquals(1000.0, contaSalario.getSaldo());
        assertEquals(10.0, contaSalario.calcularTarifa());
        assertEquals(correntista, contaSalario.getCorrentista());
        assertEquals(empresa, contaSalario.getEmpresa());
    }

}
