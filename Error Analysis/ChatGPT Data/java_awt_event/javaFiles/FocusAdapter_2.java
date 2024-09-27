import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class FocusAdapter_2 {
    public static void main(String[] args) {
        // Creating a focus adapter
        FocusAdapter focusAdapter = new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                // Your implementation when focus is lost
                System.out.println("Focus Lost");
            }
        };

        // Simulating focus lost event
        FocusEvent focusEvent = new FocusEvent(new Object(), FocusEvent.FOCUS_LOST);
        focusAdapter.focusLost(focusEvent);
    }
}
