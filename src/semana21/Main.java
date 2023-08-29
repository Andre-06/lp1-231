package semana21;

public class Main {

    /*
    *
    *   interface = contrato
    *   conjunto de método (somente assinatura, sem corpo)
    *   classe concreta que IMPLEMENTA a interface
    *
    */

    /*
     *
     *  Quadrado - lado - calcular Area calcular Perimetro
     *  Retangulo - base, altura - calcular Area calcular Perimetro
     *  Circulo - ??
     *  ...
     *
     */

    public static void main(String[] args) {
        Tela tela = new Tela(500, 500);
        Quadrado q1 = new Quadrado(10);
        Quadrado q2 = new Quadrado(50);

        Retangulo r1 = new Retangulo(10, 50);
        Quadrado q3 = new Quadrado(10);

        Circulo c1 = new Circulo(87);

        Quadrado q4 = new Quadrado(10);

        tela.addFigura(q1, new Posicao(11, 1));
        tela.addFigura(q2, new Posicao(5, 30));
        tela.addFigura(q3, new Posicao(100, 50));
        tela.addFigura(r1, new Posicao(10, 10));
        tela.addFigura(c1, new Posicao(90, 50));
        tela.addFigura(q4, new Posicao(22, 1));

        System.out.println(tela.getTotalArea());
        System.out.println(tela.getTotalPerimetro());
        System.out.println(tela.estaSobreposto(q1, q2));
        System.out.println(tela.estaSobreposto(r1, q3));
        System.out.println(tela.estaSobreposto(c1, q3));
        System.out.println(tela.estaSobreposto(q1, q4));
        
    }
}
