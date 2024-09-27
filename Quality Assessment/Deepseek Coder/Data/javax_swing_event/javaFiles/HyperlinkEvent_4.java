import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkEvent.EventType;

public class HyperlinkEvent_4 {
    public static void main(String[] args) {
        HyperlinkEvent event = new HyperlinkEvent(null, EventType.ACTIVATED, "http://example.com", "Click here");
        String description = event.getDescription();
        System.out.println(description);
    }
}
