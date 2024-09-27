import java.security.cert.LDAPCertStoreParameters;

public class LDAPCertStoreParameters_1 {
    public static void main(String[] args) {
        LDAPCertStoreParameters params = new LDAPCertStoreParameters("ldap://example.com");
        String serverName = params.getServerName();
        System.out.println("LDAP Server Name: " + serverName);
    }
}
