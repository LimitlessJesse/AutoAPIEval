import javax.management.remote.JMXServiceURL;

public class JMXServiceURL_10 {
    public static void main(String[] args) {
        try {
            JMXServiceURL url1 = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:1099/jmxrmi");
            JMXServiceURL url2 = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:1099/jmxrmi");
            JMXServiceURL url3 = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:1099/jmxrmi");

            System.out.println(url1.equals(url2)); // true
            System.out.println(url1.equals(url3)); // false
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
