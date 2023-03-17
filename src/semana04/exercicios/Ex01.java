package semana04.exercicios;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um numero inteiro: ");
        int n = scan.nextInt();

        System.out.format("Antecessor: %s\n", n-1);
        System.out.format("Sucessor: %s", n+1);

        scan.close();

    }
    
}
