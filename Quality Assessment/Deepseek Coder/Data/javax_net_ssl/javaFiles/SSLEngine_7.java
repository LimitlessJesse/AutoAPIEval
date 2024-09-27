import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class SSLEngine_7 {
    public static void main(String[] args) throws IOException {
        SSLContext context = SSLContext.getInstance("TLS");
        context.init(null, null, null);
        SSLSocketFactory factory = context.getSocketFactory();
        SSLSocket socket = (SSLSocket) factory.createSocket(new InetSocketAddress("www.google.com", 443));
        SSLEngine engine = socket.getEnabledSSLEngines().get(0);
        engine.beginHandshake();
        OutputStream out = socket.getOutputStream();
        out.write("Hello, world!".getBytes());
        socket.close();
    }
}
