import javax.management.remote.JMXServiceURL;

public class JMXServiceURL_3 {
    public static void main(String[] args) {
        try {
            JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:1099/jmxrmi");
            String protocol = url.getProtocol();
            System.out.println("Protocol: " + protocol);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
