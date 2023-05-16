package semana12.exercicios.exercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    public void encontraUmImcBaixoPeso() {
        //AAA
        //Arrange
        float altura = 2.10f;
        float peso = 50.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        int classificacao = pessoa.getFaixa();
        
        //Assert
        assertEquals(0, classificacao);
    }

    @Test
    public void encontraUmImcPesoNormal() {
       //AAA
        //Arrange
        float altura = 1.75f;
        float peso = 60.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        int classificacao = pessoa.getFaixa();
        
        //Assert
        assertEquals(1, classificacao);
    }

    @Test
    public void encontraUmImcExecessoPeso() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 80.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        int classificacao = pessoa.getFaixa();
        
        //Assert
        assertEquals(2, classificacao);
    }

    @Test
    public void encontraUmImcObesidade1() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 100.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        int classificacao = pessoa.getFaixa();
        
        //Assert
        assertEquals(3, classificacao);
    }

    @Test
    public void encontraUmImcObesidade2() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 110.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        int classificacao = pessoa.getFaixa();
        
        //Assert
        assertEquals(4, classificacao);
    }

    @Test
    public void encontraUmImcObesidade3() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 150.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        int classificacao = pessoa.getFaixa();
        
        //Assert
        assertEquals(5, classificacao);
    }

    @Test
    public void calculaUmImcBaixoPeso() {
        //AAA
        //Arrange
        float altura = 2.10f;
        float peso = 50.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        float imc = pessoa.calcularImc();
        
        //Assert
        assertEquals(11.337869644165039, imc);
    }

    @Test
    public void calculaUmImcPesoNormal() {
       //AAA
        //Arrange
        float altura = 1.75f;
        float peso = 60.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        float imc = pessoa.calcularImc();
        
        //Assert
        assertEquals(19.59183692932129, imc);
    }

    @Test
    public void calculaUmImcExecessoPeso() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 80.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        float imc = pessoa.calcularImc();
        
        //Assert
        assertEquals(27.681659698486328, imc);
    }

    @Test
    public void calculaUmImcObesidade1() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 100.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        float imc = pessoa.calcularImc();
        
        //Assert
        assertEquals(34.602073669433594, imc);
    }

    @Test
    public void calculaUmImcObesidade2() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 110.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        float imc = pessoa.calcularImc();
        
        //Assert
        assertEquals(38.06228256225586, imc);
    }

    @Test
    public void calculaUmImcObesidade3() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 150.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        float imc = pessoa.calcularImc();
        
        //Assert
        assertEquals(51.90311050415039, imc);
    }

    @Test
    public void mostraASituaçãoParaUmImcBaixoPeso() {

        //AAA
        //Arrange
        float altura = 2.10f;
        float peso = 50.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        String pesoIdeal = pessoa.getSituacao();
        
        //Assert
        assertEquals("GANHAR", pesoIdeal);
    }

    @Test
    public void mostraASituaçãoParaUmImcPesoNormal() {
       //AAA
        //Arrange
        float altura = 1.75f;
        float peso = 60.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        String pesoIdeal = pessoa.getSituacao();
        
        //Assert
        assertEquals("NORMAL", pesoIdeal);
    }
  
    @Test
    public void mostraASituaçãoParaUmImcExecessoPeso() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 80.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        String pesoIdeal = pessoa.getSituacao();
        
        //Assert
        assertEquals("PERDER", pesoIdeal);
    }

    @Test
    public void mostraASituaçãoParaUmImcObesidade1() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 100.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        String pesoIdeal = pessoa.getSituacao();
        
        //Assert
        assertEquals("PERDER", pesoIdeal);
    }

    @Test
    public void mostraASituaçãoParaUmImcObesidade2() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 110.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        String pesoIdeal = pessoa.getSituacao();
        
        //Assert
        assertEquals("PERDER", pesoIdeal);
    }

    @Test
    public void mostraASituaçãoParaUmImcObesidade3() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 150.0f;

        Pessoa pessoa = new Pessoa(altura, peso);
        String pesoIdeal = pessoa.getSituacao();
        
        //Assert
        assertEquals("PERDER", pesoIdeal);
    }



}
