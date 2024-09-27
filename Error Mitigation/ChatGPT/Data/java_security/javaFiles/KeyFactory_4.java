import java.security.KeyFactory;

public class KeyFactory_4 {
    public static void main(String[] args) {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        String algorithm = keyFactory.getAlgorithm();
        System.out.println("Algorithm: " + algorithm);
    }
}
