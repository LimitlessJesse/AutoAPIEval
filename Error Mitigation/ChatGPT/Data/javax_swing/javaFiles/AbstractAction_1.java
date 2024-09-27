import javax.swing.AbstractAction;

public class AbstractAction_1 {
    public static void main(String[] args) {
        AbstractAction action = new AbstractAction() {
            @Override
            public Object getValue(String key) {
                // Implementing the getValue method
                if (key.equals("example")) {
                    return "This is an example value";
                } else {
                    return null;
                }
            }
        };

        // Using the getValue method
        Object value = action.getValue("example");
        System.out.println("Value: " + value);
    }
}
