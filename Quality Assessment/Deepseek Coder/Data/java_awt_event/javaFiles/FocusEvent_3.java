import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocusEvent_3 {
    public static void main(String[] args) {
        FocusListener listener = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                System.out.println("Focus gained");
            }

            @Override
            public void focusLost(FocusEvent e) {
                System.out.println("Focus lost");
                System.out.println("Is temporary: " + e.isTemporary());
            }
        };

        // Assuming we have a component here, we add the listener
        // component.addFocusListener(listener);
    }
}
