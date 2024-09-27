import javax.management.remote.JMXServiceURL;

public class JMXServiceURL_1 {
    public static void main(String[] args) {
        JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:9999/jmxrmi");
        String protocol = url.getProtocol();
        System.out.println("Protocol: " + protocol);
    }
}
