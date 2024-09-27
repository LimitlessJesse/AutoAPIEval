import javax.management.remote.JMXConnectorServerFactory;
import javax.management.remote.JMXServiceURL;
import javax.management.MBeanServer;
import java.io.IOException;
import java.util.Map;

public class JMXConnectorServerFactory_3 {
    public static void main(String[] args) {
        JMXServiceURL serviceURL = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:9999/server");
        Map<String, Object> environment = null;
        MBeanServer mbeanServer = null;

        try {
            JMXConnectorServerFactory.newJMXConnectorServer(serviceURL, environment, mbeanServer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
