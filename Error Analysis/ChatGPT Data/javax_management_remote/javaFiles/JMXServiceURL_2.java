import javax.management.remote.JMXServiceURL;

public class JMXServiceURL_2 {
    public static void main(String[] args) {
        JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:9999/jmxrmi");
        String host = url.getHost();
        System.out.println("Host: " + host);
    }
}
