package semana14.exercicios.exercicio3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

import dnl.utils.text.table.TextTable;

public class Recibo {
    Map<String, Object> recibo = new HashMap<>();
    final String[] DEFAULTKEYS = {"id", "data", "valor", "saldo", "erro"};
    final String[] TRANSACAOKEYS = {"id", "data", "valor", "saldo", "Correntista", "erro"};
    
    public Recibo(int codigo, String correntista, double saldo) {
        recibo.put("cod", codigo);
        recibo.put("nome", correntista);
        recibo.put("saldo", saldo);
        Map<String, List<Map<String, Object>>> acoes = new HashMap<>();
        List<Map<String, Object>> arr = new ArrayList<>();
        List<Map<String, Object>> arr1 = new ArrayList<>();
        List<Map<String, Object>> arr2 = new ArrayList<>();
        acoes.put("sacar", arr);
        acoes.put("depositar", arr1);
        acoes.put("transferir", arr2);
        recibo.put("ações", acoes);
    }

    public void registrarSaque(double dinheiro, double saldo, boolean erro) {
        Object[] values = {UUID.randomUUID(), LocalDateTime.now(), dinheiro, saldo, erro};
        Map<String, Object> transacao = transacao(DEFAULTKEYS, values);
        getList("sacar").add(transacao);
        recibo.replace("saldo", saldo);
    }

    public void registrarDeposito(double dinheiro, double saldo, boolean erro) {
        Object[] values = {UUID.randomUUID(), LocalDateTime.now(), dinheiro, saldo, erro};
        Map<String, Object> transacao = transacao(DEFAULTKEYS, values);
        getList("depositar").add(transacao);
        recibo.replace("saldo", saldo);
    }
    
    public void registrarTransferencia(double dinheiro, double saldo, boolean erro, Conta correntista) {
        Object[] values = {UUID.randomUUID(), LocalDateTime.now(), dinheiro, saldo, correntista.getCodigo(), erro};
        Map<String, Object> transacao = transacao(TRANSACAOKEYS, values);
        getList("transferir").add(transacao);
        recibo.replace("saldo", saldo);
    }

    private Map<String, Object> transacao(String[] keys, Object[] values){
        if (keys.length != values.length) throw new IllegalArgumentException("O número de chaves e valores devem ser os mesmos");
        
        Map<String, Object> transacao = new HashMap<>();
        for (int i = 0, j = 0; i < values.length; i++, j++) {
            transacao.put(keys[i], values[j]);
        }
        return transacao;
    }

    @SuppressWarnings("unchecked")
    public List<Map<String, Object>> getList(String key) {
        return (List<Map<String, Object>>) ((Map<String, Object>) recibo.get("ações")).get(key);
    }

    public void imprimirRecibo(){
        TextTable table = new TextTable(new String [] {"Código", "Nome", "Saldo"}, 
                                        new String [][] {{recibo.get("cod").toString(), 
                                                       recibo.get("nome").toString(), 
                                                       recibo.get("saldo").toString()}});

        List<Map<String, Object>> saques = getList("sacar");
        List<Map<String, Object>> depositos = getList("depositar");
        List<Map<String, Object>> transferencia = getList("transferir");

        TextTable saquesTable = new TextTable(DEFAULTKEYS, toArray(saques));
        TextTable depositosTable = new TextTable(DEFAULTKEYS, toArray(depositos));
        TextTable transferenciaTable = new TextTable(TRANSACAOKEYS, toArray(transferencia));
        table.printTable();
        System.out.println("\nSaques: ");
        saquesTable.printTable();
        System.out.println("\nDepósitos: ");
        depositosTable.printTable();
        System.out.println("\nTransferencias: ");
        transferenciaTable.printTable();

    }

    public void imprimirExtrato(){
        Map<LocalDateTime, Object[]> extrato = new HashMap<>();
        for (Map<String, Object> transacao : getList("sacar")) {
            if (! (boolean) transacao.get("erro")){
                extrato.put((LocalDateTime) (transacao.get("data")), new Object[] {null, transacao.get("valor")});
            }
        }
        for (Map<String, Object> transacao : getList("depositar")) {
            if (! (boolean) transacao.get("erro")){
                extrato.put((LocalDateTime) (transacao.get("data")), new Object[] {transacao.get("valor"), null});
            }
        }
        for (Map<String, Object> transacao : getList("transferir")) {
            if (! (boolean) transacao.get("erro")){
                extrato.put((LocalDateTime) (transacao.get("data")), new Object[] {null, transacao.get("valor")});
            }
        }
        TreeMap<LocalDateTime, Object[]> extrato2 = new TreeMap<>(extrato);
        Object[][] values = new Object[extrato2.size()][];
        int i = 0;
        for (LocalDateTime date : extrato2.keySet()) {
            values[i] = new Object[] {date, extrato2.get(date)[0], extrato2.get(date)[1]};
            i++;
        }

        TextTable table = new TextTable(new String [] {"Código", "Nome", "Saldo"}, 
                                        new String [][] {{recibo.get("cod").toString(), 
                                                       recibo.get("nome").toString(), 
                                                       recibo.get("saldo").toString()}});
        table.printTable();

        TextTable extratoTable = new TextTable(new String[] {"Data", "Entradas", "Saídas"}, values);
        System.out.println("\nExtrato: ");
        extratoTable.printTable();
    }

    private Object[][] toArray(List<Map<String, Object>> list){
        Object[][] values = new Object[list.size()][];
        for (int i = 0; i < values.length; i++) {
            Map<String, Object> map = list.get(i);
            Object[] values2 = new Object[map.keySet().size()];
            for (int j = 0; j < map.keySet().size(); j++) {
                values2[j] = map.get((map.keySet().size() == 6) ? TRANSACAOKEYS[j] : DEFAULTKEYS[j]);
            }
            values[i] = values2;
        }
        return values;
    }
}
