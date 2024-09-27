import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.FlavorListener;

public class Clipboard_3 {
    public static void main(String[] args) {
        Clipboard clipboard = new Clipboard("exampleClipboard");
        FlavorListener flavorListener = new FlavorListener() {
            @Override
            public void flavorsChanged(FlavorEvent e) {
                System.out.println("Flavors changed event received: " + e);
            }
        };
        clipboard.addFlavorListener(flavorListener);
    }
}
