package semana20;

import java.util.HashMap;
import java.util.Map;

public class TrueOrFalse extends OnlyChoice{

    public TrueOrFalse(int number, String statement, boolean trueOrFalse) {
        super(number, statement, putMap(trueOrFalse));
    }

    private static Map<String, Boolean> putMap(boolean trueOrFalse){
        Map<String, Boolean> options = new HashMap<>();
        options.put("Verdadeiro", trueOrFalse);
        options.put("Falso", !trueOrFalse);
        return options;
    }

    @Override
    public boolean choice(String[] texts) throws IllegalArgumentException {
        throw new IllegalAccessError("Nao é possível escolher mais de uma alternativa em perguntas verdadeiro ou falso");
    }

}
