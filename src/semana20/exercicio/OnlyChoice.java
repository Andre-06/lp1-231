package semana20.exercicio;

import java.util.Collections;
import java.util.Map;

public class OnlyChoice extends Question{
    public OnlyChoice(int number, String statement, Map<String, Boolean> options) {
        super(number, statement, options);
    }
    @Override
    protected void setOptions(Map<String, Boolean> options) throws IllegalArgumentException {
        if (Collections.frequency(options.values(), true) >= 2) throw new IllegalArgumentException("Somente uma alternativa pode estar correta");
        if (Collections.frequency(options.values(), true) == 0) throw new IllegalArgumentException("Ao menos uma alternativa deve estar correta");
        super.options = options;
    }

    @Override
    public boolean choice(String text) throws IllegalArgumentException {
        if (options.get(text) == null) throw new IllegalArgumentException("Escolha uma alternativa valida");
        return options.get(text);
    }

    @Override
    public boolean choice(String[] texts) throws IllegalAccessError {
        throw new IllegalAccessError("Nao é possível escolher mais de uma alternativa em perguntas de única escolha");
    }

}
