import javax.management.remote.JMXServiceURL;

public class JMXServiceURL_3 {
    public static void main(String[] args) {
        try {
            JMXServiceURL url = new JMXServiceURL("rmi", "", 0);
            int port = url.getPort();
            System.out.println("Port number: " + port);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
