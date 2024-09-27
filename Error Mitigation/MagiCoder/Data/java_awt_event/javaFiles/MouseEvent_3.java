import java.awt.event.MouseEvent;

public class MouseEvent_3 {
    public static void main(String[] args) {
        MouseEvent event = new MouseEvent(null, 0, 0, 0, 0, 1, false, 1);
        int clickCount = event.getClickCount();
        System.out.println("Number of clicks: " + clickCount);
    }
}
