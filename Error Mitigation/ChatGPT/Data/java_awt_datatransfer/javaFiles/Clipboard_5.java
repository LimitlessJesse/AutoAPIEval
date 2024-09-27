import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;

public class Clipboard_5 {
    public static void main(String[] args) {
        Clipboard clipboard = new Clipboard("example");
        DataFlavor flavor = DataFlavor.stringFlavor;
        boolean isAvailable = clipboard.isDataFlavorAvailable(flavor);
        System.out.println("Is Data Flavor Available: " + isAvailable);
    }
}
