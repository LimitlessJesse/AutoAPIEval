import javax.net.ssl.HandshakeCompletedEvent;

public class HandshakeCompletedEvent_2 {
    public static void main(String[] args) {
        HandshakeCompletedEvent event = new HandshakeCompletedEvent(null, null);
        String cipherSuite = event.getCipherSuite();
        System.out.println("Cipher Suite: " + cipherSuite);
    }
}
