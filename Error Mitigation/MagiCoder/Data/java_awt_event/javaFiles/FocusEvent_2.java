import java.awt.Component;
import java.awt.event.FocusEvent;

public class FocusEvent_2 {
    public static void main(String[] args) {
        Component component1 = new Component();
        Component component2 = new Component();

        FocusEvent focusEvent = new FocusEvent(component1, FocusEvent.FOCUS_GAINED);
        Component oppositeComponent = focusEvent.getOppositeComponent();

        if (oppositeComponent == component2) {
            System.out.println("The opposite component is correct.");
        } else {
            System.out.println("The opposite component is incorrect.");
        }
    }
}
