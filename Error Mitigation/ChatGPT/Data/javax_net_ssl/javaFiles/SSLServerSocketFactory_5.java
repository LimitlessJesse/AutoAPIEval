import javax.net.ssl.SSLServerSocketFactory;

public class SSLServerSocketFactory_5 {
    public static void main(String[] args) {
        SSLServerSocketFactory factory = SSLServerSocketFactory.getDefault();
        String[] cipherSuites = factory.getDefaultCipherSuites();
        
        System.out.println("Default Cipher Suites:");
        for (String cipherSuite : cipherSuites) {
            System.out.println(cipherSuite);
        }
    }
}
