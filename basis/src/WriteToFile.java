import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class WriteToFile {
    private LocalDateTime date;

    public WriteToFile(Quiz quiz) {
        this.date = LocalDateTime.now();

        try {
            FileWriter myWriter = new FileWriter("answerFlashCards.txt", true);

            // Schrijf de datum en tijd voor heading
            myWriter.write(date.getYear() + "/" + date.getMonthValue() + "/" + date.getDayOfMonth() + "\t" + date.getHour() + ":" + date.getMinute() + "\n");

            // Schrijf alle antwoorden binnen dezelfde open stream
            for (int i = 0; i < quiz.getQuestionList().size(); i++) {
                myWriter.write(quiz.getQuestionList().get(i).getQuestionNumber() + " " + quiz.getQuestionList().get(i).getQuestion() + " " +quiz.getQuestionList().get(i).getAnswer() + "\n");
                //System.out.printf("test %d%n", i);
            }
            myWriter.write("\n");

            // Sluit het bestand pas als alles geschreven is
            myWriter.close();
            //System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            //System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}