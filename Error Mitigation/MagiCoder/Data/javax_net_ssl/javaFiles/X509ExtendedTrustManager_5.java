import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509ExtendedTrustManager;
import java.security.cert.X509Certificate;
import java.net.Socket;

public class X509ExtendedTrustManager_5 {
    public static void main(String[] args) {
        SSLContext sslContext = SSLContext.getInstance("TLS");
        TrustManager[] trustManagers = new TrustManager[] {
            new X509ExtendedTrustManager() {
                @Override
                public void checkClientTrusted(X509Certificate[] chain, String authType) {
                    // Implement your own logic here
                }

                @Override
                public void checkServerTrusted(X509Certificate[] chain, String authType, Socket socket) {
                    // Implement your own logic here
                }

                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            }
        };
        sslContext.init(null, trustManagers, null);
    }
}
