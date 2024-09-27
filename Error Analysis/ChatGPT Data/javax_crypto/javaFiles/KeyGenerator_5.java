import javax.crypto.KeyGenerator;

public class KeyGenerator_5 {
    public static void main(String[] args) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            System.out.println("Provider: " + keyGenerator.getProvider());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
