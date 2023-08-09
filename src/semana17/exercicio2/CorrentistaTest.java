package semana17.exercicio2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CorrentistaTest {

    private Correntista correntista;
    private List<Conta> contas;

    @BeforeEach
    public void setup() {
        contas = new ArrayList<>();
        contas.add(new Conta(1, LocalDate.now(), 1000.0, 10.0, null));
        contas.add(new Conta(2, LocalDate.now(), 2000.0, 15.0, null));

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
        newContas.add(new Conta(3, LocalDate.now(), 3000.0, 20.0, null));
        correntista.setContas(newContas);
        assertEquals(newContas, correntista.getContas());
    }
}
