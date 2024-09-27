import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class ButtonGroup_1 {
    public static void main(String[] args) {
        ButtonGroup group = new ButtonGroup();
        AbstractButton button1 = new AbstractButton();
        AbstractButton button2 = new AbstractButton();
        
        group.add(button1);
        group.add(button2);
    }
}
