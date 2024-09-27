import javax.net.ssl.SSLServerSocketFactory;

public class SSLServerSocketFactory_5 {
    public static void main(String[] args) {
        String[] supportedCipherSuites = SSLServerSocketFactory.getDefault().getSupportedCipherSuites();
        
        System.out.println("Supported Cipher Suites:");
        for(String suite : supportedCipherSuites) {
            System.out.println(suite);
        }
    }
}
