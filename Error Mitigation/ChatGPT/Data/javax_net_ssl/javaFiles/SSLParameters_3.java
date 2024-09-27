import javax.net.ssl.SSLParameters;

public class SSLParameters_3 {
    public static void main(String[] args) {
        SSLParameters sslParams = new SSLParameters();
        String[] cipherSuites = {"TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA"};
        sslParams.setCipherSuites(cipherSuites);
    }
}
