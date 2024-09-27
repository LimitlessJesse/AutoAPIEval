import java.security.MessageDigestSpi;

public class MessageDigestSpi_3 {
    public static void main(String[] args) {
        // Create an instance of a class that extends MessageDigestSpi
        MyMessageDigestSpi myMessageDigestSpi = new MyMessageDigestSpi();
        
        // Call the engineDigest method
        byte[] hashValue = myMessageDigestSpi.engineDigest();
        
        // Print the resulting hash value
        System.out.println("Hash Value: " + new String(hashValue));
    }
}

class MyMessageDigestSpi extends MessageDigestSpi {
    @Override
    protected byte[] engineDigest() {
        // Perform hash computation and padding
        byte[] hashValue = new byte[]{0x01, 0x02, 0x03}; // Example hash value
        
        // Reset the engine
        engineReset();
        
        return hashValue;
    }
    
    // Implement engineReset method
    @Override
    protected void engineReset() {
        // Reset the engine implementation
    }
}
