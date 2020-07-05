package HomeworkThree;

public class Email implements Sender{
    private String topic;
    private String text;

    public Email(String topic, String text) {
        this.topic = topic;
        this.text = text;
    }

    @Override
    public String send() {
        return text;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
