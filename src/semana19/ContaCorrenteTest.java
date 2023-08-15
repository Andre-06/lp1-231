package semana19;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    private ContaCorrente contaCorrente;
    private Correntista correntista;

    @BeforeEach
    public void setUp() {
        correntista = new Correntista(1, "Fulano", null);
        LocalDate dataAbertura = LocalDate.of(2023, 8, 1);
        contaCorrente = new ContaCorrente(123, dataAbertura, 1000.0, 10.0, correntista, 500.0);
    }

    @Test
    public void testGetLimite() {
        assertEquals(500.0, contaCorrente.getLimite());
    }

    @Test
    public void testSetLimite() {
        contaCorrente.setLimite(700.0);
        assertEquals(700.0, contaCorrente.getLimite());
    }

    @Test
    public void testCalcularTarifa() {
        double tarifa = contaCorrente.calcularTarifa();
        assertEquals(15.0, tarifa);
    }

    @Test
    public void testSacar() {
        contaCorrente.sacar(200.0);
        assertEquals(800.0, contaCorrente.getSaldo());
    }

    @Test
    public void testSacarInvalidValue() {
        assertThrows(IllegalArgumentException.class, () -> contaCorrente.sacar(-100.0));
    }

    @Test
    public void testSacarInsufficientFunds() {
        assertThrows(IllegalArgumentException.class, () -> contaCorrente.sacar(1500.0));
    }

    @Test
    public void testSacarExceedsLimit() {
        assertThrows(IllegalArgumentException.class, () -> contaCorrente.sacar(600.0));
    }

    @Test
    public void testDepositar() {
        contaCorrente.depositar(300.0);
        assertEquals(1300.0, contaCorrente.getSaldo());
    }

    @Test
    public void testDepositarInvalidValue() {
        assertThrows(IllegalArgumentException.class, () -> contaCorrente.depositar(-50.0));
    }

    @Test
    public void testConstructor() {
        assertEquals(123, contaCorrente.getNumero());
        assertEquals(LocalDate.of(2023, 8, 1), contaCorrente.getDataAbertura());
        assertEquals(1000.0, contaCorrente.getSaldo());
        assertEquals(15.0, contaCorrente.calcularTarifa());
        assertEquals(correntista, contaCorrente.getCorrentista());
        assertEquals(500.0, contaCorrente.getLimite());
    }
}
