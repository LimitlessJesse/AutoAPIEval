import javax.management.remote.JMXServiceURL;

public class JMXServiceURL_3 {
    public static void main(String[] args) {
        JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:9999/jmxrmi");
        int port = url.getPort();
        System.out.println("Port: " + port);
    }
}
