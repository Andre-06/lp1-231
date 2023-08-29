package semana21;

public class Quadrado implements FiguraGeometrica{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado*4;
    }

    @Override
    public double getMaxX(Posicao posicao) {
        return posicao.getX() + lado;
    }

    @Override
    public double getMaxY(Posicao posicao) {
        return posicao.getY() + lado;
    }
}
