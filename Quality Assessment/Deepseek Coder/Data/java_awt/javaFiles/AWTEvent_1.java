import java.awt.AWTEvent;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTEvent_1 {
    public static void main(String[] args) {
        // Create an ActionListener
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the event
                AWTEvent event = (AWTEvent) e;
                
                // Get the event ID
                int eventID = event.getID();
                
                // Print the event ID
                System.out.println("Event ID: " + eventID);
            }
        };
        
        // Post an ActionEvent to the event queue
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(new ActionEvent(this, 0, "Test Event"), listener);
    }
}
