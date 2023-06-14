package semana14.exercicios.exercicio3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

       conta.getRecibo().imprimirRecibo();

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
        
        conta.getRecibo().imprimirRecibo();
        conta2.getRecibo().imprimirRecibo();

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
        
        conta.getRecibo().imprimirExtrato();
        conta2.getRecibo().imprimirExtrato();

    }

        
    @Test
    public void constroiComCodigoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> new Conta(-5, "João Gomes Pedro"));
    }
    
    @Test
    public void constroiComCorrentistaMenorQueCinco() {
        assertThrows(IllegalArgumentException.class, () -> new Conta(5, "João"));
    }

    @Test
    public void constroiComCorrentistaMaiorQue100() {
        assertThrows(IllegalArgumentException.class, () -> new Conta(8, "Xavier Ignatius Maximillian Theodore Winchester IV, Esquire Jr. the Third, the Great, the Magnificent, the Extraordinary, the Unstoppable, the Invincible, the Undeniable, the Incomparable, the Unparalleled, the Spectacular, the Phenomenal, the Legendary, the Mythical, the Majestic, the Grandiose, the Illustrious, the Remarkable, the Fantastic, the Marvelous, the Supreme, the All-Powerful, the Eternal, the Immortal, the Unending, the Everlasting, the Timeless, the Boundless, the Infinite, the Unconquerable, the Sovereign, the Exalted, the Transcendent, the Unassailable, the Undefeatable, the Ineffable, the Indomitable, the Incomprehensible, the Unfathomable, the Inscrutable, the Unyielding, the Resplendent, the Sublime, the Magnanimous, the Benevolent, the Merciful, the Compassionate, the Wise, the Sagacious, the Enlightened, the Profound, the Inquisitive, the Curious, the Daring, the Fearless, the Audacious, the Courageous, the Valiant, the Intrepid, the Dauntless, the Bold, the Brave, the Gallant, the Noble, the Righteous, the Just, the Virtuous, the Honest, the Trustworthy, the Loyal, the Devoted, the Faithful, the Sincere, the Genuine, the Authentic, the Real, the Legitimate, the Valid, the Credible, the Reliable, the Dependable, the Steadfast, the Unwavering, the Tenacious, the Persistent, the Diligent, the Industrious, the Assiduous, the Persevering, the Resolute, the Ambitious, the Driven, the Motivated, the Committed, the Dedicated, the Focused, the Purposeful, the Disciplined, the Patient, the Calm, the Serene, the Tranquil, the Peaceful, the Harmonious, the Balanced, the Centered, the Grounded, the Stable, the Secure, the Confident, the Self-Assured, the Assertive, the Empowered, the Influential, the Inspiring, the Motivating, the Encouraging, the Supportive, the Nurturing, the Caring, the Compassionate, the Loving, the Kind, the Generous, the Gracious, the Humble, the Modest, the Sincere, the Respectful, the Polite, the Courteous, the Considerate, the Thoughtful, the Attentive, the Meticulous, the Perfectionistic, the Rigorous, the Thorough, the Systematic, the Methodical, the Organized, the Structured, the Efficient, the Effective, the Productive, the Resourceful, the Ingenious, the Innovative, the Creative, the Imaginative, the Visionary, the Curious, the Inquisitive, the Analytical, the Logical, the Rational, the Pragmatic, the Objective, the Reflective, the Contemplative, the Wise, the Intellectual, the Scholarly, the Learned, the Erudite, the Cultured, the Sophisticated, the Refined, the Elegant, the Stylish, the Fashionable, the Trendsetting, the Chic, the Avant-Garde, the Unique, the Original, the Distinctive, the Different, the Unusual"));
    }
    
   @Test
    public void constroiComValorValidoCorrentista() {
        Conta conta = new Conta(5, "João Gomes Pedro");
        assertEquals(conta.getCorrentista(), "João Gomes Pedro");
    }     

   @Test
    public void constroiComValorValidoCodigoPositivo() {
        Conta conta = new Conta(5, "João Gomes Pedro");
        assertEquals(conta.getCodigo(), 5);
    }  

   @Test
    public void constroiComValorValidoCodigoZero() {
        Conta conta = new Conta(0, "João Gomes Pedro");
        assertEquals(conta.getCodigo(), 0);
    }  
}
