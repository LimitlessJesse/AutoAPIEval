import javax.swing.JComponent;
import javax.swing.TransferHandler;
import java.awt.datatransfer.Transferable;

public class TransferHandler_5 {
    public static void main(String[] args) {
        JComponent source = new JComponent() {}; // Creating a dummy JComponent for example
        Transferable data = null; // Setting Transferable data to null for example
        int action = TransferHandler.COPY; // Setting action to COPY for example

        exportDone(source, data, action);
    }

    public static void exportDone(JComponent source, Transferable data, int action) {
        // Perform actions based on the parameters received
        System.out.println("Export done successfully with source: " + source + ", data: " + data + ", action: " + action);
    }
}
