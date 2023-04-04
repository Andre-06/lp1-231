package semana06.exercicios.ex01;

public class CalculadoraAquario {
    
    public static float calcularVolume(float altura, float largura, float comprimento) {
        return (altura*largura*comprimento)/1000;
    }
    
    public static float calcularPotenciaTermostato(float volume, float temperaturaAmbiente, float temperaturaDesejada) {
        return volume * 0.05f * (temperaturaAmbiente - temperaturaDesejada);
    }

    public static float calcularFiltragemMinima(float volume) {
        return volume * 2;
    }
    
    public static float calcularFiltragemMaxima(float volume) {
        return volume * 3;
    }
}
