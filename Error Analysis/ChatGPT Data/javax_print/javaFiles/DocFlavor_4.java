import javax.print.DocFlavor;

public class DocFlavor_4 {
    public static void main(String[] args) {
        DocFlavor flavor = DocFlavor.STRING.TEXT_PLAIN;
        String mediaSubtype = flavor.getMediaType();
        System.out.println("Media subtype: " + mediaSubtype);
    }
}
