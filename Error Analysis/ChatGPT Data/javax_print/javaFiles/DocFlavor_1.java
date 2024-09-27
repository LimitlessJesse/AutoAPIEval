import javax.print.DocFlavor;

public class DocFlavor_1 {
    public static void main(String[] args) {
        DocFlavor docFlavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
        String mediaType = docFlavor.getMediaType();
        System.out.println("Media Type: " + mediaType);
    }
}
