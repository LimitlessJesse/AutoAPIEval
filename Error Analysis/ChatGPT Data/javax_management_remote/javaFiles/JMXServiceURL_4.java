import javax.management.remote.JMXServiceURL;

public class JMXServiceURL_4 {
    public static void main(String[] args) {
        try {
            JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:9999/jmxrmi");
            String path = url.getURLPath();
            System.out.println("URL Path: " + path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
