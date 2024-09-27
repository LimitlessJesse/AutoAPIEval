import java.awt.event.FocusEvent;

public class FocusEvent_2 {
    public static void main(String[] args) {
        // Creating a FocusEvent object
        FocusEvent focusEvent = new FocusEvent(null, FocusEvent.FOCUS_GAINED);

        // Checking if the focus event is temporary
        boolean isTemp = focusEvent.isTemporary();

        // Printing the result
        System.out.println("Is temporary event: " + isTemp);
    }
}
