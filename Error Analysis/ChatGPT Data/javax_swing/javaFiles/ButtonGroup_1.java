import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class ButtonGroup_1 {
    public static void main(String[] args) {
        ButtonGroup group = new ButtonGroup();

        JRadioButton button1 = new JRadioButton("Option 1");
        JRadioButton button2 = new JRadioButton("Option 2");

        group.add(button1);
        group.add(button2);

        // buttons are now part of the group
    }
}
