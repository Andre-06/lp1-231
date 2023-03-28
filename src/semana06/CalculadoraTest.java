package semana06;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void somaDoisNumerosPositivos() {
        //AAA
        //Arrange
        double n1 = 10.0;
        double n2 = 2.0;

        //Act
        double soma = Calculadora.somar(n1, n2);
        
        //Assert
        assertEquals(12.0, soma);
    }

    @Test
    public void somaUmNumeroPositivoEUmNegativo() {
        double n1 = 10.0;
        double n2 = -2.0;

        double soma = Calculadora.somar(n1, n2);
        
        assertEquals(8.0, soma);
    }    

    @Test
    public void somaDoisNumerosNegativos() {
        double n1 = -10.0;
        double n2 = -2.0;

        double soma = Calculadora.somar(n1, n2);
        
        assertEquals(-12.0, soma);
    }    

    @Test
    public void somaDoisNumerosPositivosReais() {
        double n1 = -10.1;
        double n2 = -2.6;

        double soma = Calculadora.somar(n1, n2);
        
        assertEquals(-12.7, soma);
    }    
    //---------------

    @Test
    public void subtraiDoisNumerosPositivos() {
        //AAA
        //Arrange
        double n1 = 10.0;
        double n2 = 2.0;

        //Act
        double subtrai = Calculadora.subtrair(n1, n2);
        
        //Assert
        assertEquals(8.0, subtrai);
    }

    @Test
    public void subtraiUmNumeroPositivoEUmNegativo() {
        double n1 = 10.0;
        double n2 = -2.0;

        double subtrai = Calculadora.subtrair(n1, n2);
        
        assertEquals(12.0, subtrai);
    }    

    @Test
    public void subtraiDoisNumerosNegativos() {
        double n1 = -10.0;
        double n2 = -2.0;

        double subtrai = Calculadora.subtrair(n1, n2);
        
        assertEquals(-8.0, subtrai);
    }    

    @Test
    public void subtraiDoisNumerosPositivosReais() {
        double n1 = -10.1;
        double n2 = -2.6;

        double subtrai = Calculadora.subtrair(n1, n2);
        
        assertEquals(-7.5, subtrai);
    }    
    //-----------
    @Test
    public void multiplicaDoisNumerosPositivos() {
        //AAA
        //Arrange
        double n1 = 10.0;
        double n2 = 2.0;

        //Act
        double multiplica = Calculadora.multiplicar(n1, n2);
        
        //Assert
        assertEquals(20.0, multiplica);
    }

    @Test
    public void multiplicaUmNumeroPositivoEUmNegativo() {
        double n1 = 10.0;
        double n2 = -2.0;

        double multiplica = Calculadora.multiplicar(n1, n2);
        
        assertEquals(-20.0, multiplica);
    }    

    @Test
    public void multiplicaDoisNumerosNegativos() {
        double n1 = -10.0;
        double n2 = -2.0;

        double multiplica = Calculadora.multiplicar(n1, n2);
        
        assertEquals(20.0, multiplica);
    }    

    @Test
    public void multiplicaDoisNumerosPositivosReais() {
        double n1 = -10.1;
        double n2 = -2.6;

        double multiplica = Calculadora.multiplicar(n1, n2);
        
        assertEquals(26.26, multiplica);
    }    
    //-----------
    @Test
    public void dividiDoisNumerosPositivos() throws Exception {
        //AAA
        //Arrange
        double n1 = 10.0;
        double n2 = 2.0;

        //Act
        double dividi = Calculadora.dividir(n1, n2);
        
        //Assert
        assertEquals(5.0, dividi);
    }

    @Test
    public void dividiUmNumeroPositivoEUmNegativo() throws Exception {
        double n1 = 10.0;
        double n2 = -2.0;

        double dividi = Calculadora.dividir(n1, n2);
        
        assertEquals(-5.0, dividi);
    }    

    @Test
    public void dividiDoisNumerosNegativos() throws Exception {
        double n1 = -10.0;
        double n2 = -2.0;

        double dividi = Calculadora.dividir(n1, n2);
        
        assertEquals(5.0, dividi);
    }    

    @Test
    public void dividiDoisNumerosPositivosReais() throws Exception {
        double n1 = -10.1;
        double n2 = -2.6;

        double dividi = Calculadora.dividir(n1, n2);
        
        assertEquals(3.884615384615384, dividi);
    }    

    @Test
    public void dividiPorZero() throws Exception {
        double n1 = -10.1;
        double n2 = 0;

        Exception exception = assertThrows(RuntimeException.class, () -> {
            Calculadora.dividir(n1, n2);
        });
        String expectedMessage = "Não é possível divir por 0";
        String actualMessage = exception.getMessage();

        assertEquals(actualMessage, expectedMessage);
    }    
    

}
