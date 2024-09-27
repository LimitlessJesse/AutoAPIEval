import java.awt.event.MouseWheelEvent;

public class MouseWheelEvent_1 {
    public static void main(String[] args) {
        MouseWheelEvent event = new MouseWheelEvent(null, 0, 0, 0, 0, 0, 0, false, 0, 0, 0);
        int wheelRotation = event.getWheelRotation();
        System.out.println("Wheel Rotation: " + wheelRotation);
    }
}
