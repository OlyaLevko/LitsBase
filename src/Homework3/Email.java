package Homework3;

public class Email implements Sender{
    private String topic;
    private String text;
    private boolean network = true;

    public Email(String topic, String text) {
        this.topic = topic;
        this.text = text;
    }

    @Override
    public String send() throws OutOfNetworkException {
        if(!network) throw new OutOfNetworkException("Email");
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

    public boolean isNetwork() {
        return network;
    }

    public void setNetwork(boolean network) {
        this.network = network;
    }
}
