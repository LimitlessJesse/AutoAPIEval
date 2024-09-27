import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.SSLSession;

public class HandshakeCompletedEvent_3 {
    public static void main(String[] args) {
        // Create a HandshakeCompletedEvent object
        HandshakeCompletedEvent event = new HandshakeCompletedEvent(null, null, null);

        // Get the SSLSession from the event
        SSLSession session = event.getSession();

        // Get the cipher suite from the SSLSession
        String cipherSuite = session.getCipherSuite();

        // Print the cipher suite
        System.out.println("Cipher Suite: " + cipherSuite);
    }
}
