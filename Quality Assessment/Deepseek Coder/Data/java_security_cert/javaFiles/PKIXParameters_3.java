import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.security.cert.PKIXParameters;
import java.util.Date;

public class PKIXParameters_3 {
    public static void main(String[] args) throws Exception {
        SSLContext sslContext = SSLContext.getInstance("TLS");
        SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
        SSLSocket sslSocket = (SSLSocket) sslSocketFactory.createSocket("example.com", 443);
        PKIXParameters pkixParams = new PKIXParameters(new Date());
        sslSocket.setPKIXParameters(pkixParams);
        sslSocket.startHandshake();
        //...
    }
}
