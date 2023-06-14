package semana14.exercicios.exercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    public void encontraUmImcBaixoPeso() {
        //AAA
        //Arrange
        double altura = 2.10f;
        double peso = 50.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        int classificacao = pessoa.getFaixa();
        
        //Assert
        assertEquals(0, classificacao);
    }

    @Test
    public void encontraUmImcPesoNormal() {
       //AAA
        //Arrange
        double altura = 1.75f;
        double peso = 60.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        int classificacao = pessoa.getFaixa();
        
        //Assert
        assertEquals(1, classificacao);
    }

    @Test
    public void encontraUmImcExecessoPeso() {
        //AAA
        //Arrange
        double altura = 1.70f;
        double peso = 80.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        int classificacao = pessoa.getFaixa();
        
        //Assert
        assertEquals(2, classificacao);
    }

    @Test
    public void encontraUmImcObesidade1() {
        //AAA
        //Arrange
        double altura = 1.70f;
        double peso = 100.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        int classificacao = pessoa.getFaixa();
        
        //Assert
        assertEquals(3, classificacao);
    }

    @Test
    public void encontraUmImcObesidade2() {
        //AAA
        //Arrange
        double altura = 1.70f;
        double peso = 110.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        int classificacao = pessoa.getFaixa();
        
        //Assert
        assertEquals(4, classificacao);
    }

    @Test
    public void encontraUmImcObesidade3() {
        //AAA
        //Arrange
        double altura = 1.70f;
        double peso = 150.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        int classificacao = pessoa.getFaixa();
        
        //Assert
        assertEquals(5, classificacao);
    }

    @Test
    public void calculaUmImcBaixoPeso() {
        //AAA
        //Arrange
        double altura = 2.10f;
        double peso = 50.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        double imc = pessoa.calcularImc();
        
        //Assert
        assertEquals(11.337869510500358, imc);
    }

    @Test
    public void calculaUmImcPesoNormal() {
       //AAA
        //Arrange
        double altura = 1.75f;
        double peso = 60.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        double imc = pessoa.calcularImc();
        
        //Assert
        assertEquals(19.591836734693878, imc);
    }

    @Test
    public void calculaUmImcExecessoPeso() {
        //AAA
        //Arrange
        double altura = 1.70f;
        double peso = 80.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        double imc = pessoa.calcularImc();
        
        //Assert
        assertEquals(27.68165934675469, imc);
    }

    @Test
    public void calculaUmImcObesidade1() {
        //AAA
        //Arrange
        double altura = 1.70f;
        double peso = 100.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        double imc = pessoa.calcularImc();
        
        //Assert
        assertEquals(34.602074183443364, imc);
    }

    @Test
    public void calculaUmImcObesidade2() {
        //AAA
        //Arrange
        double altura = 1.70f;
        double peso = 110.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        double imc = pessoa.calcularImc();
        
        //Assert
        assertEquals(38.062281601787696, imc);
    }

    @Test
    public void calculaUmImcObesidade3() {
        //AAA
        //Arrange
        double altura = 1.70f;
        double peso = 150.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        double imc = pessoa.calcularImc();
        
        //Assert
        assertEquals(51.903111275165045, imc);
    }

    @Test
    public void mostraASituaçãoParaUmImcBaixoPeso() {

        //AAA
        //Arrange
        double altura = 2.10f;
        double peso = 50.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        String pesoIdeal = pessoa.getSituacao();
        
        //Assert
        assertEquals("GANHAR", pesoIdeal);
    }

    @Test
    public void mostraASituaçãoParaUmImcPesoNormal() {
       //AAA
        //Arrange
        double altura = 1.75f;
        double peso = 60.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        String pesoIdeal = pessoa.getSituacao();
        
        //Assert
        assertEquals("NORMAL", pesoIdeal);
    }
  
    @Test
    public void mostraASituaçãoParaUmImcExecessoPeso() {
        //AAA
        //Arrange
        double altura = 1.70f;
        double peso = 80.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        String pesoIdeal = pessoa.getSituacao();
        
        //Assert
        assertEquals("PERDER", pesoIdeal);
    }

    @Test
    public void mostraASituaçãoParaUmImcObesidade1() {
        //AAA
        //Arrange
        double altura = 1.70f;
        double peso = 100.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        String pesoIdeal = pessoa.getSituacao();
        
        //Assert
        assertEquals("PERDER", pesoIdeal);
    }

    @Test
    public void mostraASituaçãoParaUmImcObesidade2() {
        //AAA
        //Arrange
        double altura = 1.70f;
        double peso = 110.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        String pesoIdeal = pessoa.getSituacao();
        
        //Assert
        assertEquals("PERDER", pesoIdeal);
    }

    @Test
    public void mostraASituaçãoParaUmImcObesidade3() {
        //AAA
        //Arrange
        double altura = 1.70f;
        double peso = 150.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        String pesoIdeal = pessoa.getSituacao();
        
        //Assert
        assertEquals("PERDER", pesoIdeal);
    }

    
    @Test
    public void constroiComPesoNegativa() {
        assertThrows(IllegalArgumentException.class, () -> new Pessoa(-5.0, 5.0));
    }
    
    @Test
    public void constroiComPesoZero() {
        assertThrows(IllegalArgumentException.class, () -> new Pessoa(0.0, 5.0));
    }
    
    @Test
    public void constroiComAlturaZero() {
        assertThrows(IllegalArgumentException.class, () -> new Pessoa(5.0, 0.0));
    }

    @Test
    public void constroiComAlturaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> new Pessoa(8.0, -9.0));
    }
    
    @Test
    public void setComPesoNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            Pessoa pessoa = new Pessoa(5.0, 5.0);
            pessoa.setPeso(-5.0);
        });
    }
    
    @Test
    public void setComPesoZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Pessoa pessoa = new Pessoa(5.0, 5.0);
            pessoa.setPeso(0.0);
        });
    }
    
    @Test
    public void setComAlturaZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Pessoa pessoa = new Pessoa(5.0, 5.0);
            pessoa.setAltura(0.0);
        });
    }
    
    @Test
    public void setComAlturaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            Pessoa pessoa = new Pessoa(5.0, 5.0);
            pessoa.setAltura(-5.0);
        });
    }

   @Test
    public void constroiComValorValidoAltura() {
        Pessoa pessoa = new Pessoa(5.0, 5.0);
        assertEquals(pessoa.getAltura(), 5);
    }     

   @Test
    public void constroiComValorValidoPeso() {
        Pessoa pessoa = new Pessoa(5.0, 5.0);
        assertEquals(pessoa.getPeso(), 5);
    }  

   @Test
    public void setComValorValidoAltura() {
        Pessoa pessoa = new Pessoa(5.0, 5.0);
        pessoa.setAltura(2);
        assertEquals(pessoa.getAltura(), 2);
    }     

   @Test
    public void setComValorValidoPeso() {
        Pessoa pessoa = new Pessoa(5.0, 5.0);
        pessoa.setPeso(2);
        assertEquals(pessoa.getPeso(), 2);
    }  
       


}
