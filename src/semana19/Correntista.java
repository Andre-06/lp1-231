    package semana19;

    import java.util.ArrayList;
    import java.util.List;

    public class Correntista {
        private int codigo;
        private String nome;
        private List<Conta> contas;

        public Correntista(int codigo, String nome, List<Conta> contas) {
            this.codigo = codigo;
            this.nome = nome;
            if (contas != null)
                this.contas = contas;
            else
                this.contas = new ArrayList<>();
        }

        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public List<Conta> getContas() {
            return contas;
        }

        public void setContas(List<Conta> contas) {
            this.contas = contas;
        }

        public void addConta(Conta conta){
            if (conta != null)
                contas.add(conta);
        }

        public double calcularTarifas(){
            double totalTarifas = 0.0;
            for (Conta conta: contas){
                totalTarifas += conta.calcularTarifa();
            }
            return totalTarifas;
        }

    }
