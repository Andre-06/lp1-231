package semana12;

public class Retangulo {
    // Atributos
    public double base, altura;

    //Construtor
    public Retangulo(){}

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
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
    
}
