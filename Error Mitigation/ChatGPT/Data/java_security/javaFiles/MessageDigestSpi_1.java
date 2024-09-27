import java.security.MessageDigestSpi;

public class MessageDigestSpi_1 {
    public static void main(String[] args) {
        // Create a custom MessageDigestSpi object
        MessageDigestSpi spi = new MessageDigestSpi() {
            @Override
            protected void engineUpdate(byte input) {
                // Implement the engineUpdate method
                System.out.println("Updating digest with byte: " + input);
            }
        };
        
        // Call the engineUpdate method with a sample byte input
        byte sampleByte = 65; // ASCII value of 'A'
        spi.engineUpdate(sampleByte);
    }
}
