import javax.management.remote.rmi.RMIConnectorServer;
import java.io.IOException;

public class RMIConnectorServer_3 {
    public static void main(String[] args) {
        RMIConnectorServer server = null;
        try {
            server = new RMIConnectorServer();
            server.start();
            //...
            // Use the server
            //...
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (server!= null) {
                try {
                    server.stop();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
