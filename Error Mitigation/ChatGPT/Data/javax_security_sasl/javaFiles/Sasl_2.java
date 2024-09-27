import javax.security.sasl.Sasl;
import javax.security.sasl.SaslException;
import javax.security.sasl.SaslServer;
import javax.security.sasl.CallbackHandler;
import java.util.Map;

public class Sasl_2 {
    public static void main(String[] args) {
        try {
            String mechanism = "DIGEST-MD5";
            String protocol = "ldap";
            String serverName = "example.com";
            Map<String, ?> props = null;
            CallbackHandler cbh = null;

            SaslServer saslServer = Sasl.createSaslServer(mechanism, protocol, serverName, props, cbh);
            if (saslServer != null) {
                System.out.println("SaslServer created successfully");
            } else {
                System.out.println("Failed to create SaslServer");
            }
        } catch (SaslException e) {
            System.out.println("Error creating SaslServer: " + e.getMessage());
        }
    }
}
