import javax.swing.AbstractAction;

public class AbstractAction_2 {
    public static void main(String[] args) {
        AbstractAction action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform action here
            }
        };
        
        action.putValue("key1", "value1");
        action.putValue("key2", 123);
    }
}
