package semana14.exercicios.exercicio1;

public class Aquario {
    float altura, largura, comprimento;

    public Aquario(float altura, float largura, float comprimento){
        setAltura(altura);
        setLargura(largura);
        setComprimento(comprimento);
    }

    public Aquario(float valorUnico){
        setAltura(valorUnico);
        setLargura(valorUnico);
        setComprimento(valorUnico);
    }

    public float getAltura(){
        return altura;
    }

    public float getLargura(){
        return largura;
    }

    public float getComprimento(){
        return comprimento;
    }

    public void setAltura(float altura){
        if (altura < 0.0) {
            throw new IllegalArgumentException("Altura inválido: Altura não pode ser negativo");
         } else if (altura == 0.0){
            throw new IllegalArgumentException("Altura inválido: Altura não pode ser igual a zero");
         }
        this.altura = altura;
    }

    public void setLargura(float largura){
        if (largura < 0.0) {
            throw new IllegalArgumentException("Largura inválido: Largura não pode ser negativo");
         } else if (largura == 0.0){
            throw new IllegalArgumentException("Largura inválido: Largura não pode ser igual a zero");
         }
        this.largura = largura;
    }

    public void setComprimento(float comprimento){
        if (comprimento < 0.0) {
            throw new IllegalArgumentException("Comprimento inválido: Comprimento não pode ser negativo");
         } else if (comprimento == 0.0){
            throw new IllegalArgumentException("Comprimento inválido: Comprimento não pode ser igual a zero");
         }
        this.comprimento = comprimento;
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