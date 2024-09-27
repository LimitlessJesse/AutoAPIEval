import javax.net.ssl.TrustManagerFactory;

public class TrustManagerFactory_1 {
    public static void main(String[] args) {
        String algorithm = TrustManagerFactory.getDefaultAlgorithm();
        System.out.println("Default TrustManagerFactory algorithm: " + algorithm);
    }
}
