import javax.crypto.Cipher;
import java.security.AlgorithmParameters;

public class Cipher_5 {
    public static void main(String[] args) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            AlgorithmParameters params = cipher.getParameters();
            System.out.println("Parameters used with this cipher: " + params);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
