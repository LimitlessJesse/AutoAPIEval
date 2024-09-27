import java.awt.PageAttributes.MediaType;

public class PageAttributes_MediaType_3 {
    public static void main(String[] args) {
        MediaType mediaType = new MediaType(MediaType.A4, MediaType.ISO_4A0);
        int hashCode = mediaType.hashCode();
        System.out.println("Hashcode of MediaType: " + hashCode);
    }
}
