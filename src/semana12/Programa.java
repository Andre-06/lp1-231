package semana12;

public class Programa {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10.0);
        // quadrado.lado = 10.0;
        
        System.out.println(quadrado.calcularArea());
        System.out.println(quadrado.calcularPerimetro());

        Retangulo r1 = new Retangulo(10.0, 5.0);
        Retangulo r2 = new Retangulo(15.5, 3.5);
        r1.imprimir();
        r2.imprimir(false, true);

        Circulo circulo = new Circulo(7.5);
        Circulo letraO = new Circulo(4.0);

        circulo.imprimir();
        letraO.imprimir(true, false);

    }
}
