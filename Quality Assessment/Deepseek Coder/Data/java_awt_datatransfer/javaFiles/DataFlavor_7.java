import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class DataFlavor_7 {
    public static void main(String[] args) {
        DataFlavor flavor = DataFlavor.stringFlavor;
        try {
            String mimeType = flavor.getMimeType();
            System.out.println("MIME Type: " + mimeType);
        } catch (UnsupportedFlavorException e) {
            e.printStackTrace();
        }
    }
}
