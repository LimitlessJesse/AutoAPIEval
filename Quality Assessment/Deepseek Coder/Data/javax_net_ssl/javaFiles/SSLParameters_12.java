import javax.net.ssl.SSLParameters;

public class SSLParameters_12 {
    public static void main(String[] args) {
        SSLParameters sslParameters = new SSLParameters();
        boolean wantClientAuth = sslParameters.getWantClientAuth();
        System.out.println("Want Client Auth: " + wantClientAuth);
    }
}
