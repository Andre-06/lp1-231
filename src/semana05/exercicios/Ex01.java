package semana05.exercicios;
import java.util.Scanner;

public class Ex01{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira as dimensões do aquário em centimetros (Comprimento x Altura x Largura): ");
        String input = sc.nextLine();
        System.out.print("Insira em °C a temperatura ambiente: ");
        float temperaturaAmbiente = sc.nextFloat();
        System.out.print("Insira em °C a temperatura desejada: ");
        float temperaturaDesejada = sc.nextFloat();

        
        String[] dimensao = input.split("x");
        
        var comprimento = Float.parseFloat(dimensao[0]);
        var altura = Float.parseFloat(dimensao[1]);
        var largura = Float.parseFloat(dimensao[2]);

        float volume = ((comprimento * altura * largura) / 1000);
        float potencia = (volume * 0.05f * (temperaturaAmbiente - temperaturaDesejada));

        System.out.println("Volume do aquário: " + volume + "L");
        System.out.println("Potência do termostato: " + (potencia<0?potencia*-1:potencia) + "W");
        System.out.println("Filtragem necessária para manter a qualidade de água:");
        System.out.println("Mínima: " + (volume * 2) + "L");
        System.out.println("Máxima: " + (volume * 3) + "L");

        sc.close();

    }

} 
