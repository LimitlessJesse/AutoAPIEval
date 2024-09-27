import javax.swing.AbstractAction;

public class AbstractAction_4 {
    public static void main(String[] args) {
        AbstractAction action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action performed logic
            }
        };
        
        // Set the action as enabled
        action.setEnabled(true);
    }
}
