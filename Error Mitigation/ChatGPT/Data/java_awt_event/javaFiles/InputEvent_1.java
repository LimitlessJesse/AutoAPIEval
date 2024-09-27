import java.awt.event.InputEvent;

public class InputEvent_1 {
    public static void main(String[] args) {
        InputEvent event = new InputEvent(null, 0, 0, 0, 0);
        int modifiers = event.getModifiers();
        System.out.println("Modifiers: " + modifiers);
    }
}
