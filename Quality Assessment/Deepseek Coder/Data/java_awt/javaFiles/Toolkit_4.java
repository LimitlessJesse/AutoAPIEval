import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class Toolkit_4 {
    public static void main(String[] args) {
        StringSelection stringSelection = new StringSelection("Hello, World!");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        // Wait for the clipboard to be updated
        Toolkit.getDefaultToolkit().sync();

        // Now you can retrieve the content from the clipboard
        System.out.println(clipboard.getContents(null));
    }
}
