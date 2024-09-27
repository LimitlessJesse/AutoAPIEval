import javax.management.remote.JMXServiceURL;
import java.net.MalformedURLException;

public class JMXServiceURL_4 {
    public static void main(String[] args) throws MalformedURLException {
        JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:1099/jmxrmi");
        int port = url.getPort();
        System.out.println("Port: " + port);
    }
}
