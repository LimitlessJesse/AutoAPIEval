import javax.print.DocFlavor;

public class DocFlavor_3 {
    public static void main(String[] args) {
        DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
        String mimeType = flavor.getMimeType();
        System.out.println("MIME Type: " + mimeType);
    }
}
