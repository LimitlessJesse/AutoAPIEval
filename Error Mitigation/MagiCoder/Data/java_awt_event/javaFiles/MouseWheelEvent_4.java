import java.awt.event.MouseWheelEvent;

public class MouseWheelEvent_4 {
    public static void main(String[] args) {
        MouseWheelEvent event = new MouseWheelEvent(null, 0, 0, 0, 0, 0, 0, false, MouseWheelEvent.WHEEL_UNIT_SCROLL);
        int scrollAmount = event.getScrollAmount();
        System.out.println("Scroll Amount: " + scrollAmount);
    }
}
