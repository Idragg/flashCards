import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        List<Question> questionList = List.of(
                new Question(1, "Wat is roos en heeft veren?", null),
                new Question(2, "Wat is oranje en komt voor in een Disney film?", null),
                new Question(3, "Wat is de film waar ze zeggen een leeuw is geboren OMG?", null),
                new Question(4, "wat de naam van een dier dat met een O begint en in minecraft voor komt?", null),
                new Question(5, "Wat is de hoofdstad van Australië (het is niet Sydney)?", null),
                new Question(6, "Hoeveel tanden heeft een volwassen mens gemiddeld?", null),
                new Question(7, "Welk element op de periodiek systeem heeft de scheikundige afkorting 'Au'?", null),
                new Question(8, "Hoe heet de hoogste berg ter wereld?", null),
                new Question(9, "Welke planeet in ons zonnestelsel staat het dichtst bij de zon?", null),
                new Question(10, "In welk jaar stapte de eerste mens op de maan?", null),
                new Question(11, "Welk land heeft de meeste eilanden ter wereld?", null),
                new Question(12, "Wat is het snelste landdier ter wereld?", null),
                new Question(13, "Hoeveel kleuren heeft een regenboog?", null),
                new Question(14, "Welke oceanen zijn er allemaal op aarde?", null),
                new Question(15, "Wie schilderde de Mona Lisa?", null),
                new Question(16, "Wat is de chemische formule voor water?", null),
                new Question(17, "Welk dier staat bekend als de \"koning der dieren\"?", null),
                new Question(18, "Hoeveel botten heeft een pasgeboren baby ongeveer?", null),
                new Question(19, "Welk continent is het grootste ter wereld qua landoppervlakte?", null),
                new Question(20, "Wat is de nationale sport van Canada?", null),
                new Question(21, "Welk land heeft de meeste eilanden ter wereld?", null),
                new Question(22, "Hoe lang doet de aarde erover om één volledige baan om de zon te voltooien?", null),
                new Question(23, "Welk insect produceert honing?", null),
                new Question(24, "Wat is het hardste natuurlijke materiaal op aarde?", null),
                new Question(25, "Wat is de hoofdstad van Japan?", null),
                new Question(26, "Hoeveel spelers staan er bij een standaard voetbalteam in het veld?", null),
                new Question(27, "Wie schilderde de Mona Lisa?", null),
                new Question(28, "Wat is het grootste zoogdier ter wereld?", null),
                new Question(29, "In welk land staat de Eiffeltoren?", null),
                new Question(30, "Hoeveel dagen telt een schrikkeljaar?", null),
                new Question(31, "Wat is het hoofdingrediënt van guacamole?", null),
                new Question(32, "Welke planeet staat bekend als de Rode Planeet?", null)
        );

        // Pak 10 willekeurige vragen uit de lijst
        for (int i = 0; i < 10; i++) {
            int j = random.nextInt(questionList.size());
            quiz.getQuestionList().add(questionList.get(j));
        }

        System.out.println(quiz);
        String answer = null;

        for (int i = 0; i < quiz.getQuestionList().size(); i++) {
            System.out.println(quiz.getQuestionList().get(i));
            answer = keyboard.nextLine();
            quiz.getQuestionList().get(i).setAnswer(answer);
        }

        // Wegschrijven nadat álle vragen van de quiz zijn beantwoord
        new WriteToFile(quiz);
    }
}