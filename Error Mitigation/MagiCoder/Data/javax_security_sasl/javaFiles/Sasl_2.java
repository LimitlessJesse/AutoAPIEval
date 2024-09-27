import javax.security.sasl.Sasl;
import javax.security.sasl.SaslServer;
import javax.security.auth.callback.CallbackHandler;
import java.util.Map;

public class Sasl_2 {
    public static void main(String[] args) {
        String mechanism = "PLAIN";
        String protocol = "PLAIN";
        String serverName = "localhost";
        Map<String,?> props = null;
        CallbackHandler cbh = null;

        SaslServer saslServer = Sasl.createSaslServer(mechanism, protocol, serverName, props, cbh);

        // Use the saslServer as needed...
    }
}
