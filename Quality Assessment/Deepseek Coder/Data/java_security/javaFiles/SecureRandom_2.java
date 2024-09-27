import java.security.SecureRandom;

public class SecureRandom_2 {
    public static void main(String[] args) {
        byte[] randomBytes = new byte[10];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(randomBytes);

        System.out.println("Generated random bytes:");
        for (byte b : randomBytes) {
            System.out.print(b + " ");
        }
    }
}
