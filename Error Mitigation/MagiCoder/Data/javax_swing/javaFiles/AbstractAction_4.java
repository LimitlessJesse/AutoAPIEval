import javax.swing.AbstractAction;
import javax.swing.Action;

public class AbstractAction_4 {
    public static void main(String[] args) {
        AbstractAction action = new AbstractAction() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // Implement actionPerformed method
            }
        };

        action.setEnabled(false);
    }
}
