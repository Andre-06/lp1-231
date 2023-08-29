package semana21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tela {
    private final List<FiguraGeometrica> figuras;
    private final Map<FiguraGeometrica, Posicao> posicoes;
    double maxX;
    double maxY;

    public Tela(double maxX, double maxY){
        figuras = new ArrayList<>();
        posicoes = new HashMap<>();
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public List<FiguraGeometrica> getFiguras() {
        return figuras;
    }

    public double getTotalArea() {
        double total = 0;
        for (FiguraGeometrica figura :
                figuras) {
            total += figura.calcularArea();
        }
        return total;
    }

    public double getTotalPerimetro() {
        double total = 0;
        for (FiguraGeometrica figura :
                figuras) {
            total += figura.calcularPerimetro();
        }
        return total;
    }

    public Map<FiguraGeometrica, Posicao> getPosicoes() {
        return posicoes;
    }

    public void addFigura(FiguraGeometrica figura, Posicao posicao) {
        figuras.add(figura);
        posicoes.put(figura, posicao);
    }
    public boolean estaSobreposto(FiguraGeometrica figura1, FiguraGeometrica figura2){
        Posicao posicao1 = posicoes.get(figura1);
        Posicao posicao2 = posicoes.get(figura2);

        int figura1X = (int) posicao1.getX();
        int figura1Y = (int) posicao1.getY();

        int figura2X = (int) posicao2.getX();
        int figura2Y = (int) posicao2.getY();

        for (int i = figura1X; i < figura1.getMaxX(posicao1); i++) {
            for (int j = figura1Y; j < figura1.getMaxY(posicao1); j++) {
                for (int k = figura2X; k < figura2.getMaxX(posicao2); k++) {
                    for (int l = figura2Y; l < figura2.getMaxY(posicao2); l++) {
                        if(l == j && k == i) {
                            System.out.printf("Figura 1: %s x, %s y\n", i, j);
                            System.out.printf("Figura 2: %s x, %s y\n", k, l);
                            return true;
                        }
                    }
                }
            }
        }

        return false;

    }

}
