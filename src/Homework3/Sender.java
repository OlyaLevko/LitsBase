package Homework3;

public interface Sender {
    String send() throws OutOfNetworkException;
    void setNetwork(boolean b);
}
