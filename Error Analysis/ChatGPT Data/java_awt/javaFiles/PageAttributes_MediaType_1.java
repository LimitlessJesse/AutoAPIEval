import java.awt.PageAttributes;

public class PageAttributes_MediaType_1 {
    public static void main(String[] args) {
        PageAttributes.MediaType mediaType = PageAttributes.MediaType.A4;
        String mediaTypeString = mediaType.toString();
        System.out.println("Media Type: " + mediaTypeString);
    }
}
