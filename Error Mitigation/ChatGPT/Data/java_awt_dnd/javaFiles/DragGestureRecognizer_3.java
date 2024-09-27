import java.awt.Component;
import java.awt.dnd.DragGestureRecognizer;

public class DragGestureRecognizer_3 {
    public static void main(String[] args) {
        DragGestureRecognizer dragGestureRecognizer = new DragGestureRecognizer() {
            @Override
            public void setComponent(Component c) {
                // Implementation of setting the Component
            }
        };
        
        Component component = new Component() {
            // Implementation of Component
        };
        
        dragGestureRecognizer.setComponent(component);
    }
}
