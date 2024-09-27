import javax.net.ssl.TrustManagerFactory;

public class TrustManagerFactory_3 {
    public static void main(String[] args) {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("SunX509");
        String algorithm = trustManagerFactory.getAlgorithm();
        System.out.println("Algorithm name: " + algorithm);
    }
}
