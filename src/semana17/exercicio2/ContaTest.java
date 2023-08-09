package semana17.exercicio2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {
    private Correntista correntista;
    private Conta conta;

    @BeforeEach
    public void setUp() {
        correntista = new Correntista(1, "Exemplo Correntista", null);
        conta = new Conta(123, LocalDate.now(), 1000.0, 10.0, correntista);
    }

    @Test
    public void testSaqueValido() {
        conta.sacar(500.0);
        assertEquals(500.0, conta.getSaldo(), 0.001);
    }

    @Test
    public void testSaqueInvalidoValorZero() {
        assertThrows(IllegalArgumentException.class, () -> conta.sacar(0.0));
    }

    @Test
    public void testSaqueInvalidoValorNegativo() {
        assertThrows(IllegalArgumentException.class, () -> conta.sacar(-100.0));
    }

    @Test
    public void testSaqueInvalidoValorMaiorQueSaldo() {
        assertThrows(IllegalArgumentException.class, () -> conta.sacar(1500.0));
    }

    @Test
    public void testDepositoValido() {
        conta.depositar(300.0);
        assertEquals(1300.0, conta.getSaldo(), 0.001);
    }

    @Test
    public void testDepositoInvalidoValorZero() {
        assertThrows(IllegalArgumentException.class, () -> conta.depositar(0.0));
    }

    @Test
    public void testDepositoInvalidoValorNegativo() {
        assertThrows(IllegalArgumentException.class, () -> conta.depositar(-50.0));
    }

    @Test
    public void testCalcularTarifa() {
        double tarifa = conta.calcularTarifa();
        assertEquals(10.0, tarifa, 0.001);
    }

    @Test
    public void testConstrutor() {
        assertEquals(123, conta.getNumero());
        assertEquals(LocalDate.now(), conta.getDataAbertura());
        assertEquals(1000.0, conta.getSaldo(), 0.001);
        assertEquals(10.0, conta.calcularTarifa(), 0.001);
        assertEquals(correntista, conta.getCorrentista());
    }

}