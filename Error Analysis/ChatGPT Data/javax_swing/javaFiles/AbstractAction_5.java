import javax.swing.AbstractAction;

public class AbstractAction_5 {
    public static void main(String[] args) {
        MyAction action = new MyAction();
        action.setEnabled(false);
        System.out.println("Action enabled: " + action.isEnabled());
    }
}

class MyAction extends AbstractAction {
    // Implement any necessary methods here
    
}
