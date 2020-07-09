package Homework3;

public class SMS implements Sender{
    private String text;
    private boolean network = true;

    public SMS(String text) {
        this.text = text;
    }

    @Override
    public String send() throws OutOfNetworkException {
        if(!network) throw new OutOfNetworkException("SMS");
        return text;
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
