import javax.net.ssl.HandshakeCompletedEvent;
import java.security.cert.Certificate;

public class HandshakeCompletedEvent_4 {
    public static void main(String[] args) {
        HandshakeCompletedEvent event = new HandshakeCompletedEvent(null, null);
        Certificate[] certificates = event.getPeerCertificates();
        System.out.println("Peer certificates:");
        for (Certificate certificate : certificates) {
            System.out.println(certificate);
        }
    }
}
