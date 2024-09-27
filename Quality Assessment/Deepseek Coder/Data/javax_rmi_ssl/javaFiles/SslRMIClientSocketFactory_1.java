import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.io.IOException;
import java.net.Socket;

public class SslRMIClientSocketFactory_1 {
    public static void main(String[] args) throws IOException {
        SslRMIClientSocketFactory sslRMIClientSocketFactory1 = new SslRMIClientSocketFactory();
        SslRMIClientSocketFactory sslRMIClientSocketFactory2 = new SslRMIClientSocketFactory();

        Socket socket1 = new Socket(sslRMIClientSocketFactory1);
        Socket socket2 = new Socket(sslRMIClientSocketFactory2);

        boolean isEqual = socket1.equals(socket2);

        System.out.println("Are the two SslRMIClientSocketFactory objects equal? " + isEqual);
    }
}
