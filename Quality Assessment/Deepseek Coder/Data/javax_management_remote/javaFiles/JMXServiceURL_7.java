import javax.management.remote.JMXServiceURL;

public class JMXServiceURL_7 {
    public static void main(String[] args) {
        try {
            JMXServiceURL url1 = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:1099/jmxrmi");
            JMXServiceURL url2 = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:1099/jmxrmi");

            boolean isEqual = url1.equals(url2);

            System.out.println("Are the JMXServiceURLs equal? " + isEqual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
