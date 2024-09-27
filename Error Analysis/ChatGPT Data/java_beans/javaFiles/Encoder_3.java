import java.beans.ExceptionListener;
import java.beans.Encoder;

public class Encoder_3 {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        
        // Create an ExceptionListener
        ExceptionListener listener = exception -> {
            System.err.println("Exception: " + exception.getMessage());
        };
        
        // Set the ExceptionListener to the Encoder
        encoder.setExceptionListener(listener);
        
        // Now when an exception occurs during encoding, it will be handled by the listener
    }
}
