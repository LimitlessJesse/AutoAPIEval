import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class Clipboard_2 {
    public static void main(String[] args) {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable contents = clipboard.getContents(null);

        if (contents!= null) {
            try {
                String data = (String) contents.getTransferData(DataFlavor.stringFlavor);
                System.out.println(data);
            } catch (UnsupportedFlavorException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}
