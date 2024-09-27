import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;

public class Clipboard_2 {
    public static void main(String[] args) {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable contents = clipboard.getContents(null);
        if (contents != null) {
            System.out.println("Contents of clipboard: " + contents);
        } else {
            System.out.println("Clipboard is empty");
        }
    }
}
