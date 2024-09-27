import java.awt.event.InputEvent;

public class InputEvent_1 {
    public static void main(String[] args) {
        InputEvent event = new InputEvent() {
            // This is a dummy implementation, we only need the getModifiers() method
        };

        int modifiers = event.getModifiers();
        System.out.println("Modifiers: " + modifiers);
    }
}
