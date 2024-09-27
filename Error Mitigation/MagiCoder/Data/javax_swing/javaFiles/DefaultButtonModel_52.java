import javax.swing.DefaultButtonModel;

public class DefaultButtonModel_52 {
    public static void main(String[] args) {
        DefaultButtonModel model = new DefaultButtonModel();
        model.setActionCommand("Click me");
        String actionCommand = model.getActionCommand();
        System.out.println(actionCommand);
    }
}
