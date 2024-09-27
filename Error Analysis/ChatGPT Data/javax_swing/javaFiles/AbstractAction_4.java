import javax.swing.AbstractAction;

public class AbstractAction_4 {
    public static void main(String[] args) {
        AbstractAction action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform action here
            }
        };

        action.setEnabled(true); // Enables the action
    }
}
