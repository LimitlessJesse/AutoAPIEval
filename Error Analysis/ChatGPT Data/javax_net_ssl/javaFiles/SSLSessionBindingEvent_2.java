import javax.net.ssl.SSLSessionBindingEvent;

public class SSLSessionBindingEvent_2 {
    public static void main(String[] args) {
        SSLSessionBindingEvent event = new SSLSessionBindingEvent(null, "session");
        String name = event.getName();
        System.out.println(name);
    }
}
