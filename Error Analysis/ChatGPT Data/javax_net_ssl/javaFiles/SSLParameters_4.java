import javax.net.ssl.SSLParameters;

public class SSLParameters_4 {
    public static void main(String[] args) {
        SSLParameters sslParameters = new SSLParameters();
        boolean wantClientAuth = sslParameters.getWantClientAuth();
        System.out.println("Want client authentication: " + wantClientAuth);
    }
}
