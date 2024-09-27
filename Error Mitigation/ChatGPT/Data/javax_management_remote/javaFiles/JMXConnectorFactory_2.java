import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import java.io.IOException;

public class JMXConnectorFactory_2 {
    public static void main(String[] args) {
        try {
            JMXServiceURL serviceURL = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:9999/jmxrmi");
            JMXConnector jmxConnector = JMXConnectorFactory.connect(serviceURL);
            System.out.println("JMXConnector connected successfully");
            // Use the JMXConnector object for further operations
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
