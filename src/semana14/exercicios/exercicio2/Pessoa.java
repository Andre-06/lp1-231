package semana14.exercicios.exercicio2;

public class Pessoa {
    private double altura;
    private double peso;

    final double IMC_IDEAL_MINIMO = 18.5;
    final double IMC_IDEAL_MAXIMO = 24.9;
    final double BAIXO_PESO = 18.5;
    final double PESO_NORMAL = 25;
    final double EXCESSO_DE_PESO = 30;
    final double OBESIDADE_1 = 35;
    final double OBESIDADE_2 = 40;
    public static final String[] CLASSIFICACAO = {"Baixo peso", "Peso normal", "Execsso de peso", "Obesidade de Classe 1", "Obesidade de Classe 2", "Obesidade de Classe 3"};

    public Pessoa(double altura, double peso){
        setAltura(altura);
        setPeso(peso);
    }
    
    public void setAltura(double altura){
        if (altura < 0.0) {
            throw new IllegalArgumentException("Altura inválido: Altura não pode ser negativo");
         } else if (altura == 0.0){
            throw new IllegalArgumentException("Altura inválido: Altura não pode ser igual a zero");
         }
        this.altura = altura;
    }

    public void setPeso(double peso){
        if (peso < 0.0) {
            throw new IllegalArgumentException("Peso inválido: Peso não pode ser negativo");
         } else if (peso == 0.0){
            throw new IllegalArgumentException("Peso inválido: Peso não pode ser igual a zero");
         }
        this.peso = peso;
    }

    public double getAltura(){
        return altura;
    }

    public double getPeso(){
        return peso;
    }

    public double calcularImc() {
        return  peso / (altura * altura);
    }

    public int getFaixa(){
        double imc = calcularImc();
        if (imc < BAIXO_PESO) return 0;
        else if (imc < PESO_NORMAL) return 1;
        else if (imc < EXCESSO_DE_PESO) return 2;
        else if (imc < OBESIDADE_1) return 3;
        else if (imc < OBESIDADE_2) return 4;
        return 5;
    }

    public String getSituacao() {
        if (calcularImc() < IMC_IDEAL_MINIMO) return "GANHAR";
        else if (calcularImc() > IMC_IDEAL_MAXIMO) return "PERDER";
        return "NORMAL";
    }
    
}
