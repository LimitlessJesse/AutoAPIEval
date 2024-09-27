import javax.net.ssl.SSLServerSocket;

public class SSLServerSocket_4 {
    public static void main(String[] args) {
        SSLServerSocket serverSocket = null;
        try {
            // Create an SSLServerSocket
            serverSocket = (SSLServerSocket) SSLServerSocketFactory.getDefault().createServerSocket(12345);
            
            // Set the need for client authentication
            serverSocket.setNeedClientAuth(true);
            
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
