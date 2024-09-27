import java.awt.dnd.DragGestureRecognizer;

public class DragGestureRecognizer_2 {
    public static void main(String[] args) {
        // Create an instance of a class that extends DragGestureRecognizer
        MyDragGestureRecognizer drag = new MyDragGestureRecognizer();
        // Call the unregisterListeners method
        drag.unregisterListeners();
    }
}

abstract class MyDragGestureRecognizer extends DragGestureRecognizer {
    protected void unregisterListeners() {
        // Implementation of unregisterListeners method
        System.out.println("Listeners unregistered");
    }
}
