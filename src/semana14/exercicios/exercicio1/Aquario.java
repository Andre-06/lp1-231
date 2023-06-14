package semana14.exercicios.exercicio1;

public class Aquario {
    double altura, largura, comprimento;

    public Aquario(double altura, double largura, double comprimento){
        setAltura(altura);
        setLargura(largura);
        setComprimento(comprimento);
    }

    public Aquario(double valorUnico){
        setAltura(valorUnico);
        setLargura(valorUnico);
        setComprimento(valorUnico);
    }

    public double getAltura(){
        return altura;
    }

    public double getLargura(){
        return largura;
    }

    public double getComprimento(){
        return comprimento;
    }

    public void setAltura(double altura){
        if (altura < 0.0) {
            throw new IllegalArgumentException("Altura inválido: Altura não pode ser negativo");
         } else if (altura == 0.0){
            throw new IllegalArgumentException("Altura inválido: Altura não pode ser igual a zero");
         }
        this.altura = altura;
    }

    public void setLargura(double largura){
        if (largura < 0.0) {
            throw new IllegalArgumentException("Largura inválido: Largura não pode ser negativo");
         } else if (largura == 0.0){
            throw new IllegalArgumentException("Largura inválido: Largura não pode ser igual a zero");
         }
        this.largura = largura;
    }

    public void setComprimento(double comprimento){
        if (comprimento < 0.0) {
            throw new IllegalArgumentException("Comprimento inválido: Comprimento não pode ser negativo");
         } else if (comprimento == 0.0){
            throw new IllegalArgumentException("Comprimento inválido: Comprimento não pode ser igual a zero");
         }
        this.comprimento = comprimento;
    }

    public double calcularVolume() {
        return (altura*largura*comprimento)/1000;
    }
    
    public double calcularPotenciaTermostato(double temperaturaAmbiente, double temperaturaDesejada) {
        return calcularVolume() * 0.05f * (temperaturaAmbiente - temperaturaDesejada);
    }
    
    public String calcularQuantidadeLitrosFiltro(){
        return "Filtragem mínima: " + calcularFiltragemMinima() + "\n Filtragem Máxima: " + calcularFiltragemMaxima();
    }

    public double calcularFiltragemMinima() {
        return calcularVolume() * 2;
    }
    
    public double calcularFiltragemMaxima() {
        return calcularVolume() * 3;
    }
}