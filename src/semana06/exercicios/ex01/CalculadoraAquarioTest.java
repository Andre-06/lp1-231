package semana06.exercicios.ex01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraAquarioTest {

    @Test
    public void calculaVolumeComNumerosInteiros() {
        //AAA
        //Arrange
        float altura = 2f;
        float largura = 50;
        float profundidade = 63f;
        //Act
        float volume = CalculadoraAquario.calcularVolume(altura, largura, profundidade);
        
        //Assert
        assertEquals(6.300000190734863, volume);
    }

    @Test
    public void calculaVolumeComNumerosReais() {
        //AAA
        //Arrange
        float altura = 2.10f;
        float largura = 50.0f;
        float profundidade = 63.9f;
        //Act
        float volume = CalculadoraAquario.calcularVolume(altura, largura, profundidade);
        
        //Assert
        assertEquals(6.709499359130859, volume);
    }


    @Test
    public void calculaFiltragemMinimaComNumerosInteiros() {
        //AAA
        //Arrange
        float altura = 2f;
        float largura = 50;
        float profundidade = 63f;
        //Act
        float volume = CalculadoraAquario.calcularVolume(altura, largura, profundidade);
        float filtragem = CalculadoraAquario.calcularFiltragemMinima(volume);
        
        //Assert
        assertEquals(12.600000381469727, filtragem);
    }

    @Test
    public void calculaFiltragemMinimaComNumerosReais() {
        //AAA
        //Arrange
        float altura = 2.10f;
        float largura = 50.0f;
        float profundidade = 63.9f;
        //Act
        float volume = CalculadoraAquario.calcularVolume(altura, largura, profundidade);
        float filtragem = CalculadoraAquario.calcularFiltragemMinima(volume);
        
        //Assert
        assertEquals(13.418998718261719, filtragem);
    }

    @Test
    public void calculaFiltragemMaximaComNumerosInteiros() {
        //AAA
        //Arrange
        float altura = 2f;
        float largura = 50;
        float profundidade = 63f;
        //Act
        float volume = CalculadoraAquario.calcularVolume(altura, largura, profundidade);
        float filtragem = CalculadoraAquario.calcularFiltragemMaxima(volume);
        
        //Assert
        assertEquals(18.900001525878906, filtragem);
    }

    @Test
    public void calculaFiltragemMaximaComNumerosReais() {
        //AAA
        //Arrange
        float altura = 2.10f;
        float largura = 50.0f;
        float profundidade = 63.9f;
        //Act
        float volume = CalculadoraAquario.calcularVolume(altura, largura, profundidade);
        float filtragem = CalculadoraAquario.calcularFiltragemMaxima(volume);
        
        //Assert
        assertEquals(20.128498077392578, filtragem);
    }

    @Test
    public void calculaPotenciaPositivaNegativaComNumerosInteiros() {
        //AAA
        //Arrange
        float altura = 2f;
        float largura = 50;
        float profundidade = 63f;
        float tempMin = 56f;
        float tempMax = 23f;
        //Act
        float volume = CalculadoraAquario.calcularVolume(altura, largura, profundidade);
        float potencia = CalculadoraAquario.calcularPotenciaTermostato(volume, tempMin, tempMax);
        //Assert
        assertEquals(10.395000457763672, potencia);
    }

    @Test
    public void calculaPotenciaPositivaNegativaComNumerosReais() {
        //AAA
        //Arrange
        float altura = 2.10f;
        float largura = 50.0f;
        float profundidade = 63.9f;
        float tempMin = 56.35f;
        float tempMax = 13.48f;
        //Act
        float volume = CalculadoraAquario.calcularVolume(altura, largura, profundidade);
        float potencia = CalculadoraAquario.calcularPotenciaTermostato(volume, tempMin, tempMax);
        //Assert
        assertEquals(14.381811141967773, potencia);
    }

    @Test
    public void calculaPotenciaNegativaComNumerosInteiros() {
        //AAA
        //Arrange
        float altura = 2f;
        float largura = 50;
        float profundidade = 63f;
        float tempMin = 13f;
        float tempMax = 98f;
        //Act
        float volume = CalculadoraAquario.calcularVolume(altura, largura, profundidade);
        float potencia = CalculadoraAquario.calcularPotenciaTermostato(volume, tempMin, tempMax);
        //Assert
        assertEquals(-26.775001525878906, potencia);
    }

    @Test
    public void calculaPotenciaNegativaComNumerosReais() {
        //AAA
        //Arrange
        float altura = 2.10f;
        float largura = 50.0f;
        float profundidade = 63.9f;
        float tempMin = 13.65f;
        float tempMax = 56.5478f;
        //Act
        float volume = CalculadoraAquario.calcularVolume(altura, largura, profundidade);
        float potencia = CalculadoraAquario.calcularPotenciaTermostato(volume, tempMin, tempMax);
        //Assert
        assertEquals(-14.39113712310791, potencia);
    }

}
