import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.net.InetSocketAddress;
import java.util.List;

public class SNIServerName_5 {
    public static void main(String[] args) throws Exception {
        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, null, null);
        SSLSocketFactory factory = sslContext.getSocketFactory();
        SSLSocket socket = (SSLSocket) factory.createSocket("www.example.com", 443);
        socket.addHandshakeCompletedListener(event -> {
            List<SNIServerName> serverNames = event.getSSLSession().getPeerCertificates()[0].getSubjectAlternativeNames();
            for (SNIServerName serverName : serverNames) {
                System.out.println(serverName.toString());
            }
        });
        socket.connect(new InetSocketAddress("www.example.com", 443));
    }
}
