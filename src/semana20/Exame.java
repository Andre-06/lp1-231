package semana20;

import java.util.List;

public class Exame {
    List<Question> questions;
    List<List<Integer>> answers;

    public Exame(List<Question> questions, List<List<Integer>> answers) {
        this.questions = questions;
        this.answers = answers;
    }

    public int pontuation(){
        int pontuation = 0;
        for (int i = 0; i < questions.size(); i++) {
            if(questions.get(i).choice(answers.get(i))){
                pontuation++;
            }
        }
        return pontuation;
    }
}
