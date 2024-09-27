import java.awt.event.MouseEvent;

public class MouseEvent_1 {
    public static void main(String[] args) {
        MouseEvent event = new MouseEvent(null, 0, 0, 0, 100, 50, 1, false);
        int xPosition = event.getX();
        System.out.println("X Position: " + xPosition);
    }
}
