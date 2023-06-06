package semana14;

public class Quadrado {
    private double lado;

    public Quadrado(double lado){
        this.setLado(lado);
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    /*
     * public TIPO_ATRIBUTO getNOMEDOATRIBUTO() {
     *      return ATRIBUTO;
     * }
     * 
     * public void setNOMEDOATRIBUTO(TIPO_ATRIBUTO, NOME_DO_ATRIBUTO){
     *      this.NOMEDOATRIBUTO = NOME_DO_ATRIBUTO
     * }
     * 
     */

     public double getLado(){
        return lado;
     }

     public void setLado(double lado) {
         if (lado < 0.0) {
            throw new IllegalArgumentException("Lado inválido: Lado não pode ser negativo");
         } else if (lado == 0.0){
            throw new IllegalArgumentException("Lado inválido: Lado não pode ser igual a zero");
         }
        this.lado = lado;
    }
        
}
