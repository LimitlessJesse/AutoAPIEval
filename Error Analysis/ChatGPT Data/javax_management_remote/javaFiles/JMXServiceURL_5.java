import javax.management.remote.JMXServiceURL;

public class JMXServiceURL_5 {
    public static void main(String[] args) {
        JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:9999/server");
        String urlAsString = url.toString();
        System.out.println(urlAsString);
    }
}
