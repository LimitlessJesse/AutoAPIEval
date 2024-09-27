import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;

public class HttpsURLConnection_4 {
    public static void main(String[] args) {
        HostnameVerifier verifier = new HostnameVerifier() {
            @Override
            public boolean verify(String s, String s1) {
                return false; // Implement your verification logic here
            }
        };
        
        HttpsURLConnection.setDefaultHostnameVerifier(verifier);
    }
}
