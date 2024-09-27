import javax.swing.event.HyperlinkEvent;

public class HyperlinkEvent_2 {
    
    public static void main(String[] args) {
        HyperlinkEvent event = new HyperlinkEvent(new Object(), HyperlinkEvent.EventType.ACTIVATED, null, "https://www.example.com");
        System.out.println(event.getDescription());
    }
}
