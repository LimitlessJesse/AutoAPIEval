import javax.net.ssl.HandshakeCompletedEvent;
import java.security.cert.Certificate;

public class HandshakeCompletedEvent_3 {
    public static void main(String[] args) {
        HandshakeCompletedEvent event = null; // Assume event is initialized
        Certificate[] certificates = event.getLocalCertificates();
        
        if(certificates != null) {
            for(Certificate cert : certificates) {
                System.out.println(cert);
            }
        } else {
            System.out.println("No local certificates found.");
        }
    }
}
