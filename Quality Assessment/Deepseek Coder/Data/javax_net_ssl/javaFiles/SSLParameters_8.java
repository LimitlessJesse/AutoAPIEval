import javax.net.ssl.SSLParameters;

public class SSLParameters_8 {
    public static void main(String[] args) {
        SSLParameters sslParameters = new SSLParameters();
        boolean needClientAuth = sslParameters.getNeedClientAuth();
        System.out.println("Need Client Authentication: " + needClientAuth);
    }
}
