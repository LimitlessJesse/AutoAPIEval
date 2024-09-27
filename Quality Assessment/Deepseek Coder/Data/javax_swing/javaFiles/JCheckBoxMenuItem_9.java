import javax.swing.*;

public class JCheckBoxMenuItem_9 {
    public static void main(String[] args) {
        JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("CheckBox");
        
        // Set the initial state of the checkbox
        checkBoxMenuItem.setState(true);
        
        // Get the state of the checkbox
        boolean state = checkBoxMenuItem.getState();
        
        // Print the state of the checkbox
        System.out.println("State of the checkbox: " + state);
    }
}
