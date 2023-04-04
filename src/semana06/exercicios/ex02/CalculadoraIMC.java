package semana06.exercicios.ex02;

public class CalculadoraIMC {
    
    public static final float IMC_IDEAL_MINIMO = 18.5f;
    public static final float IMC_IDEAL_MAXIMO = 24.9f;
    public static final float BAIXO_PESO = 18.5f;
    public static final float PESO_NORMAL = 25f;
    public static final float EXCESSO_DE_PESO = 30f;
    public static final float OBESIDADE_1 = 35f;
    public static final float OBESIDADE_2 = 40f;
    public static final String[] CLASSIFICACAO = {"Baixo peso", "Peso normal", "Execsso de peso", "Obesidade de Classe 1", "Obesidade de Classe 2", "Obesidade de Classe 3"};

    public static float calcularImc(float altura, float peso) {
        return peso / (altura * altura);
    }
    
    public static int classifacarImc(float imc) {
        if (imc < BAIXO_PESO) return 0;
        else if (imc < PESO_NORMAL) return 1;
        else if (imc < EXCESSO_DE_PESO) return 2;
        else if (imc < OBESIDADE_1) return 3;
        else if (imc < OBESIDADE_2) return 4;
        else return 5;
        
    }
    
    public static float calcularPesoIdeal(float imc, float altura, float peso) {
        if (imc < IMC_IDEAL_MINIMO) return (IMC_IDEAL_MINIMO * (altura * altura)) - peso;
        else if (imc > IMC_IDEAL_MAXIMO) return peso - (IMC_IDEAL_MAXIMO * (altura * altura));
        else return 0f;
    }
}
