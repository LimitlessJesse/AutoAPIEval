import javax.swing.AbstractAction;

public class AbstractAction_5 {
    public static void main(String[] args) {
        AbstractAction action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action performed logic here
            }
        };
        
        // Set the action as enabled
        action.setEnabled(true);
    }
}
