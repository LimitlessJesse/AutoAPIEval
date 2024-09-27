import java.awt.Component;
import java.awt.event.FocusEvent;

public class FocusEvent_1 {
    public static void main(String[] args) {
        Component component1 = new Component() {};
        Component component2 = new Component() {};
        
        FocusEvent focusGainedEvent = new FocusEvent(component1, FocusEvent.FOCUS_GAINED);
        Component oppositeComponent = focusGainedEvent.getOppositeComponent();
        System.out.println("Opposite Component for FOCUS_GAINED event: " + oppositeComponent);
        
        FocusEvent focusLostEvent = new FocusEvent(component2, FocusEvent.FOCUS_LOST);
        oppositeComponent = focusLostEvent.getOppositeComponent();
        System.out.println("Opposite Component for FOCUS_LOST event: " + oppositeComponent);
    }
}
