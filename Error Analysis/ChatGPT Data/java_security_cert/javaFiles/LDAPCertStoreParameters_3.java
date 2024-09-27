import java.security.cert.LDAPCertStoreParameters;

public class LDAPCertStoreParameters_3 {
    public static void main(String[] args) {
        LDAPCertStoreParameters params = new LDAPCertStoreParameters("ldap.example.com", 389);
        int port = params.getPort();
        System.out.println("LDAP Server Port: " + port);
    }
}
