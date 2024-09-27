import java.security.cert.LDAPCertStoreParameters;

public class LDAPCertStoreParameters_2 {
    public static void main(String[] args) {
        LDAPCertStoreParameters params = new LDAPCertStoreParameters(1234);
        int port = params.getPort();
        System.out.println("Port number: " + port);
    }
}
