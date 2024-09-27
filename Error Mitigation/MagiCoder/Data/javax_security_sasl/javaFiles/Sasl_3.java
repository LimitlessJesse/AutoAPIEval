import javax.security.sasl.Sasl;
import javax.security.sasl.SaslClient;
import javax.security.sasl.SaslException;
import javax.security.auth.callback.CallbackHandler;
import java.util.Map;

public class Sasl_3 {
    public static void main(String[] args) {
        try {
            String[] mechanisms = {"PLAIN"};
            String protocol = "PLAIN";
            String serverName = "localhost";
            String authzId = "user";
            Map<String,?> props = null;
            CallbackHandler cbh = null;

            SaslClient saslClient = Sasl.createSaslClient(mechanisms, protocol, serverName, authzId, props, cbh);

            System.out.println("SaslClient created successfully: " + saslClient);
        } catch (SaslException e) {
            e.printStackTrace();
        }
    }
}
