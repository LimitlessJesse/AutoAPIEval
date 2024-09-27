import javax.naming.ldap.StartTlsResponse;

public class StartTlsResponse_3 {
    public static void main(String[] args) {
        StartTlsResponse response = new StartTlsResponse();
        String[] cipherSuites = {"TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA"};
        response.setEnabledCipherSuites(cipherSuites);
    }
}
