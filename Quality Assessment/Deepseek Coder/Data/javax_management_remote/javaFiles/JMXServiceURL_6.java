import javax.management.remote.JMXServiceURL;

public class JMXServiceURL_6 {
    public static void main(String[] args) {
        try {
            JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:1099/jmxrmi");
            System.out.println(url.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
