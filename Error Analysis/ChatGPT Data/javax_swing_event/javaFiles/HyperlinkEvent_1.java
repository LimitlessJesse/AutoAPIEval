import javax.swing.event.HyperlinkEvent;

public class HyperlinkEvent_1 {
    public static void main(String[] args) {
        HyperlinkEvent event = new HyperlinkEvent(this, HyperlinkEvent.EventType.ACTIVATED, url);
        String urlString = event.getURL().toString();
        System.out.println("URL: " + urlString);
    }
}
