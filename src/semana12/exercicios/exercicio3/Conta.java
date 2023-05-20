package semana12.exercicios.exercicio3;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
            recibo.registrar(dinheiro, saldo, true, "sacar");
            return -1;
        }
        saldo -= dinheiro; 
        recibo.registrar(dinheiro, saldo, false, "sacar");;
        return saldo;
    }

    public double depositar(double dinheiro) {
        if (dinheiro <= 0) {
            recibo.registrar(dinheiro, saldo, true, "depositar");
            return -1;
        }
        saldo += dinheiro;
        recibo.registrar(dinheiro, saldo, false, "depositar");
        return saldo;
    }

    public double[] transferir(double dinheiro, Conta conta) {
        double[] execao = {-1, -1};
        if (dinheiro > saldo || dinheiro <= 0) {   
            double[] saldos = {saldo, conta.saldo};
            recibo.registrar(dinheiro, saldos, true, conta);
            return execao;
        }
        sacar(dinheiro);
        conta.depositar(dinheiro);
        double[] saldos = {saldo, conta.saldo};
        recibo.registrar(dinheiro, saldos, false, conta);
        return saldos;
    }
    
}
