import java.security.KeyPairGenerator;
import java.security.InvalidParameterException;

public class KeyPairGenerator_2 {
    public static void main(String[] args) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048); // Initialize with keysize of 2048 bits
        } catch (InvalidParameterException e) {
            System.out.println("Invalid keysize provided.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
