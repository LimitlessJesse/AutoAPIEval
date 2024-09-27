import javax.net.ssl.SSLSessionBindingEvent;

public class SSLSessionBindingEvent_1 {
    public static void main(String[] args) {
        SSLSessionBindingEvent event = new SSLSessionBindingEvent("name", "value");
        String name = event.getName();
        System.out.println("Name: " + name);
    }
}
