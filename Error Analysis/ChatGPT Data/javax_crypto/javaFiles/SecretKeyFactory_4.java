import javax.crypto.SecretKeyFactory;

public class SecretKeyFactory_4 {
    public static void main(String[] args) {
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("AES");
        String algorithm = keyFactory.getAlgorithm();
        System.out.println("Algorithm: " + algorithm);
    }
}
