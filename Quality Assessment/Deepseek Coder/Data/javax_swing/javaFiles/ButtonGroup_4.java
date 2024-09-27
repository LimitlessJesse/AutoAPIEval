import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class ButtonGroup_4 {
    public static void main(String[] args) {
        ButtonGroup bg = new ButtonGroup();
        JRadioButton rb1 = new JRadioButton("Radio 1");
        JRadioButton rb2 = new JRadioButton("Radio 2");
        JRadioButton rb3 = new JRadioButton("Radio 3");

        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        rb1.setSelected(true);
        System.out.println("Before clearSelection: " + rb1.isSelected());

        bg.clearSelection();
        System.out.println("After clearSelection: " + rb1.isSelected());
    }
}
