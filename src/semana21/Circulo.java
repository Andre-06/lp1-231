package semana21;

public class Circulo extends Quadrado implements FiguraGeometrica{
    private double raio;

    public Circulo(double raio) {
        super(raio);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 2 * Math.PI * (raio * raio);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public double getMaxX(Posicao posicao) {
        return super.getMaxX(posicao);
    }

    @Override
    public double getMaxY(Posicao posicao) {
        return super.getMaxY(posicao);
    }
}
