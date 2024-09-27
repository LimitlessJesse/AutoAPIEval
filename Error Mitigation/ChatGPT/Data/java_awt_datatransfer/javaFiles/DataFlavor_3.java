import java.awt.datatransfer.DataFlavor;

public class DataFlavor_3 {
    public static void main(String[] args) {
        DataFlavor flavor = new DataFlavor(String.class, "text/plain");
        String mimeType = "text/plain";
        boolean isEqual = flavor.isMimeTypeEqual(mimeType);
        System.out.println("Is MIME type equal: " + isEqual);
    }
}
