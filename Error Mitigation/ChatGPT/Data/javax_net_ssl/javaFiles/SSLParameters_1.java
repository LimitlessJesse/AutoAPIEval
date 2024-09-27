import javax.net.ssl.SSLParameters;

public class SSLParameters_1 {
    public static void main(String[] args) {
        SSLParameters sslParams = new SSLParameters();
        String[] cipherSuites = sslParams.getCipherSuites();
        if (cipherSuites != null) {
            for (String cipherSuite : cipherSuites) {
                System.out.println(cipherSuite);
            }
        } else {
            System.out.println("No cipher suites have been set.");
        }
    }
}
