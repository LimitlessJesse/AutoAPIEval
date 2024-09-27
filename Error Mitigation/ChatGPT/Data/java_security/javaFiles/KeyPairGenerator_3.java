import java.security.KeyPairGenerator;

public class KeyPairGenerator_3 {
    public static void main(String[] args) {
        KeyPairGenerator keyPairGenerator;
        try {
            keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            String algorithm = keyPairGenerator.getAlgorithm();
            System.out.println("Algorithm: " + algorithm);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
