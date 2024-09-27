import java.security.MessageDigestSpi;

public class MessageDigestSpi_5 {
    public static void main(String[] args) {
        MessageDigestSpi engine = new MessageDigestSpi() {
            @Override
            protected void engineReset() {
                // Reset the message digest engine
            }
        };

        engine.engineReset(); // Call the engineReset method
    }
}
