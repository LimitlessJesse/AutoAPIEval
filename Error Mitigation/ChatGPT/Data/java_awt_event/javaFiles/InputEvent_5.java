import java.awt.event.InputEvent;

public class InputEvent_5 {
    public static void main(String[] args) {
        InputEvent event = new InputEvent(null, 0, 0, 0, 0);
        boolean isShiftDown = event.isShiftDown();
        System.out.println("Is Shift Down: " + isShiftDown);
    }
}
