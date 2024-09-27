import javax.net.ssl.SSLParameters;

public class SSLParameters_5 {
    public static void main(String[] args) {
        SSLParameters sslParams = new SSLParameters();
        sslParams.setEndpointIdentificationAlgorithm("HTTPS");
    }
}
