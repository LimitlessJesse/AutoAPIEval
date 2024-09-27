import javax.crypto.spec.GCMParameterSpec;
import java.nio.ByteBuffer;
import java.security.SecureRandom;

public class GCMParameterSpec_2 {
    public static void main(String[] args) {
        // Generate a random initialization vector (IV)
        byte[] iv = new byte[12];
        new SecureRandom().nextBytes(iv);

        // Create a GCMParameterSpec with the IV
        GCMParameterSpec spec = new GCMParameterSpec(128, iv);

        // Get the IV from the GCMParameterSpec
        byte[] retrievedIv = spec.getIV();

        // Print the retrieved IV
        System.out.println("Retrieved IV: " + ByteBuffer.wrap(retrievedIv).asLongBuffer().get());
    }
}
