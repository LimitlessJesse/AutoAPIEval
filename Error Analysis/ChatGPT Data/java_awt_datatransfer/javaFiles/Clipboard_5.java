import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.FlavorListener;

public class Clipboard_5 {
    public static void main(String[] args) {
        Clipboard clipboard = new Clipboard("myClipboard");
        
        FlavorListener flavorListener = new FlavorListener() {
            @Override
            public void flavorsChanged(FlavorEvent e) {
                // Implement your logic here
            }
        };
        
        clipboard.addFlavorListener(flavorListener);
    }
}
