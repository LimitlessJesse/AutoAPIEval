import javax.net.ssl.KeyManagerFactory;

public class KeyManagerFactory_4 {
    public static void main(String[] args) {
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("SunX509");
        String algorithm = keyManagerFactory.getAlgorithm();
        System.out.println("Algorithm: " + algorithm);
    }
}
