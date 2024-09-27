import java.awt.event.MouseWheelEvent;

public class MouseWheelEvent_3 {
    public static void main(String[] args) {
        MouseWheelEvent event = new MouseWheelEvent(null, 0, 0, 0, 0, 0, 0, false, MouseWheelEvent.WHEEL_UNIT_SCROLL, 0, 0);
        int scrollType = event.getScrollType();
        System.out.println("Scroll Type: " + scrollType);
    }
}
