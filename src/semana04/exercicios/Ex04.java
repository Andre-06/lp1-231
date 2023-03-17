package semana04.exercicios;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o código: ");
        String cod = scan.nextLine();
        
        /*
         * Exemplos válidos:

BR0001X
BR1236X
BR9999X
Exemplos inválidos:

br0001X
BR126X
BR99999X
BR9999Y
         */

        int nums;
        try{
            nums = Integer.parseInt(cod.substring(2, 6));
        } catch (NumberFormatException exception){
            System.out.println("Código Inválido");
            return;
        }
        
        if (cod.startsWith("BR") && cod.endsWith("X") && nums >= 1 && nums <= 9999 && cod.length() == 7) {
            System.out.println("Codigo Válido");
        } else {
            System.out.println("Código Inválido");
        }


        
    }
    
}
