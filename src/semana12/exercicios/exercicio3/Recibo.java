package semana12.exercicios.exercicio3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import dnl.utils.text.table.TextTable;

public class Recibo {
    Map<String, Object> recibo = new HashMap<>();
    final String[] DEFAULTKEYS = {"id", "data", "valor", "saldo", "erro"};
    final String[] TRANSACAOKEYS = {"id", "data", "valor", "saldo", "Correntista","erro"};
    
    public Recibo(int codigo, String correntista, double saldo) {
        recibo.put("cod", codigo);
        recibo.put("nome", correntista);
        recibo.put("saldo", saldo);
        Map<String, List<Map<String, Object>>> acoes = new HashMap<>();
        List<Map<String, Object>> arr = new ArrayList<>();
        acoes.put("sacar", arr);
        acoes.put("depositar", arr);
        acoes.put("transferir", arr);
        recibo.put("ações", acoes);
    }

    public void registrar(double dinheiro, double saldo, boolean erro, String acao) {
        Object[] values = {UUID.randomUUID().toString(), LocalDateTime.now().toString(), dinheiro, saldo, erro};
        Map transacao = transacao(DEFAULTKEYS, values);
        List list = getList(acao);
        list.add(transacao);
        recibo.replace("saldo", saldo);
    }
    
    public void registrar(double dinheiro, double[] saldos, boolean erro, Conta correntista) {
        Object[] values = {UUID.randomUUID().toString(), LocalDateTime.now().toString(), dinheiro, saldos, correntista, erro};
        Map transacao = transacao(TRANSACAOKEYS, values);
        List list = getList("transferir");
        list.add(transacao);
        recibo.replace("saldo", saldos[0]);
    }

    private Map<Object, Object> transacao(Object[] keys, Object[] values){
        if (keys.length != values.length) throw new IllegalArgumentException("O número de chaves e valores devem ser os mesmos");
        
        Map<Object, Object> transacao = new HashMap<>();
        for (int i = 0, j = 0; i < values.length; i++, j++) {
            transacao.put(keys[i], values[j]);
        }
        return transacao;
    }

    public List<Map<String, Object>> getList(String key) {
        Map<String, Object> acoes = (Map<String, Object>) recibo.get("ações");
        return (List<Map<String, Object>>) acoes.get(key);
    }

    public void imprimirRecibo(){
        TextTable table = new TextTable(new String [] {"Código", "Nome", "Saldo"}, 
                                        new String [][] {{recibo.get("cod").toString(), 
                                                       recibo.get("nome").toString(), 
                                                       recibo.get("saldo").toString()}});

        Object[][] values = new Object[getList("sacar").size()][];
        int i = 0;
        for (Object map : getList("sacar").toArray()) {
            values[i] =  ((Map<String, Object>) map).values().toArray();
            i++;
        }
        Object[][] values2 = new Object[getList("depositar").size()][];
        i = 0;
        for (Object map : getList("depositar").toArray()) {
            values2[i] =  ((Map<String, Object>) map).values().toArray();
            i++;
        }
        Object[][] values3 = new Object[getList("transferir").size()][];
        i = 0;
        for (Object map : getList("transferir").toArray()) {
            values3[i] =  ((Map<String, Object>) map).values().toArray();
            i++;
        }
        TextTable saques = new TextTable(DEFAULTKEYS, values);
        TextTable depositos = new TextTable(DEFAULTKEYS, values2);
        TextTable transferencia = new TextTable(TRANSACAOKEYS, values3);
        table.printTable();
        System.out.println("--------------------EXTRATO--------------------");
        System.out.println("Saques: ");
        saques.printTable();
        System.out.println("Depósitos: ");
        depositos.printTable();
        System.out.println("Transferencias: ");
        transferencia.printTable();
    }

}
