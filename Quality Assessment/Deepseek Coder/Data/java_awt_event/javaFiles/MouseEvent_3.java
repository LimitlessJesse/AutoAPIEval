import java.awt.event.MouseEvent;

public class MouseEvent_3 {
    public static void main(String[] args) {
        MouseEvent event = new MouseEvent(null, 0, 0, 0, 0, 0, 0, false, 0);
        int button = event.getButton();
        System.out.println("Button: " + button);
    }
}
