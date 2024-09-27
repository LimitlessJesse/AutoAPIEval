import java.awt.AWTEvent;
import java.awt.event.AWTEventListenerProxy;

public class AWTEventListenerProxy_1 {
    public static void main(String[] args) {
        AWTEventListenerProxy proxy = new AWTEventListenerProxy() {
            @Override
            public void eventDispatched(AWTEvent event) {
                // Forward the AWT event to the listener delegate
                System.out.println("Event dispatched: " + event);
            }
        };
        
        // Simulate an AWT event
        AWTEvent event = new AWTEvent(new Object(), 0) {};
        proxy.eventDispatched(event);
    }
}
