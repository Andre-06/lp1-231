package semana17.exercicio1;

public class VendedorFixo extends Vendedor {
    private double salario;
    public VendedorFixo(String nome, double vendas, double comissao, double salario) {
        super(nome, vendas, comissao);
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
