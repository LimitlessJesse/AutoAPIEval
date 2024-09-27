import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.SSLSocket;

public class HandshakeCompletedEvent_1 {
    public static void main(String[] args) {
        SSLSocket sslSocket = null; // Initialize your SSLSocket object
        
        // Register an event listener to get notified when a handshake is completed
        sslSocket.addHandshakeCompletedListener((HandshakeCompletedEvent event) -> {
            // Get the socket associated with the event
            SSLSocket socket = event.getSocket();
            
            // Additional code logic can be added here
            
            // Example: Print out the cipher suite used in the handshake
            System.out.println("Cipher suite: " + socket.getSession().getCipherSuite());
        });
    }
}
