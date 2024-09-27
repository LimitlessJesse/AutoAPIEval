import javax.net.ssl.SSLServerSocket;

public class SSLServerSocket_5 {
    public static void main(String[] args) {
        SSLServerSocket serverSocket = null;
        boolean needClientAuth = true; // set to true if client authentication is required
        serverSocket.setNeedClientAuth(needClientAuth);
    }
}
