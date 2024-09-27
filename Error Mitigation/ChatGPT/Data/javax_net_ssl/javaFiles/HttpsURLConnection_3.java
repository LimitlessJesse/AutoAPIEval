import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public class HttpsURLConnection_3 {
    public static void main(String[] args) {
        SSLSocketFactory factory = SSLSocketFactory.getDefault(); // Get the default SSLSocketFactory
        HttpsURLConnection.setDefaultSSLSocketFactory(factory); // Set the default SSLSocketFactory
    }
}
