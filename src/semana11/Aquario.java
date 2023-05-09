package semana11;

public class Aquario {
    float altura, largura, comprimento;

    public float calcularVolume() {
        return (altura*largura*comprimento)/1000;
    }
    
    public float calcularPotenciaTermostato(float temperaturaAmbiente, float temperaturaDesejada) {
        return calcularVolume() * 0.05f * (temperaturaAmbiente - temperaturaDesejada);
    }
    
    public String calcularQuantidadeLitrosFiltro(){
        return "Filtragem mínima: " + calcularFiltragemMinima() + "\n Filtragem Máxima: " + calcularFiltragemMaxima();
    }

    public float calcularFiltragemMinima() {
        return calcularVolume() * 2;
    }
    
    public float calcularFiltragemMaxima() {
        return calcularVolume() * 3;
    }
}