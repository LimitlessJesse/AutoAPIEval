import javax.net.ssl.TrustManagerFactory;

public class TrustManagerFactory_2 {
    public static void main(String[] args) {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
        String algorithm = trustManagerFactory.getAlgorithm();
        System.out.println("TrustManagerFactory algorithm: " + algorithm);
    }
}
