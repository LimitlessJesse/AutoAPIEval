import java.security.cert.LDAPCertStoreParameters;

public class LDAPCertStoreParameters_2 {
    public static void main(String[] args) {
        LDAPCertStoreParameters params = new LDAPCertStoreParameters("server.example.com");
        String serverName = params.getServerName();
        System.out.println("Server name: " + serverName);
    }
}
