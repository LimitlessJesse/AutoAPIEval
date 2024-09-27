import javax.management.remote.JMXServiceURL;

public class JMXServiceURL_4 {
    public static void main(String[] args) {
        JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:9999/server");
        String urlPath = url.getURLPath();
        System.out.println("URL Path: " + urlPath);
    }
}
