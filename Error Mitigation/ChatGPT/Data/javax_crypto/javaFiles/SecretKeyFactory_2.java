import javax.crypto.SecretKeyFactory;

public class SecretKeyFactory_2 {
    public static void main(String[] args) {
        SecretKeyFactory factory = SecretKeyFactory.getInstance("AES");
        String algorithm = factory.getAlgorithm();
        System.out.println("Algorithm name: " + algorithm);
    }
}
