import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import java.util.HashMap;
import java.util.Map;

public class JMXConnectorFactory_1 {
    public static void main(String[] args) throws Exception {
        JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:1099/jmxrmi");
        Map<String, String[]> env = new HashMap<>();
        JMXConnector connector = JMXConnectorFactory.newJMXConnector(url, env);
        connector.connect();
        //...
        // You can use the JMXConnector object here to manage the JMX connection
        //...
        connector.close();
    }
}
