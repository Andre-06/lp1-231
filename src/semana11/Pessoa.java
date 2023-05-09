package semana11;

public class Pessoa {
    float altura;
    float peso;
    boolean pesoNormal = false;
    boolean sobrepeso = true;

    final float IMC_IDEAL_MINIMO = 18.5f;
    final float IMC_IDEAL_MAXIMO = 24.9f;
    final float BAIXO_PESO = 18.5f;
    final float PESO_NORMAL = 25f;
    final float EXCESSO_DE_PESO = 30f;
    final float OBESIDADE_1 = 35f;
    final float OBESIDADE_2 = 40f;
    public static final String[] CLASSIFICACAO = {"Baixo peso", "Peso normal", "Execsso de peso", "Obesidade de Classe 1", "Obesidade de Classe 2", "Obesidade de Classe 3"};

    public float calcularImc() {
        return  peso / (altura * altura);
    }

    public int getFaixa(){
        float imc = calcularImc();
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
