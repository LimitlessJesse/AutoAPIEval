import javax.crypto.spec.PBEKeySpec;
import java.security.SecureRandom;

public class PBEKeySpec_4 {
    public static void main(String[] args) {
        PBEKeySpec keySpec = new PBEKeySpec("password".toCharArray());
        byte[] salt = keySpec.getSalt();        
        System.out.println("Salt: " + new String(salt));
    }
}
