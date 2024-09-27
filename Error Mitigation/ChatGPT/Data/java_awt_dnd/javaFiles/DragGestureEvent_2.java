import java.awt.Component;
import java.awt.dnd.DragGestureEvent;

public class DragGestureEvent_2 {
    public static void main(String[] args) {
        Component component = new Component() {};
        DragGestureEvent dragGestureEvent = new DragGestureEvent(component, 0, 0, 0, null);
        
        Component associatedComponent = dragGestureEvent.getComponent();
        System.out.println("Associated Component: " + associatedComponent);
    }
}
