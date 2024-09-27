import java.security.SecureRandom;
import java.security.SecureRandomSpi;

public class SecureRandomSpi_3 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom(new byte[16]);
        byte[] bytes = new byte[10];
        secureRandom.engineNextBytes(bytes);
        for (byte b : bytes) {
            System.out.print(b + " ");
        }
    }
}
