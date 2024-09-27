import java.awt.event.MouseEvent;

public class MouseEvent_2 {
    public static void main(String[] args) {
        MouseEvent event = new MouseEvent(null, 0, 0, 0, 100, 50, 1, false);
        int yPosition = event.getY();
        System.out.println("Vertical position relative to the component: " + yPosition);
    }
}
