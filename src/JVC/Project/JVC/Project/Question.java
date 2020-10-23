package JVC.Project;

public class Question {
    private String question;
    private String key;

    public Question(String question, String key) {
        this.question = question;
        this.key = key;
    }

    public Question() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", key='" + key + '\'' +
                '}';
    }
}
