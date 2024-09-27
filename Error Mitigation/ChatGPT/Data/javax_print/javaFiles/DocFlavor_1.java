import javax.print.DocFlavor;

public class DocFlavor_1 {
    public static void main(String[] args) {
        DocFlavor docFlavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
        String mimeType = docFlavor.getMimeType();
        System.out.println("MIME Type: " + mimeType);
    }
}
