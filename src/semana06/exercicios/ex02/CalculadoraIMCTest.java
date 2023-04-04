package semana06.exercicios.ex02;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraIMCTest {

    @Test
    public void encontraUmImcBaixoPeso() {
        //AAA
        //Arrange
        float altura = 2.10f;
        float peso = 50.0f;

        //Act
        float imc = CalculadoraIMC.calcularImc(altura, peso);
        int classificacao = CalculadoraIMC.classifacarImc(imc);
        
        //Assert
        assertEquals(0, classificacao);
    }

    @Test
    public void encontraUmImcPesoNormal() {
       //AAA
        //Arrange
        float altura = 1.75f;
        float peso = 60.0f;

        //Act
        float imc = CalculadoraIMC.calcularImc(altura, peso);
        int classificacao = CalculadoraIMC.classifacarImc(imc);
        
        //Assert
        assertEquals(1, classificacao);
    }

    @Test
    public void encontraUmImcExecessoPeso() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 80.0f;

        //Act
        float imc = CalculadoraIMC.calcularImc(altura, peso);
        int classificacao = CalculadoraIMC.classifacarImc(imc);
        
        //Assert
        assertEquals(2, classificacao);
    }

    @Test
    public void encontraUmImcObesidade1() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 100.0f;

        //Act
        float imc = CalculadoraIMC.calcularImc(altura, peso);
        int classificacao = CalculadoraIMC.classifacarImc(imc);
        
        //Assert
        assertEquals(3, classificacao);
    }

    @Test
    public void encontraUmImcObesidade2() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 110.0f;

        //Act
        float imc = CalculadoraIMC.calcularImc(altura, peso);
        int classificacao = CalculadoraIMC.classifacarImc(imc);
        
        //Assert
        assertEquals(4, classificacao);
    }

    @Test
    public void encontraUmImcObesidade3() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 150.0f;

        //Act
        float imc = CalculadoraIMC.calcularImc(altura, peso);
        int classificacao = CalculadoraIMC.classifacarImc(imc);
        
        //Assert
        assertEquals(5, classificacao);
    }

    @Test
    public void calculaUmImcBaixoPeso() {
        //AAA
        //Arrange
        float altura = 2.10f;
        float peso = 50.0f;

        //Act
        float imc = CalculadoraIMC.calcularImc(altura, peso);
        
        //Assert
        assertEquals(11.337869644165039, imc);
    }

    @Test
    public void calculaUmImcPesoNormal() {
       //AAA
        //Arrange
        float altura = 1.75f;
        float peso = 60.0f;

        //Act
        float imc = CalculadoraIMC.calcularImc(altura, peso);
        
        //Assert
        assertEquals(19.59183692932129, imc);
    }

    @Test
    public void calculaUmImcExecessoPeso() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 80.0f;

        //Act
        float imc = CalculadoraIMC.calcularImc(altura, peso);
        
        //Assert
        assertEquals(27.681659698486328, imc);
    }

    @Test
    public void calculaUmImcObesidade1() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 100.0f;

        //Act
        float imc = CalculadoraIMC.calcularImc(altura, peso);
        
        //Assert
        assertEquals(34.602073669433594, imc);
    }

    @Test
    public void calculaUmImcObesidade2() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 110.0f;

        //Act
        float imc = CalculadoraIMC.calcularImc(altura, peso);
        
        //Assert
        assertEquals(38.06228256225586, imc);
    }

    @Test
    public void calculaUmImcObesidade3() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 150.0f;

        //Act
        float imc = CalculadoraIMC.calcularImc(altura, peso);
        
        //Assert
        assertEquals(51.90311050415039, imc);
    }

    @Test
    public void calculaUmPesoIdealParaUmImcBaixoPeso() {
        //AAA
        //Arrange
        float altura = 2.10f;
        float peso = 50.0f;

        //Act
        float imc = CalculadoraIMC.calcularImc(altura, peso);
        float pesoIdeal = CalculadoraIMC.calcularPesoIdeal(imc, altura, peso);
        
        //Assert
        assertEquals(31.584991455078125, pesoIdeal);
    }

    @Test
    public void calculaUmPesoIdealParaUmImcPesoNormal() {
       //AAA
        //Arrange
        float altura = 1.75f;
        float peso = 60.0f;

        //Act
        float imc = CalculadoraIMC.calcularImc(altura, peso);
        float pesoIdeal = CalculadoraIMC.calcularPesoIdeal(imc, altura, peso);
        
        //Assert
        assertEquals(0, pesoIdeal);
    }

    @Test
    public void calculaUmPesoIdealParaUmImcExecessoPeso() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 80.0f;

        //Act
        float imc = CalculadoraIMC.calcularImc(altura, peso);
        float pesoIdeal = CalculadoraIMC.calcularPesoIdeal(imc, altura, peso);
        
        //Assert
        assertEquals(8.03900146484375, pesoIdeal);
    }

    @Test
    public void calculaUmPesoIdealParaUmImcObesidade1() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 100.0f;

        //Act
        float imc = CalculadoraIMC.calcularImc(altura, peso);
        float pesoIdeal = CalculadoraIMC.calcularPesoIdeal(imc, altura, peso);
        
        //Assert
        assertEquals(28.03900146484375, pesoIdeal);
    }

    @Test
    public void calculaUmPesoIdealParaUmImcObesidade2() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 110.0f;

        //Act
        float imc = CalculadoraIMC.calcularImc(altura, peso);
        float pesoIdeal = CalculadoraIMC.calcularPesoIdeal(imc, altura, peso);
        
        //Assert
        assertEquals(38.03900146484375, pesoIdeal);
    }

    @Test
    public void calculaUmPesoIdealParaUmImcObesidade3() {
        //AAA
        //Arrange
        float altura = 1.70f;
        float peso = 150.0f;

        //Act
        float imc = CalculadoraIMC.calcularImc(altura, peso);
        float pesoIdeal = CalculadoraIMC.calcularPesoIdeal(imc, altura, peso);
        
        //Assert
        assertEquals(78.03900146484375, pesoIdeal);
    }



}
