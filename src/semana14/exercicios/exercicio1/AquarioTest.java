package semana14.exercicios.exercicio1;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AquarioTest {

    @Test
    public void calculaVolumeComNumerosInteiros() {
        //AAA
        //Arrange
        float altura = 2f;
        float largura = 50f;
        float profundidade = 63f;
        Aquario aquario = new Aquario(altura, largura, profundidade);
        //Act
        float volume = aquario.calcularVolume();
        
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
        Aquario aquario = new Aquario(altura, largura, profundidade);
        //Act
        float volume = aquario.calcularVolume();
        
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
        Aquario aquario = new Aquario(altura, largura, profundidade);
        //Act
        float filtragem = aquario.calcularFiltragemMinima();
        
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
        Aquario aquario = new Aquario(altura, largura, profundidade);
        //Act
        float filtragem = aquario.calcularFiltragemMinima();
        
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
        Aquario aquario = new Aquario(altura, largura, profundidade);
        //Act
        float filtragem = aquario.calcularFiltragemMaxima();
        
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
        Aquario aquario = new Aquario(altura, largura, profundidade);
        //Act
        float filtragem = aquario.calcularFiltragemMaxima();
        
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
        Aquario aquario = new Aquario(altura, largura, profundidade);
        float tempMin = 56f;
        float tempMax = 23f;
        //Act
        float potencia = aquario.calcularPotenciaTermostato(tempMin, tempMax);
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
        Aquario aquario = new Aquario(altura, largura, profundidade);
        float tempMin = 56.35f;
        float tempMax = 13.48f;
        //Act
        float potencia = aquario.calcularPotenciaTermostato(tempMin, tempMax);
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
        Aquario aquario = new Aquario(altura, largura, profundidade);
        float tempMin = 13f;
        float tempMax = 98f;
        //Act
        float potencia = aquario.calcularPotenciaTermostato(tempMin, tempMax);
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
        Aquario aquario = new Aquario(altura, largura, profundidade);
        float tempMin = 13.65f;
        float tempMax = 56.5478f;
        //Act
        float potencia = aquario.calcularPotenciaTermostato(tempMin, tempMax);
        //Assert
        assertEquals(-14.39113712310791, potencia);
    }
    
    @Test
    public void controiComLarguraNegativaEAlturaZeroEComprimentoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> new Aquario(-5f, 0f, -5f));
    }
    
    @Test
    public void controiComLarguraZeroEAlturaNegativaEComprimentoZero() {
        assertThrows(IllegalArgumentException.class, () -> new Aquario(0f, -5f, 0f));
    }
    
    @Test
    public void controiComLarguraZeroEAlturaZeroEComprimentoPositivo() {
        assertThrows(IllegalArgumentException.class, () -> new Aquario(0f, 0f, 5f));
    }
    @Test
    public void controiComLarguraNegativaEAlturaNegativaEComprimentoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> new Aquario(-8f, -9f, -5f));
    }
    
    @Test
    public void controiComLarguraPositivaEAlturaNegativaEComprimentoZero() {
        assertThrows(IllegalArgumentException.class, () -> new Aquario(8f, -9f, 0f));
    }
    
    @Test
    public void controiComLarguraNegativaEAlturaPositivaEComprimentoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> new Aquario(-8f, 9f, -5f));
    }

    @Test
    public void setComValoresNegativos() {
        assertThrows(IllegalArgumentException.class, () -> {
            Aquario aquario = new Aquario(5f, 5f, 8f);
            aquario.setLargura(-5f);
            aquario.setAltura(-5f);
            aquario.setComprimento(-5f);
        });
    }
    
    @Test
    public void setComValoresZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Aquario aquario = new Aquario(5f, 5f, 8f);
            aquario.setLargura(0f);
            aquario.setAltura(0f);
            aquario.setComprimento(0f);
        });
    }
    
    @Test
    public void setComPositivosENegativos() {
        assertThrows(IllegalArgumentException.class, () -> {
            Aquario aquario = new Aquario(5f, 5f, 8f);
            aquario.setLargura(5f);
            aquario.setAltura(-5f);
            aquario.setComprimento(-5f);
        });
    }
    
    @Test
    public void setComPositivosEZeros() {
        assertThrows(IllegalArgumentException.class, () -> {
            Aquario aquario = new Aquario(5f, 5f, 8f);
            aquario.setLargura(5f);
            aquario.setAltura(5f);
            aquario.setComprimento(0f);
        });
    }
    
    @Test
    public void setComPositivosNegativosEZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Aquario aquario = new Aquario(5f, 5f, 8f);
            aquario.setLargura(5f);
            aquario.setAltura(-5f);
            aquario.setComprimento(0f);
        });
    }
    
    @Test
    public void setComZeros() {
        assertThrows(IllegalArgumentException.class, () -> {
            Aquario aquario = new Aquario(5f, 5f, 8f);
            aquario.setLargura(0f);
            aquario.setAltura(0f);
            aquario.setComprimento(0f);
        });
    }

   @Test
    public void constroiComValorValido() {
        Aquario aquario = new Aquario(5f, 5f, 5f);
        assertEquals((aquario.getAltura() + aquario.getLargura() + aquario.getComprimento()), 15);
    }

    @Test
    public void setComValorValido() {
        Aquario aquario = new Aquario(5f, 5f, 5f);
        aquario.setLargura(10f);
        aquario.setAltura(10f);
        aquario.setComprimento(10f);
        assertEquals((aquario.getAltura() + aquario.getLargura() + aquario.getComprimento()), 30);
    }
}
