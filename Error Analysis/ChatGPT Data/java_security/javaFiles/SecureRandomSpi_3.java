import java.security.SecureRandom;
import java.security.SecureRandomSpi;

public class SecureRandomSpi_3 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[10];
        random.engineNextBytes(bytes);
        System.out.println("Random bytes generated: ");
        for (byte b : bytes) {
            System.out.print(b + " ");
        }
    }
}
