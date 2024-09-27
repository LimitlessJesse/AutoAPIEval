import javax.swing.ButtonGroup;
import javax.swing.AbstractButton;
import java.util.Enumeration;

public class ButtonGroup_3 {
    public static void main(String[] args) {
        ButtonGroup buttonGroup = new ButtonGroup();
        
        Enumeration<AbstractButton> elements = buttonGroup.getElements();
        while (elements.hasMoreElements()) {
            AbstractButton button = elements.nextElement();
            System.out.println(button.getText());
        }
    }
}
