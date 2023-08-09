package semana17.exercicio2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class ContaPoupancaTest {

    private ContaPoupanca contaPoupanca;
    private Correntista correntista;

    @BeforeEach
    public void setUp() {
        correntista = new Correntista(1, "Nome Correntista", null);
        contaPoupanca = new ContaPoupanca(123, LocalDate.now(), 1000.0, 10.0, correntista, LocalDate.of(2023, 8, 9));
    }

    @Test
    public void testGetAniversario() {
        LocalDate expectedAniversario = LocalDate.of(2023, 8, 9);
        assertEquals(expectedAniversario, contaPoupanca.getAniversario());
    }

    @Test
    public void testSetAniversario() {
        LocalDate newAniversario = LocalDate.of(2023, 9, 10);
        contaPoupanca.setAniversario(newAniversario);
        assertEquals(newAniversario, contaPoupanca.getAniversario());
    }

    @Test
    public void testCalcularTarifa() {
        double expectedTarifa = 10.0;
        assertEquals(expectedTarifa, contaPoupanca.calcularTarifa());
    }

    @Test
    public void testConstrutor() {
        int expectedNumero = 123;
        LocalDate expectedDataAbertura = LocalDate.now();
        double expectedSaldo = 1000.0;
        double expectedTarifa = 10.0;
        assertEquals(expectedNumero, contaPoupanca.getNumero());
        assertEquals(expectedDataAbertura, contaPoupanca.getDataAbertura());
        assertEquals(expectedSaldo, contaPoupanca.getSaldo());
        assertEquals(expectedTarifa, contaPoupanca.calcularTarifa());
        assertEquals(correntista, contaPoupanca.getCorrentista());
        assertEquals(LocalDate.of(2023, 8, 9), contaPoupanca.getAniversario());
    }

}