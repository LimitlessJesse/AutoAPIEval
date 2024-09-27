import java.security.SecureRandom;

public class SecureRandom_2 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] seed = {1, 2, 3, 4, 5};
        secureRandom.setSeed(seed);
    }
}
