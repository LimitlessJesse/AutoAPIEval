import javax.swing.*;
import java.awt.datatransfer.Clipboard;
import javax.swing.TransferHandler;

public class TransferHandler_1 {
    public static void main(String[] args) {
        // Create a JComponent
        JComponent comp = new JLabel("Hello, World!");

        // Get the system clipboard
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

        // Define the action (COPY, MOVE, or COPY_OR_MOVE)
        int action = TransferHandler.COPY;

        // Call the exportToClipboard method
        exportToClipboard(comp, clipboard, action);
    }

    public static void exportToClipboard(JComponent comp, Clipboard clipboard, int action) {
        TransferHandler transferHandler = comp.getTransferHandler();
        if (transferHandler != null) {
            transferHandler.exportToClipboard(comp, clipboard, action);
        }
    }
}
