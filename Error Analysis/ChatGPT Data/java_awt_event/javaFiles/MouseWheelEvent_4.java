import java.awt.event.MouseWheelEvent;

public class MouseWheelEvent_4 {
    public static void main(String[] args) {
        MouseWheelEvent event = new MouseWheelEvent(new Object(), 0, 0, 0, 0, 0, 0, false, MouseWheelEvent.WHEEL_UNIT_SCROLL, 1, 1);
        int unitsToScroll = event.getUnitsToScroll();
        System.out.println("Units to scroll: " + unitsToScroll);
    }
}
