import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class ButtonGroup_5 {
    public static void main(String[] args) {
        ButtonGroup group = new ButtonGroup();
        
        JRadioButton button1 = new JRadioButton("Option 1");
        JRadioButton button2 = new JRadioButton("Option 2");
        
        group.add(button1);
        group.add(button2);
        
        // Select button1
        button1.setSelected(true);
        
        // Clear the selection
        group.clearSelection();
        
        System.out.println("Button 1 selected: " + button1.isSelected());
        System.out.println("Button 2 selected: " + button2.isSelected());
    }
}
