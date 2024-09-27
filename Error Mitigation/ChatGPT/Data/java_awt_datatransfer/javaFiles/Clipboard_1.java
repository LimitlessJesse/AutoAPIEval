import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;

public class Clipboard_1 {
    public static void main(String[] args) {
        Clipboard clipboard = new Clipboard("exampleClipboard");
        Transferable contents = new Transferable() {
            @Override
            public Object getTransferData(DataFlavor flavor) {
                return null;
            }

            @Override
            public DataFlavor[] getTransferDataFlavors() {
                return new DataFlavor[0];
            }

            @Override
            public boolean isDataFlavorSupported(DataFlavor flavor) {
                return false;
            }
        };
        ClipboardOwner owner = new ClipboardOwner() {
            @Override
            public void lostOwnership(Clipboard clipboard, Transferable contents) {
                System.out.println("Lost ownership of clipboard contents");
            }
        };
        
        try {
            clipboard.setContents(contents, owner);
            System.out.println("Clipboard contents set successfully");
        } catch (IllegalStateException e) {
            System.out.println("Clipboard is currently unavailable");
        }
    }
}
