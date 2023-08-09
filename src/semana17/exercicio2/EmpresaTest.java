package semana17.exercicio2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpresaTest {

    private Empresa empresa;

    @BeforeEach
    public void setup() {
        empresa = new Empresa("123456789", "Minha Empresa");
    }

    @Test
    public void testGetCnpj() {
        assertEquals("123456789", empresa.getCnpj());
    }

    @Test
    public void testSetCnpj() {
        empresa.setCnpj("987654321");
        assertEquals("987654321", empresa.getCnpj());
    }

    @Test
    public void testGetNome() {
        assertEquals("Minha Empresa", empresa.getNome());
    }

    @Test
    public void testSetNome() {
        empresa.setNome("Nova Empresa");
        assertEquals("Nova Empresa", empresa.getNome());
    }
}
