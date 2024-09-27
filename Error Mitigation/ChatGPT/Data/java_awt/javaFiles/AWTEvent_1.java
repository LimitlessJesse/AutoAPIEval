import java.awt.AWTEvent;

public class AWTEvent_1 {
    public static void main(String[] args) {
        AWTEvent event = new AWTEvent(new Object(), 1) {
            // Implementing the getID method
            public int getID() {
                return this.getID();
            }
        };
        System.out.println("Event ID: " + event.getID());
    }
}
