import javax.net.ssl.SSLServerSocket;

public class SSLServerSocket_5 {
    public static void main(String[] args) {
        SSLServerSocket serverSocket = null;
        try {
            // Initialize SSLServerSocket
            serverSocket = (SSLServerSocket) SSLServerSocketFactory.getDefault().createServerSocket(12345);
            
            // Set client authentication to be requested
            serverSocket.setWantClientAuth(true);
            
            // Other server socket operations
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
