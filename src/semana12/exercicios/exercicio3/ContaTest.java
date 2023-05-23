package semana12.exercicios.exercicio3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTest { 

    @Test
    public void sacaMenosDinheiroDoQueTemNaConta() {
        //AAA
        //Arrange
        int codigo = 0;
        String nome = "Joãozinho";

        Conta conta = new Conta(codigo, nome);
        conta.depositar(5000);
        
        double saldo = conta.sacar(20);

        //Assert
        assertEquals(4980, saldo);
    }

    @Test
    public void sacaMaisDinheiroDoQueTemNaConta() {
        //AAA
        //Arrange
        int codigo = 0;
        String nome = "Joãozinho";

        Conta conta = new Conta(codigo, nome);
        conta.depositar(5000);
        
        double saldo = conta.sacar(5010);

        //Assert
        assertEquals(-1, saldo);
    }

    @Test
    public void sacaMenosQueZero() {
        //AAA
        //Arrange
        int codigo = 0;
        String nome = "Joãozinho";

        Conta conta = new Conta(codigo, nome);
        conta.depositar(5000);
        
        double saldo = conta.sacar(-20);

        //Assert
        assertEquals(-1, saldo);
    }

    @Test
    public void sacaZero() {
        //AAA
        //Arrange
        int codigo = 0;
        String nome = "Joãozinho";

        Conta conta = new Conta(codigo, nome);
        conta.depositar(5000);
        
        double saldo = conta.sacar(0);

        //Assert
        assertEquals(-1, saldo);
    }

    @Test
    public void depositaMaisQueZero() {
        //AAA
        //Arrange
        int codigo = 0;
        String nome = "Joãozinho";

        Conta conta = new Conta(codigo, nome);
        conta.depositar(5000);
        
        double saldo = conta.depositar(5010);

        //Assert
        assertEquals(10010, saldo);
    }

    @Test
    public void depositaMenosQueZero() {
        //AAA
        //Arrange
        int codigo = 0;
        String nome = "Joãozinho";

        Conta conta = new Conta(codigo, nome);
        conta.depositar(5000);
        
        double saldo = conta.depositar(-10);

        //Assert
        assertEquals(-1, saldo);
    }

    @Test
    public void depositaZero() {
        //AAA
        //Arrange
        int codigo = 0;
        String nome = "Joãozinho";

        Conta conta = new Conta(codigo, nome);
        conta.depositar(5000);
        
        double saldo = conta.depositar(0);

        //Assert
        assertEquals(-1, saldo);
    }

    @Test
    public void transfereMenosDoQueTem() {
        //AAA
        //Arrange
        int codigo = 0;
        String nome = "Joãozinho";
        int codigo2 = 1;
        String nome2 = "Mariazinha";

        Conta conta = new Conta(codigo, nome);
        conta.depositar(5000);
        Conta conta2 = new Conta(codigo2, nome2);
        conta2.depositar(5000);
        
        double[] saldos = conta.transferir(50, conta2);
        double[] saldosCorretos = {4950, 5050};
        //Assert
        assertArrayEquals(saldosCorretos, saldos);
    }

    @Test
    public void transfereMaisDoQueTem() {
        //AAA
        //Arrange
        int codigo = 0;
        String nome = "Joãozinho";
        int codigo2 = 1;
        String nome2 = "Mariazinha";

        Conta conta = new Conta(codigo, nome);
        conta.depositar(5000);
        Conta conta2 = new Conta(codigo2, nome2);
        conta2.depositar(5000);
        
        double[] saldos = conta.transferir(5050, conta2);
        double[] saldosCorretos = {-1, -1};

       conta.recibo.imprimirRecibo();

        assertArrayEquals(saldosCorretos, saldos);
    }

    @Test
    public void transfereMenosDoQueZero() {
        //AAA
        //Arrange
        int codigo = 0;
        String nome = "Joãozinho";
        int codigo2 = 1;
        String nome2 = "Mariazinha";

        Conta conta = new Conta(codigo, nome);
        conta.depositar(5000);
        Conta conta2 = new Conta(codigo2, nome2);
        conta2.depositar(5000);
        
        double[] saldos = conta.transferir(-50, conta2);
        double[] saldosCorretos = {-1, -1};
        //Assert
        assertArrayEquals(saldosCorretos, saldos);
    }

    @Test
    public void transfereZero() {
        //AAA
        //Arrange
        int codigo = 0;
        String nome = "Joãozinho";
        int codigo2 = 1;
        String nome2 = "Mariazinha";

        Conta conta = new Conta(codigo, nome);
        conta.depositar(5000);
        Conta conta2 = new Conta(codigo2, nome2);
        conta2.depositar(5000);
        
        double[] saldos = conta.transferir(0, conta2);
        double[] saldosCorretos = {-1, -1};
        //Assert
        assertArrayEquals(saldosCorretos, saldos);
    }

    @Test
    public void imprimirRecibo() throws InterruptedException{
        int codigo = 0;
        String nome = "Joãozinho";
        int codigo2 = 1;
        String nome2 = "Mariazinha";

        Conta conta = new Conta(codigo, nome);
        Conta conta2 = new Conta(codigo2, nome2);

        conta.depositar(5000);
        Thread.sleep(10);
        conta.sacar(20);
        Thread.sleep(10);
        conta.depositar(5000);
        Thread.sleep(10);
        conta.depositar(5000);
        Thread.sleep(10);
        conta.sacar(-20);
        Thread.sleep(10);
        conta.depositar(5000);
        Thread.sleep(10);
        conta.sacar(0);
        Thread.sleep(10);
        conta.depositar(5010);
        Thread.sleep(10);
        conta.depositar(5000);
        Thread.sleep(10);
        conta.depositar(-10);
        Thread.sleep(10);
        conta.depositar(5000);
        Thread.sleep(10);
        conta.depositar(0);
        Thread.sleep(10);
        conta.depositar(5000);
        Thread.sleep(10);
        conta2.depositar(5000);
        Thread.sleep(10);
        conta.transferir(50, conta2);
        Thread.sleep(10);
        conta.depositar(5000);
        Thread.sleep(10);
        conta2.depositar(5000);
        Thread.sleep(10);
        conta.transferir(5050, conta2);
        Thread.sleep(10);
        conta.depositar(5000);
        Thread.sleep(10);
        conta2.depositar(5000);
        Thread.sleep(10);
        conta.transferir(-50, conta2);
        Thread.sleep(10);
        conta.depositar(5000);
        Thread.sleep(10);
        conta2.depositar(5000);
        Thread.sleep(10);
        conta.transferir(0, conta2);
        Thread.sleep(10);
        
        conta.recibo.imprimirRecibo();
        conta2.recibo.imprimirRecibo();

    }

    @Test
    public void imprimirExtrato() throws InterruptedException{
        int codigo = 0;
        String nome = "Joãozinho";
        int codigo2 = 1;
        String nome2 = "Mariazinha";

        Conta conta = new Conta(codigo, nome);
        Conta conta2 = new Conta(codigo2, nome2);

        conta.depositar(5000);
        Thread.sleep(10);
        conta.sacar(20);
        Thread.sleep(10);
        conta.depositar(5000);
        Thread.sleep(10);
        conta.depositar(5000);
        Thread.sleep(10);
        conta.sacar(-20);
        Thread.sleep(10);
        conta.depositar(5000);
        Thread.sleep(10);
        conta.sacar(0);
        Thread.sleep(10);
        conta.depositar(5010);
        Thread.sleep(10);
        conta.depositar(5000);
        Thread.sleep(10);
        conta.depositar(-10);
        Thread.sleep(10);
        conta.depositar(5000);
        Thread.sleep(10);
        conta.depositar(0);
        Thread.sleep(10);
        conta.depositar(5000);
        Thread.sleep(10);
        conta2.depositar(5000);
        Thread.sleep(10);
        conta.transferir(50, conta2);
        Thread.sleep(10);
        conta.depositar(5000);
        Thread.sleep(10);
        conta2.depositar(5000);
        Thread.sleep(10);
        conta.transferir(5050, conta2);
        Thread.sleep(10);
        conta.depositar(5000);
        Thread.sleep(10);
        conta2.depositar(5000);
        Thread.sleep(10);
        conta.transferir(-50, conta2);
        Thread.sleep(10);
        conta.depositar(5000);
        Thread.sleep(10);
        conta2.depositar(5000);
        Thread.sleep(10);
        conta.transferir(0, conta2);
        Thread.sleep(10);
        
        conta.recibo.imprimirExtrato();
        conta2.recibo.imprimirExtrato();

    }
}
