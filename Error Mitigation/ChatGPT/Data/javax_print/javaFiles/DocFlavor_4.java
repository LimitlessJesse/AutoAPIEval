import javax.print.DocFlavor;

public class DocFlavor_4 {
    public static void main(String[] args) {
        DocFlavor docFlavor = DocFlavor.BYTE_ARRAY.TEXT_PLAIN_UTF_8;
        String mediaSubtype = docFlavor.getMediaSubtype();
        System.out.println("Media Subtype: " + mediaSubtype);
    }
}
