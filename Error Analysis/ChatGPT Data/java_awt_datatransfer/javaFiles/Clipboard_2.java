import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;

public class Clipboard_2 {
    public static void main(String[] args) {
        Clipboard clipboard = new Clipboard("myClipboard");
        Transferable transferable = clipboard.getContents(null);
        System.out.println("Contents retrieved from clipboard: " + transferable);
    }
}
