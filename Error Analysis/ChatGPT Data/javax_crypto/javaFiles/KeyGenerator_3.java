import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class KeyGenerator_3 {
    public static void main(String[] args) {
        try{
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(256);
            SecretKey secretKey = keyGen.generateKey();
            System.out.println("Generated Key: " + secretKey);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
