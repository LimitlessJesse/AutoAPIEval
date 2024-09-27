import javax.swing.TransferHandler;
import javax.swing.JComponent;
import java.awt.datatransfer.Clipboard;

public class TransferHandler_2 {
    public static void main(String[] args) {
        JComponent component = new JComponent(); // create a JComponent
        Clipboard clipboard = new Clipboard(); // create a Clipboard
        
        TransferHandler transferHandler = new TransferHandler();
        try {
            transferHandler.exportToClipboard(component, clipboard, TransferHandler.COPY);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
