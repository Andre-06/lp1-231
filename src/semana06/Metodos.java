package semana06;

public class Metodos {

    //Assinatura do Método
    // public - acesso em qualquer parte do projeto
    // static - metodo atrelado a clase, nao precisa criar um objeto
    // void - tipo de retorno (sem retorno)
    // imprimir palavra

    public static void imprimirPalavraMaiusculo(String palavra) {
        System.out.println(palavra.toUpperCase());
    }

    public void imprimirPalavraMinusculo(String palavra) {
       System.out.println(palavra.toLowerCase()); 
    }  


    public static void main(String[] args) {
        System.out.println(Math.PI);
        imprimirPalavraMaiusculo("Olá Mundo!");
        imprimirPalavraMaiusculo("testeTeste");
        System.out.printf("A soma de 5 + 9 é: %s\n", Calculadora.somar(5, 9));
        System.out.printf("A subtração de 5 - 9 é: %s\n", Calculadora.subtrair(5, 9));
        System.out.printf("A multiplicação de 5 * 9 é: %s\n", Calculadora.multiplicar(5, 9));
        System.out.printf("A divisão de 5 / 9 é: %s\n", Calculadora.dividir(5, 9));
    }
}
