import java.awt.PageAttributes;

public class PageAttributes_OriginType_5 {
    public static void main(String[] args) {
        PageAttributes.OriginType originType = PageAttributes.OriginType.HARDWARE;
        String originTypeString = originType.toString();
        
        System.out.println("Origin Type: " + originTypeString);
    }
}
