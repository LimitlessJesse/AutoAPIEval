import java.awt.event.MouseWheelEvent;

public class MouseWheelEvent_3 {
    public static void main(String[] args) {
        MouseWheelEvent event = new MouseWheelEvent(new Object(), 0, 0, 0, 0, 0, 0, false, 0, 0, 0);
        int scrollType = event.getScrollType();
        System.out.println("Scroll Type: " + scrollType);
    }
}
