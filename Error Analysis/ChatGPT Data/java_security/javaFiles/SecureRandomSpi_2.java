import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.util.Arrays;

public class SecureRandomSpi_2 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        byte[] seed = random.engineGenerateSeed(10);
        System.out.println(Arrays.toString(seed));
    }
}
