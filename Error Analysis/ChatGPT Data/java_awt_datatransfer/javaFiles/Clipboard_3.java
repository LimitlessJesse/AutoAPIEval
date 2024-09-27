import java.awt.datatransfer.Clipboard;

public class Clipboard_3 {
    public static void main(String[] args) {
        Clipboard clipboard = new Clipboard("example");
        
        String name = clipboard.getName();
        System.out.println("Clipboard name: " + name);
    }
}
