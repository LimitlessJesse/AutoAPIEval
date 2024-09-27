import javax.net.ssl.SSLParameters;

public class SSLParameters_4 {
    public static void main(String[] args) {
        SSLParameters sslParams = new SSLParameters();
        String[] protocols = {"TLSv1.2", "TLSv1.3"};
        sslParams.setProtocols(protocols);
    }
}
