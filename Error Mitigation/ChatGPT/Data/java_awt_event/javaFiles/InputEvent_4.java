import java.awt.event.InputEvent;

public class InputEvent_4 {
    public static void main(String[] args) {
        InputEvent event = new InputEvent(null, 0, 0, 0, 0);
        boolean isAltDown = event.isAltDown();
        System.out.println("Alt modifier is down: " + isAltDown);
    }
}
