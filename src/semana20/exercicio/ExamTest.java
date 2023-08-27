package semana20.exercicio;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ExamTest {
    @Test
    public void testExamFunctionality() throws IllegalAccessException {
        Map<String, Boolean> options1 = new HashMap<>();
        options1.put("Alternativa 1", false);
        options1.put("Alternativa 2", false);
        options1.put("Alternativa 3", true);
        options1.put("Alternativa 4", false);

        Map<String, Boolean> options3 = new HashMap<>();
        options3.put("Branco", true);
        options3.put("Preto", false);
        options3.put("Marrom", false);
        options3.put("Amarelo", true);
        options3.put("Verde", true);
        options3.put("Azul", true);
        options3.put("Rosa", false);

        OnlyChoice question1 = new OnlyChoice(1, "Escolha a alternativa correta", options1);
        TrueOrFalse question2 = new TrueOrFalse(2, "Joao é analfabeta", true);
        MultipleChoice question3 = new MultipleChoice(3, "Quais são as cores do Brasil?", options3);

        List<Question> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);

        Exam exam = new Exam(questions);

        exam.answer(question1, "Alternativa 3");
        exam.answer(question2, "Verdadeiro");
        exam.answer(question3, new String[]{"Branco", "Amarelo", "Verde", "Azul"});

        assertEquals(question1, exam.getSortedQuestions().toArray()[0]);
        assertEquals(question2, exam.getSortedQuestions().toArray()[1]);
        assertEquals(question3, exam.getSortedQuestions().toArray()[2]);

        assertEquals(3, exam.getPontuation());

        // Exceções
        assertThrows(IllegalArgumentException.class, () -> exam.answer(4, "Falso")); // Numero invalido
        assertThrows(IllegalArgumentException.class, () -> exam.answer(question1, "Invalid")); // Alternativa invalida
        assertThrows(IllegalArgumentException.class, () -> exam.answer(question2, "Invalid")); // Alternativa invalida
        assertThrows(IllegalArgumentException.class, () -> exam.answer(question3, new String[]{"Invalid", "Invalid"})); // Alternativa invalida

        exam.answer(question1, "Alternativa 1");
        exam.answer(question2, "Verdadeiro");
        exam.answer(question3, new String[]{"Branco", "Preto", "Azul"});

        assertEquals(1, exam.getPontuation());
    }

    @Test
    public void testFullExam() throws IllegalAccessException {
        Map<String, Boolean> options1 = new HashMap<>();
        options1.put("Alternativa 1", false);
        options1.put("Alternativa 2", false);
        options1.put("Alternativa 3", true);
        options1.put("Alternativa 4", false);

        Map<String, Boolean> options3 = new HashMap<>();
        options3.put("Branco", true);
        options3.put("Preto", false);
        options3.put("Marrom", false);
        options3.put("Amarelo", true);
        options3.put("Verde", true);
        options3.put("Azul", true);
        options3.put("Rosa", false);

        OnlyChoice question1 = new OnlyChoice(1, "Escolha a alternativa correta", options1);
        TrueOrFalse question2 = new TrueOrFalse(2, "Joao é analfabeta", true);
        MultipleChoice question3 = new MultipleChoice(3, "Quais são as cores do Brasil?", options3);

        TrueOrFalse question4 = new TrueOrFalse(4, "A Terra é plana?", false);

        Map<String, Boolean> options5 = new HashMap<>();
        options5.put("Alternativa A", true);
        options5.put("Alternativa B", false);
        options5.put("Alternativa C", true);
        options5.put("Alternativa D", false);
        MultipleChoice question5 = new MultipleChoice(5, "Quais alternativas são verdadeiras?", options5);

        Map<String, Boolean> options6 = new HashMap<>();
        options6.put("Vermelho", false);
        options6.put("Amarelo", true);
        options6.put("Verde", true);
        options6.put("Azul", true);
        options6.put("Roxo", false);
        options6.put("Laranja", false);
        options6.put("Marrom", false);
        MultipleChoice question6 = new MultipleChoice(6, "Quais cores são primárias?", options6);

        TrueOrFalse question7 = new TrueOrFalse(7, "O sol gira em torno da Terra?", false);

        Map<String, Boolean> options8 = new HashMap<>();
        options8.put("Opção 1", false);
        options8.put("Opção 2", true);
        options8.put("Opção 3", false);
        OnlyChoice question8 = new OnlyChoice(8, "Qual é a opção correta?", options8);

        Map<String, Boolean> options9 = new HashMap<>();
        options9.put("Alternativa X", false);
        options9.put("Alternativa Y", false);
        options9.put("Alternativa Z", true);
        options9.put("Alternativa W", true);
        MultipleChoice question9 = new MultipleChoice(9, "Quais alternativas são válidas?", options9);

        OnlyChoice question10 = new OnlyChoice(10, "Escolha a única alternativa incorreta", options8);

        List<Question> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);
        questions.add(question8);
        questions.add(question9);
        questions.add(question10);

        Exam exam = new Exam(questions);

        assertThrows(IllegalAccessException.class, exam::printAnsweredExam);
        exam.printExamQuestions();

        exam.answer(question1, "Alternativa 3");
        exam.answer(question2, "Verdadeiro");
        exam.answer(question3, new String[]{"Branco", "Amarelo", "Verde", "Azul"});
        exam.answer(question4, "Falso");
        exam.answer(question5, new String[]{"Alternativa A", "Alternativa C"});
        exam.answer(question6, new String[]{"Amarelo", "Verde", "Azul"});
        exam.answer(question7, "Verdadeiro");
        exam.answer(question8, "Opção 1");
        exam.answer(question9, new String[]{"Alternativa Y", "Alternativa Z"});
        exam.answer(question10, "Opção 3");

        exam.printAnsweredExam();

        assertEquals(6, exam.getPontuation());  // 7 respostas corretas
    }

    @Test
    public void testComprehensiveExam() throws IllegalAccessException {
        Map<String, Boolean> options1 = new HashMap<>();
        options1.put("Alternativa 1", false);
        options1.put("Alternativa 2", false);
        options1.put("Alternativa 3", true);
        options1.put("Alternativa 4", false);

        Map<String, Boolean> options3 = new HashMap<>();
        options3.put("Branco", true);
        options3.put("Preto", false);
        options3.put("Marrom", false);
        options3.put("Amarelo", true);
        options3.put("Verde", true);
        options3.put("Azul", true);
        options3.put("Rosa", false);

        OnlyChoice question1 = new OnlyChoice(1, "Escolha a alternativa correta", options1);
        TrueOrFalse question2 = new TrueOrFalse(2, "Joao é analfabeta", true);
        MultipleChoice question3 = new MultipleChoice(3, "Quais são as cores do Brasil?", options3);

        OnlyChoice duplicateQuestion = new OnlyChoice(1, "Pergunta duplicada", options1);

        assertThrows(IllegalArgumentException.class, () -> new OnlyChoice(4, "", options1));

        List<Question> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(duplicateQuestion);

        // Criação de exam com pergunta duplicada
        assertThrows(IllegalArgumentException.class, () -> new Exam(questions));

        // Remoção da pergunta duplicada
        questions.remove(duplicateQuestion);

        Exam exam = new Exam(questions);

        // Alternativas ou perguntas inexistentes
        assertThrows(IllegalArgumentException.class, () -> exam.answer(null, "Alternativa 3"));
        assertThrows(IllegalArgumentException.class, () -> exam.answer(duplicateQuestion, "Alternativa 3"));

        // Alternativa de multipla escolha para pergunta de unica escolha
        assertThrows(IllegalAccessError.class, () -> exam.answer(question1, new String[]{"Alternativa 1"}));

        // Numero da questao incorreto
        assertThrows(IllegalArgumentException.class, () -> exam.answer(11, "Alternativa 3"));

        // Questão inexistente para o Exam
        OnlyChoice unaddedQuestion = new OnlyChoice(5, "Pergunta não adicionada", options1);
        assertThrows(IllegalArgumentException.class, () -> exam.answer(unaddedQuestion, "Alternativa 3"));

        exam.answer(question3, new String[]{"Branco", "Amarelo", "Verde", "Azul"});

        assertThrows(IllegalAccessException.class, exam::getPontuation);

        exam.answer(question1, "Alternativa 3");
        exam.answer(question2, "Verdadeiro");

        assertEquals(3, exam.getPontuation());
    }

}
