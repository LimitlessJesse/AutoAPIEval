import java.awt.event.MouseWheelEvent;

public class MouseWheelEvent_3 {
    public static void main(String[] args) {
        MouseWheelEvent event = new MouseWheelEvent(null, 0, 0, 0, 1, 1, 1, false, MouseWheelEvent.WHEEL_UNIT_SCROLL);
        int rotation = event.getWheelRotation();
        System.out.println("Wheel rotation: " + rotation);
    }
}
