import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLEngine;

public class SSLEngine_1 {
    public static void main(String[] args) {
        SSLEngine sslEngine = SSLEngine.getDefault();
        SSLSession sslSession = sslEngine.getSession();
        
        System.out.println("SSL Session ID: " + sslSession.getId());
        System.out.println("SSL Cipher Suite: " + sslSession.getCipherSuite());
        System.out.println("SSL Protocol: " + sslSession.getProtocol());
        System.out.println("Creation Time: " + sslSession.getCreationTime());
    }
}
