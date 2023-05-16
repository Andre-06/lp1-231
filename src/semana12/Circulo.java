package semana12;

public class Circulo {
    public double raio;

    public Circulo (double raio){
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public void imprimir(){
        System.out.println(calcularArea());
        System.out.println(calcularPerimetro());
    }

    public void imprimir(boolean area, boolean perimetro) {
        if (area) System.out.println(calcularArea());
        if (perimetro) System.out.println(calcularPerimetro());
    }
}
