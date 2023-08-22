package semana20;

import java.util.List;

public class OnlyChoice extends Question{
    public OnlyChoice(int number, String statement, List<Option> options) {
        super(number, statement, options);
    }

    @Override
    public boolean choice(List<Integer> answers) {
        return options.get(answers.get(0)).isCorrect;
    }

}
