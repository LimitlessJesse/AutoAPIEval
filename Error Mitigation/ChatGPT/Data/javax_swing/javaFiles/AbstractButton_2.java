import javax.swing.AbstractButton;

public class AbstractButton_2 {
    public static void main(String[] args) {
        AbstractButton button = new AbstractButton() {
            // Implementing setActionCommand method
            public void setActionCommand(String actionCommand) {
                // Setting the action command for this button
                System.out.println("Action command set to: " + actionCommand);
            }
        };

        // Calling the setActionCommand method
        button.setActionCommand("click");
    }
}
