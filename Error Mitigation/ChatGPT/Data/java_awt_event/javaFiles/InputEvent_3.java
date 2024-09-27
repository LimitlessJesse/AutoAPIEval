import java.awt.event.InputEvent;

public class InputEvent_3 {
    public static void main(String[] args) {
        InputEvent event = new InputEvent(null, 0, 0, 0, 0);
        
        int onmask = InputEvent.SHIFT_DOWN_MASK | InputEvent.BUTTON1_DOWN_MASK;
        int offmask = InputEvent.CTRL_DOWN_MASK;
        
        if ((event.getModifiersEx() & (onmask | offmask)) == onmask) {
            System.out.println("SHIFT and BUTTON1 are down, but CTRL is up");
        }
    }
}
