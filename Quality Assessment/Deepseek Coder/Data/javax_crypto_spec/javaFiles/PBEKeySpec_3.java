import javax.crypto.spec.PBEKeySpec;
import java.security.SecureRandom;
import java.security.spec.KeySpec;

public class PBEKeySpec_3 {
    public static void main(String[] args) throws Exception {
        // Generate a secure random salt
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);

        // Create a PBEKeySpec with the salt
        KeySpec spec = new PBEKeySpec("password".toCharArray(), salt, 65536, 128);

        // Get the salt from the PBEKeySpec
        byte[] saltFromSpec = ((PBEKeySpec) spec).getSalt();

        // Print the salt
        for (byte b : saltFromSpec) {
            System.out.printf("%02x", b);
        }
    }
}
