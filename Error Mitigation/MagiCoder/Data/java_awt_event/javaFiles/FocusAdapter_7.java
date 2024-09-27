import java.awt.event.FocusEvent;
import java.awt.event.FocusAdapter;

public class FocusAdapter_7 {
    public static void main(String[] args) {
        // Create a FocusAdapter
        FocusAdapter focusAdapter = new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                // This method is called when a component gains the keyboard focus
                System.out.println("Focus gained");
            }
        };

        // You can use the focusAdapter in your code
        // For example, if you have a JTextField and you want to add the focusAdapter
        // JTextField textField = new JTextField();
        // textField.addFocusListener(focusAdapter);
    }
}
