import javax.net.ssl.SSLSocket;

public class SSLSocket_5 {
    public static void main(String[] args) {
        SSLSocket socket = null; // Initialize your SSLSocket object
        
        // Set client authentication required
        socket.setNeedClientAuth(true);
        
        // Set client authentication not desired
        socket.setNeedClientAuth(false);
    }
}
