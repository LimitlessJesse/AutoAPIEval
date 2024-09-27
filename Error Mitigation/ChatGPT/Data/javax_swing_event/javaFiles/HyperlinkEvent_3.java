import javax.swing.event.HyperlinkEvent;

public class HyperlinkEvent_3 {
    public static void main(String[] args) {
        HyperlinkEvent event = new HyperlinkEvent(this, HyperlinkEvent.EventType.ACTIVATED, null, "https://www.example.com");
        String description = event.getDescription();
        System.out.println("Description: " + description);
    }
}
