package semana14;

public class Circulo {
    private double raio;

    public Circulo (double raio){
        setRaio(raio);
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

    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio){
        if (raio < 0.0) {
            throw new IllegalArgumentException("Raio inválido: Raio não pode ser negativo");
         } else if (raio == 0.0){
            throw new IllegalArgumentException("Raio inválido: Raio não pode ser igual a zero");
         }
        this.raio = raio;
    }
}
