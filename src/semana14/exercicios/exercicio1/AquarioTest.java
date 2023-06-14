package semana14.exercicios.exercicio1;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AquarioTest {

    @Test
    public void calculaVolumeComNumerosInteiros() {
        //AAA
        //Arrange
        double altura = 2;
        double largura = 50;
        double profundidade = 63;
        Aquario aquario = new Aquario(altura, largura, profundidade);
        //Act
        double volume = aquario.calcularVolume();
        
        //Assert
        assertEquals(6.3, volume);
    }

    @Test
    public void calculaVolumeComNumerosReais() {
        //AAA
        //Arrange
        double altura = 2.10;
        double largura = 50.0;
        double profundidade = 63.9;
        Aquario aquario = new Aquario(altura, largura, profundidade);
        //Act
        double volume = aquario.calcularVolume();
        
        //Assert
        assertEquals(6.7095, volume);
    }


    @Test
    public void calculaFiltragemMinimaComNumerosInteiros() {
        //AAA
        //Arrange
        double altura = 2;
        double largura = 50;
        double profundidade = 63;
        Aquario aquario = new Aquario(altura, largura, profundidade);
        //Act
        double filtragem = aquario.calcularFiltragemMinima();
        
        //Assert
        assertEquals(12.6, filtragem);
    }

    @Test
    public void calculaFiltragemMinimaComNumerosReais() {
        //AAA
        //Arrange
        double altura = 2.10;
        double largura = 50.0;
        double profundidade = 63.9;
        Aquario aquario = new Aquario(altura, largura, profundidade);
        //Act
        double filtragem = aquario.calcularFiltragemMinima();
        
        //Assert
        assertEquals(13.419, filtragem);
    }

    @Test
    public void calculaFiltragemMaximaComNumerosInteiros() {
        //AAA
        //Arrange
        double altura = 2;
        double largura = 50;
        double profundidade = 63;
        Aquario aquario = new Aquario(altura, largura, profundidade);
        //Act
        double filtragem = aquario.calcularFiltragemMaxima();
        
        //Assert
        assertEquals(18.9, filtragem);
    }

    @Test
    public void calculaFiltragemMaximaComNumerosReais() {
        //AAA
        //Arrange
        double altura = 2.10;
        double largura = 50.0;
        double profundidade = 63.9;
        Aquario aquario = new Aquario(altura, largura, profundidade);
        //Act
        double filtragem = aquario.calcularFiltragemMaxima();
        
        //Assert
        assertEquals(20.128500000000003, filtragem);
    }

    @Test
    public void calculaPotenciaPositivaNegativaComNumerosInteiros() {
        //AAA
        //Arrange
        double altura = 2;
        double largura = 50;
        double profundidade = 63;
        Aquario aquario = new Aquario(altura, largura, profundidade);
        double tempMin = 56;
        double tempMax = 23;
        //Act
        double potencia = aquario.calcularPotenciaTermostato(tempMin, tempMax);
        //Assert
        assertEquals(10.39500015489757, potencia);
    }

    @Test
    public void calculaPotenciaPositivaNegativaComNumerosReais() {
        //AAA
        //Arrange
        double altura = 2.10;
        double largura = 50.0;
        double profundidade = 63.9;
        Aquario aquario = new Aquario(altura, largura, profundidade);
        double tempMin = 56.35;
        double tempMax = 13.48;
        //Act
        double potencia = aquario.calcularPotenciaTermostato(tempMin, tempMax);
        //Assert
        assertEquals(14.381813464305718, potencia);
    }

    @Test
    public void calculaPotenciaNegativaComNumerosInteiros() {
        //AAA
        //Arrange
        double altura = 2;
        double largura = 50;
        double profundidade = 63;
        Aquario aquario = new Aquario(altura, largura, profundidade);
        double tempMin = 13;
        double tempMax = 98;
        //Act
        double potencia = aquario.calcularPotenciaTermostato(tempMin, tempMax);
        //Assert
        assertEquals(-26.775000398978587, potencia);
    }

    @Test
    public void calculaPotenciaNegativaComNumerosReais() {
        //AAA
        //Arrange
        double altura = 2.10;
        double largura = 50.0;
        double profundidade = 63.9;
        Aquario aquario = new Aquario(altura, largura, profundidade);
        double tempMin = 13.65;
        double tempMax = 56.5478;
        //Act
        double potencia = aquario.calcularPotenciaTermostato(tempMin, tempMax);
        //Assert
        assertEquals(-14.391139669444689, potencia);
    }
    
    @Test
    public void constroiComLarguraNegativa() {
        assertThrows(IllegalArgumentException.class, () -> new Aquario(-5.0, 5.0, 5.0));
    }
    
    @Test
    public void constroiComLarguraZero() {
        assertThrows(IllegalArgumentException.class, () -> new Aquario(0.0, 5.0, 5.0));
    }
    
    @Test
    public void constroiComAlturaZero() {
        assertThrows(IllegalArgumentException.class, () -> new Aquario(5.0, 0.0, 5.0));
    }
    @Test
    public void constroiComAlturaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> new Aquario(8.0, -9.0, 5.0));
    }
    
    @Test
    public void constroiComComprimentoZero() {
        assertThrows(IllegalArgumentException.class, () -> new Aquario(8.0, 9.0, 0.0));
    }
    
    @Test
    public void constroiComComprimentoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> new Aquario(8.0, 9.0, -5.0));
    }
    
    @Test
    public void setComLarguraNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            Aquario aquario = new Aquario(5.0);
            aquario.setLargura(-5.0);
        });
    }
    
    @Test
    public void setComLarguraZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Aquario aquario = new Aquario(5.0);
            aquario.setLargura(0.0);
        });
    }
    
    @Test
    public void setComAlturaZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Aquario aquario = new Aquario(5.0);
            aquario.setAltura(0.0);
        });
    }
    @Test
    public void setComAlturaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            Aquario aquario = new Aquario(5.0);
            aquario.setAltura(-5.0);
        });
    }
    
    @Test
    public void setComComprimentoZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Aquario aquario = new Aquario(5.0);
            aquario.setComprimento(0.0);
        });
    }
    
    @Test
    public void setComComprimentoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            Aquario aquario = new Aquario(5.0);
            aquario.setComprimento(-5.0);
        });
    }
        
   @Test
    public void constroiComValorValidoAltura() {
        Aquario aquario = new Aquario(5.0);
        assertEquals(aquario.getAltura(), 5);
    }     

   @Test
    public void constroiComValorValidoLargura() {
        Aquario aquario = new Aquario(5.0);
        assertEquals(aquario.getLargura(), 5);
    }  
       
   @Test
    public void constroiComValorValidoComrpimento() {
        Aquario aquario = new Aquario(5.0);
        assertEquals(aquario.getComprimento(), 5);
    }
        
   @Test
    public void setComValorValidoAltura() {
        Aquario aquario = new Aquario(5.0);
        aquario.setAltura(2);
        assertEquals(aquario.getAltura(), 2);
    }     

   @Test
    public void setComValorValidoLargura() {
        Aquario aquario = new Aquario(5.0);
        aquario.setLargura(2);
        assertEquals(aquario.getLargura(), 2);
    }  
       
   @Test
    public void setComValorValidoComrpimento() {
        Aquario aquario = new Aquario(5.0);
        aquario.setComprimento(2);
        assertEquals(aquario.getComprimento(), 2);
    }
}
