import java.awt.dnd.DragGestureRecognizer;

public class DragGestureRecognizer_4 {
    public static void main(String[] args) {
        DragGestureRecognizer dragGestureRecognizer = new DragGestureRecognizer();
        int actions = 1; // Example value for permitted source drag action(s)
        dragGestureRecognizer.setSourceActions(actions);
    }
}
