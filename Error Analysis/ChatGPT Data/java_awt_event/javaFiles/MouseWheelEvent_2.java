import java.awt.event.MouseWheelEvent;

public class MouseWheelEvent_2 {
    public static void main(String[] args) {
        // Create a MouseWheelEvent object for demonstration
        MouseWheelEvent event = new MouseWheelEvent(new Object(), 0, 0, 0, 0, 0, 0, 0, false, 0, 0);
        
        // Get the scroll amount from the MouseWheelEvent object
        int scrollAmount = event.getScrollAmount();
        
        // Print the scroll amount
        System.out.println("Scroll amount: " + scrollAmount);
    }
}
