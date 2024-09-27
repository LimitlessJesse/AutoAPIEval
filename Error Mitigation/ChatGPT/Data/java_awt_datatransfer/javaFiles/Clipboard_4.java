import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.FlavorListener;

public class Clipboard_4 {
    public static void main(String[] args) {
        Clipboard clipboard = new Clipboard("exampleClipboard");
        FlavorListener flavorListener = new FlavorListener() {
            @Override
            public void flavorsChanged(FlavorEvent e) {
                // Implement your logic here
            }
        };
        
        clipboard.removeFlavorListener(flavorListener);
    }
}
