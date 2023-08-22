package semana20;

import java.util.List;

public abstract class Question {
    int number;
    String statement;
    List<Option> options;

    public Question(int number, String statement, List<Option> options) {
        this.number = number;
        this.statement = statement;
        this.options = options;
    }

    public abstract boolean choice(List<Integer> answers);
}
