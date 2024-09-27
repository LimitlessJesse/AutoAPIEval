import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class FocusAdapter_4 {
    public static void main(String[] args) {
        // Create a FocusAdapter
        FocusAdapter focusAdapter = new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                // This method is called when a component loses the keyboard focus
                System.out.println("Focus lost");
            }
        };

        // You can use the focusAdapter in your code
        // For example, if you have a JTextField and you want to listen for focus lost events
        // jTextField.addFocusListener(focusAdapter);
    }
}
