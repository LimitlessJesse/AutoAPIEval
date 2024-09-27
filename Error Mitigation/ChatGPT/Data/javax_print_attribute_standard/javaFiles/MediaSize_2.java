import javax.print.attribute.standard.MediaSize;
import javax.print.attribute.standard.MediaSizeName;

public class MediaSize_2 {
    public static void main(String[] args) {
        MediaSize mediaSize = MediaSize.getMediaSizeForName(MediaSizeName.ISO_A4);
        System.out.println("Media size for ISO A4: " + mediaSize);
    }
}
