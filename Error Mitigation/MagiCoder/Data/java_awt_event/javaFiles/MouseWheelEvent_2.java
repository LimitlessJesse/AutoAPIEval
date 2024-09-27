import java.awt.event.MouseWheelEvent;

public class MouseWheelEvent_2 {
    public static void main(String[] args) {
        MouseWheelEvent event = new MouseWheelEvent(null, 0, 0, 0, 1, 1, 1, false, MouseWheelEvent.WHEEL_UNIT_SCROLL);
        int unitsToScroll = event.getUnitsToScroll();
        System.out.println("Units to scroll: " + unitsToScroll);
    }
}
