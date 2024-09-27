import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class ButtonGroup_3 {
    public static void main(String[] args) {
        ButtonGroup bg = new ButtonGroup();
        JRadioButton rb1 = new JRadioButton("Button 1");
        JRadioButton rb2 = new JRadioButton("Button 2");
        bg.add(rb1);
        bg.add(rb2);
        
        rb1.setSelected(true);
        System.out.println("Before clearSelection: " + rb1.isSelected());
        
        bg.clearSelection();
        System.out.println("After clearSelection: " + rb1.isSelected());
    }
}
