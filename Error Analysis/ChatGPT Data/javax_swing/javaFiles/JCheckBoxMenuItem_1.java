import javax.swing.JCheckBoxMenuItem;

public class JCheckBoxMenuItem_1 {
    public static void main(String[] args) {
        JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("Option 1");
        checkBoxMenuItem.setState(true);
        
        System.out.println("Checkbox menu item state: " + checkBoxMenuItem.getState());
    }
}
