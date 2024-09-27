import java.awt.event.MouseEvent;

public class MouseEvent_1 {
    public static void main(String[] args) {
        MouseEvent event = new MouseEvent(null, 0, 0, 0, 100, 100, 1, false);
        int x = event.getX();
        System.out.println("The x position of the mouse event is: " + x);
    }
}
