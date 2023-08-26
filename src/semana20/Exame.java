package semana20;

import java.util.*;
import java.util.stream.Stream;

public class Exame {
    private final Map<Question, Integer> questions;
    private final Map<Question, Object> answers;

    public Exame(List<Question> questions) {
        this.answers = new HashMap<>();
        this.questions = new HashMap<>();
        setQuestions(questions);
    }

    public void setQuestions(List<Question> questions) throws IllegalArgumentException{
        if (questions.size() == 0) throw new IllegalArgumentException();
        for (Question question: questions) {
            if (getQuestionByNumber(question.getNumber()) != null) throw new IllegalArgumentException("Nao é permitido duas questoes com os mesmo numeros");
            this.questions.put(question, -1);
        }
    }

    public void answer(Question question, String answer) throws IllegalArgumentException{
        if (questions.get(question) == null) throw new IllegalArgumentException("Escolha uma questão válida");
        if (question.choice(answer)) questions.replace(question, 1);
        else questions.replace(question, 0);
        answers.put(question, answer);
    }

    public void answer(Question question, String[] answer) throws IllegalArgumentException{
        if (questions.get(question) == null) throw new IllegalArgumentException("Escolha uma questão válida");
        if (question.choice(answer)) questions.replace(question, 1);
        else questions.replace(question, 0);
        answers.put(question, answer);
    }

    public void answer(int number, String answer) throws IllegalArgumentException{
        Question question = getQuestionByNumber(number);
        if (question == null) throw new IllegalArgumentException("Escolha uma questão válida");
        if (question.choice(answer)) questions.replace(question, 1);
        else questions.replace(question, 0);
        answers.put(question, answer);
    }

    public void answer(int number, String[] answer) throws IllegalArgumentException{
        Question question = getQuestionByNumber(number);
        if (question == null) throw new IllegalArgumentException("Escolha uma questão válida");
        if (question.choice(answer)) questions.replace(question, 1);
        else questions.replace(question, 0);
        answers.put(question, answer);
    }

    public Map<Question, Integer> getQuestions() {
        return questions;
    }

    private Question getQuestionByNumber(int number){
        for (Question question :
                questions.keySet()) {
            if (question.getNumber() == number) return question;
        }
        return null;
    }

    public int getPontuation() throws IllegalAccessException {
        if (Collections.frequency(questions.values(), -1) > 0) throw new IllegalAccessException("Responda todas as questões antes de ver sua pontuação");
        return questions.values().stream().mapToInt(Integer::intValue).sum();
    }

    public void printExamQuestions() {
        System.out.println("Questões do Exame:");
        for (Question question : getSortedQuestions()) {
            System.out.println("Questão " + question.getNumber() + ": " + question.getStatement());

            if (question instanceof OnlyChoice) {
                if (question instanceof TrueOrFalse) System.out.println("Tipo: Verdadeiro ou Falso");
                else System.out.println("Tipo: Escolha Única");
            } else if (question instanceof MultipleChoice) {
                System.out.println("Tipo: Múltipla Escolha");
            }

            System.out.println("\nAlternativas: ");
            for (String option :
                    question.options.keySet().stream().sorted().toList()) {
                System.out.println("-> " + option);
            }
            System.out.println();
        }
    }

    public void printAnsweredExam() throws IllegalAccessException {
        if (Collections.frequency(questions.values(), -1) > 0) throw new IllegalAccessException("Responda todas as questões antes de ver sua pontuação");
        System.out.println("Gabarito do Exame:");
        for (Question question : getSortedQuestions()) {
            System.out.println("Questão " + question.getNumber() + ": " + question.getStatement());

            if (question instanceof OnlyChoice) {
                if (question instanceof TrueOrFalse) System.out.println("Tipo: Verdadeiro ou Falso");
                else System.out.println("Tipo: Escolha Única");
            } else if (question instanceof MultipleChoice) {
                System.out.println("Tipo: Múltipla Escolha");
            }

            System.out.println("\nAlternativas: ");
            for (String option :
                    question.options.keySet().stream().sorted().toList()) {
                if (answers.get(question) instanceof String[]){
                    List<String> answersList = Arrays.asList((String[]) answers.get(question));
                    if (Collections.frequency(answersList, option) > 0){
                        System.out.println("-> " + option + (question.options.get(option)?" (✓)":" X"));
                    } else {
                        System.out.println("-> " + option + (question.options.get(option)?" ✓":""));
                    }
                } else {
                    if (option.equals(answers.get(question))){
                        System.out.println("-> " + option + (question.options.get(option)?" (✓)":" X"));
                    } else {
                        System.out.println("-> " + option + (question.options.get(option)?" ✓":""));
                    }
                }
            }
            System.out.println();
        }
    }

    public List<Question> getSortedQuestions() {
        List<Question> list = new ArrayList<>();
        for (Question question :
                questions.keySet()) {
            if (list.isEmpty()) {
                list.add(question);
            } else {
                int length = list.size();
                for (int i = 0; i < length; i++) {
                    if (list.get(i).getNumber() > question.getNumber()) {
                        list.add(i, question);
                        break;
                    } else if (i + 1 == list.size()) {
                        list.add(question);
                    }
                }
            }
        }
        return list;
    }

}
