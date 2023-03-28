package semana06;

public class Imprimir {
    public static void main(String[] args) {
        Metodos.imprimirPalavraMaiusculo("Batata");
        // Metodos.imprimirPalavraMinusculo("Batata"); - erro por não ser static

        Metodos metodo = new Metodos();
        metodo.imprimirPalavraMinusculo("Batata");

    }
}
