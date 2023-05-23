package semana12.exercicios.exercicio3;

/*
 * conta = {"cod":1, "nome":"Salve Salve", "açoes":{"sacar":[{"id":"sadalsdja", "data":"20-20-20", "valor":4000}], 
 *                                                  "depositar":[{"id":"sadsadas", "data":"202020", "valor":6000}],
 *                                                  "trasferir":[{"id":"sadsadas", "data":"202020", "valor":6000, "recibente":Conta}]}}
 * 
 */

public class Conta {
    int codigo;
    double saldo = 0.0;
    String correntista;
    Recibo recibo;

    public Conta(int codigo, String correntista){
        this.codigo = codigo;
        this.correntista = correntista;
        this.recibo = new Recibo(codigo, correntista, saldo);
    }

    public double sacar(double dinheiro) {
        if (dinheiro > saldo || dinheiro <= 0){ 
            recibo.registrarSaque(dinheiro, saldo, true);
            return -1;
        }
        saldo -= dinheiro; 
        recibo.registrarSaque(dinheiro, saldo, false);;
        return saldo;
    }

    public double depositar(double dinheiro) {
        if (dinheiro <= 0) {
            recibo.registrarDeposito(dinheiro, saldo, true);
            return -1;
        }
        saldo += dinheiro;
        recibo.registrarDeposito(dinheiro, saldo, false);
        return saldo;
    }

    public double[] transferir(double dinheiro, Conta conta) {
        double[] execao = {-1, -1};
        if (dinheiro > saldo || dinheiro <= 0) {   
            double[] saldos = {saldo, conta.saldo};
            recibo.registrarTransferencia(dinheiro, saldos[0], true, conta);
            return execao;
        }
        saldo -= dinheiro;
        conta.depositar(dinheiro);
        double[] saldos = {saldo, conta.saldo};
        recibo.registrarTransferencia(dinheiro, saldos[0], false, conta);
        return saldos;
    }
    
}
