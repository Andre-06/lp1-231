package semana07;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExerciciosRevisaoTest {
    @Test
    public void somaTresValores() {
        //AAA
        //Arrange
        double n1 = 5;
        double n2 = 6;
        double n3 = 7;

        //Act
        double soma = ExerciciosRevisao.somarTresValores(n1, n2, n3);
        
        //Assert
        assertEquals(18, soma);
    }
    
    @Test
    public void calculaMediaAritimeticaDeTresValores() {
        //AAA
        //Arrange
        double n1 = 5;
        double n2 = 6;
        double n3 = 7;

        //Act
        double soma = ExerciciosRevisao.calcularMediaAritimeticaDeTresValores(n1, n2, n3);

        //Assert
        assertEquals(6, soma);
    }

    @Test
    public void achaMaiorValorDeTresValores() {
        //AAA
        //Arrange
        int n1 = 5;
        int n2 = 6;
        int n3 = 7;

        //Act
        double soma = ExerciciosRevisao.acharMaiorValorDeTresValores(n1, n2, n3);

        //Assert
        assertEquals(7, soma);
    }

    @Test
    public void achaMenorValorDeTresValores() {
        //AAA
        //Arrange
        int n1 = 5;
        int n2 = 6;
        int n3 = 7;

        //Act
        double soma = ExerciciosRevisao.acharMenorValorDeTresValores(n1, n2, n3);

        //Assert
        assertEquals(5, soma);
    }

    @Test
    public void criarArrayDeTresValores() {
        //AAA
        //Arrange
        double n1 = 5;
        double n2 = 6;
        double n3 = 7;
        double[] num = {5, 6, 7};

        //Act
        double[] soma = ExerciciosRevisao.criarArrayDeTresValores(n1, n2, n3);

        //Assert
        assertEquals(num, soma);
    }

    @Test
    public void somaArray() {
        //AAA
        //Arrange
        double[] num = {5, 6, 7};
        
        //Act
        double soma = ExerciciosRevisao.somarArray(num);

        //Assert
        assertEquals(18, soma);
    }

    @Test
    public void achaMaiorValor() {
        //AAA
        //Arrange
        double[] num = {5, 6, 7};
        
        //Act
        double soma = ExerciciosRevisao.acharMaiorValor(num);

        //Assert
        assertEquals(7, soma);
    }

    @Test
    public void achaMenorValor() {
        //AAA
        //Arrange
        double[] num = {5, 6, 7};
        
        //Act
        double soma = ExerciciosRevisao.acharMaiorValor(num);

        //Assert
        assertEquals(7, soma);
    }

    @Test
    public void juntaDoisArrays() {
        //AAA
        //Arrange
        int[] num1 = {5, 7, 9};
        int[] num2 = {6, 8, 10};
        int[] num = {5, 6, 7, 8, 9, 10};
        
        //Act
        int[] soma = ExerciciosRevisao.juntarDoisArrays(num1, num2);

        //Assert
        assertEquals(num, soma);
    }
    
}
