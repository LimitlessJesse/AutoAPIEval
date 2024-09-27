import java.awt.event.MouseWheelEvent;

public class MouseWheelEvent_5 {
    public static void main(String[] args) {
        MouseWheelEvent event = new MouseWheelEvent(null, 0, 0, 0, false, false, false, false, 0, false, 1);
        int unitsToScroll = event.getUnitsToScroll();
        System.out.println("Units to scroll: " + unitsToScroll);
    }
}
