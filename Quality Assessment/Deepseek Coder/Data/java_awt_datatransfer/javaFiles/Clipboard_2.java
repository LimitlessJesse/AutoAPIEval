import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class Clipboard_2 {
    public static void main(String[] args) {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        try {
            Transferable contents = clipboard.getContents(null);
            if (contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                String result = (String) contents.getTransferData(DataFlavor.stringFlavor);
                System.out.println(result);
            }
        } catch (UnsupportedFlavorException | IOException ex) {
            ex.printStackTrace();
        }
    }
}
