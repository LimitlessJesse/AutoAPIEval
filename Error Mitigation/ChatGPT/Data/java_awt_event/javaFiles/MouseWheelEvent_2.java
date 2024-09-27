import java.awt.event.MouseWheelEvent;

public class MouseWheelEvent_2 {
    public static void main(String[] args) {
        MouseWheelEvent event = new MouseWheelEvent(null, 0, 0, 0, 0, 0, 0, false, MouseWheelEvent.WHEEL_UNIT_SCROLL, 1, 1);
        int scrollAmount = event.getScrollAmount();
        System.out.println("Scroll Amount: " + scrollAmount);
    }
}
