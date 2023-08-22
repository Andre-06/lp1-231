package semana20;

import java.util.ArrayList;
import java.util.List;

public class TrueOrFalse extends OnlyChoice{
    public TrueOrFalse(int number, String statement, boolean trueOrFalse) {
        super(number, statement, null);
        List<Option> list = new ArrayList<>();
        if (trueOrFalse){
            list.add(new Option("Verdadeiro", true));
            list.add(new Option("Falso", false));
        } else {
            list.add(new Option("Verdadeiro", false));
            list.add(new Option("Falso", true));
        }
        super.options = list;
    }
}
