import java.awt.AWTEvent;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTEvent_3 {
    public static void main(String[] args) {
        // Create a new ActionListener
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Action performed");
            }
        };

        // Create a new ActionEvent
        ActionEvent event = new ActionEvent(listener, 0, "action");

        // Set the source of the event
        AWTEvent awtEvent = new AWTEvent(event) {
            @Override
            public Object getSource() {
                return event.getSource();
            }
        };

        // Print the source of the event
        System.out.println(awtEvent.getSource());
    }
}
