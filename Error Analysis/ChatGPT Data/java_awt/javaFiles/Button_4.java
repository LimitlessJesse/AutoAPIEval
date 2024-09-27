import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button_4 {
    public static void main(String[] args) {
        Button button = new Button("Click Me");
        
        // Create ActionListener
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked");
            }
        };
        
        // Add the ActionListener to the button
        button.addActionListener(listener);
        
        // Remove the ActionListener from the button
        button.removeActionListener(listener);
    }
}
