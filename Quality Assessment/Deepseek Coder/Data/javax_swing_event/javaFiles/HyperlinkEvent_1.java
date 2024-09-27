import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkEvent.EventType;

public class HyperlinkEvent_1 {
    public static void main(String[] args) {
        HyperlinkEvent event = new HyperlinkEvent(null, EventType.ACTIVATED, null, null, null, null, null);
        EventType eventType = event.getEventType();
        System.out.println(eventType);
    }
}
