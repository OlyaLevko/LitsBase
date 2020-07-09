package Homework3;

public class UnlockedException extends  Exception{
    public UnlockedException() {
    }
    public UnlockedException(String s) {
        super(s);
    }
    @Override
    public String toString() {
        return getMessage();
    }
}
