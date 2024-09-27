import javax.swing.TransferHandler;
import javax.swing.JComponent;
import java.awt.event.InputEvent;

public class TransferHandler_1 {
    public static void main(String[] args) {
        JComponent comp = new JComponent() {}; // create a dummy JComponent
        InputEvent e = null; // create a dummy InputEvent
        int action = TransferHandler.COPY; // set the transfer action to COPY
        
        TransferHandler transferHandler = new TransferHandler() {};
        transferHandler.exportAsDrag(comp, e, action);
    }
}
