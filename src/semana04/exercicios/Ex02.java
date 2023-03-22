package semana04.exercicios;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira três numeros abaixo: ");
        float n1 = scan.nextFloat();
        float n2 = scan.nextFloat();
        float n3 = scan.nextFloat();

        System.out.format("Media Aritmética: %s", (n1 + n2 + n3)/3);

        scan.close();

    }
}
