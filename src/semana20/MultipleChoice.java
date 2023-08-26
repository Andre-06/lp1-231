package semana20;

import java.util.Collections;
import java.util.Map;

public class MultipleChoice extends Question{
    public MultipleChoice(int number, String statement, Map<String, Boolean> options) {
        super(number, statement, options);
    }

    @Override
    protected void setOptions(Map<String, Boolean> options) throws IllegalArgumentException {
        if (Collections.frequency(options.values(), true) == 0) throw new IllegalArgumentException("Ao menos uma alternativa deve estar correta");
        super.options = options;
    }

    @Override
    public boolean choice(String text) throws IllegalArgumentException {
        if (options.get(text) == null) throw new IllegalArgumentException("Escolha uma alternativa valida");
        if (Collections.frequency(options.values(), true) >= 2) return false;
        return options.get(text);
    }

    @Override
    public boolean choice(String[] texts) throws IllegalArgumentException{
        for (String text: texts) {
            if (options.get(text) == null) throw new IllegalArgumentException("Escolha uma alternativa valida");
            if (!options.get(text)) return false;
        }
        return true;
    }

}
