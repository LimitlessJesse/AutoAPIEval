import java.awt.event.MouseEvent;

public class MouseEvent_4 {
    public static void main(String[] args) {
        MouseEvent event = new MouseEvent(null, 0, 0, 0, 0, 0, 0, false);
        int clickCount = event.getClickCount();
        System.out.println("Number of clicks: " + clickCount);
    }
}
