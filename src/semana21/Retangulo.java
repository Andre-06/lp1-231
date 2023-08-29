package semana21;

public class Retangulo implements FiguraGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public double getMaxX(Posicao posicao) {
        return posicao.getX() + base;
    }

    @Override
    public double getMaxY(Posicao posicao) {
        return posicao.getY() + altura;
    }

}
