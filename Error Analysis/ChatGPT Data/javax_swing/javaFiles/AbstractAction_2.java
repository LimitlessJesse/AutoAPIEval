import javax.swing.AbstractAction;

public class AbstractAction_2 {
    public static void main(String[] args) {
        AbstractAction action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                putValue("key", "value");
            }
        };
        action.actionPerformed(null);
    }
}
