import javax.net.ssl.HandshakeCompletedEvent;

public class HandshakeCompletedEvent_2 {
    public static void main(String[] args) {
        // Assuming handshakeCompletedEvent is initialized somehow
        HandshakeCompletedEvent handshakeCompletedEvent = new HandshakeCompletedEvent(null, null);
        
        String cipherSuite = handshakeCompletedEvent.getCipherSuite();
        System.out.println("Cipher Suite: " + cipherSuite);
    }
}
