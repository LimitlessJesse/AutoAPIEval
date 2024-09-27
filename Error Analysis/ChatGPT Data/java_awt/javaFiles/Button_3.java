import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button_3 {
    public static void main(String[] args) {
        Button button = new Button("Click Me");
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });
    }
}
