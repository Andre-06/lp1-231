package semana12.exercicios.exercicio3;

public class Conta {
    int codigo;
    double saldo = 0.0;
    String correntista;

    public Conta(int codigo, String correntista){
        this.codigo = codigo;
        this.correntista = correntista;
    }

    public double sacar(double dinheiro) {
        if (dinheiro > saldo) return -1;
        saldo -= dinheiro; 
        System.out.println("R$" + dinheiro + "sacado");
        System.out.println("Saldo Atual: R$" + saldo);
        return saldo;
    }

    public double depositar(double dinheiro) {
        if (dinheiro <= 0) return -1;
        saldo += dinheiro;
        System.out.println("R$" + dinheiro + "depositado");
        System.out.println("Saldo Atual: R$" + saldo);
        return saldo;
    }

    public double[] transferir(double dinheiro, Conta conta) {
        double[] execao = {-1, -1};
        if (dinheiro > saldo || dinheiro <= 0) return execao;
        conta.depositar(dinheiro);
        saldo -= dinheiro;
        System.out.println("R$" + dinheiro + "trasferido");
        System.out.println("Saldo Atual: R$" + saldo);
        System.out.println("Saldo Outra Conta: R$" + conta.saldo);
        double[] saldos = {saldo, conta.saldo};
        return saldos;
    }

    
}
