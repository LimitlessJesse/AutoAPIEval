import javax.swing.ButtonGroup;
import javax.swing.AbstractButton;
import java.util.Enumeration;

public class ButtonGroup_2 {
    public static void main(String[] args) {
        ButtonGroup group = new ButtonGroup();
        
        // Add buttons to the group
        
        Enumeration<AbstractButton> buttons = group.getElements();
        while (buttons.hasMoreElements()) {
            AbstractButton button = buttons.nextElement();
            System.out.println(button.getText());
        }
    }
}
