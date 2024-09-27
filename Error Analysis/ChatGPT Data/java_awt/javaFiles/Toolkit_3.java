import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

public class Toolkit_3 {
    public static void main(String[] args) {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        System.out.println("System clipboard: " + clipboard);
    }
}
