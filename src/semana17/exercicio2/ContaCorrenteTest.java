package semana17.exercicio2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {
    private ContaCorrente contaCorrente;
    private Correntista correntista;
    private LocalDate dataAbertura;

    @BeforeEach
    public void setUp() {
        correntista = new Correntista(1, "Fulano", null);
        dataAbertura = LocalDate.of(2023, 8, 1);
        contaCorrente = new ContaCorrente(123, dataAbertura, 1000.0, 10.0, correntista, 500.0);
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
    public void testCalcularTarifa() {
        double tarifa = contaCorrente.calcularTarifa();
        assertEquals(10.0, tarifa);
    }

    @Test
    public void testConstructor() {
        assertEquals(123, contaCorrente.getNumero());
        assertEquals(dataAbertura, contaCorrente.getDataAbertura());
        assertEquals(1000.0, contaCorrente.getSaldo());
        assertEquals(10.0, contaCorrente.calcularTarifa());
        assertEquals(correntista, contaCorrente.getCorrentista());
        assertEquals(500.0, contaCorrente.getLimite());
    }
}