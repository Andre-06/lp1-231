package semana14;

public class Retangulo {
    // Atributos
    private double base, altura;

    //Construtor
    public Retangulo(){}

    public Retangulo(double base, double altura){
        setAltura(altura);
        setBase(base);
    }

    //Métodos

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro(){
        return 2 * (base + altura);
    }

    public void imprimir(){
        System.out.println(calcularArea());
        System.out.println(calcularPerimetro());
    }

    public void imprimir(boolean area, boolean perimetro){
        if (area) System.out.println(calcularArea());
        if (perimetro) System.out.println(calcularPerimetro());
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    public void setBase(double base){
        if (base < 0.0) {
            throw new IllegalArgumentException("Base inválido: Base não pode ser negativo");
         } else if (base == 0.0){
            throw new IllegalArgumentException("Base inválido: Base não pode ser igual a zero");
         }
        this.base = base;
    }

    public void setAltura(double altura){
        if (altura < 0.0) {
            throw new IllegalArgumentException("Altura inválido: Altura não pode ser negativo");
         } else if (altura == 0.0){
            throw new IllegalArgumentException("Altura inválido: Altura não pode ser igual a zero");
         }
        this.altura = altura;
    }
    
}
