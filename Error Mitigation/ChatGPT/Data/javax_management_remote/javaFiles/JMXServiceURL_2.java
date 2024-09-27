import javax.management.remote.JMXServiceURL;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class JMXServiceURL_2 {
    public static void main(String[] args) {
        JMXServiceURL serviceURL = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:9999/jmxrmi");
        String host = serviceURL.getHost();
        System.out.println("Host: " + host);
    }
}
