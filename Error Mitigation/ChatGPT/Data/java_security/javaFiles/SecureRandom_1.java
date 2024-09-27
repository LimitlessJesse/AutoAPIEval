import java.security.SecureRandom;

public class SecureRandom_1 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] randomBytes = new byte[10];
        secureRandom.nextBytes(randomBytes);
        
        System.out.print("Random Bytes: ");
        for (byte b : randomBytes) {
            System.out.print(b + " ");
        }
    }
}
