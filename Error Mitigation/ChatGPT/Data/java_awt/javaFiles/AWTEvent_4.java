import java.awt.AWTEvent;

public class AWTEvent_4 {
    public static void main(String[] args) {
        AWTEvent event = new AWTEvent(new Object(), 0) {
            // Override the isConsumed method
            @Override
            protected boolean isConsumed() {
                return super.isConsumed();
            }
        };
        
        // Check if the event is consumed
        System.out.println("Is event consumed? " + event.isConsumed());
    }
}
