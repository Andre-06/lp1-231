package semana06;

public class Calculadora {
    // metodo que soma dois numeros e retorna o resultado
    public static double somar(double a, double b) {
        return a + b;
    }
    // metodo que subtrai dois numeros e retorna o resultado
    public static double subtrair(double a, double b) {
        return a - b;
    }
    // metodo que multiplica dois numeros e retorna o resultado
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    // metodo que dividi dois numeros e retorna o resultado
    public static double dividir(double a, double b) throws Exception {
        if (b == 0) throw new IllegalArgumentException("Não é possível divir por 0");
        return a / b;
    }
}
