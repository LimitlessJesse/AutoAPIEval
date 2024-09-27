import javax.swing.event.HyperlinkEvent;
import java.net.URL;

public class HyperlinkEvent_1 {
    public static void main(String[] args) {
        HyperlinkEvent event = new HyperlinkEvent(this, HyperlinkEvent.EventType.ACTIVATED, new URL("https://www.example.com"));
        URL url = event.getURL();
        System.out.println("URL: " + url);
    }
}
