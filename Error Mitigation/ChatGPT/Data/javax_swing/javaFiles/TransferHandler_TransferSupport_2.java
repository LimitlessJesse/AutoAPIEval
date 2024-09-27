import javax.swing.TransferHandler.TransferSupport;
import java.awt.Component;

public class TransferHandler_TransferSupport_2 {
    public static void main(String[] args) {
        TransferSupport transferSupport = new TransferSupport(new Component() {});
        Component targetComponent = transferSupport.getComponent();
        System.out.println("Target Component: " + targetComponent);
    }
}
