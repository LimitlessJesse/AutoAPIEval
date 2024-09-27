import javax.net.ssl.ExtendedSSLSession;

public class ExtendedSSLSession_4 {
    public static void main(String[] args) {
        ExtendedSSLSession sslSession = ... // obtain ExtendedSSLSession object
        String[] supportedAlgorithms = sslSession.getLocalSupportedSignatureAlgorithms();
        for(String algorithm : supportedAlgorithms) {
            System.out.println(algorithm);
        }
    }
}
