import java.beans.Encoder;
import java.beans.ExceptionListener;

public class Encoder_4 {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        ExceptionListener exceptionListener = encoder.getExceptionListener();
        System.out.println("ExceptionListener: " + exceptionListener);
    }
}
