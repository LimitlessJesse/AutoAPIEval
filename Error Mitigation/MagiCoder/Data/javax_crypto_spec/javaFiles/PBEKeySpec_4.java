import javax.crypto.spec.PBEKeySpec;
import java.security.spec.KeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PBEKeySpec;
import java.security.spec.InvalidKeySpecException;

public class PBEKeySpec_4 {
    public static void main(String[] args) {
        try {
            // Create a PBEKeySpec object
            PBEKeySpec pbeKeySpec = new PBEKeySpec("password".toCharArray());

            // Get the password
            char[] password = pbeKeySpec.getPassword();

            // Print the password
            System.out.println(new String(password));

            // Clear the password
            pbeKeySpec.clearPassword();

            // Try to get the password again, this should throw an IllegalStateException
            try {
                password = pbeKeySpec.getPassword();
            } catch (IllegalStateException e) {
                System.out.println("Password has been cleared: " + e.getMessage());
            }
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }
    }
}
