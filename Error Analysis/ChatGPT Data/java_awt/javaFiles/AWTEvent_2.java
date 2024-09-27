import java.awt.AWTEvent;

public class AWTEvent_2 {
    public static void main(String[] args) {
        AWTEvent event = new AWTEvent(new Object(), 0) {
            public int getID() {
                return 123; // Example value, you should replace this with actual implementation
            }
        };
        
        System.out.println("Event ID: " + event.getID());
    }
}
