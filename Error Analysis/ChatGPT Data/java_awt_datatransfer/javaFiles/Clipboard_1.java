import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;

public class Clipboard_1 {
    
    public static void main(String[] args) {
        Clipboard clipboard = new Clipboard("myClipboard");
        Transferable contents = null; // Initialize with your Transferable object
        ClipboardOwner owner = null; // Initialize with your ClipboardOwner object
        
        clipboard.setContents(contents, owner);
    }
}
