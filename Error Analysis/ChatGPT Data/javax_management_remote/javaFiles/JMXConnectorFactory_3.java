import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import java.util.HashMap;
import java.util.Map;

public class JMXConnectorFactory_3 {
    public static void main(String[] args) {
        try {
            JMXServiceURL serviceURL = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:9999/jmxrmi");
            Map<String, Object> environment = new HashMap<>();
            
            JMXConnector jmxConnector = JMXConnectorFactory.newJMXConnector(serviceURL, environment);
            jmxConnector.connect();
            
            System.out.println("JMX Connector created and connected successfully");
            
            // Perform operations here
            
            jmxConnector.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
