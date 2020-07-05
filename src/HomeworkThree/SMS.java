package HomeworkThree;

public class SMS  implements Sender{
    private String text;

    public SMS(String text) {
        this.text = text;
    }

    @Override
    public String send() {
        return text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }




}
