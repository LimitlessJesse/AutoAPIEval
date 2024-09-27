import java.awt.AWTEvent;

public class AWTEvent_3 {
    public static void main(String[] args) {
        AWTEvent event = new AWTEvent(new Object(), 123);
        int id = event.getID();
        System.out.println("Event ID: " + id);
    }
}
