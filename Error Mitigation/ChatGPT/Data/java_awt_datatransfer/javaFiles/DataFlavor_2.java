import java.awt.datatransfer.DataFlavor;

public class DataFlavor_2 {
    public static void main(String[] args) {
        DataFlavor flavor = new DataFlavor(String.class, "text/plain");
        String mimeType = flavor.getMimeType();
        System.out.println("MIME Type: " + mimeType);
    }
}
