import java.awt.event.MouseWheelEvent;

public class MouseWheelEvent_2 {
    public static void main(String[] args) {
        MouseWheelEvent event = new MouseWheelEvent(null, 0, 0, 0, 0, 0, 0, false, 1);
        int rotation = event.getWheelRotation();
        System.out.println("Wheel rotation: " + rotation);
    }
}
