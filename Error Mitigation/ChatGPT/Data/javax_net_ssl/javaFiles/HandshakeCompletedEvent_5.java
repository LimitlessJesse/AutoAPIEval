import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.security.Principal;

public class HandshakeCompletedEvent_5 {
    public static void main(String[] args) {
        HandshakeCompletedEvent event = null; // Initialize with your HandshakeCompletedEvent object
        
        try {
            Principal peerPrincipal = event.getPeerPrincipal();
            System.out.println("Peer's Principal: " + peerPrincipal);
        } catch (SSLPeerUnverifiedException e) {
            System.out.println("Peer's identity has not been verified.");
        }
    }
}
