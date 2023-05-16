package semana12.exercicios.exercicio1;

public class Aquario {
    float altura, largura, comprimento;

    public Aquario(float altura, float largura, float comprimento){
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public Aquario(float valorUnico){
        this.altura = valorUnico;
        this.largura = valorUnico;
        this.comprimento = valorUnico;
    }


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