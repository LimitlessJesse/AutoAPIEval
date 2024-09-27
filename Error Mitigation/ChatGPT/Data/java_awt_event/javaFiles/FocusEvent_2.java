import java.awt.event.FocusEvent;

public class FocusEvent_2 {
    public static void main(String[] args) {
        FocusEvent focusEvent = new FocusEvent(null, FocusEvent.FOCUS_GAINED);
        boolean temporary = focusEvent.isTemporary();
        System.out.println("Is temporary focus change event: " + temporary);
    }
}
