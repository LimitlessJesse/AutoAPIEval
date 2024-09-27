import javax.management.remote.JMXServiceURL;

public class JMXServiceURL_8 {
    public static void main(String[] args) {
        try {
            JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:1099/jmxrmi");
            int hashCode = url.hashCode();
            System.out.println("Hash code: " + hashCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
