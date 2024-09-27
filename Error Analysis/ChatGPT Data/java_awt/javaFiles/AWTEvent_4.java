import java.awt.AWTEvent;

public class AWTEvent_4 {
    public static void main(String[] args) {
        AWTEvent event = new AWTEvent();
        
        // Consume the event
        event.consume();
        
        System.out.println("Event consumed.");
    }
}
