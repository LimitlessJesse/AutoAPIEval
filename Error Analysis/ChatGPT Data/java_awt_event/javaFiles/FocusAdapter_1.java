import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class FocusAdapter_1 {
    public static void main(String[] args) {
        // Create a focus adapter
        FocusAdapter focusAdapter = new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                System.out.println("Focus gained");
                // Add your custom logic here
            }
        };
        
        // Simulate focus gained event
        FocusEvent focusEvent = new FocusEvent(new Object(), FocusEvent.FOCUS_GAINED);
        focusAdapter.focusGained(focusEvent);
    }
}
