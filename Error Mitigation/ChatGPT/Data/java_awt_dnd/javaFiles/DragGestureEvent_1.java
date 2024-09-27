import java.awt.dnd.DragGestureEvent;
import java.awt.event.InputEvent;

public class DragGestureEvent_1 {
    public static void main(String[] args) {
        // Create a DragGestureEvent object
        DragGestureEvent dragGestureEvent = new DragGestureEvent(null, 0, 0, 0, null);

        // Get the initial event that triggered the gesture
        InputEvent triggerEvent = dragGestureEvent.getTriggerEvent();

        // Print the triggering event
        System.out.println("Triggering event: " + triggerEvent);
    }
}
