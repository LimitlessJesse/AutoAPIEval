import java.awt.event.FocusEvent;

public class FocusEvent_1 {
    public static void main(String[] args) {
        FocusEvent focusEvent = new FocusEvent(null, FocusEvent.FOCUS_GAINED);
        boolean isTemporary = focusEvent.isTemporary();
        System.out.println("Is the focus change temporary? " + isTemporary);
    }
}
