import javax.swing.TransferHandler.TransferSupport;
import javax.swing.JButton;

public class TransferHandler_TransferSupport_2 {
    public static void main(String[] args) {
        TransferSupport support = new TransferSupport(new JButton(), "Hello");
        JButton component = (JButton) support.getComponent();
        System.out.println("Component: " + component.getText());
    }
}
