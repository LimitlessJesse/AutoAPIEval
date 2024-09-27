import java.security.SecureRandom;

public class SecureRandom_2 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[10];
        random.nextBytes(bytes);

        System.out.print("Random bytes: ");
        for (byte b : bytes) {
            System.out.print(b + " ");
        }
    }
}
