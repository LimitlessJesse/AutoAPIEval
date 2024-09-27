import javax.swing.TransferHandler;
import javax.swing.JComponent;
import java.awt.event.InputEvent;

public class TransferHandler_3 {
    public static void main(String[] args) {
        JComponent comp = new JComponent(); // create a JComponent object
        InputEvent e = new InputEvent(comp, 0, 0, 0, 0); // create an InputEvent object
        int action = TransferHandler.COPY; // define the action (you can use TransferHandler.COPY, TransferHandler.MOVE, or TransferHandler.LINK)

        TransferHandler.exportAsDrag(comp, e, action); // call the exportAsDrag method
    }
}
