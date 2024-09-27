import javax.management.remote.JMXServiceURL;

public class JMXServiceURL_5 {
    public static void main(String[] args) {
        try {
            JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:1099/jmxrmi");
            int port = url.getPort();
            System.out.println("Port: " + port);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
