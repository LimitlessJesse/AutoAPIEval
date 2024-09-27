import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JMXConnectorFactory_3 {
    public static void main(String[] args) {
        try {
            JMXServiceURL serviceURL = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:9999/jmxrmi");
            Map<String, Object> environment = new HashMap<>();
            
            JMXConnector connector = JMXConnectorFactory.connect(serviceURL, environment);
            
            // Use the JMXConnector object for further operations
            
            connector.close(); // Close the connection when done
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
