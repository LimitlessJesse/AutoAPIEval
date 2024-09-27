import javax.net.ssl.SSLParameters;

public class SSLParameters_1 {
    public static void main(String[] args) {
        SSLParameters sslParams = new SSLParameters();
        
        String[] cipherSuites = sslParams.getCipherSuites();
        
        for(String suite : cipherSuites) {
            System.out.println(suite);
        }
    }
}
