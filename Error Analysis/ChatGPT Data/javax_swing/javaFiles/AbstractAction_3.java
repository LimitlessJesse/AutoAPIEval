import javax.swing.AbstractAction;

public class AbstractAction_3 {
    public static void main(String[] args) {
        AbstractAction action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object value = getValue("key");
                System.out.println("Value for key: " + value);
            }
        };
        
        action.actionPerformed(null);
    }
}
