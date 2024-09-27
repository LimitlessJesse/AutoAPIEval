import javax.print.DocFlavor;

public class DocFlavor_3 {
    public static void main(String[] args) {
        DocFlavor docFlavor = DocFlavor.BYTE_ARRAY.TEXT_PLAIN_UTF_8;
        String mediaType = docFlavor.getMediaType();
        System.out.println("Media Type: " + mediaType);
    }
}
