package semana04.exercicios;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor da conta: ");
        float valor = scan.nextFloat();

        /*
         * Compras entre R$ 0,01 e R$ 9,99 - 0% de desconto
Compras entre R$ 10,00 e R$ 99,99 - 5% de desconto
Compras entre R$ 100,00 e R$ 499,99 - 10% de desconto
Compras iguais ou superiores a R$ 500,00 - 15% de desconto
         */
        float desconto = 0f;

        if (valor >= 10 && valor <= 99.99) {
            desconto = 0.05f;
        } else if (valor >= 100 && valor <= 499.99) {
            desconto = 0.1f;
        } else if (valor >= 500){
            desconto = 0.15f;
        }

        System.out.format("Total da Compra: %.2f | Desconto: %.2f", valor * (1-desconto), desconto*100);
        System.out.println('%');

        scan.close();

    }

}