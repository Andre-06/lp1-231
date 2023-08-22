package semana20;

import java.util.List;

public class MultipleChoice extends Question{
    public MultipleChoice(int number, String statement, List<Option> options) {
        super(number, statement, options);
    }

    public boolean choice(List<Integer> listId) {
        for (int id: listId) {
            if(!options.get(id).isCorrect) return false;
        }
        return true;
    }
}
