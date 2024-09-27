import javax.net.ssl.SSLServerSocketFactory;

public class SSLServerSocketFactory_4 {
    public static void main(String[] args) {
        SSLServerSocketFactory factory = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
        String[] cipherSuites = factory.getDefaultCipherSuites();
        
        for(String cipherSuite : cipherSuites){
            System.out.println(cipherSuite);
        }
    }
}
