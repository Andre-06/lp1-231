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
        final float IMCIDEALMINIMO = 18.5f;
        final float IMCIDEALMAXIMO = 24.9f;

        System.out.print("Você esta em ");
        var pesoNormal = false;
        var sobrepeso = true;
        if (imc < 18.5) {
            System.out.print("Baixo peso");
            sobrepeso = false;
        } else if (imc < 25f) {
            System.out.print("Peso normal");
            pesoNormal = true;
        } else if (imc < 30f) {
            System.out.print("Excesso de peso");
        } else if (imc < 35f) {
            System.out.print("Obesidade de Classe 1");
        } else if (imc < 40f) {
            System.out.print("Obesidade de Classe 2");
        } else {
            System.out.print("Obesidade de Classe 3");
        } 

        System.out.printf(" (%.2f IMC)\n", imc);
        if (! pesoNormal){
            System.out.print("Você precisa ");
            if (sobrepeso){
                System.out.printf("perder aproximadante %.3f", (peso - (IMCIDEALMAXIMO * (altura * altura))));
            } else {
                System.out.printf("ganhar aproximadante %.3f", ((IMCIDEALMINIMO * (altura * altura)) - peso));
            }
        }

    }
}
