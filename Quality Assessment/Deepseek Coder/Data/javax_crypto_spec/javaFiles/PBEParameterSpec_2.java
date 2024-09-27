import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PBEParameterSpec_2 {
    public static void main(String[] args) {
        // Generate a secure random salt
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);

        // Create a PBEParameterSpec with the salt
        PBEParameterSpec spec = new PBEParameterSpec(salt, 1024, 256);

        // Get the salt from the PBEParameterSpec
        byte[] saltFromSpec = spec.getSalt();

        // Print the salt
        for (byte b : saltFromSpec) {
            System.out.print(b + " ");
        }
    }
}
