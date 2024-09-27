import javax.net.ssl.SSLParameters;
import java.util.Arrays;

public class SSLParameters_3 {
    public static void main(String[] args) {
        SSLParameters sslParameters = new SSLParameters();
        String[] protocols = {"TLSv1.2", "TLSv1.3"};
        sslParameters.setProtocols(protocols);
        System.out.println("Protocols: " + Arrays.toString(sslParameters.getProtocols()));
    }
}
