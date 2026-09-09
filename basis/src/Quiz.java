import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private List<Question> questionList = new ArrayList<>();

    public Quiz() {

    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    @Override
    public String toString() {
        return String.format("Dit is de quiz!");
    }
}
