package semana07;

import java.util.Arrays;

public class ExerciciosRevisao {
    public static double somarTresValores(double n1, double n2, double n3) {
        return n1 + n2 + n3;      
    }
    public static double calcularMediaAritimeticaDeTresValores(double n1, double n2, double n3) {
        return somarTresValores(n1, n2, n3)/3;
    }
    public static int acharMaiorValorDeTresValores(int n1, int n2, int n3) {
        int [] num = {n1, n2, n3};
        Arrays.sort(num);
        return num[2];
    }
    public static int acharMenorValorDeTresValores(int n1, int n2, int n3) {
        int [] num = {n1, n2, n3};
        Arrays.sort(num);
        return num[0];
    }
    public static double[] criarArrayDeTresValores(double n1, double n2, double n3) {
        double[] arrayDeTresValores = {n1, n2, n3};
        return arrayDeTresValores;
    }
    public static double somarArray(double[] arr) {
        return Arrays.stream(arr).sum();
    }
    public static double calcularMediaAritimetica(double[] arr) {
        return ExerciciosRevisao.somarArray(arr)/arr.length;
    }
    public static double acharMaiorValor(double[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static double acharMenorValor(double[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }
    public static int[] juntarDoisArrays(int[] arr1, int[] arr2) {
        int[] arr = new int [(arr1.length + arr2.length)];
        for (int i = 0, j = 0; i < arr.length-1; i=+2, j++) {
            arr[i] = arr1[j];
            arr[i+1] = arr2[j];
        }
        return arr; 
    }

}
