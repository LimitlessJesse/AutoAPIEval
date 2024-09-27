import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLServerSocketFactory;

public class SSLServerSocket_4 {
    public static void main(String[] args) {
        try {
            SSLServerSocketFactory factory = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
            SSLServerSocket serverSocket = (SSLServerSocket) factory.createServerSocket(8080);
            serverSocket.setWantClientAuth(true);

            System.out.println("WantClientAuth set to true");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
