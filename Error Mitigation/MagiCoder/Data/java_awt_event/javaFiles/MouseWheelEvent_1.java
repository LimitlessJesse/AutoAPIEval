import java.awt.event.MouseWheelEvent;

public class MouseWheelEvent_1 {
    public static void main(String[] args) {
        MouseWheelEvent event = new MouseWheelEvent(null, 0, 0, 0, 0, 0, 0, false, MouseWheelEvent.WHEEL_UNIT_SCROLL);
        int scrollType = event.getScrollType();
        System.out.println("Scroll Type: " + scrollType);
    }
}
