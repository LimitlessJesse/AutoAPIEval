import java.awt.event.FocusEvent;
import java.awt.Component;

public class FocusEvent_1 {
    public static void main(String[] args) {
        Component sourceComponent = new Component() {
        };
        
        Component oppositeComponent = new Component() {
        };
        
        FocusEvent focusEvent = new FocusEvent(sourceComponent, FocusEvent.FOCUS_GAINED, true, oppositeComponent);
        
        Component result = focusEvent.getOppositeComponent();
        System.out.println("Opposite Component: " + result);
    }
}
