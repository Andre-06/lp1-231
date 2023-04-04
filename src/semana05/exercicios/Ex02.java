package semana05.exercicios;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira sua altura em metros: ");
        float altura = sc.nextFloat();
        System.out.print("Insira seu peso em Kg: ");
        float peso = sc.nextFloat();
        
        sc.close();

        float imc = ( peso / (altura * altura));
        final float IMC_IDEAL_MINIMO = 18.5f;
        final float IMC_IDEAL_MAXIMO = 24.9f;
        final float BAIXO_PESO = 18.5f;
        final float PESO_NORMAL = 25f;
        final float EXCESSO_DE_PESO = 30f;
        final float OBESIDADE_1 = 35f;
        final float OBESIDADE_2 = 40f;

        System.out.print("Você esta em ");
        var pesoNormal = false;
        var sobrepeso = true;
        if (imc < BAIXO_PESO) {
            System.out.print("Baixo peso");
            sobrepeso = false;
        } else if (imc < PESO_NORMAL) {
            System.out.print("Peso normal");
            pesoNormal = true;
        } else if (imc < EXCESSO_DE_PESO) {
            System.out.print("Excesso de peso");
        } else if (imc < OBESIDADE_1) {
            System.out.print("Obesidade de Classe 1");
        } else if (imc < OBESIDADE_2) {
            System.out.print("Obesidade de Classe 2");
        } else {
            System.out.print("Obesidade de Classe 3");
        } 

        System.out.printf(" (%.2f IMC)\n", imc);
        if (! pesoNormal){
            System.out.print("Você precisa ");
            if (sobrepeso){
                System.out.printf("perder aproximadante %.3f", (peso - (IMC_IDEAL_MAXIMO * (altura * altura))));
            } else {
                System.out.printf("ganhar aproximadante %.3f", ((IMC_IDEAL_MINIMO * (altura * altura)) - peso));
            }

        }

    }
}
