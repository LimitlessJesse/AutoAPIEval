import javax.crypto.KeyGenerator;
import java.security.InvalidParameterException;

public class KeyGenerator_2 {
    public static void main(String[] args) {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128); // Initialize key generator with keysize of 128 bits
        } catch (InvalidParameterException e) {
            System.out.println("Invalid keysize provided.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
