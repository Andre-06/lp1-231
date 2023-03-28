package semana06;

import java.util.Scanner;

public class Palindromo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        int[] ocorrencias = new int[palavra.length()];

        for (int i = 0; i < ocorrencias.length; i++) {
            ocorrencias[i] = palavra.length() - palavra.replace(palavra.toCharArray()[i], '\0').length();
        }
        System.out.println(ocorrencias);
    }
    

}