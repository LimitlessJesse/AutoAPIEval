import java.util.EventObject;

public class EventObject_2 {
    public static void main(String[] args) {
        // Create a new EventObject
        EventObject event = new EventObject("Source");

        // Get the source of the event
        Object source = event.getSource();

        // Print the source
        System.out.println("Source: " + source);
    }
}
