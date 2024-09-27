import javax.net.ssl.SSLParameters;

public class SSLParameters_3 {
    public static void main(String[] args) {
        SSLParameters sslParams = new SSLParameters();
        System.out.println(sslParams.getNeedClientAuth());
    }
}
