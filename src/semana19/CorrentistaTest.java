package semana19;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class CorrentistaTest {

    private Correntista correntista;
    private List<Conta> contas;

    @BeforeEach
    public void setUp() {
        contas = new ArrayList<>();
        contas.add(new ContaCorrente(1, null, 1000.0, 10.0, null, 500.0));
        contas.add(new ContaPoupanca(2, null, 2000.0, 15.0, null, null));

        correntista = new Correntista(123, "João", contas);
    }

    @Test
    public void testGetCodigo() {
        assertEquals(123, correntista.getCodigo());
    }

    @Test
    public void testSetCodigo() {
        correntista.setCodigo(456);
        assertEquals(456, correntista.getCodigo());
    }

    @Test
    public void testGetNome() {
        assertEquals("João", correntista.getNome());
    }

    @Test
    public void testSetNome() {
        correntista.setNome("Maria");
        assertEquals("Maria", correntista.getNome());
    }

    @Test
    public void testGetContas() {
        assertEquals(contas, correntista.getContas());
    }

    @Test
    public void testSetContas() {
        List<Conta> newContas = new ArrayList<>();
        newContas.add(new ContaSalario(3, null, 3000.0, 20.0, null, null));
        correntista.setContas(newContas);
        assertEquals(newContas, correntista.getContas());
    }

    @Test
    public void testAddConta() {
        Conta novaConta = new ContaSalario(4, null, 4000.0, 25.0, null, null);
        correntista.addConta(novaConta);
        assertTrue(correntista.getContas().contains(novaConta));
    }

    @Test
    public void testCalcularTarifas() {
        double expectedTotalTarifas = 10.0 + 15.0; // Assuming the tarifas are set as 10.0 and 15.0
        assertEquals(expectedTotalTarifas, correntista.calcularTarifas());
    }
}
