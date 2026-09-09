public class Question {
    private int questionNumber;
    private String question;
    private String answer;

    public Question(int number, String question, String answer) {
        this.questionNumber = number;
        this.question = question;
        this.answer = null;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public String getQuestion() {
        return question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        boolean answerStatus;
        if (answer == null){
            answerStatus = false;
        }
        else {
            answerStatus = true;
        }
        return String.format("Dit is vraag nummer %d: %S %S", questionNumber, question, answerStatus? answer:" ");
    }

    public String getAnswer() {
        return answer;
    }
}
