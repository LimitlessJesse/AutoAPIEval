import javax.management.remote.JMXServiceURL;
import java.net.MalformedURLException;

public class JMXServiceURL_5 {
    public static void main(String[] args) throws MalformedURLException {
        JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:1099/jmxrmi");
        String protocol = url.getProtocol();
        System.out.println("Protocol: " + protocol);
    }
}
