import java.awt.datatransfer.DataFlavor;

public class DataFlavor_3 {
    public static void main(String[] args) {
        DataFlavor flavor = DataFlavor.stringFlavor;
        String mimeType = flavor.getMimeType();
        System.out.println("MIME Type: " + mimeType);
    }
}
