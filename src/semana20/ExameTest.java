package semana20;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExameTest {
    @Test
    public void exame() {
        List<Question> questions = new ArrayList<>();
        List<List<Integer>> answers = new ArrayList<>();

        List<Option> list = new ArrayList<>();
        Option option1 = new Option("Alternativa 1", false);
        list.add(option1);
        Option option2 = new Option("Alternativa 2", false);
        list.add(option2);
        Option option3 = new Option("Alternativa 3", true);
        list.add(option3);
        Option option4 = new Option("Alternativa 4", false);
        list.add(option4);
        OnlyChoice question1 = new OnlyChoice(1, "Escolha a alternativa correta", list);
        List<Integer> answer1 = new ArrayList<>();
        answer1.add(2);

        TrueOrFalse question2 = new TrueOrFalse(2, "Joao é analfabeta", true);
        List<Integer> answer2 = new ArrayList<>();
        answer2.add(1);

        List<Option> list1 = new ArrayList<>();
        Option option11 = new Option("Branco", true);
        list.add(option11);
        Option option12 = new Option("Preto", true);
        list.add(option12);
        Option option13 = new Option("Marrom", false);
        list.add(option13);
        Option option14 = new Option("Amarelo", true);
        list.add(option14);
        Option option5 = new Option("Verde", true);
        list.add(option5);
        Option option6 = new Option("Azul", true);
        list.add(option6);
        Option option7 = new Option("Rosa", false);
        list.add(option7);
        MultipleChoice question3 = new MultipleChoice(3, "Quais são as cores do Brasil?", list1);
        List<Integer> answer3 = new ArrayList<>();
        answer3.add(0);
        answer3.add(1);
        answer3.add(3);
        answer3.add(4);
        answer3.add(5);

        questions.add(question1);
        questions.add(question2);
        questions.add(question3);

        answers.add(answer1);
        answers.add(answer2);
        answers.add(answer3);

        Exame exame = new Exame(questions, answers);

        assertEquals(2, exame.pontuation());
    }
}