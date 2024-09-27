import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JMXConnectorFactory_4 {
    public static void main(String[] args) {
        try {
            JMXServiceURL serviceURL = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:9999/jmxrmi");
            Map<String, Object> environment = new HashMap<>();
            
            JMXConnector jmxConnector = JMXConnectorFactory.newJMXConnector(serviceURL, environment);
            
            // The resultant client is not connected until its connect method is called
            // jmxConnector.connect();
            
            System.out.println("JMXConnector created successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
