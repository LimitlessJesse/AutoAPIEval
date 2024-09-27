import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.SSLSession;

public class HandshakeCompletedEvent_1 {
    public static void main(String[] args) {
        HandshakeCompletedEvent event = new HandshakeCompletedEvent(null, null);
        SSLSession session = event.getSession();
        System.out.println("SSL Session ID: " + session.getId());
    }
}
