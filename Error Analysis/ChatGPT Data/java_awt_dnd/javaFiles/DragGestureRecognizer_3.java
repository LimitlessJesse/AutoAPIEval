import java.awt.dnd.DragGestureRecognizer;

public class DragGestureRecognizer_3 {
    public static void main(String[] args) {
        DragGestureRecognizer dragGestureRecognizer = new DragGestureRecognizer() {
            @Override
            public int getSourceActions() {
                // Add your implementation here
                return 0;
            }
        };
        System.out.println("Source Actions: " + dragGestureRecognizer.getSourceActions());
    }
}
