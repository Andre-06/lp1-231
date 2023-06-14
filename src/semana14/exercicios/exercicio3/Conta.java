package semana14.exercicios.exercicio3;

/*
 * conta = {"cod":1, "nome":"Salve Salve", "açoes":{"sacar":[{"id":"sadalsdja", "data":"20-20-20", "valor":4000}], 
 *                                                  "depositar":[{"id":"sadsadas", "data":"202020", "valor":6000}],
 *                                                  "trasferir":[{"id":"sadsadas", "data":"202020", "valor":6000, "recibente":Conta}]}}
 * 
 */

public class Conta {
    private int codigo;
    private double saldo = 0.0;
    private String correntista;
    private Recibo recibo;

    public Conta(int codigo, String correntista){
        setCodigo(codigo);
        setCorrentista(correntista);
        this.recibo = new Recibo(codigo, correntista, saldo);
    }

    private void setCodigo(int codigo){
        if (codigo < 0){
            throw new IllegalArgumentException("Código deve ser positivo");
        }
        this.codigo = codigo;
    }

    private void setCorrentista(String correntista){
        if (correntista.length() <= 5 || correntista.length() >= 100){
            throw new IllegalArgumentException("O nome do correntista deve ter no mínio cinco e no máximo 100 caracteres");
        } 
        this.correntista = correntista;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getCorrentista(){
        return correntista;
    }

    public Recibo getRecibo(){
        return recibo;
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
