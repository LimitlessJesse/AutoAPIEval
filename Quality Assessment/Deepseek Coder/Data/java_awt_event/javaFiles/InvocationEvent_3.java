import java.awt.EventQueue;
import java.awt.event.InvocationEvent;
import java.awt.event.InvocationListener;

public class InvocationEvent_3 {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Create a new InvocationListener
                InvocationListener listener = new InvocationListener() {
                    public void invocationPerformed(InvocationEvent e) {
                        System.out.println("Invocation event dispatched");
                    }
                };

                // Create a new InvocationEvent
                InvocationEvent event = new InvocationEvent(this, listener);

                // Dispatch the event
                event.dispatch();
            }
        });
    }
}
