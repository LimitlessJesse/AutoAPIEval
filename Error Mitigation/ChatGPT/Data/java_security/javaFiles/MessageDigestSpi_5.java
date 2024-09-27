import java.security.MessageDigestSpi;

public class MessageDigestSpi_5 {
    public static void main(String[] args) {
        // This method is protected and abstract, so it needs to be implemented in a subclass
        // Example implementation in a subclass:
        MessageDigestSpi spi = new MessageDigestSpi() {
            @Override
            protected void engineReset() {
                // Reset the digest for further use
                System.out.println("Digest reset for further use");
            }
        };
        
        // Calling the engineReset method
        spi.engineReset();
    }
}
